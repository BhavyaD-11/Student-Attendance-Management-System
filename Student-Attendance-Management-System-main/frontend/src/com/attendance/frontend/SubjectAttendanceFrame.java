package com.attendance.frontend;

import javax.swing.*;

public class SubjectAttendanceFrame extends JFrame {
    public SubjectAttendanceFrame() {
        setTitle("Subject-wise Attendance");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titleLabel = new JLabel("Subject-wise Attendance Breakdown");
        titleLabel.setBounds(110, 50, 250, 30);
        add(titleLabel);
    }
}