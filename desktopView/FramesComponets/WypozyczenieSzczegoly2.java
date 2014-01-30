package FramesComponets;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

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

import net.miginfocom.swing.MigLayout;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;


public class WypozyczenieSzczegoly2 extends CenterPanel {
	private JTable table_1;
	/**
	 * Create the panel.
	 */
	public WypozyczenieSzczegoly2() {


		setLayout(new MigLayout("", "[605.00,grow][]", "[grow]"));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, "cell 0 0,grow");

		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);

		JLabel lblPatnoci = new JLabel("P\u0142atno\u015Bci");

		JPanel panel_2 = new JPanel();

		JPanel panel_3 = new JPanel();

		JLabel lblModel = new JLabel("Model");

		JPanel panel_4 = new JPanel();

		JLabel lblAkcesoria = new JLabel("Akcesoria");

		JPanel panel_6 = new JPanel();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 716, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(lblPatnoci)
								.addContainerGap(788, Short.MAX_VALUE))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(lblModel)
								.addContainerGap(803, Short.MAX_VALUE))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
									.addComponent(panel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 561, GroupLayout.PREFERRED_SIZE)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(146)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblAkcesoria)
									.addPreferredGap(ComponentPlacement.RELATED, 661, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(124, Short.MAX_VALUE))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPatnoci)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblModel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblAkcesoria)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(227, Short.MAX_VALUE))
		);

		JCheckBox chckbxNawigacjaGps = new JCheckBox("Nawigacja GPS");

		JLabel lblCenaAkc1 = new JLabel("AkcesoriaVal");

		JCheckBox chckbxOdtwarzaczDvd = new JCheckBox("Odtwarzacz DVD");

		JCheckBox chckbxCbRadio = new JCheckBox("CB - Radio");

		JCheckBox chckbxacuchy = new JCheckBox("\u0141a\u0144cuchy");

		JLabel lblFotelikDlaDziecka = new JLabel("Fotelik dla dziecka (1-4 lat)");

		JLabel lblFotelikDlaDziecka_1 = new JLabel("Fotelik dla dziecka (4-8 lat)");

		JComboBox fotelik1Box = new JComboBox();

		JComboBox fotelik2Box = new JComboBox();

		JLabel lblPodkadkeNaFotelik = new JLabel("Podk\u0142adke na fotel dla dziecka");

		JComboBox fotelik3Box = new JComboBox();

		JLabel lblCenaAkc2 = new JLabel("AkcesoriaVal");

		JLabel lblCenaAkc3 = new JLabel("AkcesoriaVal");

		JLabel lblCenaAkc4 = new JLabel("AkcesoriaVal");

		JLabel lblCenaFotel1 = new JLabel("AkcesoriaVal");

		JLabel lblCenaFotel2 = new JLabel("AkcesoriaVal");

		JLabel lblCenafotel3 = new JLabel("AkcesoriaVal");
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(chckbxacuchy, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(chckbxCbRadio, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(chckbxOdtwarzaczDvd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(chckbxNawigacjaGps, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_6.createSequentialGroup()
									.addComponent(lblCenaAkc1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
									.addComponent(fotelik1Box, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_6.createSequentialGroup()
									.addComponent(lblCenaAkc2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
									.addComponent(fotelik2Box, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_6.createSequentialGroup()
									.addComponent(lblCenaAkc3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
									.addComponent(fotelik3Box, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblPodkadkeNaFotelik, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblFotelikDlaDziecka_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblFotelikDlaDziecka, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCenafotel3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCenaFotel2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCenaFotel1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblCenaAkc4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNawigacjaGps)
						.addComponent(lblCenaAkc1)
						.addComponent(lblFotelikDlaDziecka)
						.addComponent(fotelik1Box, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCenaFotel1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxOdtwarzaczDvd)
						.addComponent(lblFotelikDlaDziecka_1)
						.addComponent(fotelik2Box, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCenaAkc2)
						.addComponent(lblCenaFotel2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxCbRadio)
						.addComponent(lblPodkadkeNaFotelik)
						.addComponent(fotelik3Box, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCenaAkc3)
						.addComponent(lblCenafotel3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxacuchy)
						.addComponent(lblCenaAkc4))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);

		JLabel lblModelPojazdu = new JLabel("Model Pojazdu");

		JComboBox modelPojazduBox = new JComboBox();



		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.gray);

		JLabel lblCenaBruttodoba = new JLabel("Cena brutto/doba:");

		JLabel lblKaucja_1 = new JLabel("Kaucja:");

		JLabel lblCenabrval = new JLabel("cenaBrVal");

		JLabel lblKaucjaval = new JLabel("kaucjaVal");

		JPanel panel_7 = new JPanel();
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblModelPojazdu)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(modelPojazduBox, 0, 285, Short.MAX_VALUE))
						.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCenaBruttodoba, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblKaucja_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblKaucjaval)
								.addComponent(lblCenabrval, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
							.addGap(60))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblModelPojazdu)
								.addComponent(modelPojazduBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_5, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCenaBruttodoba)
						.addComponent(lblCenabrval))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKaucja_1)
						.addComponent(lblKaucjaval))
					.addContainerGap())
		);
		String[] columnNames = {"",
                "",};

