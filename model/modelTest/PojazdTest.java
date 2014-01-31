package modelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Pojazd;

public class PojazdTest {

	@Test
	public void testSetNrRejstracyjny()
	{
		Pojazd p = new Pojazd();
		p.setNrRejstracyjny("ERA 75TM");
		assertTrue(p.getNrRejstracyjny().equals("ERA 75TM"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetNrRejstracyjny2()
	{
		Pojazd p = new Pojazd();
		p.setNrRejstracyjny("era 75tms");

	}
}
