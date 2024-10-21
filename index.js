const express = require('express');
const mysql = require('mysql2');
const cors = require('cors');
const bodyParser = require('body-parser');
const path = require('path');
const app = express();

// Middleware Setup
app.use(cors());
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.json());
app.use(express.static(path.join(__dirname, 'public')));

// MySQL connection setup
const db = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'sidhu@07',
    database: 'food_explorer'
});

db.connect((err) => {
    if (err) {
        console.error('Database connection failed:', err);
        return;
    }
    console.log('Connected to the database.');
});

// Routes

// Serve Login Page
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'login.html'));
});

// Serve Dashboard Page after Login
app.get('/dashboard', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

// Login Route
app.post('/login', (req, res) => {
    const { username, password } = req.body;
    const query = 'SELECT * FROM users WHERE username = ? AND password = ?';

    db.query(query, [username, password], (err, results) => {
        if (err) return res.status(500).json({ error: 'Database query failed' });

        if (results.length > 0) {
            res.status(200).json({ message: 'Login successful', redirect: '/dashboard' });
        } else {
            res.status(401).json({ message: 'Invalid username or password' });
        }
    });
});

// Search Route for Restaurants and Food
app.get('/search', (req, res) => {
    const searchQuery = req.query.search || '';
    const query = `
        SELECT name, location, type_of_food 
        FROM restaurants 
        WHERE location LIKE ? OR type_of_food LIKE ?`;

    db.query(query, [`%${searchQuery}%`, `%${searchQuery}%`], (err, results) => {
        if (err) return res.status(500).json({ error: 'Database query failed' });

        if (results.length > 0) {
            res.status(200).json(results);
        } else {
            res.status(404).json({ message: 'No matching restaurants or food found.' });
        }
    });
});

// Reviews Route
// Reviews Route
app.get('/reviews', (req, res) => {
    const restaurant = req.query.restaurant || '';
    const query = `SELECT * FROM reviews WHERE restaurant_name LIKE ?`;

    db.query(query, [`%${restaurant}%`], (err, results) => {
        if (err) return res.status(500).json({ error: 'Database query failed' });
        res.json(results);
    });
});


// Logout Route
app.get('/logout', (req, res) => {
    res.redirect('/');
});

// Start Server
const PORT = 5000;
app.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}`);
});
