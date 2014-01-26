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

import entity.Klient;
import entity.Pojazd;
import entity.Rezerwacja;

import javax.swing.BoxLayout;


public class Wypozyczenie extends JFrame {

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

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Wypozyczenie frame = new Wypozyczenie();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
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



	public void setRezerwacjeTable(List<Object[]> rows) {
		DefaultTableModel tableModel = ((DefaultTableModel) rezerwacjeTable.getModel());
		for (int i = 0; i < tableModel.getRowCount(); i++) {
			((DefaultTableModel) rezerwacjeTable.getModel()).removeRow(0);
		}
		
		for(Object[] row: rows){
			tableModel.addRow(row);
		}
		
	}



	public JTabbedPane getKarty() {
		return karty;
	}



	public void setKarty(JTabbedPane karty) {
		this.karty = karty;
	}



	/**
	 * Create the frame.
	 */
	public Wypozyczenie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JButton btnWyloguj = new JButton("Wyloguj");
		
		JLabel lblZalogowanyJako = new JLabel("Zalogowany jako: ");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(509, Short.MAX_VALUE)
					.addComponent(lblZalogowanyJako)
					.addGap(92)
					.addComponent(btnWyloguj)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnWyloguj)
						.addComponent(lblZalogowanyJako))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		//panel.setLayout(new MigLayout("", "[]", "[]"));
		
		karty = new JTabbedPane(JTabbedPane.TOP);
		ButtonGroup newOrImport=new ButtonGroup();
		
		ButtonGroup status=new ButtonGroup();
		
		JPanel rezerwacje = new JPanel();
		karty.addTab("Rezerwacje", null, rezerwacje, null);
		
		JPanel zwroty = new JPanel();
		karty.addTab("Zwroty", null, zwroty, null);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
				.addComponent(karty, GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(karty, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
		);
		
		JPanel danePojazdow = new JPanel();
		karty.addTab("Dane pojazdów", null, danePojazdow, null);
		danePojazdow.setLayout(new MigLayout("", "[545.00,grow][]", "[][grow]"));
		
		JPanel panel_3 = new JPanel();
		danePojazdow.add(panel_3, "cell 0 0 2 1,grow");
		
		JButton button = new JButton("Dodaj");
		
		JButton button_1 = new JButton("Usu\u0144");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(7)
					.addComponent(button)
					.addGap(4)
					.addComponent(button_1)
					.addContainerGap(635, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(button)
						.addComponent(button_1)))
		);
		panel_3.setLayout(gl_panel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		danePojazdow.add(scrollPane_1, "cell 0 1,grow");
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_2 = new JPanel();
		danePojazdow.add(panel_2, "cell 1 1,grow");
		
		JLabel label_1 = new JLabel("Szukaj pojazd\u00F3w");
		
		JLabel label_2 = new JLabel("Marka");
		
		JLabel label_3 = new JLabel("Model");
		
		JComboBox cboxMarka = new JComboBox();
		
		JComboBox cboxModel = new JComboBox();
		
		JLabel label_4 = new JLabel("Nr rejestracyjny");
		
		txtNrRejestracyjny = new JTextField();
		txtNrRejestracyjny.setColumns(10);
		
		JLabel label_5 = new JLabel("Data przegl\u0105du");
		
		JLabel label_6 = new JLabel("Status");
		
		JRadioButton rbtnPojWszystkie = new JRadioButton("Wszystkie");
		
		JRadioButton rbtnPojWypozyczone = new JRadioButton("Wypo\u017Cyczone");
		
		JRadioButton rbtnPojWolne = new JRadioButton("Wolne");
		
		ButtonGroup statusPojazdu=new ButtonGroup();
		statusPojazdu.add(rbtnPojWszystkie);
		statusPojazdu.add(rbtnPojWypozyczone);
		statusPojazdu.add(rbtnPojWolne);
		
		JButton btnPojazdSzukaj = new JButton("Szukaj");
		
		DatePanel datePrzegladOd = new DatePanel("Od");
		
		DatePanel datePrzegladDo = new DatePanel("Do");
		
		JButton btnPojazdResetuj = new JButton("Resetuj");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnPojazdSzukaj, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnPojazdResetuj, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(48)
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
							.addGap(25))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(rbtnPojWolne, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(rbtnPojWszystkie, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(rbtnPojWypozyczone, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(label_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(cboxMarka, 0, 73, Short.MAX_VALUE))
								.addGap(4)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(label_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(cboxModel, 0, 80, Short.MAX_VALUE))))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(label_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtNrRejestracyjny, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
					.addGap(10))
				.addComponent(datePrzegladOd, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
				.addComponent(datePrzegladDo, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(cboxMarka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cboxModel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addComponent(label_4)
					.addGap(4)
					.addComponent(txtNrRejestracyjny, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(label_5)
					.addGap(4)
					.addComponent(datePrzegladOd, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(datePrzegladDo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label_6)
					.addGap(4)
					.addComponent(rbtnPojWszystkie)
					.addGap(4)
					.addComponent(rbtnPojWypozyczone)
					.addGap(4)
					.addComponent(rbtnPojWolne)
					.addGap(33)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPojazdSzukaj)
						.addComponent(btnPojazdResetuj))
					.addContainerGap(82, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel wypozyczenia = new JPanel();
		karty.addTab("Wypo¿yczenia", null, wypozyczenia, null);
		wypozyczenia.setLayout(new MigLayout("", "[][][309.00,grow][]", "[][grow]"));
		
		JRadioButton radioImportujDane = new JRadioButton("Importuj dane z rezerwacji");
		wypozyczenia.add(radioImportujDane, "cell 0 0");
		
		JRadioButton radioNoweWypozyczenie = new JRadioButton("Nowe wypo\u017Cyczenie");
		wypozyczenia.add(radioNoweWypozyczenie, "cell 1 0");
		newOrImport.add(radioNoweWypozyczenie);
		newOrImport.add(radioImportujDane);
		

		String[] names = new String[]{"Nr rezerwacji", "Imiê", "Nazwisko", "Pojazd", "Data utworzenia", "Status"};
		Object[][] v = new Object[][]{{1,"Jan","Kowalski","Skoda Fabia 1.2", "19-11-2013","Nie potwierdzona"}};
		rezerwacjeTable = new JTable(new DefaultTableModel(v, names));	
		JScrollPane scrollPane = new JScrollPane(rezerwacjeTable);
		wypozyczenia.add(scrollPane, "cell 0 1 3 1,grow");
		
		JPanel panel_1 = new JPanel();
		wypozyczenia.add(panel_1, "cell 3 1,grow");
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
		
		JRadioButton radioWszystkie = new JRadioButton("Wszystkie");
		panel_1.add(radioWszystkie, "cell 0 13 2 1");
		
		JRadioButton radioPotwierdzone = new JRadioButton("Potwierdzone");
		panel_1.add(radioPotwierdzone, "cell 0 14 2 1");
		
		JRadioButton radioNiepotwierdzone = new JRadioButton("Niepotwierdzone");
		panel_1.add(radioNiepotwierdzone, "cell 0 15 2 1");
		status.add(radioWszystkie);
		status.add(radioPotwierdzone);
		status.add(radioNiepotwierdzone);
		
		
		JButton przyciskSzukaj = new JButton("Szukaj");
		panel_1.add(przyciskSzukaj, "cell 0 17,growx");
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
