import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;


public class DanePojazdowSzczeguly extends JPanel 
{
	private JTextField txtNumerPolisy;
	private JTextField txtNrRejestracyjny;
	private JTextField txtNrIdentyfikacyjny;
	private JTextField txtMiejscaSiedzce;
	private JTextField txtMasaMax;
	private JTextField txtMasaDop;
	private JTextField txtMasaWasna;
	private JTextField txtPojenmo;
	private JTextField txtMocMax;
	private JTextField txtRodzajPaliwa;

	/**
	 * Create the panel.
	 */
	public DanePojazdowSzczeguly() 
	{
		setLayout(new MigLayout("", "[610.00,grow][grow]", "[25.00][437.00,grow]"));
		
		JPanel panel_2 = new JPanel();
		add(panel_2, "cell 0 0 2 1,grow");
		
		JLabel lblDanePojazdu = new JLabel("Dane Pojazdu");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDanePojazdu)
					.addContainerGap(732, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lblDanePojazdu)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 0 1,grow");
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		
		JLabel lblNrRejestracyjny = new JLabel("Nr rejestracyjny");
		
		txtNrRejestracyjny = new JTextField();
		txtNrRejestracyjny.setText("Nr rejestracyjny");
		txtNrRejestracyjny.setColumns(10);
		
		JLabel lblMarka = new JLabel("Marka");
		
		JComboBox cboxMarka = new JComboBox();
		
		JComboBox cboxModel = new JComboBox();
		
		JLabel lblModel = new JLabel("Model");
		
		JComboBox cboxTyp = new JComboBox();
		
		JLabel lblTyp = new JLabel("Typ");
		
		JLabel lblNrIdentyfikacyjny = new JLabel("Nr identyfikacyjny");
		
		txtNrIdentyfikacyjny = new JTextField();
		txtNrIdentyfikacyjny.setText("Nr identyfikacyjny");
		txtNrIdentyfikacyjny.setColumns(10);
		
		JLabel lblKategoria = new JLabel("Kategoria");
		
		JComboBox cboxKategoria = new JComboBox();
		
		JLabel lblMiejscaSiedzce = new JLabel("Miejsca siedz\u0105ce");
		
