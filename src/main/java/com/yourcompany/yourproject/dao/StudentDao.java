package com.yourcompany.yourproject.dao;

import com.yourcompany.yourproject.model.Student;

import java.util.List;

/**
 * @author anjum
 * @since 6/30/14.
 */
public interface StudentDao {
    public void saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student find(Student student);
}
