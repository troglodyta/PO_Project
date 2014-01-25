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
import entity.Wypozyczenie;

public class DBManager {
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
		session.update(entity);
		session.getTransaction().commit();
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
		//TODO dodaæ to do testów
		Klient klient = (Klient)DBManager.INSTANCE.loadByID("Klient", 5);
		System.out.println(klient);
		Umowa u = (Umowa)klient.getUmowas().toArray()[0];
		System.out.println(u);
		Wypozyczenie w = u.getWypozyczenie();
		System.out.println(w);
		DaneWypozyczenia daneWyp =w.getDaneWypozyczenia();
		System.out.println(daneWyp);
		Collection a =  daneWyp.getAkcesoria();
		Akcesoria akcesoria=(Akcesoria) a.toArray()[0]; 
		System.out.println(akcesoria);
		Oddzial oddzial = akcesoria.getOddzial();
		System.out.println(oddzial);
		Kierownik kOddzialu = oddzial.getKierownik();
		System.out.println(kOddzialu);
		Szef awansujacy = kOddzialu.getAwansujacy();
		System.out.println(awansujacy);
		
		Rezerwacja r = (Rezerwacja)klient.getRezerwacje().toArray()[0];
		System.out.println(r);
		DaneWypozyczenia daneWyp2 = r.getDaneWypozyczenia(); 
		System.out.println(daneWyp2);
		Oddzial zwr = daneWyp2.getOddzialZwrotu();
		System.out.println(zwr);
		Pojazd poj = daneWyp2.getPojazd();
		System.out.println(poj);
		DaneModeluPojazdu danePoj=poj.getDanePojazdu();
		System.out.println(danePoj);
		Polisa pol =poj.getPolisa();
		System.out.println(pol);
		Ubezpieczyciel ub = pol.getUbezpieczyciel();
		System.out.println(ub);
		List l = DBManager.INSTANCE.queryHibernate("select k from Klient k where k.znizka = 0",null);
		System.out.println(l);
		List l2 = DBManager.INSTANCE.querySQL("select * from klienci",null); 
		System.out.println(((Object[])l2.get(0))[1]);
//		System.out.println(szef);

	}

}
