package model;

import java.util.HashMap;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import entity.Entity;

public class DBManager {
	private  Configuration configuration;
	private SessionFactory sessionFactory;
	public static final  DBManager INSTANCE = new DBManager();
	
	private DBManager(){
		configuration=new Configuration();  
		sessionFactory=configuration.configure().buildSessionFactory();
	}
	
	public Entity loadByID(String name, int id) throws ClassNotFoundException{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Entity ent = (Entity) session.get(Class.forName("entity."+ name),id);
		Hibernate.initialize(ent);
		session.getTransaction().commit();
		session.close();
		return ent;
	}
	
	public boolean saveEntity(Entity entity){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		return session.getTransaction().wasCommitted();
	}
	
	public boolean updateEntity(Entity entity){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
		return session.getTransaction().wasCommitted();
	}
	
	public boolean deleteEntity(Entity entity){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		session.close();
		return session.getTransaction().wasCommitted();
	}
	
	
	
	public static void main(String[] args) {
	try {
		System.out.println(DBManager.INSTANCE.loadByID("Adres", 1));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

}
