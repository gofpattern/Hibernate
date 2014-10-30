package com.vaannila.student;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vaannila.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Address address1 = new Address("OMR Road", "Chennai", "TN","600097");
			Address address2 = new Address("Ring Road", "Banglore","Karnataka", "560000");

			Set<Course> courses = new HashSet<Course>();
			courses.add(new Course("Maths"));
			courses.add(new Course("Computer Science"));

			Student student1 = new Student("Eswar", address1, courses);
			Student student2 = new Student("Joe", address2, courses);
			Student student3 = new Student("hafeez", address1, courses);

			session.save(student1);
			session.save(student2);
			session.save(student3);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
