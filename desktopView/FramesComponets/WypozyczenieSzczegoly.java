package FramesComponets;
import java.awt.Component;
import java.awt.Dimension;

import javax.security.auth.callback.TextInputCallback;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.Box;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import com.toedter.calendar.JDateChooser;

import entity.*;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.text.MaskFormatter;

import org.junit.experimental.theories.DataPoint;

import java.awt.BorderLayout;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;


public class WypozyczenieSzczegoly extends CenterPanel {
	private JTextField imie;
	private JTextField nazwisko;
	private JTextField ulica;
	private JButton anuluj;
	private JTextField kodPocztowy;
	private JTextField miejscowosc;
	private JTextField numerTelefonu;
	private JTextField email;
	private JTextField numerPrawaJazdy;
	private JTextField nazwaFirmy;
	private JTextField ulicaF;
	private JTextField kodPocztowyF;
	private JTextField miejscowoscF;
	private JTextField NIP;
	private JCheckBox checkEdytujDane;
	private JPanel panel_1;
	private JComboBox krajWydaniaPrawaJazdy ;
	private JTextPane uwagi;
	private JCheckBox checkNajemFirmowy;
	private JComboBox plec;
	private JPanel panel_3;
	private JButton powrot;
	private DatePanel dataUrodzenia;
	private JButton zapisz;
	private Component[] klientComponets;
	private Component[] adresKlientComponets;
	private Component[] rezerwacjaComponets = {uwagi};
	private Component[] firmaComponents;
	private Component[] adresFirmy;

	/**
	 * Create the panel.
	 */
	public void setCountries(String[] countries){
		for(String name : countries){
			krajWydaniaPrawaJazdy.addItem(name);
		}
	}

	public void addButtonsListener(ActionListener l){
		powrot.addActionListener(l);
		zapisz.addActionListener(l);
		anuluj.addActionListener(l);
	}

	public void setContent(Rezerwacja rez){
		Klient klient = rez.getKlient();
		HashMap<String, Object> daneKlienta = klient.getFildsValues();

		fillFilds(klientComponets, daneKlienta);
		Adres adresKlienta = klient.getAdres();
		HashMap<String, Object> daneAdresuKlienta = adresKlienta.getFildsValues();

		fillFilds(adresKlientComponets, daneAdresuKlienta);

		DaneWypozyczenia daneWypozyczanie = rez.getDaneWypozyczenia();
		Firma firma = daneWypozyczanie.getFirma();
		if(firma != null){
			checkNajemFirmowy.setSelected(true);
			HashMap<String, Object> daneFirmy = firma.getFildsValues();
			fillFilds(firmaComponents, daneFirmy);
			HashMap<String, Object> daneAdresuFirmy = firma.getAdres().getFildsValues();
			fillFilds(adresFirmy, daneAdresuFirmy);
		}
		else{
			checkNajemFirmowy.setSelected(false);
			nazwaFirmy.setText("");
			ulicaF.setText("");
			kodPocztowyF.setText("");
			miejscowoscF.setText("");
			NIP.setText("");
		}

		uwagi.setText(rez.getUwagi());
		int plecIndex = klient.getPlec().equals("M")? 0 : 1;
		plec.setSelectedIndex(plecIndex);
	}





	public HashMap<String, Object>[] getFildsValue(){
		HashMap<String, Object> daneKlienta = new HashMap<String, Object>();
		HashMap<String, Object> daneFirmy = new HashMap<String, Object>();
		fillHashMap(klientComponets, daneKlienta);
		fillHashMap(adresKlientComponets, daneKlienta);
		fillHashMap(firmaComponents, daneFirmy);
		fillHashMap(adresFirmy, daneFirmy);
		String plecStr = plec.getSelectedItem().equals("Pan")? "M":"K";

		daneKlienta.put(plec.getName(), plecStr);
		daneKlienta.put(uwagi.getName(), uwagi.getText());

		HashMap[] dane = new HashMap[]{daneKlienta, daneFirmy};
		return dane;
	}

	public boolean isEditable() {
		return checkEdytujDane.isSelected();
	}

