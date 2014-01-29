package entity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class Entity {

	@Override
	public boolean equals(Object obj) {
		if (obj.getClass().equals(this.getClass())) {
			return this.toString().equals(obj.toString());
		}
		return false;
	}

	// TODO Dodac testy

	// tablica params zawiera w kluczu nazwe pola klasy a jako wartosc przyjmuje
	// wartosc, która ma
	// zostac ustawiona dla pola
	public void setFields(HashMap<String, Object> params) {
		try {
			Class c = Class.forName(this.getClass().getCanonicalName());
			setFieldsClass(c, params);
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
		}
	}

	private void setFieldsClass(Class c, HashMap<String, Object> params)
			throws IllegalArgumentException, IllegalAccessException,
			SecurityException, InvocationTargetException {

		if (c != null) {
			System.out.println(c.getCanonicalName());
			Field[] fields = c.getDeclaredFields();
			for (Field f : fields) {
				String fieldName = f.getName();
				if (params.containsKey(fieldName)) {
					Object value = params.get(f.getName());
					// pobranie gettera dla pola
					java.lang.reflect.Method m;
					try {
						m = c.getMethod("set"
								+ fieldName.substring(0, 1).toUpperCase()
								+ fieldName.substring(1, fieldName.length()),
								value.getClass());
					} catch (NoSuchMethodException e) {
						throw new IllegalArgumentException(c.getCanonicalName()
								+ " metoda setter dla pola " + fieldName
								+ " dla argumentu " + value.getClass()
								+ " nie istniej");
					}
					// ustawienie wartoœci pola
					m.invoke(this, value);
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
	}
}