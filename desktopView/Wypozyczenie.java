import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JList;

import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
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


public class Wypozyczenie extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;
	private JTextField txtNrRejestracyjny;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wypozyczenie frame = new Wypozyczenie();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		
		JTabbedPane karty = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel wypozyczenia = new JPanel();
		karty.addTab("Wypo¿yczenia", null, wypozyczenia, null);
		wypozyczenia.setLayout(new MigLayout("", "[][][309.00,grow][]", "[][grow]"));
		
		JRadioButton rdbtnImportujDaneRezerwacji = new JRadioButton("Importuj dane z rezerwacji");
		wypozyczenia.add(rdbtnImportujDaneRezerwacji, "cell 0 0");
		
		JRadioButton rdbtnNoweWypoyczenie = new JRadioButton("Nowe wypo\u017Cyczenie");
		wypozyczenia.add(rdbtnNoweWypoyczenie, "cell 1 0");
		
		ButtonGroup newOrImport=new ButtonGroup();
		newOrImport.add(rdbtnNoweWypoyczenie);
		newOrImport.add(rdbtnImportujDaneRezerwacji);
		
		JScrollPane scrollPane = new JScrollPane();
		wypozyczenia.add(scrollPane, "cell 0 1 3 1,grow");
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		wypozyczenia.add(panel_1, "cell 3 1,grow");
		panel_1.setLayout(new MigLayout("", "[82.00,grow][100px,grow]", "[][][][][][][][][][][29.00][28.00][][][][][grow]"));
		
		JLabel lblWyszukajRezerwacje = new JLabel("Wyszukaj rezerwacje");
		panel_1.add(lblWyszukajRezerwacje, "cell 0 0 2 1");
		
		JLabel lblNrRezerwacji = new JLabel("Nr rezerwacji");
		panel_1.add(lblNrRezerwacji, "cell 0 1 2 1");
		
		textField = new JTextField();
		panel_1.add(textField, "cell 0 2 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblImi = new JLabel("Imi\u0119");
		panel_1.add(lblImi, "cell 0 3 2 1");
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "cell 0 4 2 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		panel_1.add(lblNazwisko, "cell 0 5 2 1");
		
		textField_2 = new JTextField();
		panel_1.add(textField_2, "cell 0 6 2 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblMarka = new JLabel("Marka");
		panel_1.add(lblMarka, "cell 0 7");
		
		JLabel lblModel = new JLabel("Model");
		panel_1.add(lblModel, "cell 1 7");
		
		JComboBox comboBox_1 = new JComboBox();
		panel_1.add(comboBox_1, "cell 0 8,growx");
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox, "cell 1 8,growx");
		
		JCheckBox chckbxDataUtworzenia = new JCheckBox("Data utworzenia");
		panel_1.add(chckbxDataUtworzenia, "cell 0 9 2 1");
		
		DatePanel datePanel = new DatePanel((String) null);
		panel_1.add(datePanel, "cell 0 10 2 1,grow");
		
		DatePanel datePanel_1 = new DatePanel((String) null);
		panel_1.add(datePanel_1, "cell 0 11 2 1,grow");
		
		JLabel lblStatus = new JLabel("Status");
		panel_1.add(lblStatus, "cell 0 12");
		
		JRadioButton rdbtnWszystkie = new JRadioButton("Wszystkie");
		panel_1.add(rdbtnWszystkie, "cell 0 13 2 1");
		
		JRadioButton rdbtnPotwierdzone = new JRadioButton("Potwierdzone");
		panel_1.add(rdbtnPotwierdzone, "cell 0 14 2 1");
		
		JRadioButton rdbtnNiepotwierdzone = new JRadioButton("Niepotwierdzone");
		panel_1.add(rdbtnNiepotwierdzone, "cell 0 15 2 1");
		
		ButtonGroup status=new ButtonGroup();
		status.add(rdbtnWszystkie);
		status.add(rdbtnPotwierdzone);
		status.add(rdbtnNiepotwierdzone);
		
		
		JButton btnSzukaj = new JButton("Szukaj");
		panel_1.add(btnSzukaj, "cell 0 16,growx");
		
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
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
