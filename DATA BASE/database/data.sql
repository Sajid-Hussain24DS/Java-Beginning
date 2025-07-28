CREATE DATABASE IF NOT EXISTS registration;
USE registration;

CREATE TABLE users(
    id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone_number VARCHAR(15),
    gender VARCHAR(10),
    address TEXT
);
ALTER TABLE users CHANGE full_name name VARCHAR(100) NOT NULL;
ALTER TABLE users CHANGE  name full_name VARCHAR(100) NOT NULL;
ALTER TABLE users CHANGE phone_number phone VARCHAR(100) NOT NULL;

ALTER TABLE users CHANGE  phone phone_number VARCHAR(100) NOT NULL;