package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import entity.*;

public class WypozyczenieModel implements Model {
	private DBManager manager = DBManager.INSTANCE;

	public List<Rezerwacja> getWszytkieRezerwacje(){
		String sql = "select r from  Rezerwacja r where r.daneWypozyczenia.pojazd.czyWypozyczony=false";
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
		String hql = "select r from Rezerwacja r where r.daneWypozyczenia.pojazd.czyWypozyczony=false and "+sWhere;
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

	public List<DaneModeluPojazdu> getDanePojazdow(){
		String hql = "from DaneModeluPojazdu order by marka, model";
		List<DaneModeluPojazdu> query=   manager.queryHibernate(hql, null);
		return query;
	}

	public DaneModeluPojazdu getDaneModeluPojazdu(HashMap<String, Object> params){
		String hql = "select d from DaneModeluPojazdu d where d.marka=:marka and d.model=:model and d.typ =:typ";
		System.out.println(hql);
		System.out.println(params);
		List<DaneModeluPojazdu> query=   manager.queryHibernate(hql, params);
		return query.get(0);
	}

	public String[] getOddzialy(){
		String sql = "SELECT miejscowosc FROM Adresy, Oddzialy WHERE AdresyID = Adresy.ID ORDER BY miejscowosc";
		List<Object[]> query=  manager.querySQL(sql, null);
		String[] wyn = new String[query.size()];
		for (int i = 0; i < wyn.length; i++) {
			Object q = query.get(i);
			String s = (String) q;
			wyn[i]=s;
		}
		return wyn;
	}

	public String generujUmowe(DaneWypozyczenia dane, Klient klient){
		Pojazd p = dane.getPojazd();
		DaneModeluPojazdu daneP = p.getDanePojazdu();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String s = "UMOWA\nzawarta w dniu "+f.format((new Date()))+" pomiêdzy:"
+"Firm¹ AutoTrans ,siedziba Wroc³aw, przy ul. "+dane.getOddzialOdbioru().getAdres().getUlica()+"\nlegitymuj¹cym/¹ siê numerem NIP  52 90-133 zwan¹/ym w dalszej czêœci umowy WYNAJMUJ¥CYM\n"
+"a\n"
+""+klient.getImie()+" "+klient.getNazwisko()+" , zamieszka³ym"+klient.getAdres().getMiejscowosc()+", przy ul."+klient.getAdres().getUlica()+"\nlegitymuj¹cym/¹ siê numerem prawojazdy "+klient.getNumerPrawaJazdy()+" zwan¹/ym w dalszej czêœci umowy NAJEMC¥.\n"
+"NAJEMCA zobowi¹zuje siê do zwrotu wypo¿yczonego pojazdu\n "+daneP.getMarka()+" "+daneP.getModel()+" "+daneP.getTyp()+" numer rejstacyjny: "+p.getNrRejstracyjny()
+"\ndo dnia i godziny "+f.format(dane.getDataGodzinaDo())+" oraz wp³aty p³atnoœci "+dane.getPlatnosc()
+"\nNAJEMCA jest zobowiazany do zwrotu pojazdu w nienaruszonym stanie.\n W przeciwnym razie kaucja wysokoœci "+dane.getKaucja()+" nie podlega zwrotowi."
+"\n"
+"\nPodpis pracownika                                                                                                   Podpis najemcy";
return s;
	}

	public String[] allCountries(){
		return Counties.counties;
	}



	public static void main(String[] args) {
		WypozyczenieModel m = new WypozyczenieModel();
	System.out.println(m.getWszystkieMarki()[0]);
	System.out.println(m.getModel("Ford")[0]);
	System.out.println(m.getOddzialy()[0]);
	System.out.println(m.getDanePojazdow().toArray()[0]);

	}

}