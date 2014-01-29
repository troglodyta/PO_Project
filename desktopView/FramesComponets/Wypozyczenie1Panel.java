package FramesComponets;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.JTabbedPane;
import javax.swing.JList;

import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Label;
import java.awt.TextField;
import java.util.Date;
import java.util.List;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import entity.DaneModeluPojazdu;
import entity.Klient;
import entity.Pojazd;
import entity.Rezerwacja;

import javax.swing.BoxLayout;

public class Wypozyczenie1Panel extends JPanel {
	private JPanel contentPane;
	private JTextField textNrRezerwacji;
	private JTextField textImie;
	private JTextField textNazwisko;
	private JTable table_1;
	private JTextField txtNrRejestracyjny;
	private JTable rezerwacjeTable;
	private JTabbedPane karty;
	private JCheckBox checkDataUtworzenia;
	private JDateChooser dataOd;
	private JDateChooser dataDo;
	private JComboBox comboMarka;
	private JComboBox comboModel;
	private JButton przyciskSzukaj;
	private JRadioButton radioWszystkie;
	private JRadioButton radioPotwierdzone;
	private JRadioButton radioNiepotwierdzone;

	public JButton getPrzyciskSzukaj() {
		return przyciskSzukaj;
	}

	public JRadioButton getRadioWszystkie() {
		return radioWszystkie;
	}

	public JRadioButton getRadioPotwierdzone() {
		return radioPotwierdzone;
	}

	public JRadioButton getRadioNiepotwierdzone() {
		return radioNiepotwierdzone;
	}

	public JComboBox getComboModel() {
		return comboModel;
	}

	public JComboBox getComboMarka() {
		return comboMarka;
	}

	public JTextField getTextNrRezerwacji() {
		return textNrRezerwacji;
	}



	public JDateChooser getDataOd() {
		return dataOd;
	}



	public JDateChooser getDataDo() {
		return dataDo;
	}



	public JCheckBox getCheckDataUtworzenia() {
		return checkDataUtworzenia;
	}



	public void setTextNrRezerwacji(JTextField textNrRezerwacji) {
		this.textNrRezerwacji = textNrRezerwacji;
	}



	public JTextField getTextImie() {
		return textImie;
	}



	public void setTextImie(JTextField textImie) {
		this.textImie = textImie;
	}



	public JTextField getTextNazwisko() {
		return textNazwisko;
	}



	public void setTextNazwisko(JTextField textNazwisko) {
		this.textNazwisko = textNazwisko;
	}



	public JTextField getTxtNrRejestracyjny() {
		return txtNrRejestracyjny;
	}



	public void setTxtNrRejestracyjny(JTextField txtNrRejestracyjny) {
		this.txtNrRejestracyjny = txtNrRejestracyjny;
	}



	public JTable getRezerwacjeTable() {
		return rezerwacjeTable;
	}



	public void setRezerwacjeTable(List<Rezerwacja> rezerwacje) {
		DefaultTableModel tableModel = ((DefaultTableModel) rezerwacjeTable.getModel());
		while(tableModel.getRowCount()>0) {
			((DefaultTableModel) rezerwacjeTable.getModel()).removeRow(0);
		}

		for (Rezerwacja r : rezerwacje) {
			Klient k = r.getKlient();
			Pojazd p = r.getDaneWypozyczenia().getPojazd();
			DaneModeluPojazdu daneP = p.getDanePojazdu();
			String status = r.getCzyPotwierdzona() ? "Potwiedzona"
					: "Nie potwierdzona";
			Object[] row = new Object[] {
					r.getID(),
					k.getImie(),
					k.getNazwisko(),
					daneP.getMarka() + " " + daneP.getModel() + " "
					+ daneP.getTyp(),
					r.getDataRezerwacji().toString(), status };
			tableModel.addRow(row);
		}

	}

