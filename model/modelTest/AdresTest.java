package modelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Adres;

public class AdresTest {

	@Test
	public void testSetUlica() 
	{
		Adres adr=new Adres();
		adr.setUlica("Wolno�ci");
		assertTrue(adr.getUlica().equals("Wolno�ci"));
		
		adr.setUlica("Plac Grunwaldzki");
		assertTrue(adr.getUlica().equals("Plac Grunwaldzki"));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetUlica2()
	{
		Adres adr=new Adres();
		adr.setUlica("hsg45hs");
	}

	public void testSetKodPocztowy() 
	{
		Adres adr=new Adres();
		adr.setKodPocztowy("55050");
		assertTrue(adr.getKodPocztowy().equals("55050"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetKodPocztowy2()
	{
		Adres adr=new Adres();
		adr.setKodPocztowy("555555555");
	}
	
	public void testSetMiejscowosc() 
	{
		Adres adr=new Adres();
		adr.setMiejscowosc("Wroc�aw");
		assertTrue(adr.getMiejscowosc().equals("Wroc�aw"));
		
		adr.setMiejscowosc("Bielsko-Bia�a");
		assertTrue(adr.getMiejscowosc().equals("Bielsko-Bia�a"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetMiejscowosc2()
	{
		Adres adr=new Adres();
		adr.setMiejscowosc("sdasda8");
	}

}
