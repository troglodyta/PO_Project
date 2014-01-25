package model;

import java.util.List;

import entity.*;

public class WypozyczenieModel implements Model {
	private DBManager manager = DBManager.INSTANCE;
	
	public List<Rezerwacja> getWszytkieRezerwacje(){
		String sql = "from Rezerwacja"; 
		return (List<Rezerwacja>)(manager.queryHibernate(sql, null));
	}
	
//	public String[] getWszystkieMarki(){
//	}
	
	public static void main(String[] args) {
		WypozyczenieModel m = new WypozyczenieModel();
		System.out.println(m.getWszytkieRezerwacje());
	}
}