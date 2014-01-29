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
			Class c = Class.forName(this.getClass().getCanonicalName());
			setFieldsClass(c, params);
			return true;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private void setFieldsClass(Class c, HashMap<String, Object> params)
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
					setter.invoke(this, value);
				}
			}
			Class superClass = c.getSuperclass();
			setFieldsClass(superClass, params);
		}

	}

	public static void main(String[] args) {
		Klient a = new Klient();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("imie", "AAA");
		a.setFields(params);
		System.out.println(a);
		System.out.println(a.getFieldValue("imie"));
	}
}