		txtMiejscaSiedzce = new JTextField();
		txtMiejscaSiedzce.setText("Miejsca siedz\u0105ce");
		txtMiejscaSiedzce.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(txtNrIdentyfikacyjny, Alignment.LEADING)
									.addComponent(lblNrRejestracyjny, Alignment.LEADING)
									.addComponent(txtNrRejestracyjny, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
								.addComponent(lblNrIdentyfikacyjny))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(cboxKategoria, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(cboxMarka, Alignment.LEADING, 0, 79, Short.MAX_VALUE)
									.addComponent(lblMarka, Alignment.LEADING))
								.addComponent(lblKategoria))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMiejscaSiedzce)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtMiejscaSiedzce, Alignment.LEADING)
										.addComponent(cboxModel, Alignment.LEADING, 0, 112, Short.MAX_VALUE)
										.addComponent(lblModel, Alignment.LEADING))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(cboxTyp, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTyp)))))
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNrRejestracyjny)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNrRejestracyjny, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMarka)
								.addComponent(lblModel)
								.addComponent(lblTyp))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(cboxMarka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cboxModel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cboxTyp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNrIdentyfikacyjny)
						.addComponent(lblKategoria)
						.addComponent(lblMiejscaSiedzce))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNrIdentyfikacyjny, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cboxKategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMiejscaSiedzce, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblMasaCakowitaMaxdop = new JLabel("masa ca\u0142kowita max/dop");
		
		txtMasaMax = new JTextField();
		txtMasaMax.setText("masa max");
		txtMasaMax.setColumns(10);
		
		JLabel label = new JLabel("/");
		
		txtMasaDop = new JTextField();
		txtMasaDop.setText("masa dop");
		txtMasaDop.setColumns(10);
		
		JLabel lblMasaWasna = new JLabel("Masa w\u0142asna");
		
		txtMasaWasna = new JTextField();
		txtMasaWasna.setText("masa w\u0142asna");
		txtMasaWasna.setColumns(10);
		
		JLabel lblPojemno = new JLabel("pojemno\u015B\u0107");
		
		txtPojenmo = new JTextField();
		txtPojenmo.setText("pojenmo\u015B\u0107");
		txtPojenmo.setColumns(10);
		
		JLabel lblMocMax = new JLabel("moc max");
		
		txtMocMax = new JTextField();
		txtMocMax.setText("moc max");
		txtMocMax.setColumns(10);
		
		JLabel lblRodzajPaliwa = new JLabel("rodzaj paliwa");
		
		txtRodzajPaliwa = new JTextField();
		txtRodzajPaliwa.setText("rodzaj paliwa");
		txtRodzajPaliwa.setColumns(10);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMasaCakowitaMaxdop)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPojemno, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(txtMasaMax, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label))
								.addComponent(txtPojenmo, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblMocMax, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
								.addComponent(txtMocMax, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
								.addComponent(txtMasaDop, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMasaWasna)
						.addComponent(txtMasaWasna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRodzajPaliwa)
						.addComponent(txtRodzajPaliwa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblMasaCakowitaMaxdop)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtMasaMax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label)
								.addComponent(txtMasaDop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblMasaWasna)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMasaWasna, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPojemno)
						.addComponent(lblMocMax)
						.addComponent(lblRodzajPaliwa))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMocMax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPojenmo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRodzajPaliwa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JLabel lblDataUbezpieczenia = new JLabel("Data ubezpieczenia");
		
		DatePanel datePanel = new DatePanel((String) null);
		
		JLabel lblNumerPolisy = new JLabel("Numer polisy");
		
		txtNumerPolisy = new JTextField();
		txtNumerPolisy.setText("Numer polisy");
		txtNumerPolisy.setColumns(10);
		
		JLabel lblUbezpieczyciel = new JLabel("Ubezpieczyciel");
		
		JComboBox cboxUbezpieczyciel = new JComboBox();
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(datePanel, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
						.addComponent(lblDataUbezpieczenia)
						.addComponent(lblNumerPolisy)
						.addComponent(txtNumerPolisy, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
						.addComponent(lblUbezpieczyciel)
						.addComponent(cboxUbezpieczyciel, 0, 241, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDataUbezpieczenia)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(datePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNumerPolisy)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNumerPolisy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblUbezpieczyciel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cboxUbezpieczyciel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		DatePanel dateWymianaOleju = new DatePanel("");
		
		DatePanel datePrzeglad = new DatePanel("");
		
		JLabel lblWymianaOleju = new JLabel("Wymiana oleju");
		
		JLabel lblDataPrzegldu = new JLabel("Data przegl\u0105du");
		
		JLabel lblDataProdukcji = new JLabel("Data produkcji");
		
		DatePanel dateProdukcja = new DatePanel((String) null);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblWymianaOleju)
						.addComponent(dateWymianaOleju, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
						.addComponent(lblDataPrzegldu)
						.addComponent(datePrzeglad, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
						.addComponent(lblDataProdukcji)
						.addComponent(dateProdukcja, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWymianaOleju)
					.addGap(3)
					.addComponent(dateWymianaOleju, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDataPrzegldu)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(datePrzeglad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDataProdukcji)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(dateProdukcja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, "cell 1 1,grow");
		
		JLabel lblOpcje = new JLabel("Opcje");
		
		JCheckBox chckbxModyfikujDane = new JCheckBox("Modyfikuj dane");
		
		JButton btnZapisz = new JButton("Zapisz");
		
		JButton btnAnuluj = new JButton("Anuluj");
		
		JButton btnUsu = new JButton("Usu\u0144");
		
		JButton btnPowrt = new JButton("Powr\u00F3t");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUsu, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
						.addComponent(chckbxModyfikujDane)
						.addComponent(lblOpcje)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnZapisz)
							.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
							.addComponent(btnAnuluj))
						.addComponent(btnPowrt, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOpcje)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxModyfikujDane)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnZapisz)
						.addComponent(btnAnuluj))
					.addGap(18)
					.addComponent(btnUsu)
					.addPreferredGap(ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
					.addComponent(btnPowrt)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
	}
}