Object[][] data = {{"Silnik, paliwo, spalanie","Poj. 1.2L 65KM"},
		{"Paliwo", "benzyna"},
		{"Srednie spalanie", "6.8L/100km"},
		{"Wyposarzenie","ABD, 4XAir bag, radio CD"},
		{"Liczba drzwi", 5},
		{"Liczba miejsc", 5},
		{"Pojemnoœæ baga¿nika", "600L"}
};

DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {

	@Override
	public boolean isCellEditable(int row, int column) {
		//all cells false
		return false;
	}
};
JTable table = new JTable(tableModel);
		panel_7.setLayout(new BorderLayout(0, 0));
		table_1 = new JTable(new DefaultTableModel(
			new Object[][] {
				{"Silnik, paliwo, spalanie", "Poj. 1.2L 65KM"},
				{"Paliwo", "benzyna"},
				{"Srednie spalanie", "6.8L/100km"},
				{"Wyposarzenie", "ABD, 4XAir bag, radio CD"},
				{"Liczba drzwi", new Integer(5)},
				{"Liczba miejsc", new Integer(5)},
				{"Pojemno\u015B\u0107 baga\u017Cnika", "600L"},
			},
			new String[] {
				"", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.setRowSelectionAllowed(false);
		panel_7.add(table_1);
		panel_4.setLayout(gl_panel_4);
		panel_5.setMaximumSize(new Dimension(panel_5.getWidth()*2, panel_5.getHeight()*2));

		DatePanel datePanelOd = new DatePanel("Od");

		DatePanel datePanelDo = new DatePanel("Do");

		JLabel lblOdGodziny = new JLabel("Od godziny:");

		JLabel lblDoGodziny = new JLabel("Do godziny:");

		JSpinner spinner = new JSpinner();

		JSpinner spinner_1 = new JSpinner();

		JSpinner spinner_2 = new JSpinner();

		JSpinner spinner_3 = new JSpinner();

		JLabel lblOdbir = new JLabel("Odbi\u00F3r");

		JLabel lblZwrot = new JLabel("Zwrot");

		JComboBox odbiorBox = new JComboBox();

		JComboBox zwrotBox = new JComboBox();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(datePanelOd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblOdGodziny))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(datePanelDo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblDoGodziny, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner_2, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblZwrot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblOdbir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(odbiorBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(zwrotBox, 0, 87, Short.MAX_VALUE))
					.addGap(123))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addComponent(datePanelOd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblOdGodziny)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOdbir)
								.addComponent(odbiorBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
							.addComponent(datePanelDo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(17)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDoGodziny)
								.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblZwrot)
								.addComponent(zwrotBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(null);

		JLabel lblZaliczka = new JLabel("Zaliczka");
		lblZaliczka.setBounds(10, 11, 37, 14);
		panel_2.add(lblZaliczka);

		JLabel lblDataWpaty = new JLabel("Data wp\u0142aty");
		lblDataWpaty.setBounds(10, 29, 69, 14);
		panel_2.add(lblDataWpaty);

		JLabel lblKwota = new JLabel("Kwota");
		lblKwota.setBounds(10, 54, 69, 14);
		panel_2.add(lblKwota);

		JLabel lblDatawplatyval = new JLabel("DataWplatyVal");
		lblDatawplatyval.setBounds(108, 29, 98, 14);
		panel_2.add(lblDatawplatyval);

		JLabel lblKwotaval = new JLabel("kwotaVal");
		lblKwotaval.setBounds(108, 54, 98, 14);
		panel_2.add(lblKwotaval);

		JLabel lblKaucja = new JLabel("Kaucja");
		lblKaucja.setBounds(286, 11, 46, 14);
		panel_2.add(lblKaucja);

		JLabel lblDataWpaty_1 = new JLabel("Data wp\u0142aty");
		lblDataWpaty_1.setBounds(286, 29, 82, 14);
		panel_2.add(lblDataWpaty_1);

		JLabel lblKwota_1 = new JLabel("Kwota");
		lblKwota_1.setBounds(286, 54, 82, 14);
		panel_2.add(lblKwota_1);

		JLabel lblDatawplatyzaliczkival = new JLabel("DataWplatyZaliczkiVal");
		lblDatawplatyzaliczkival.setBounds(381, 29, 98, 14);
		panel_2.add(lblDatawplatyzaliczkival);

		JLabel lblKwotazalival = new JLabel("kwotaZaliVal");
		lblKwotazalival.setBounds(378, 54, 101, 14);
		panel_2.add(lblKwotazalival);
		panel_1.setLayout(gl_panel_1);

		JPanel panel = new JPanel();
		add(panel, "cell 1 0,grow");

		JLabel lblOpcje = new JLabel("Opcje");

		JCheckBox chckbxEdytujDane = new JCheckBox("Edytuj dane");

		JButton btnPowrt = new JButton("Powr\u00F3t");

		JButton btnDalej = new JButton("Dalej");

		JButton btnWpataKaucji = new JButton("Wp\u0142ata kaucji");

		JButton btnWpataZaliczki = new JButton("Wp\u0142ata zaliczki");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblOpcje)
						.addComponent(chckbxEdytujDane)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnPowrt)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDalej))
						.addComponent(btnWpataKaucji, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
						.addComponent(btnWpataZaliczki, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOpcje)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxEdytujDane)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnWpataKaucji)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnWpataZaliczki)
					.addPreferredGap(ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPowrt)
						.addComponent(btnDalej))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		panel_4.setMaximumSize(new Dimension(500,300));

		setComponentsNames();
	}
}
