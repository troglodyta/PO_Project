package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.*;

public class WypozyczenieModel implements Model {
	private DBManager manager = DBManager.INSTANCE;
	
	public List<Rezerwacja> getWszytkieRezerwacje(){
		String sql = "from Rezerwacja"; 
		return (List<Rezerwacja>)(manager.queryHibernate(sql, null));
	}
	
	public List<Rezerwacja> getRezerwacjeByConditions(HashMap<String, Object> params){
		StringBuffer where = new StringBuffer();
		for(String s: params.keySet()){
			switch (s) {
			case "idRezerwacji": where.append("r.ID =:"+s+" and "); break;
			case "imie":where.append("r.klient.imie =:"+s+" and "); break;
			case "nazwisko":where.append("r.klient.nazwisko =:"+s+" and "); break;
			case "marka":where.append("r.daneWypozyczenia.pojazd.danePojazdu.marka =:"+s+" and "); break;
			case "model":where.append("r.daneWypozyczenia.pojazd.danePojazdu.model =:"+s+" and "); break;
			case "dataOd":where.append("r.dataRezerwacji >=:"+s+" and "); break;
			case "dataDo":where.append("r.dataRezerwacji <=:"+s+" and "); break;
			case "status":where.append("r.czyPotwierdzona =:"+s+" and "); break;
			default:
				break;
			}
		}
		
		String sWhere = where.toString();
		if(sWhere.length() > 5)
			sWhere = sWhere.substring(0,sWhere.length()-5);
		String hql = "select r from Rezerwacja r where "+sWhere;
		return sWhere.length()>0? (List<Rezerwacja>)(manager.queryHibernate(hql, params)): getWszytkieRezerwacje();
	}
	
	public String[] getWszystkieMarki(){
		String hql = "SELECT marka FROM DaneModeluPojazdu group by marka";
		Object[] query=  manager.queryHibernate(hql, null).toArray();
		String[] wyn = new String[query.length];
		for (int i = 0; i < wyn.length; i++) {
			String s = (String) query[i];
			wyn[i]=s;
		}
		return wyn;
	}
	
	public String[] getModel(String marka){
		String hql = "SELECT model FROM DaneModeluPojazdu WHERE marka =:marka GROUP BY model";
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("marka", marka);
		Object[] query=  manager.queryHibernate(hql, param).toArray();
		String[] wyn = new String[query.length];
		for (int i = 0; i < wyn.length; i++) {
			String s = (String) query[i];
			wyn[i]=s;
		}
		return wyn;
	}
	
	public String[] allCountries(){
		return Counties.counties;
	}
	
	
	
	public static void main(String[] args) {
		WypozyczenieModel m = new WypozyczenieModel();
	System.out.println(m.getWszystkieMarki()[0]);
	System.out.println(m.getModel("Ford")[0]);
	
	}
}