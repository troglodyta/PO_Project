package modelTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import entity.Klient;

public class KlientTest {

	@Test
	public void testSetDataUrodzeniaDate() {
		Klient k=new Klient();
		k.setDataUrodzenia(new Date(1990,1,5));
		assertTrue(k.getDataUrodzenia().equals(new Date(1990,1,5)));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetDataUrodzeniaDate2() {
		Klient k=new Klient();
		k.setDataUrodzenia(new Date(2013,1,5));
		
	}

	@Test
	public void testSetNumerPrawaJazdy() {
		Klient k=new Klient();
		k.setNumerPrawaJazdy("11111111111");
		assertTrue(k.getNumerPrawaJazdy().equals("11111111111"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetNumerPrawaJazdy2() {
		Klient k=new Klient();
		k.setNumerPrawaJazdy("111111");
		
	}

	@Test
	public void testSetKrajWydaniaPrawaJazdy() {
		Klient k=new Klient();
		k.setKrajWydaniaPrawaJazdy("Polska");
		assertTrue(k.getKrajWydaniaPrawaJazdy().equals("Polska"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetKrajWydaniaPrawaJazdy2() {
		Klient k=new Klient();
		k.setKrajWydaniaPrawaJazdy("gwg54hwth");
		
	}

	@Test
	public void testSetZnizka() {
		Klient k=new Klient();
		k.setZnizka(0.3);
		assertTrue(k.getZnizka()==0.3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetZnizka2() {
		Klient k=new Klient();
		k.setZnizka(12.0);
		
	}

}
