package com.excentro.hibernate.dao;

import com.excentro.hibernate.entity.Student;
import com.excentro.hibernate.utils.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

  @Override
  public void save(Student student) {
    updateRecord(student);
  }

  private void updateRecord(Student student) {
    Session session = SessionUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.persist(student);
    tx.commit();
    session.close();
  }

  @Override
  public void add(Student student) {
    updateRecord(student);
  }

  @Override
  public void del(Student student) {
    Session session = SessionUtil.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.remove(student);
    tx.commit();
    session.close();
  }

  @Override
  public void update(Student student) {
    updateRecord(student);
  }

  @Override
  public Student getStudent(Long id) {
    Session session = SessionUtil.getSessionFactory().openSession();
    session.close();
    return session.get(Student.class, id);
  }

  @Override
  public List<Student> getStudents() {
    Session session = SessionUtil.getSessionFactory().openSession();
    session.close();
    return (List<Student>) session.createQuery("from Student").list();
  }
}
