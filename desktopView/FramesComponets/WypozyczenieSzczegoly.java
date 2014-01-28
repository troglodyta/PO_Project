package FramesComponets;
import java.awt.Component;
import java.awt.Dimension;

import javax.security.auth.callback.TextInputCallback;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.Box;
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

import org.junit.experimental.theories.DataPoint;

import java.awt.BorderLayout;
import java.util.HashMap;


public class WypozyczenieSzczegoly extends JPanel {
	private JTextField txtImi;
	private JTextField txtNazwisko;
	private JTextField txtUlica;
	private JTextField txtKodPocztowy;
	private JTextField txtMiejscowo;
	private JTextField txtNrTelefonu;
	private JTextField txtEmail;
	private JTextField txtNumerPrawaJazdy;
	private JTextField txtNazwaFirmy;
	private JTextField txtUlica_1;
	private JTextField txtKodPocztowy_1;
	private JTextField txtMiejscowo_1;
	private JTextField txtNrNip;
	private JCheckBox checkEdytujDane;
	private JPanel panel_1;
	private JComboBox txtKrajWydania ;
	private JTextPane txtUwagi;
	private JCheckBox checkNajemFirmowy;
	private JComboBox comboPlec;
	private JPanel panel_3;
	private JButton powrot;
	private DatePanel datePanel;

	/**
	 * Create the panel.
	 */
	public void setCountries(String[] countries){
		for(String name : countries){
			txtKrajWydania.addItem(name);
		}
	}

	public void addButtonsListener(ActionListener l){
		powrot.addActionListener(l);
	}

	public void setContent(Rezerwacja rez){
		Klient klient = rez.getKlient();
		txtImi.setText(klient.getImie());
		Adres adres = klient.getAdres();
		txtNazwisko.setText(klient.getNazwisko());
		txtUlica.setText(adres.getUlica());
		txtKodPocztowy.setText(adres.getKodPocztowy());
		txtMiejscowo.setText(adres.getMiejscowosc());
		txtNrTelefonu.setText(klient.getNumerTelefonu());
		txtEmail.setText(klient.getEmail());
		if(!klient.getFirmy().isEmpty()){
			checkNajemFirmowy.setSelected(true);
			Firma firma = (Firma) klient.getFirmy().toArray()[0];
			txtNazwaFirmy.setText(firma.getNazwaFirmy());
			Adres adresFirmy = firma.getAdres();
			txtUlica_1.setText(adresFirmy.getUlica());
			txtKodPocztowy_1.setText(adresFirmy.getKodPocztowy());
			txtMiejscowo_1.setText(adresFirmy.getMiejscowosc());
			txtNrNip.setText(firma.getNIP());
		}
		txtKrajWydania.setSelectedItem(klient.getKrajWydaniaPrawaJazdy());
		datePanel.setDate(klient.getDataUrodzenia());
		txtNumerPrawaJazdy.setText(klient.getNumerPrawaJazdy());
		txtUwagi.setText(rez.getUwagi());
		int plecIndex = klient.getPlec().equals("M")? 0 : 1;
		comboPlec.setSelectedIndex(plecIndex);


	}

