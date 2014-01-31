package modelTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;



import entity.Klient;
import entity.Osoba;

public class OsobaTest {

	@Test
	public void testSetNumerTelefonu() {
		Osoba o= new Klient();
		o.setNumerTelefonu("123456789");
		assertTrue(o.getNumerTelefonu().equals("123456789"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetNumerTelefonu2() {
		Osoba o= new Klient();
		o.setNumerTelefonu("hgjhg");
		
	}

	@Test
	public void testSetImie() {
		Osoba o= new Klient();
		o.setImie("Karol");
		assertTrue(o.getImie().equals("Karol"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetImie2() {
		Osoba o= new Klient();
		o.setImie("karol8");
		
	}

	@Test
	public void testSetNazwisko() {
		Osoba o= new Klient();
		o.setNazwisko("Kowalski");
		assertTrue(o.getNazwisko().equals("Kowalski"));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetNazwisko2() {
		Osoba o= new Klient();
		o.setNazwisko("aghherh45");
	}

	@Test
	public void testSetEmail() {
		Osoba o= new Klient();
		o.setEmail("kow@onet.pl");
		assertTrue(o.getEmail().equals("kow@onet.pl"));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetEmail2() {
		Osoba o= new Klient();
		o.setEmail("kow.onet.pl");
	
	}

	@Test
	public void testSetDataUrodzenia() {
		Osoba o= new Klient();
		o.setDataUrodzenia(new Date(1989,1,5));
		assertTrue(o.getDataUrodzenia().compareTo(new Date(1989,1,5))==0);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetDataUrodzenia2() {
		Osoba o= new Klient();
		o.setDataUrodzenia(new Date(2013,1,5));
	}
	@Test
	public void testSetPlec() {
		Osoba o= new Klient();
		o.setPlec("K");
		assertTrue(o.getPlec().equals("K"));
		
		o.setPlec("M");
		assertTrue(o.getPlec().equals("M"));
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void testSetPlec2() {
		Osoba o= new Klient();
		o.setPlec("gf");
		
	}

	

}
