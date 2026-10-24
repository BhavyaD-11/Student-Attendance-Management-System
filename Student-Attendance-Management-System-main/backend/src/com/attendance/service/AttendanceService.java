
package com.attendance.service;

import com.attendance.dao.AttendanceDAO;
import com.attendance.model.Attendance;
import java.util.List;

public class AttendanceService {

    private AttendanceDAO attendanceDAO = new AttendanceDAO();

    // Mark attendance
    public boolean markAttendance(Attendance attendance) {
        if (attendance == null) {
            return false;
        }

        if (!"Present".equals(attendance.getStatus())
                && !"Absent".equals(attendance.getStatus())) {
            return false;
        }

        return attendanceDAO.markAttendance(attendance);
    }

    // Get attendance records for a student
    public List<Attendance> getAttendanceByStudent(int studentId) {
        return attendanceDAO.getAttendanceByStudent(studentId);
    }
}
