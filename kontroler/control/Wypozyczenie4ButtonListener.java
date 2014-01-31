package control;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import entity.DaneWypozyczenia;
import entity.Pojazd;
import entity.Pracownik;
import entity.Rezerwacja;
import entity.Umowa;
import entity.Wypozyczenie;
import model.DBManager;
import model.Model;
import model.SessionStore;
import model.WypozyczenieModel;

public class Wypozyczenie4ButtonListener extends AbstractSingleControler implements ActionListener {

	public Wypozyczenie4ButtonListener(Model model, Component view) {
		super(model, view);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String umowaString = (String) SessionStore.INSTANCE.load("umowa");
		WypozyczenieModel model = (WypozyczenieModel) this.getModel();
		switch (e.getActionCommand()) {
		case "Drukuj umowê":
			PrinterJob printer = PrinterJob.getPrinterJob();
	        printer.setPrintable(new PageToPrint(umowaString));
	        if (printer.printDialog()) {
	            try {
	                printer.print();
	            } catch (PrinterException ex) {
	               // System.err.println("Cholera, b³¹d!");
	            }
	        }
			break;
		case "Wypo¿ycz":
			List<Rezerwacja> rezerwacje= (List<Rezerwacja>) SessionStore.INSTANCE.load("rezerwacjeList");
			Integer currentIndex = (Integer) SessionStore.INSTANCE.load("indexRezerwacji");
			Rezerwacja rezerwacja = rezerwacje.get(currentIndex);
			Pracownik potwierdzaj¹cy = (Pracownik) SessionStore.INSTANCE.load("zalogowany");
			DaneWypozyczenia daneWyp = rezerwacja.getDaneWypozyczenia();
			Pojazd p = daneWyp.getPojazd();
			if(!p.getCzyWypozyczony()){
			Umowa umowa = new Umowa(0, new Date(), umowaString, null, rezerwacja.getKlient());
			Wypozyczenie w = new entity.Wypozyczenie(0,daneWyp,potwierdzaj¹cy,null,0,umowa);
			umowa.setWypozyczenie(w);
			p.setCzyWypozyczony(true);
			DBManager.INSTANCE.saveEntity(w);

			JOptionPane.showMessageDialog(this.getView(),"Pomyœlnie dokonano wypo¿yczenia");
			FramesComponets.Wypozyczenie wyp = (FramesComponets.Wypozyczenie) this.getView();
			List<Rezerwacja> rezerwacjeNew= model.getWszytkieRezerwacje();
			SessionStore.INSTANCE.store("rezerwacjeList", rezerwacjeNew);
			wyp.reload(rezerwacjeNew);
			break;
			}
			else{
				JOptionPane.showMessageDialog(this.getView(),"Ten pojazd zosta³ ju¿ wypo¿yczony");
			break;
			}

		case "Powrót":
			FramesComponets.Wypozyczenie wyp2 = (FramesComponets.Wypozyczenie) this.getView();
			wyp2.setCurrentWypozyczeniaPanel(2);
			break;
		default:
			break;
		}

	}
    private static class PageToPrint implements Printable {
    	private String s;
    	public PageToPrint(String s) {
    		this.s=s;
		}
        public int print(Graphics g, PageFormat pageFormat, int page) {
        	String[] spit = s.split("\n");
        	int i =15;
        	for(String s:spit){
            g.drawString(s, (int) pageFormat.getImageableX(),
                    (int) pageFormat.getImageableY() + i);
            i+=20;
        	}
            return (page == 0 ? PAGE_EXISTS : NO_SUCH_PAGE);
        }
       }

}
