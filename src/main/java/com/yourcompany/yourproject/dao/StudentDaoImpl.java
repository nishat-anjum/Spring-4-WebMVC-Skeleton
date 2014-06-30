package com.yourcompany.yourproject.dao;

import com.yourcompany.yourproject.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author anjum
 * @since 6/30/14.
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void saveStudent(Student student) {
        entityManager.persist(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return entityManager.createQuery("SELECT st FROM Student st").getResultList();
    }

    @Override
    public Student find(Student student) {
        return entityManager.find(Student.class, student.getId());
    }
}
