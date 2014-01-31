package modelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Klient;
import entity.Oddzial;
import entity.Osoba;

public class OddzialTest {

	@Test
	public void testSetTelefon() {
		Oddzial o=new Oddzial();
		o.setTelefon("123456789");
		assertTrue(o.getTelefon().equals("123456789"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetTelefon2() {
		Oddzial o=new Oddzial();
		o.setTelefon("gjhf545");
		
	}

	@Test
	public void testSetEmail() {
		Oddzial o=new Oddzial();
		o.setEmail("m.kow@onet.pl");
		assertTrue(o.getEmail().equals("m.kow@onet.pl"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetEmail2() {
		Oddzial o=new Oddzial();
		o.setEmail("kow.onet.pl");
	}

}
