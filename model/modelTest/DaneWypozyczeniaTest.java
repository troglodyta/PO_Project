package modelTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import entity.DaneWypozyczenia;

public class DaneWypozyczeniaTest {

	@Test
	public void testSetDataGodzinaDo() {
		DaneWypozyczenia d=new DaneWypozyczenia();
		d.setDataGodzinaOd(new Date(2014,1,6));
		d.setDataGodzinaDo(new Date(2014,4,5));
		assert(d.getDataGodzinaOd().before(d.getDataGodzinaDo()));
	}

	@Test(expected= IllegalArgumentException.class)
	public void testSetDataGodzinaDo2() {
		DaneWypozyczenia d=new DaneWypozyczenia();
		d.setDataGodzinaOd(new Date(2014,2,6));
		d.setDataGodzinaDo(new Date(2014,1,4));
	}
	
	@Test
	public void testSetDataWpatyZaliczki() {
		DaneWypozyczenia d=new DaneWypozyczenia();
		d.setDataGodzinaOd(new Date(2014,2,6));
		d.setDataWpatyZaliczki(new Date(2014,1,5));
		assert(d.getDataGodzinaOd().after(d.getDataWpatyZaliczki()));
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testSetDataWpatyZaliczki2() {
		DaneWypozyczenia d=new DaneWypozyczenia();
		d.setDataGodzinaOd(new Date(2014,1,6));
		d.setDataWpatyZaliczki(new Date(2014,2,5));
	}

	@Test
	public void testSetDataWplatyKaucji() {
		DaneWypozyczenia d=new DaneWypozyczenia();
		d.setDataGodzinaOd(new Date(2014,2,6));
		d.setDataWplatyKaucji(new Date(2014,1,5));
		assert(d.getDataGodzinaOd().after(d.getDataWplatyKaucji()));
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void testSetDataWplatyKaucji2() {
		DaneWypozyczenia d=new DaneWypozyczenia();
		d.setDataGodzinaOd(new Date(2014,1,6));
		d.setDataWplatyKaucji(new Date(2014,2,5));
	}

}
