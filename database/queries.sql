USE attendance_db;

-- Query 1: Display all students
SELECT * FROM students;

-- Query 2: Display all subjects
SELECT * FROM subjects;

-- Query 3: Display attendance with student names
SELECT
    s.roll_no,
    s.student_name,
    sub.subject_name,
    a.attendance_date,
    a.status
FROM attendance a
JOIN students s
    ON a.student_id = s.student_id
JOIN subjects sub
    ON a.subject_id = sub.subject_id;

-- Query 4: Display only absent students
SELECT
    s.roll_no,
    s.student_name,
    sub.subject_name,
    a.attendance_date
FROM attendance a
JOIN students s
    ON a.student_id = s.student_id
JOIN subjects sub
    ON a.subject_id = sub.subject_id
WHERE a.status = 'Absent';

-- Query 5: Attendance percentage for each student
SELECT
    s.roll_no,
    s.student_name,
    ROUND(
        100.0 * SUM(a.status = 'Present')
        / COUNT(*), 2
    ) AS attendance_percentage
FROM students s
JOIN attendance a
    ON s.student_id = a.student_id
GROUP BY s.student_id, s.roll_no, s.student_name;