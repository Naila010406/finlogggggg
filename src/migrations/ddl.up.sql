/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */

CREATE DATABASE projekPemlan;

CREATE TABLE users (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name VARCHAR(255),
    username VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    created_at DATETIME
);

CREATE TABLE transactions (
    id INT IDENTITY(1,1) PRIMARY KEY,
    type VARCHAR(50),
    date DATE,
    category VARCHAR(100),
    amount DECIMAL(10, 2),
    notes VARCHAR(MAX),
    created_at DATETIME
);
