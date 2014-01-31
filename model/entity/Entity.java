package entity;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Entity {

	@Override
	public boolean equals(Object obj) {
		if (obj.getClass().equals(this.getClass())) {
			return this.toString().equals(obj.toString());
		}
		return false;
	}
	//TODO testy metody
	//Metoda zwraca wartosc pola klasy o podanej nazwie
	//Je¿eli pole o podanej nazwie nie istnieje zwaca null
	public Object getFieldValue(String name){
		try {
			Class c = Class.forName(this.getClass().getCanonicalName());
			PropertyDescriptor propertyDescriptor = new PropertyDescriptor(name, this.getClass());
			Method getter = propertyDescriptor.getReadMethod();
			return getter.invoke(this, null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// TODO Dodac testy

	// tablica params zawiera w kluczu nazwe pola klasy a jako wartosc przyjmuje
	// wartosc, która ma
	// zostac ustawiona dla pola
	public boolean setFields(HashMap<String, Object> params) {

		try {
			StringBuffer exc = new StringBuffer();
			Class c = Class.forName(this.getClass().getCanonicalName());
			setFieldsClass(c, params, exc);
			return true;
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			throw new IllegalArgumentException(e.getTargetException().getMessage());
		}  catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private void setFieldsClass(Class c, HashMap<String, Object> params, StringBuffer exception)
			throws IllegalArgumentException, IllegalAccessException,
			SecurityException, InvocationTargetException, IntrospectionException {

		if (c != null) {
			System.out.println(c.getCanonicalName());
			Field[] fields = c.getDeclaredFields();
			for (Field f : fields) {
				String fieldName = f.getName();
				if (params.containsKey(fieldName)) {
					Object value = params.get(f.getName());
					// pobranie gettera dla pola
					PropertyDescriptor propertyDescriptor = new PropertyDescriptor(fieldName, this.getClass());
					Method setter = propertyDescriptor.getWriteMethod();
					try{
					setter.invoke(this, value);
					}catch(java.lang.reflect.InvocationTargetException e){
						String message =e.getTargetException().getMessage();
						exception.append(message+"\n");
					}
				}
			}
			Class superClass = c.getSuperclass();
			setFieldsClass(superClass, params,exception);
		}
		else{
		if(exception.length() > 0)
			throw new IllegalArgumentException(exception.toString());
		}

	}

	public HashMap<String, Object> getFildsValues(){
		HashMap<String , Object> values = new HashMap<String , Object>();
		Class c;
		try {
			c = Class.forName(this.getClass().getCanonicalName());
			getFildsValues(c, values);
			return values;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	private void getFildsValues(Class c, HashMap<String, Object> values) throws ClassNotFoundException{

		if(c != null){
			Field[] fields = c.getDeclaredFields();
			for(Field f: fields){
				values.put(f.getName(), getFieldValue(f.getName()));
			}
			Class superClass = c.getSuperclass();
			getFildsValues(superClass, values);
		}

	}



	public static void main(String[] args) {
		Klient a = new Klient();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("imie", "AAA");
		params.put("nazwisko", "123");
		try{
		a.setFields(params);
		}catch(java.lang.IllegalArgumentException e){
			System.out.println("AAA");
			System.out.println(e.getMessage());
		}

			System.out.println(a.getFildsValues());

		System.out.println(a.getFieldValue("imie"));
	}
}