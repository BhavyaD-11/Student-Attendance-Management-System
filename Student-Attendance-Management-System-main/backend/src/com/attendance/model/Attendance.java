
package com.attendance.model;

import java.time.LocalDate;

public class Attendance {
    private int attendanceId;
    private int studentId;
    private int subjectId;
    private LocalDate attendanceDate;
    private String status;

    public Attendance(int attendanceId, int studentId, int subjectId,
                      LocalDate attendanceDate, String status) {
        this.attendanceId = attendanceId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.attendanceDate = attendanceDate;
        this.status = status;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public String getStatus() {
        return status;
    }
}