	public HashMap<String, Object> getFildsValue(){
		String imie = txtImi.getText();
		String nazwisko = txtNazwisko.getText();
		return null;
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

		comboPlec = new JComboBox(new String[]{"Pan", "Pani"});

		JLabel lblImi = new JLabel("Imi\u0119");

		JLabel lblNazwisko = new JLabel("Nazwisko");

		txtImi = new JTextField();
		txtImi.setText("Imi\u0119");
		txtImi.setColumns(10);

		txtNazwisko = new JTextField();
		txtNazwisko.setText("Nazwisko");
		txtNazwisko.setColumns(10);

		JLabel lblUlica = new JLabel("Ulica");

		txtUlica = new JTextField();
		txtUlica.setText("Ulica");
		txtUlica.setColumns(10);

		JLabel lblKodPocztowy = new JLabel("Kod pocztowy");

		txtKodPocztowy = new JTextField();
		txtKodPocztowy.setText("Kod pocztowy");
		txtKodPocztowy.setColumns(10);

		txtMiejscowo = new JTextField();
		txtMiejscowo.setText("Miejscowo\u015B\u0107");
		txtMiejscowo.setColumns(10);

		JLabel lblMiejscowo = new JLabel("Miejscowo\u015B\u0107");

		JLabel lblNrTelefonu = new JLabel("Nr Telefonu");

		txtNrTelefonu = new JTextField();
		txtNrTelefonu.setText("Nr Telefonu");
		txtNrTelefonu.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail");

		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		txtEmail.setColumns(10);
		JLabel lblNrPrawaJazdy = new JLabel("Nr prawa jazdy");

		txtNumerPrawaJazdy = new JTextField();
		txtNumerPrawaJazdy.setColumns(10);
		txtKrajWydania = new JComboBox();
		JLabel lblKrajWydania = new JLabel("Kraj wydania");

		JLabel lblUwagi = new JLabel("Uwagi");

		txtUwagi = new JTextPane();
		txtUwagi.setText("Uwagi");

		checkNajemFirmowy = new JCheckBox("Najem firmowy");

		JLabel lblNazwaFirmy = new JLabel("Nazwa firmy");

		txtNazwaFirmy = new JTextField();
		txtNazwaFirmy.setText("Nazwa firmy");
		txtNazwaFirmy.setColumns(10);

		JLabel lblUlica_1 = new JLabel("Ulica");

		txtUlica_1 = new JTextField();
		txtUlica_1.setText("Ulica");
		txtUlica_1.setColumns(10);

		JLabel lblKodPocztowy_1 = new JLabel("Kod pocztowy");

		txtKodPocztowy_1 = new JTextField();
		txtKodPocztowy_1.setText("Kod pocztowy");
		txtKodPocztowy_1.setColumns(10);

		JLabel lblMiejscowo_1 = new JLabel("Miejscowo\u015B\u0107");

		txtMiejscowo_1 = new JTextField();
		txtMiejscowo_1.setText("Miejscowo\u015B\u0107");
		txtMiejscowo_1.setColumns(10);

		JLabel lblNrNip = new JLabel("Nr NIP");

		txtNrNip = new JTextField();
		txtNrNip.setText("Nr NIP");
		txtNrNip.setColumns(10);

		datePanel = new DatePanel("Data urodzenia");
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
										.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
										.addComponent(txtNrTelefonu, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblKodPocztowy)
												.addComponent(txtKodPocztowy, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(lblMiejscowo)
													.addPreferredGap(ComponentPlacement.RELATED, 154, Short.MAX_VALUE))
												.addComponent(txtMiejscowo, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
										.addComponent(lblUlica)
										.addComponent(txtUlica, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblImi)
												.addComponent(txtImi, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addComponent(lblNazwisko)
													.addPreferredGap(ComponentPlacement.RELATED, 189, Short.MAX_VALUE))
												.addComponent(txtNazwisko, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNrPrawaJazdy, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblKrajWydania))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addComponent(txtNumerPrawaJazdy, GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
												.addComponent(txtKrajWydania, 0, 245, Short.MAX_VALUE)))
										.addComponent(datePanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
									.addGap(18))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNrTelefonu)
									.addGap(287))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(7)
							.addComponent(comboPlec, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNrNip)
							.addContainerGap(337, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNrNip, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(checkNajemFirmowy)
									.addComponent(lblNazwaFirmy)
									.addComponent(txtNazwaFirmy, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
									.addComponent(lblUlica_1)
									.addComponent(txtUlica_1))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblKodPocztowy_1)
										.addComponent(txtKodPocztowy_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(txtMiejscowo_1, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
										.addComponent(lblMiejscowo_1))))
							.addGap(146))))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUwagi)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtUwagi, GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboPlec, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkNajemFirmowy))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblImi)
								.addComponent(lblNazwaFirmy)))
						.addComponent(lblNazwisko))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtImi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNazwisko, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNazwaFirmy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUlica)
						.addComponent(lblUlica_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtUlica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUlica_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKodPocztowy)
						.addComponent(lblMiejscowo)
						.addComponent(lblKodPocztowy_1)
						.addComponent(lblMiejscowo_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtKodPocztowy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMiejscowo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtKodPocztowy_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMiejscowo_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNrTelefonu)
						.addComponent(lblNrNip))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNrTelefonu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNrNip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblEmail)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(datePanel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNrPrawaJazdy)
						.addComponent(txtNumerPrawaJazdy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtKrajWydania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKrajWydania))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(11)
							.addComponent(lblUwagi))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addComponent(txtUwagi, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
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
		JButton zapisz = new JButton("Zapisz");
		JButton anuluj = new JButton("Anuluj");
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
	}
}
