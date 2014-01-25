package modelTest;

import static org.junit.Assert.*;

import java.util.HashMap;

import model.ClassManager;
import model.ClassManagerI;
import model.DBManager;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import entity.Adres;

public class DBManagerTest {
	
	@Rule
	  public ExpectedException exception = ExpectedException.none();
	 
	@Test
	public void testSaveLoadUpdateRemoveToDatabase() {
		DBManager manager = DBManager.INSTANCE;
		assertNotNull(manager);
		
		Adres a = new Adres(2,"K¹tecka 40","55081","Wawrzeñczyce");
		manager.saveEntity(a);
		int id = a.getID();
		Adres a2 = (Adres) manager.loadByID("Adres", id);
		assertEquals(a, a2);
		a.setKodPocztowy("55088");
		manager.updateEntity(a);
		Adres a4 = (Adres) manager.loadByID("Adres", id);
		assertEquals(a, a4);
		manager.deleteEntity(a2);
		Adres a3 = (Adres) manager.loadByID("Adres", id);
		assertNull(a3);	
	}
	
	@Test
	public void testClassManager() {
		ClassManagerI  manager = ClassManager.INSTANCE;
		assertNotNull(manager);
		
		HashMap<String, Object> parm = new HashMap<String, Object>();
		parm.put("ID", 2);
		parm.put("ulica", "K¹tecka 40");
		parm.put("kodPocztowy", "55-081");
		parm.put("miejscowosc", "Wawrzeñczyce");
		
		Adres a1 = new Adres(2,"K¹tecka 40","55-081","Wawrzeñczyce");
		Adres a2 = (Adres)manager.createClass("Adres", parm);
		assertEquals(a1, a2);
		Adres a3 = new Adres(2,"K¹tec ka 40","55-081","Wawrzeñczyce");
		assertNotEquals(a1, a3);
		
		exception.expect(IllegalArgumentException.class);
		a2 = (Adres)manager.createClass("Adress", parm);
		assertNull(a2);
		
		parm = new HashMap<String, Object>();
		parm.put("ID", 2);
		parm.put("ulicafd", "K¹tecka 40");
		parm.put("kodPocztowy", "55-081");
		parm.put("miejscowosc", "Wawrzeñczyce");
		
		exception.expect(IllegalArgumentException.class );
		a2 = (Adres)manager.createClass("Adres", parm);
	}

}
