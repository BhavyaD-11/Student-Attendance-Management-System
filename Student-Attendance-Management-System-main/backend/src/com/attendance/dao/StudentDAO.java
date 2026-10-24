
package com.attendance.dao;

import com.attendance.model.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/attendance_db",
            "root",
            "bhavya@12345"
        );
    }

    // Display all students
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        String sql = "SELECT * FROM students";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Student student = new Student();

                student.setStudentId(rs.getInt("student_id"));
                student.setRollNo(rs.getString("roll_no"));
                student.setStudentName(rs.getString("student_name"));
                student.setDepartment(rs.getString("department"));
                student.setYearOfStudy(rs.getInt("year_of_study"));

                students.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    // Find a student using roll number
    public Student getStudentByRollNo(String rollNo) {
        String sql = "SELECT * FROM students WHERE roll_no = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, rollNo);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Student student = new Student();

                    student.setStudentId(rs.getInt("student_id"));
                    student.setRollNo(rs.getString("roll_no"));
                    student.setStudentName(rs.getString("student_name"));
                    student.setDepartment(rs.getString("department"));
                    student.setYearOfStudy(rs.getInt("year_of_study"));

                    return student;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Add a new student
    public boolean addStudent(Student student) {
        String sql = "INSERT INTO students " +
                "(roll_no, student_name, department, year_of_study) " +
                "VALUES (?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, student.getRollNo());
            ps.setString(2, student.getStudentName());
            ps.setString(3, student.getDepartment());
            ps.setInt(4, student.getYearOfStudy());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
