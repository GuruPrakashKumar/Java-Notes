// npm install mongoose
const mongoose = require('mongoose');
mongoose.connect("url");

const UserSchema = new mongoose.Schema({
    name: { type: String, required: true },
    email: { type: String, required: true }
});

const UserModel = mongoose.model("User", UserSchema);

const express = require("express");
const app = express();

app.post("/login", login);
async function login(req, res) {
    const { email, name } = req.body;
    const data = { email: email, name: name };
    const User = new UserModel(data);
    User.save();
    res.status(200).send();
}

app.listen(3000);

// localhost:3000/login
