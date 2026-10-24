
package com.attendance.model;

public class Student {

    private int studentId;
    private String rollNo;
    private String studentName;
    private String department;
    private int yearOfStudy;

    public Student() {
    }

    public Student(int studentId, String rollNo, String studentName,
                   String department, int yearOfStudy) {
        this.studentId = studentId;
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.department = department;
        this.yearOfStudy = yearOfStudy;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}



