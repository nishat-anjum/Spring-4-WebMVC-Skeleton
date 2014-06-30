package com.yourcompany.yourproject.service;

import com.yourcompany.yourproject.model.Student;

import java.util.List;

/**
 * @author anjum
 * @since 6/30/14.
 */
public interface StudentService {
    public void saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student find(Student student);
}
