package com.students.StudentService.dao;

import com.students.StudentService.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDAOImpl implements StudentDAO {

    private EntityManager entityManager;
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student>  theQuery= this.entityManager.createQuery("from Student",Student.class);
        List<Student> studentsList = theQuery.getResultList();

        return studentsList;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        this.entityManager.persist(theStudent);
    }


}
