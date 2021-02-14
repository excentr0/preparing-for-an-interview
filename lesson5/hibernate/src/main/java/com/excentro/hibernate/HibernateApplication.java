package com.excentro.hibernate;

import com.excentro.hibernate.dao.StudentDAO;
import com.excentro.hibernate.dao.StudentDAOImpl;
import com.excentro.hibernate.entity.Student;
import com.excentro.hibernate.utils.SessionUtil;
import org.hibernate.Session;

public class HibernateApplication {
	public static void main(String[] args) {
		Session session = SessionUtil.getSessionFactory().openSession();

		StudentDAO studentDao = new StudentDAOImpl(session);

		for (int i = 0; i < 1000; i++) {
			Student student = new Student("student" + i, "Mark " + i);
			studentDao.add(student);
		}

		System.out.println(studentDao.getStudents());

		Student student = studentDao.getStudent(999L);
		studentDao.del(student);
		System.out.println(studentDao.getStudents());

		student = studentDao.getStudent(1L);
		student.setName("Mike");
		studentDao.save(student);
		System.out.println(studentDao.getStudents());

		studentDao.closeSession();

	}

}
