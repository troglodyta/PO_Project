package modelTest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import model.ClassManager;
import model.ClassManagerI;
import model.DBManager;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import FramesComponets.Wypozyczenie;
import entity.Adres;
import entity.Akcesoria;
import entity.DaneModeluPojazdu;
import entity.DaneWypozyczenia;
import entity.Kierownik;
import entity.Klient;
import entity.Oddzial;
import entity.Pojazd;
import entity.Polisa;
import entity.Rezerwacja;
import entity.Szef;
import entity.Ubezpieczyciel;
import entity.Umowa;
import entity.WypozyczeniaAkcesoria;

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
	public void testTraversal() {
		DBManager manager = DBManager.INSTANCE;
		assertNotNull(manager);
		
		Klient klient = (Klient)DBManager.INSTANCE.loadByID("Klient", 5);
		assertNotNull(klient);
		assertEquals(5, klient.getID());
		Klient klient2 = (Klient)DBManager.INSTANCE.loadByID("Klient", -5);
		assertNull(klient2);
		
		//exception.expect(java.lang.ClassNotFoundException.class);
		Klient klient3 = (Klient)DBManager.INSTANCE.loadByID("Klien", 5);
		assertNull(klient3);
		
		Set<Umowa> umowy = klient.getUmowas();
		boolean condition = umowy.size()>0;
		assertTrue(condition);
		
		Umowa u = (Umowa)klient.getUmowas().toArray()[0];
		assertNotNull(u);
		assertEquals(1, u.getID());
		
		entity.Wypozyczenie w = u.getWypozyczenie();
		assertNotNull(w);
		assertEquals(1, w.getID());
		
		DaneWypozyczenia daneWyp =w.getDaneWypozyczenia();
		assertNotNull(daneWyp);
		assertEquals(1, daneWyp.getID());
		
		Collection a =   daneWyp.getWypozyczeniaAkcesoria();
		condition = a.size()>0;
		assertTrue(condition);
		
		WypozyczeniaAkcesoria wypAkc = (WypozyczeniaAkcesoria) a.toArray()[0];
		assertNotNull(wypAkc);
		assertEquals(1, wypAkc.getIlosc());
		
		Akcesoria akcesoria = wypAkc.getAkcesoria();
		assertNotNull(akcesoria);
		assertEquals("Fotelik Samochodowy", akcesoria.getNazwaAkcesorium());
	
		Oddzial oddzial = akcesoria.getOddzial();
		assertNotNull(oddzial);
		assertEquals("697123888", oddzial.getTelefon());
		
		
		Kierownik kOddzialu = oddzial.getKierownik();
		assertNotNull(kOddzialu);
		assertEquals("Ewelina Miko³ajek", kOddzialu.getImie() + " " + kOddzialu.getNazwisko());
		
		Szef awansujacy = kOddzialu.getAwansujacy();
		assertNotNull(awansujacy);
		assertEquals("89 1560 0013 2026 0001 2120 0003", awansujacy.getNumerKonta());
		
		Set<Rezerwacja> rezerwacje = klient.getRezerwacje();
		condition = rezerwacje.size()>0;
		assertTrue(condition);
		
		Rezerwacja r = (Rezerwacja) rezerwacje.toArray()[0];
		assertNotNull(r);
		assertEquals("Przelew", r.getSposobWplatyKaucji());
		
		DaneWypozyczenia daneWyp2 = r.getDaneWypozyczenia(); 
		assertNotNull(daneWyp2);
		assertEquals(daneWyp.toString(), daneWyp2.toString());
		
		Oddzial zwr = daneWyp2.getOddzialZwrotu();
		assertNotNull(zwr);
		assertEquals("odziaWro@gmail.com", zwr.getEmail());
		
		Adres adres = zwr.getAdres();
		assertNotNull(adres);
		assertEquals("S³oneczna 35", adres.getUlica());
		
		Pojazd poj = daneWyp2.getPojazd();
		assertNotNull(poj);
		assertEquals("DWR1234", poj.getNrRejstracyjny());
		
		DaneModeluPojazdu danePoj=poj.getDanePojazdu();
		assertNotNull(danePoj);
		assertEquals("Ford Fiesta", danePoj.getMarka()+" "+danePoj.getModel());
		
		Polisa pol =poj.getPolisa();
		assertNotNull(pol);
		assertEquals("ART21234", pol.getNumerPolisy());
		
		Ubezpieczyciel ub = pol.getUbezpieczyciel();
		assertNotNull(ub);
		assertEquals("AXA", ub.getNazwaUbezpieczyciela());
	}
	
	@Test
	public void testHQL(){
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("znizka", 0.0);
		List l1 = DBManager.INSTANCE.queryHibernate("select k from Klient k where k.znizka = :znizka",param);
		assertFalse(l1.isEmpty());
		for(Object k: l1){
			assertTrue(k instanceof Klient);
			assertEquals(0.0, ((Klient)k).getZnizka(), 0);
		}
		
		List l2 = DBManager.INSTANCE.queryHibernate("select k from Klient k where k.znizka = 0",null);
		assertEquals(l1.size(), l2.size());
		
		for (int i = 0; i < l1.size(); i++) {
			assertEquals(l1.get(i), l2.get(i));
		}
		exception.expect(org.hibernate.QueryException.class);
		List l3 = DBManager.INSTANCE.queryHibernate("select k from Klient k where k.znizka = :znizka",null);	
	}
	
	@Test
	public void testSQL(){
		List<Object[]> l1 = DBManager.INSTANCE.querySQL("select * from klienci",null); 
		assertFalse(l1.isEmpty());
		Object[] record = (Object[])l1.get(0); 
		String nrPraw = (String)record[0];
		assertEquals("M0092979", nrPraw);
		assertEquals(4, record.length);
		
		List<Object[]> l2 = DBManager.INSTANCE.querySQL("select * from adresy where Ulica = 'Czekoladowa 48';",null);
		assertFalse(l2.isEmpty());
		Object[] record2 = (Object[])l2.get(0); 
		String kodPocztowy = (String)record2[2];
		assertEquals("55986", kodPocztowy);
		
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("ulica", "Czekoladowa 48");
		
		List<Object[]> l3 = DBManager.INSTANCE.querySQL("select * from adresy where Ulica =:ulica ;",param);
		for (int i = 0; i < l2.size(); i++) {
			Object[] o1 = l2.get(i); 
			Object[] o2 = l3.get(i);
			for (int j = 0; j < o1.length; j++) {
				assertEquals(o1[j], o2[j]);
			}
		}
		
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
