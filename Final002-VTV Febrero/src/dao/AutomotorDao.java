package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Automotor;

public class AutomotorDao {

	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	public Automotor traerAutomotor(String dominio) throws HibernateException  {
		Automotor objeto = null;
		try {
			iniciaOperacion();
			String strHQL = " from Automotor a where a.dominio = '" + dominio + "'";
			objeto = (Automotor)session.createQuery(strHQL).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
}
