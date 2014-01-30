package FramesComponets;
import java.awt.Color;
import java.awt.Component;
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
import javax.swing.SpinnerDateModel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;

import entity.DaneModeluPojazdu;

import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.util.List;


public class WypozyczenieSzczegoly2 extends CenterPanel {
	private JTable danePojazdu;
	private JComboBox oddzialOdbioru;
	private JComboBox oddzialZwrotu;
	private JComboBox modelPojazdu;

	public void setOddzialyCombo(String[] oddzialy){
		for (int i = 0; i<oddzialOdbioru.getItemCount(); i++) {
			oddzialOdbioru.removeItemAt(0);
			oddzialZwrotu.removeItemAt(0);
		}

		for(String s : oddzialy){
			oddzialOdbioru.addItem(s);
			oddzialZwrotu.addItem(s);
		}
	}

	public void setComboPojazdy(List<DaneModeluPojazdu> modele){
		for (int i = 0; i<modelPojazdu.getItemCount(); i++) {
			modelPojazdu.removeItemAt(0);
		}

		for(DaneModeluPojazdu model:modele){
			String pojazd = model.getMarka()+" "+model.getModel()+" "+model.getTyp();
			modelPojazdu.addItem(pojazd);
		}
	}
	
	public void setModelListener(ItemListener l){
		modelPojazdu.addItemListener(l);
	}
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
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_4, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPatnoci, Alignment.LEADING)
						.addComponent(lblModel, Alignment.LEADING)
						.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
							.addComponent(lblAkcesoria)
							.addPreferredGap(ComponentPlacement.RELATED, 1089, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_6, Alignment.LEADING, 0, 0, Short.MAX_VALUE))
					.addGap(175))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPatnoci)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblModel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAkcesoria)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(250, Short.MAX_VALUE))
		);

		JCheckBox nawigacjaGPS = new JCheckBox("Nawigacja GPS");

		JLabel lblCenaAkc1 = new JLabel("AkcesoriaVal");

		JCheckBox odtwarzaczDVD = new JCheckBox("Odtwarzacz DVD");

		JCheckBox CBRadio = new JCheckBox("CB - Radio");

		JCheckBox lancuchy = new JCheckBox("\u0141a\u0144cuchy");

		JLabel lblFotelikDlaDziecka = new JLabel("Fotelik dla dziecka (1-4 lat)");

		JLabel lblFotelikDlaDziecka_1 = new JLabel("Fotelik dla dziecka (4-8 lat)");

		JComboBox fotelik1 = new JComboBox();

		JComboBox fotelik2 = new JComboBox();

		JLabel lblPodkadkeNaFotelik = new JLabel("Podk\u0142adke na fotel dla dziecka");

		JComboBox podkladka = new JComboBox();

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
						.addComponent(lancuchy, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(CBRadio, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(odtwarzaczDVD, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(nawigacjaGPS, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCenaAkc1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCenaAkc2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCenaAkc3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
							.addGap(96)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(fotelik1, 0, 41, Short.MAX_VALUE)
								.addComponent(fotelik2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(podkladka, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFotelikDlaDziecka_1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblFotelikDlaDziecka, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblPodkadkeNaFotelik, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCenafotel3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCenaFotel2, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
								.addComponent(lblCenaFotel1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
							.addGap(344))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addComponent(lblCenaAkc4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(946, Short.MAX_VALUE))))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFotelikDlaDziecka)
								.addComponent(fotelik1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCenaFotel1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFotelikDlaDziecka_1)
								.addComponent(fotelik2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCenaFotel2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPodkadkeNaFotelik)
								.addComponent(podkladka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCenafotel3)))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(nawigacjaGPS)
								.addComponent(lblCenaAkc1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(odtwarzaczDVD)
								.addComponent(lblCenaAkc2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(CBRadio)
								.addComponent(lblCenaAkc3))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
								.addComponent(lancuchy)
								.addComponent(lblCenaAkc4))))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_6.setLayout(gl_panel_6);

		JLabel lblModelPojazdu = new JLabel("Model Pojazdu");

		modelPojazdu = new JComboBox();



		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.gray);

		JLabel lblCenaBruttodoba = new JLabel("Cena brutto/doba:");

		JLabel lblKaucja_1 = new JLabel("Kaucja:");

		JLabel lblCenabrval = new JLabel("cenaBrVal");

		JLabel lblKaucjaval = new JLabel("kaucjaVal");

		JPanel panel_7 = new JPanel();
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblModelPojazdu)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(modelPojazdu, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCenaBruttodoba, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblKaucja_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblKaucjaval)
								.addComponent(lblCenabrval, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)))
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblModelPojazdu)
								.addComponent(modelPojazdu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCenaBruttodoba)
						.addComponent(lblCenabrval))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKaucja_1)
						.addComponent(lblKaucjaval)))
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
		danePojazdu = new JTable(new DefaultTableModel(
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
		danePojazdu.setRowSelectionAllowed(false);
		panel_7.add(danePojazdu);
		panel_4.setLayout(gl_panel_4);
		panel_5.setMaximumSize(new Dimension(panel_5.getWidth()*2, panel_5.getHeight()*2));

		DatePanel dataGodzinaOd = new DatePanel("Od");

		DatePanel dataGodzinaDo = new DatePanel("Do");

		JLabel lblOdGodziny = new JLabel("Od godziny:");

		JLabel lblDoGodziny = new JLabel("Do godziny:");

		SpinnerDateModel spinnerModel1 = new SpinnerDateModel();

		JLabel lblOdbir = new JLabel("Odbi\u00F3r");

		JLabel lblZwrot = new JLabel("Zwrot");

		oddzialOdbioru = new JComboBox();

		oddzialZwrotu = new JComboBox();

		SpinnerDateModel spinnerModel = new SpinnerDateModel();
		JSpinner spinner = new JSpinner(spinnerModel);
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner, "HH:mm");
	    spinner.setEditor(dateEditor);
		JSpinner spinner_1 = new JSpinner(spinnerModel1);
		JSpinner.DateEditor dateEditor1 = new JSpinner.DateEditor(spinner_1, "HH:mm");
		spinner_1.setEditor(dateEditor1);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(dataGodzinaOd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblOdGodziny)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(dataGodzinaDo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblDoGodziny, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
					.addGap(35)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblZwrot, Alignment.LEADING)
						.addComponent(lblOdbir, Alignment.LEADING))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(oddzialOdbioru, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(oddzialZwrotu, 0, 233, Short.MAX_VALUE))
					.addGap(569))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblOdbir)
							.addComponent(oddzialOdbioru, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblOdGodziny)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addComponent(dataGodzinaOd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(dataGodzinaDo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblDoGodziny)
							.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
							.addComponent(oddzialZwrotu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblZwrot)))
					.addGap(16))
		);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(null);

		JLabel lblZaliczka = new JLabel("Zaliczka");
		lblZaliczka.setBounds(10, 11, 61, 14);
		panel_2.add(lblZaliczka);

		JLabel lblDataWpaty = new JLabel("Data wp\u0142aty");
		lblDataWpaty.setBounds(10, 29, 69, 14);
		panel_2.add(lblDataWpaty);

		JLabel lblKwota = new JLabel("Kwotatxt");
		lblKwota.setBounds(10, 54, 69, 14);
		panel_2.add(lblKwota);

		JLabel dataWpatyZaliczki = new JLabel("DataWplatyVal");
		dataWpatyZaliczki.setBounds(108, 29, 98, 14);
		panel_2.add(dataWpatyZaliczki);

		JLabel platnosc = new JLabel("kwotaVal");
		platnosc.setBounds(108, 54, 98, 14);
		panel_2.add(platnosc);

		JLabel lblKaucja = new JLabel("Kaucja");
		lblKaucja.setBounds(321, 11, 46, 14);
		panel_2.add(lblKaucja);

		JLabel lblDataWpaty_1 = new JLabel("Data wp\u0142aty");
		lblDataWpaty_1.setBounds(321, 29, 82, 14);
		panel_2.add(lblDataWpaty_1);

		JLabel lblKwota_1 = new JLabel("Kwota");
		lblKwota_1.setBounds(321, 54, 82, 14);
		panel_2.add(lblKwota_1);

		JLabel dataWplatyKaucji = new JLabel("DataWplatyZaliczkiVal");
		dataWplatyKaucji.setBounds(413, 29, 127, 14);
		panel_2.add(dataWplatyKaucji);

		JLabel kaucja = new JLabel("kwotaZaliVal");
		kaucja.setBounds(413, 54, 101, 14);
		panel_2.add(kaucja);

		JLabel lblWpaconaZaliczka = new JLabel("Wp\u0142acona zaliczka");
		lblWpaconaZaliczka.setBounds(10, 79, 98, 14);
		panel_2.add(lblWpaconaZaliczka);

		JLabel wplaconaZaliczka = new JLabel("kwotaVal");
		wplaconaZaliczka.setBounds(108, 79, 98, 14);
		panel_2.add(wplaconaZaliczka);

		JLabel lblWpaconaKaucja = new JLabel("Wp\u0142acona kaucja");
		lblWpaconaKaucja.setBounds(321, 79, 82, 14);
		panel_2.add(lblWpaconaKaucja);

		JLabel wplaconaKaucja = new JLabel("kwotaZaliVal");
		wplaconaKaucja.setBounds(413, 79, 101, 14);
		panel_2.add(wplaconaKaucja);
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