	public Wypozyczenie1Panel() {



		JPanel panel = new JPanel();
		ButtonGroup newOrImport=new ButtonGroup();

		ButtonGroup status=new ButtonGroup();
		JPanel wypozyczenia = new JPanel();
		//karty.addTab("Wypo¿yczenia", null, wypozyczenia, null);
		wypozyczenia.setLayout(new MigLayout("", "[]", "[]"));

		JPanel panel_2 = new JPanel();
		wypozyczenia.add(panel_2, "cell 0 0,grow");
		panel_2.setLayout(new BorderLayout(0, 0));
		JPanel PrzegladanieRezerwacji = new JPanel();
		panel_2.add(PrzegladanieRezerwacji, BorderLayout.WEST);
		PrzegladanieRezerwacji.setLayout(new MigLayout("", "[][][309.00,grow][]", "[][grow]"));

		JRadioButton radioImportujDane = new JRadioButton("Importuj dane z rezerwacji");
		PrzegladanieRezerwacji.add(radioImportujDane, "cell 0 0");
		newOrImport.add(radioImportujDane);

		JRadioButton radioNoweWypozyczenie = new JRadioButton("Nowe wypo\u017Cyczenie");
		PrzegladanieRezerwacji.add(radioNoweWypozyczenie, "cell 1 0");
		newOrImport.add(radioNoweWypozyczenie);

		String[] names = new String[]{"Nr rezerwacji", "Imiê", "Nazwisko", "Pojazd", "Data utworzenia", "Status"};
		Object[][] v = new Object[][]{{1,"Jan","Kowalski","Skoda Fabia 1.2", "19-11-2013","Nie potwierdzona"}};
		DefaultTableModel tableModel = new DefaultTableModel(v, names) {

			@Override
			public boolean isCellEditable(int row, int column) {
				//all cells false
				return false;
			}
		};
		
		rezerwacjeTable = new JTable(tableModel);

						JScrollPane scrollPane = new JScrollPane(rezerwacjeTable);
						PrzegladanieRezerwacji.add(scrollPane, "cell 0 1 3 1,grow");

										JPanel panel_1 = new JPanel();
										PrzegladanieRezerwacji.add(panel_1, "cell 3 1,grow");
										panel_1.setLayout(new MigLayout("", "[82.00,grow][100px,grow]", "[][][][][][][][][][][29.00,grow][28.00,grow][][][][][grow][grow]"));

														JLabel lblWyszukajRezerwacje = new JLabel("Wyszukaj rezerwacje");
														panel_1.add(lblWyszukajRezerwacje, "cell 0 0 2 1");

																		JLabel lblNrRezerwacji = new JLabel("Nr rezerwacji");
																		panel_1.add(lblNrRezerwacji, "cell 0 1 2 1");

																						textNrRezerwacji = new JTextField();
																						panel_1.add(textNrRezerwacji, "cell 0 2 2 1,growx");
																						textNrRezerwacji.setColumns(10);

																										JLabel lblImi = new JLabel("Imi\u0119");
																										panel_1.add(lblImi, "cell 0 3 2 1");

																														textImie = new JTextField();
																														panel_1.add(textImie, "cell 0 4 2 1,growx");
																														textImie.setColumns(10);

																																		JLabel lblNazwisko = new JLabel("Nazwisko");
																																		panel_1.add(lblNazwisko, "cell 0 5 2 1");

																																						textNazwisko = new JTextField();
																																						panel_1.add(textNazwisko, "cell 0 6 2 1,growx");
																																						textNazwisko.setColumns(10);

																																										JLabel lblMarka = new JLabel("Marka");
																																										panel_1.add(lblMarka, "cell 0 7");

																																														JLabel lblModel = new JLabel("Model");
																																														panel_1.add(lblModel, "cell 1 7");

																																																		comboMarka = new JComboBox();
																																																		panel_1.add(comboMarka, "cell 0 8,growx");

																																																						comboModel = new JComboBox();
																																																						panel_1.add(comboModel, "cell 1 8,growx");

																																																										checkDataUtworzenia = new JCheckBox("Data utworzenia");
																																																										panel_1.add(checkDataUtworzenia, "cell 0 9 2 1");

																																																														JPanel panel_4 = new JPanel();
																																																														panel_1.add(panel_4, "cell 0 10 2 1,grow");
																																																														panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));

																																																																		JLabel lblOd = new JLabel("Od  ");
																																																																		panel_4.add(lblOd);

																																																																						dataOd = new JDateChooser();
																																																																						dataOd.setEnabled(false);
																																																																						panel_4.add(dataOd);

																																																																										JPanel panel_5 = new JPanel();
																																																																										panel_1.add(panel_5, "cell 0 11 2 1,grow");
																																																																										panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));

																																																																														JLabel lblDo = new JLabel("Do  ");
																																																																														panel_5.add(lblDo);

																																																																																		dataDo = new JDateChooser((Date) null);
																																																																																		dataDo.setEnabled(false);
																																																																																		panel_5.add(dataDo);

																																																																																						JLabel lblStatus = new JLabel("Status");
																																																																																						panel_1.add(lblStatus, "cell 0 12");

																																																																																										radioWszystkie = new JRadioButton("Wszystkie");
																																																																																										radioWszystkie.setSelected(true);
																																																																																										panel_1.add(radioWszystkie, "cell 0 13 2 1");

																																																																																														radioPotwierdzone = new JRadioButton("Potwierdzone");
																																																																																														panel_1.add(radioPotwierdzone, "cell 0 14 2 1");

																																																																																																		radioNiepotwierdzone = new JRadioButton("Niepotwierdzone");
																																																																																																		panel_1.add(radioNiepotwierdzone, "cell 0 15 2 1");
																																																																																																		status.add(radioWszystkie);
																																																																																																		status.add(radioPotwierdzone);
																																																																																																		status.add(radioNiepotwierdzone);


																																																																																																						przyciskSzukaj = new JButton("Szukaj");
																																																																																																						panel_1.add(przyciskSzukaj, "cell 0 17 2 1,growx");


				add(wypozyczenia);

	}

}
