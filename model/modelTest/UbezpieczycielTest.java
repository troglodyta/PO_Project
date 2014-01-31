package modelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Ubezpieczyciel;

public class UbezpieczycielTest {

	@Test
	public void testSetTelefon() {
		Ubezpieczyciel o=new Ubezpieczyciel();
		o.setTelefon("123456789");
		assertTrue(o.getTelefon().equals("123456789"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetTelefon2() {
		Ubezpieczyciel o=new Ubezpieczyciel();
		o.setTelefon("123kjhl49");

	}

	@Test
	public void testSetEmail() {
		Ubezpieczyciel o=new Ubezpieczyciel();
		o.setEmail("kow@onet.pl");
		assertTrue(o.getEmail().equals("kow@onet.pl"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetEmail2() {
		Ubezpieczyciel o=new Ubezpieczyciel();
		o.setEmail("kow.onet.pl");
	}

}
