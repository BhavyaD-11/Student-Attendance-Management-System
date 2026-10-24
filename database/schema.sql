CREATE DATABASE IF NOT EXISTS attendance_db;

USE attendance_db;

-- 1. Students table
CREATE TABLE IF NOT EXISTS students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    roll_no VARCHAR(20) UNIQUE NOT NULL,
    student_name VARCHAR(100) NOT NULL,
    department VARCHAR(50) NOT NULL,
    year_of_study INT NOT NULL
);

-- 2. Subjects table
CREATE TABLE IF NOT EXISTS subjects (
    subject_id INT AUTO_INCREMENT PRIMARY KEY,
    subject_code VARCHAR(20) UNIQUE NOT NULL,
    subject_name VARCHAR(100) NOT NULL
);

-- 3. Attendance table
CREATE TABLE IF NOT EXISTS attendance (
    attendance_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT NOT NULL,
    subject_id INT NOT NULL,
    attendance_date DATE NOT NULL,
    status ENUM('Present', 'Absent') NOT NULL,

    FOREIGN KEY (student_id)
        REFERENCES students(student_id),

    FOREIGN KEY (subject_id)
        REFERENCES subjects(subject_id),

    UNIQUE (student_id, subject_id, attendance_date)
);