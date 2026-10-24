
package com.attendance.service;

import com.attendance.dao.StudentDAO;
import com.attendance.model.Student;

public class LoginService {

    private StudentDAO studentDAO = new StudentDAO();

    public Student login(String username, String password) {

        System.out.println("Username entered: [" + username + "]");
        System.out.println("Password entered: [" + password + "]");

        if (username == null || password == null) {
            System.out.println("Username or password is null");
            return null;
        }

        username = username.trim();
        password = password.trim();

        if (!username.equals(password)) {
            System.out.println("Username and password do not match");
            return null;
        }

        Student student = studentDAO.getStudentByRollNo(username);

        if (student == null) {
            System.out.println("Student not found in database");
        } else {
            System.out.println("Student found: " + student.getStudentName());
        }

        return student;
    }
}
