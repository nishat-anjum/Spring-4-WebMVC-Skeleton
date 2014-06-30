package com.yourcompany.yourproject.service;

import com.yourcompany.yourproject.dao.StudentDao;
import com.yourcompany.yourproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author anjum
 * @since 6/30/14.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student find(Student student) {
        return studentDao.find(student);
    }
}
