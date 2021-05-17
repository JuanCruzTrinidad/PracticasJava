package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Control;
import datos.Inspeccion;
import datos.Medicion;
import datos.Observacion;

public class ControlDao {
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	
	public Control traerObservacion (Inspeccion inspeccion) {
		Control objeto = null;
		try {
			iniciaOperacion();
			//SELECT c FROM Cliente c JOIN c.eventos e WHERE e.idEvento = 
			objeto = (Control) session.createQuery("SELECT c from Control c JOIN c.inspeccion i  WHERE i.idInspeccion = "+inspeccion.getIdInspeccion()).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public Control traerMedicion (Inspeccion inspeccion) {
		Control objeto = null;
		try {
			iniciaOperacion();
			objeto = (Control) session.createQuery("SELECT m from Medicion m JOIN m.inspeccion i where i.idInspeccion = "+inspeccion.getIdInspeccion()).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
}
