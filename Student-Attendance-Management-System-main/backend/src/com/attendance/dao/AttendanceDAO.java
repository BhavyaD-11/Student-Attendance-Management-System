
package com.attendance.dao;

import com.attendance.model.Attendance;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AttendanceDAO {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/attendance_db",
            "root",
            "bhavya@12345"
        );
    }

    // Mark attendance
    public boolean markAttendance(Attendance attendance) {
        String sql = "INSERT INTO attendance " +
                "(student_id, subject_id, attendance_date, status) " +
                "VALUES (?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, attendance.getStudentId());
            ps.setInt(2, attendance.getSubjectId());
            ps.setDate(3, Date.valueOf(attendance.getAttendanceDate()));
            ps.setString(4, attendance.getStatus());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Get attendance records for a student
    public List<Attendance> getAttendanceByStudent(int studentId) {
        List<Attendance> records = new ArrayList<>();

        String sql = "SELECT * FROM attendance WHERE student_id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Attendance attendance = new Attendance(
                        rs.getInt("attendance_id"),
                        rs.getInt("student_id"),
                        rs.getInt("subject_id"),
                        rs.getDate("attendance_date").toLocalDate(),
                        rs.getString("status")
                    );

                    records.add(attendance);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return records;
    }
}
