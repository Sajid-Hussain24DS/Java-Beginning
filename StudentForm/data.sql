CREATE DATABASE library_management;
USE library_management;
CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(100) ,
    dept_code VARCHAR(50) 
    
);

-- 1. Drop existing PRIMARY KEY
ALTER TABLE departments DROP PRIMARY KEY;

-- 2. Add AUTO_INCREMENT and new PRIMARY KEY
ALTER TABLE departments MODIFY dept_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY;
ALTER TABLE departments DROP PRIMARY KEY;
ALTER TABLE departments MODIFY dept_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100) ,
    roll_number VARCHAR(50) ,
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
    
);

ALTER TABLE students DROP PRIMARY KEY;
ALTER TABLE students MODIFY student_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY;
ALTER TABLE students DROP FOREIGN KEY students_ibfk_1;

ALTER TABLE students
ADD CONSTRAINT students_ibfk_1
FOREIGN KEY (dept_id) REFERENCES departments(dept_id);