	public void setEditable(boolean editable){
		for(Component c : panel_1.getComponents()){
			c.setEnabled(editable);
		}
	}

	public void addEditableListener(ItemListener l){
		checkEdytujDane.addItemListener(l);

	}

	public WypozyczenieSzczegoly() {
		setLayout(new MigLayout("", "[605.00,grow][]", "[grow]"));

		JPanel panel_2 = new JPanel();
		add(panel_2, "cell 0 0,grow");
		panel_2.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane, BorderLayout.NORTH);
		scrollPane.setBounds(0, 0, 712, 578);

		panel_1 = new JPanel();
		panel_1.setMaximumSize(new Dimension(100,100));
		scrollPane.setViewportView(panel_1);

		plec = new JComboBox(new String[]{"Pan", "Pani"});

		JLabel lblImi = new JLabel("Imi\u0119");

		JLabel lblNazwisko = new JLabel("Nazwisko");

		imie = new JTextField();
		imie.setText("Imi\u0119");
		imie.setColumns(10);

		nazwisko = new JTextField();
		nazwisko.setText("Nazwisko");
		nazwisko.setColumns(10);

		JLabel lblUlica = new JLabel("Ulica");

		ulica = new JTextField();
		ulica.setText("Ulica");
		ulica.setColumns(10);

