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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import entity.DaneModeluPojazdu;
import entity.Klient;
import entity.Pojazd;
import entity.Rezerwacja;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;


public class Wypozyczenie extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTextField txtNrRejestracyjny;
	private JTabbedPane karty;
	private ArrayList<JPanel> wypozyczeniePalels = new ArrayList<JPanel>();
	private JPanel currentWypozyczeniaPanel;

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

//	public JButton getPrzyciskSzukaj() {
//		return przyciskSzukaj;
//	}
//
//	public JRadioButton getRadioWszystkie() {
//		return radioWszystkie;
//	}
//
//	public JRadioButton getRadioPotwierdzone() {
//		return radioPotwierdzone;
//	}
//
//	public JRadioButton getRadioNiepotwierdzone() {
//		return radioNiepotwierdzone;
//	}
//
//	public JComboBox getComboModel() {
//		return comboModel;
//	}
//
//	public JComboBox getComboMarka() {
//		return comboMarka;
//	}
//
//	public JTextField getTextNrRezerwacji() {
//		return textNrRezerwacji;
//	}
//
//
//
//	public JDateChooser getDataOd() {
//		return dataOd;
//	}
//
//
//
//	public JDateChooser getDataDo() {
//		return dataDo;
//	}
//
//
//
//	public JCheckBox getCheckDataUtworzenia() {
//		return checkDataUtworzenia;
//	}
//
//
//
//	public void setTextNrRezerwacji(JTextField textNrRezerwacji) {
//		this.textNrRezerwacji = textNrRezerwacji;
//	}
//
//
//
//	public JTextField getTextImie() {
//		return textImie;
//	}
//
//
//
//	public void setTextImie(JTextField textImie) {
//		this.textImie = textImie;
//	}
//
//
//
//	public JTextField getTextNazwisko() {
//		return textNazwisko;
//	}
//
//
//
//	public void setTextNazwisko(JTextField textNazwisko) {
//		this.textNazwisko = textNazwisko;
//	}
//
//
//
//	public JTextField getTxtNrRejestracyjny() {
//		return txtNrRejestracyjny;
//	}
//
//
//
//	public void setTxtNrRejestracyjny(JTextField txtNrRejestracyjny) {
//		this.txtNrRejestracyjny = txtNrRejestracyjny;
//	}
//
//
//
//	public JTable getRezerwacjeTable() {
//		return rezerwacjeTable;
//	}
//
//
//
//	public void setRezerwacjeTable(List<Rezerwacja> rezerwacje) {
//		DefaultTableModel tableModel = ((DefaultTableModel) rezerwacjeTable.getModel());
//		while(tableModel.getRowCount()>0) {
//			((DefaultTableModel) rezerwacjeTable.getModel()).removeRow(0);
//		}
//
//		for (Rezerwacja r : rezerwacje) {
//			Klient k = r.getKlient();
//			Pojazd p = r.getDaneWypozyczenia().getPojazd();
//			DaneModeluPojazdu daneP = p.getDanePojazdu();
//			String status = r.getCzyPotwierdzona() ? "Potwiedzona"
//					: "Nie potwierdzona";
//			Object[] row = new Object[] {
//					r.getID(),
//					k.getImie(),
//					k.getNazwisko(),
//					daneP.getMarka() + " " + daneP.getModel() + " "
//					+ daneP.getTyp(),
//					r.getDataRezerwacji().toString(), status };
//			tableModel.addRow(row);
//		}
//
//	}

	public void setCurrentWypozyczeniaPanel(int index){
		//currentWypozyczeniaPanel = wypozyczeniePalels.get(index);
		currentWypozyczeniaPanel.remove(0);
		currentWypozyczeniaPanel.add(wypozyczeniePalels.get(index));
		this.revalidate();
		this.repaint();
		currentWypozyczeniaPanel.revalidate();
		currentWypozyczeniaPanel.repaint();
	}

	public JPanel getWypozyczeniaPanel(int index){
		return wypozyczeniePalels.get(index);
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
		setBounds(100, 100, 883, 730);
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
		JPanel szczegulyWypozyczenia1 = new WypozyczenieSzczegoly();
		JPanel szczegulyWypozyczenia2 = new WypozyczenieSzczegoly2();
		currentWypozyczeniaPanel = new JPanel();
		currentWypozyczeniaPanel.setLayout(new BorderLayout(0, 0));
		JPanel wypozyczeniePanel = new Wypozyczenie1Panel();
		FlowLayout flowLayout = (FlowLayout) wypozyczeniePanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		currentWypozyczeniaPanel.add(wypozyczeniePanel);
		wypozyczeniePalels.add(wypozyczeniePanel);
		wypozyczeniePalels.add(szczegulyWypozyczenia1);
		wypozyczeniePalels.add(szczegulyWypozyczenia2);
		
		karty.addTab("Wypo¿yczenia", null, currentWypozyczeniaPanel, null);

			
		String[] names = new String[]{"Nr rezerwacji", "Imiê", "Nazwisko", "Pojazd", "Data utworzenia", "Status"};
		Object[][] v = new Object[][]{{1,"Jan","Kowalski","Skoda Fabia 1.2", "19-11-2013","Nie potwierdzona"}};


		contentPane.setLayout(gl_contentPane);


	}
}
