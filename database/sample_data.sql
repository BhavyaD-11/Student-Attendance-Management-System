USE attendance_db;

INSERT INTO students
(roll_no, student_name, department, year_of_study)
VALUES
('101', 'Ravi', 'CSE', 2),
('102', 'Priya', 'AIML', 2),
('103', 'Suresh', 'CSE', 2);

INSERT INTO subjects (subject_code, subject_name)
VALUES
('CS201', 'DBMS'),
('CS202', 'Data Structures');

INSERT INTO attendance
(student_id, subject_id, attendance_date, status)
VALUES
(1, 1, '2026-10-20', 'Present'),
(2, 1, '2026-10-20', 'Absent'),
(3, 1, '2026-10-20', 'Present'),
(1, 2, '2026-10-20', 'Present'),
(2, 2, '2026-10-20', 'Present'),
(3, 2, '2026-10-20', 'Absent');