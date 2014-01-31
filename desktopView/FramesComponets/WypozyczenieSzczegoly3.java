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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class WypozyczenieSzczegoly3 extends JPanel {
	private JCheckBox podpisanoUmowe;
	private JButton przyciskDrukuj;
	private JTextField nrRejstracyjny;
	private JTextPane umowa;
	private JLabel nazwaPojazdu;
	private JButton wypozycz;
	private JButton powrot;

	public void setUmowa(String s) {
		umowa.setText(s);
	}

	public boolean getPodpisanoUmoweEnable(){
		return podpisanoUmowe.isSelected();
	}

	public void setWypozyczEnable(boolean enable){
		wypozycz.setEnabled(enable);
	}


	public void addPodpisanoUmoweListener(ItemListener l){
		podpisanoUmowe.addItemListener(l);
	}

	public void setContent(Pojazd p){
		DaneModeluPojazdu daneP = p.getDanePojazdu();
		nrRejstracyjny.setText(p.getNrRejstracyjny());
		nazwaPojazdu.setText(daneP.getMarka()+" "+daneP.getModel()+" "+daneP.getTyp());
	}

	public void addButtonsListeners(ActionListener l) {
		przyciskDrukuj.addActionListener(l);
		wypozycz.addActionListener(l);
		powrot.addActionListener(l);
	}

	public WypozyczenieSzczegoly3() {

		JPanel panel = new JPanel();

		String[] names = new String[] { "Nr rezerwacji", "Imiê", "Nazwisko",
				"Pojazd", "Data utworzenia", "Status" };
		Object[][] v = new Object[][] { { 1, "Jan", "Kowalski",
				"Skoda Fabia 1.2", "19-11-2013", "Nie potwierdzona" } };

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 617, 231, 0 };
		gridBagLayout.rowHeights = new int[] { 516, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		add(scrollPane, gbc_scrollPane);
		scrollPane
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		umowa = new JTextPane();
		scrollPane.setViewportView(umowa);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.WEST;
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		add(panel_1, gbc_panel_1);
		panel_1.setLayout(new MigLayout("", "[82.00,grow][100px,grow]", "[][][][][][][][][][][29.00,grow][28.00,grow][][][][][grow][grow]"));

		JLabel lblWyszukajRezerwacje = new JLabel("Opcje");
		panel_1.add(lblWyszukajRezerwacje, "cell 0 0 2 1");

		podpisanoUmowe = new JCheckBox("Umowe podpisano");
		panel_1.add(podpisanoUmowe, "cell 0 1");

		przyciskDrukuj = new JButton("Drukuj umow\u0119");
		panel_1.add(przyciskDrukuj, "cell 0 2 2 4,grow");

		JLabel lblPojazdSkodaFabia = new JLabel("Pojazd");
		panel_1.add(lblPojazdSkodaFabia, "flowx,cell 0 6");

		JLabel lblNrRejstracyjny = new JLabel("Nr rejstracyjny");
		panel_1.add(lblNrRejstracyjny, "cell 0 7");

		nrRejstracyjny = new JTextField();
		nrRejstracyjny.setEditable(false);
		panel_1.add(nrRejstracyjny, "cell 0 8 2 1,growx");
		nrRejstracyjny.setColumns(10);

		powrot = new JButton("Powr\u00F3t");
		powrot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

				JButton szczegoly = new JButton("Szczego\u0142y");
				szczegoly.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				panel_1.add(szczegoly, "cell 0 9 2 1,grow");
		panel_1.add(powrot, "cell 0 17,growx,aligny center");

		wypozycz = new JButton("Wypo\u017Cycz");
		wypozycz.setEnabled(false);
		panel_1.add(wypozycz, "cell 1 17,growx,aligny center");

		nazwaPojazdu = new JLabel("New label");
		panel_1.add(nazwaPojazdu, "cell 0 6");

	}

}