		JLabel lblKodPocztowy = new JLabel("Kod pocztowy");
		MaskFormatter mf1=null;
		try {
			mf1 = new MaskFormatter("##-###");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		kodPocztowy = new JFormattedTextField(mf1);
		kodPocztowy.setText("Kod pocztowy");
		kodPocztowy.setColumns(10);

		miejscowosc = new JTextField();
		miejscowosc.setText("Miejscowo\u015B\u0107");
		miejscowosc.setColumns(10);

		JLabel lblMiejscowo = new JLabel("Miejscowo\u015B\u0107");

		JLabel lblNrTelefonu = new JLabel("Nr Telefonu");

		numerTelefonu = new JTextField();
		numerTelefonu.setText("Nr Telefonu");
		numerTelefonu.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail");

		email = new JTextField();
		email.setText("E-mail");
		email.setColumns(10);
		JLabel lblNrPrawaJazdy = new JLabel("Nr prawa jazdy");

		numerPrawaJazdy = new JTextField();
		numerPrawaJazdy.setColumns(10);
		krajWydaniaPrawaJazdy = new JComboBox();
		JLabel lblKrajWydania = new JLabel("Kraj wydania");

		JLabel lblUwagi = new JLabel("Uwagi");

		uwagi = new JTextPane();
		uwagi.setText("Uwagi");

		checkNajemFirmowy = new JCheckBox("Najem firmowy");

		JLabel lblNazwaFirmy = new JLabel("Nazwa firmy");

		nazwaFirmy = new JTextField();
		nazwaFirmy.setText("Nazwa firmy");
		nazwaFirmy.setColumns(10);

		JLabel lblUlica_1 = new JLabel("Ulica");

		ulicaF = new JTextField();
		ulicaF.setText("Ulica");
		ulicaF.setColumns(10);

		JLabel lblKodPocztowy_1 = new JLabel("Kod pocztowy");

		kodPocztowyF = new JTextField();
		kodPocztowyF.setText("Kod pocztowy");
		kodPocztowyF.setColumns(10);

		JLabel lblMiejscowo_1 = new JLabel("Miejscowo\u015B\u0107");

		miejscowoscF = new JTextField();
		miejscowoscF.setText("Miejscowo\u015B\u0107");
		miejscowoscF.setColumns(10);

		JLabel lblNrNip = new JLabel("Nr NIP");

		NIP = new JTextField();
		NIP.setText("Nr NIP");
		NIP.setColumns(10);

		dataUrodzenia = new DatePanel("Data urodzenia");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEmail)
					.addContainerGap(695, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(email, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
										.addComponent(numerTelefonu, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblKodPocztowy)
												.addComponent(kodPocztowy, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(lblMiejscowo)
													.addPreferredGap(ComponentPlacement.RELATED, 154, Short.MAX_VALUE))
												.addComponent(miejscowosc, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
										.addComponent(lblUlica)
										.addComponent(ulica, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblImi)
												.addComponent(imie, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(lblNazwisko)
													.addPreferredGap(ComponentPlacement.RELATED, 189, Short.MAX_VALUE))
												.addComponent(nazwisko, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNrPrawaJazdy, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblKrajWydania))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(numerPrawaJazdy, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
												.addComponent(krajWydaniaPrawaJazdy, 0, 245, Short.MAX_VALUE)))
										.addComponent(dataUrodzenia, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
									.addGap(18))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNrTelefonu)
									.addGap(287))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(7)
							.addComponent(plec, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNrNip)
							.addContainerGap(337, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(NIP, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(checkNajemFirmowy)
									.addComponent(lblNazwaFirmy)
									.addComponent(nazwaFirmy, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
									.addComponent(lblUlica_1)
									.addComponent(ulicaF))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblKodPocztowy_1)
										.addComponent(kodPocztowyF, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(miejscowoscF, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
										.addComponent(lblMiejscowo_1))))
							.addGap(146))))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUwagi)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(uwagi, GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(plec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkNajemFirmowy))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblImi)
								.addComponent(lblNazwaFirmy)))
						.addComponent(lblNazwisko))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(imie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(nazwisko, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(nazwaFirmy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUlica)
						.addComponent(lblUlica_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(ulica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ulicaF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKodPocztowy)
						.addComponent(lblMiejscowo)
						.addComponent(lblKodPocztowy_1)
						.addComponent(lblMiejscowo_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(kodPocztowy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(miejscowosc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(kodPocztowyF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(miejscowoscF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNrTelefonu)
						.addComponent(lblNrNip))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(numerTelefonu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(NIP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblEmail)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dataUrodzenia, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNrPrawaJazdy)
						.addComponent(numerPrawaJazdy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(krajWydaniaPrawaJazdy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKrajWydania))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(11)
							.addComponent(lblUwagi))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addComponent(uwagi, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);

		JPanel panel = new JPanel();
		panel.setBounds(663, 0, 154, 444);
		add(panel, "cell 1 0,growx,aligny top");
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

				JPanel panel_4 = new JPanel();
				panel.add(panel_4);
				panel_4.setLayout(new BorderLayout(0, 0));

				panel_3 = new JPanel();
				panel_4.add(panel_3);
				panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));

						JLabel lblOpcje = new JLabel("Opcje");
						panel_3.add(lblOpcje);

								checkEdytujDane = new JCheckBox("Edytuj dane");
								panel_3.add(checkEdytujDane);
		zapisz = new JButton("Zapisz");
		anuluj = new JButton("Anuluj");
		JPanel panelZap = new JPanel(new GridLayout(1, 2));
		panel.add(Box.createRigidArea(new Dimension(0,15)));
		panelZap.add(zapisz);
		panelZap.add(anuluj);
		panel.add(panelZap);

		panel.add(Box.createRigidArea(new Dimension(0,500)));
		JPanel buttons = new JPanel(new GridLayout(1, 2));
		powrot = new JButton("Powrót");
		JButton dalej = new JButton("Dalej");
		buttons.add(powrot);
		buttons.add(dalej);
		panel.add(buttons);
		setEditable(false);

		// set component name
		setComponentsNames();

		miejscowoscF.setName("miejscowosc");
		ulicaF.setName("ulica");
		kodPocztowyF.setName("kodPocztowy");

		//pogrupowanie komponentów w tablice
		klientComponets= new Component[]{imie, nazwisko, numerTelefonu,email,dataUrodzenia,krajWydaniaPrawaJazdy, numerPrawaJazdy};
		adresKlientComponets = new Component[]{ulica, miejscowosc, kodPocztowy};
		firmaComponents = new Component[]{nazwaFirmy, NIP};
		adresFirmy = new Component[]{ulicaF, kodPocztowyF,miejscowoscF};
	}
}
