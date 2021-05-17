package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Automotor;
import datos.Control;
import datos.Inspeccion;

public class InspeccionDao {
	
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	
	public List<Inspeccion> traerInspeccion(Automotor automotor) {
		List<Inspeccion> lista = new ArrayList<Inspeccion>();
		try {
			iniciaOperacion();
			String hQL = "from Inspeccion i inner join fetch i.automotor a where a.idAutomotor=" + automotor.getIdAutomotor();
			lista = session.createQuery(hQL).list();
		} finally {
			session.close();
		}
		return lista;
	}
	
	public Inspeccion traerInspeccion (int idInspeccion) {
		Inspeccion objeto = null;
		try {
			iniciaOperacion();
			objeto = (Inspeccion) session.get(Inspeccion.class, idInspeccion);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public List<Inspeccion> traerInspeccion (LocalDate date) {
		List<Inspeccion> lista = new ArrayList<Inspeccion>();
		try {
			iniciaOperacion();
			//String dateString =  date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
			String hql = "from Inspeccion i  WHERE i.fecha = :date";
			lista = session.createQuery(hql).setParameter("date", date).list();
		} finally {
			session.close();
		}
		return lista;
	}
	
	public List<Inspeccion> traerInspeccion (LocalDate date, String estado) {
		List<Inspeccion> lista = new ArrayList<Inspeccion>();
		try {
			iniciaOperacion();
			String hql = "from Inspeccion i  WHERE i.fecha = :date and i.estado = :estado";
			lista = session.createQuery(hql)
					.setParameter("date", date)
					.setParameter("estado", estado)
					.list();
		} finally {
			session.close();
		}
		return lista;
	}
	
	public List<Inspeccion> traerInspeccion (LocalDate date, LocalTime time) {
		List<Inspeccion> lista = new ArrayList<Inspeccion>();
		try {
			iniciaOperacion();
			String timeString =  time.format(DateTimeFormatter.ISO_LOCAL_TIME);
			System.out.println(timeString);
			String hql = "SELECT i from Inspeccion i JOIN i.controles c WHERE i.fecha = :date and c.hora = :time";
			lista = session.createQuery(hql)
					.setParameter("date", date)
					.setString("time", timeString)
					.list();
		} finally {
			session.close();
		}
		return lista;
	}
	
}
