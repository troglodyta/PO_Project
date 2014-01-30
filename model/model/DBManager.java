package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javassist.expr.Instanceof;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Akcesoria;
import entity.DaneModeluPojazdu;
import entity.DaneWypozyczenia;
import entity.Entity;
import entity.Kierownik;
import entity.Klient;
import entity.Oddzial;
import entity.Pojazd;
import entity.Polisa;
import entity.Pracownik;
import entity.Rezerwacja;
import entity.Szef;
import entity.Ubezpieczyciel;
import entity.Umowa;
import entity.WypozyczeniaAkcesoria;
import entity.Wypozyczenie;

public class DBManager {//mój komentarz
	private  Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;
	public static final  DBManager INSTANCE = new DBManager();

	private DBManager(){
		configuration=new Configuration();
		sessionFactory=configuration.configure().buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public Entity loadByID(String name, int id){
		try {
			session.beginTransaction();
			Entity ent;
			ent = (Entity) session.get(Class.forName("entity."+ name),id);
			Hibernate.initialize(ent);
			session.getTransaction().commit();
			return ent;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void saveEntity(Entity entity){
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}

	public void updateEntity(Entity entity){
		session.beginTransaction();
		System.out.println("sss");
		session.update(entity);
		System.out.println("ccc");
		session.getTransaction().commit();
		System.out.println("CCcc");
	}

	public void deleteEntity(Entity entity){
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
	}

	public List queryHibernate(String hibernateSql, HashMap<String, Object> param) {
		Query query = session.createQuery(hibernateSql);
		if (param != null) {
			for (String name : param.keySet()) {
				query.setParameter(name, param.get(name));
			}
		}
		List<Object> results = query.list();
		return results;
	}

	public List<Object[]> querySQL(String sql, HashMap<String, Object> param) {
		Query query = session.createSQLQuery(sql);
		if (param != null) {
			for (String name : param.keySet()) {
				query.setParameter(name, param.get(name));
			}
		}
		List<Object[]> results = query.list();
		return results;
	}

	public void closeSession(){
		session.close();
	}
	
	public static void main(String[] args) {
		DaneModeluPojazdu d = (DaneModeluPojazdu) INSTANCE.loadByID("DaneModeluPojazdu", 1);
		System.out.println(d);
	}

}
