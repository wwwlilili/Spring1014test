package model;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OfficeDAO {

	public Session createSession() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		return factory.openSession();

	}

	public Office getOfficeById(String id) {
		// TODO Auto-generated method stub
		Session ss = createSession();
		TypedQuery<Office> q = ss.createQuery("from Office o where o.officeCode= :code", Office.class);
		q.setParameter("code", id);
		return q.getSingleResult();

	}

}
