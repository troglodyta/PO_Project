package model;

import java.lang.reflect.Field;
import java.util.HashMap;

import entity.Adres;
import entity.Entity;

public class ClassManager implements ClassManagerI {

	public static final ClassManagerI INSTANCE = new ClassManager();
	
	private ClassManager(){}
	
	@Override
	public Entity createClass(String className, HashMap<String, Object> parameters){
		try {
			Class c = Class.forName("entity."+className);
			Entity instance;
			instance = (Entity)c.newInstance();
			Field[] fields = c.getDeclaredFields();	
			
			for(Field f: fields){
				f.setAccessible(true);
				Object param = parameters.get(f.getName());
				if(param == null)
					throw new IllegalArgumentException("Not found value for field: "+f.getName());
				f.set(instance, parameters.get(f.getName()));
			}
			return instance;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		Adres a = new Adres(1, "AAA","BBB","CCC");
		HashMap<String, Object> parm = new HashMap<String, Object>();
		parm.put("ID", 1);
		parm.put("ulica", "AAA");
		parm.put("kodPocztowy", "BBB");
		parm.put("miejscowosc", "CCC");
		Adres b = (Adres)ClassManager.INSTANCE.createClass("Adress", parm);
		System.out.println(b);
	}
}