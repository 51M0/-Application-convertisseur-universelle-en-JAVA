package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import principal.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.plaf.PanelUI;

import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;

public class Interf extends JFrame implements ActionListener {
	private JPanel contentPane, panel, panelInputD, panelInputMoney, panelInputSpeed;
	private JTextField txtDistanceFRom, txtDeviseFRom, txtSpeedfrom;
	private JTextField txtDeviseTo, txtSpeedTo, txtDistanceTo;
	private JLabel lblTo;
	private JButton btnConvert;
	private JComboBox cBoxDistanceFrom, cBoxDistanceTo, cBoxDeviseFrom, cBoxDeviseTo, cBoxTempsFrom, cBoxSpeedDFrom,
			cBoxSpeedTFrom ,cBoxTempsTo;
	private JMenuItem mntmDevise = new JMenuItem("Devise");
	private JMenuItem mntmDistance = new JMenuItem("Distance");
	private JMenuItem mntmTemps =new JMenuItem("temps");
	private JLabel lblTo_1;
	private JLabel lblTo_2;
	private JPanel panel_1;
	private JPanel panel_2;
	private JMenuItem mntmVitesse = new JMenuItem("Vitesse");
	private JComboBox CBoxSpeedDTo;
	private JComboBox CBoxSpeedTTo;
	private JPanel panelInputTemps;
	private JTextField txtTempsfrom;
	private JLabel TO;
	private JTextField txtTempsTo;
	private JComboBox cBoxTempsTO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interf frame = new Interf();
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
	public Interf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		/// Panel for a button
		JPanel minipanel = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) minipanel.getLayout();
		flowLayout_2.setVgap(20);
		minipanel.setBorder(new LineBorder(new Color(135, 206, 235), 3));
		minipanel.setBackground(new Color(135, 206, 250));
		contentPane.add(minipanel, BorderLayout.SOUTH);

		btnConvert = new JButton("convert");
		minipanel.add(btnConvert);
		btnConvert.setVisible(false);

		panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setVgap(20);
		panel.setBorder(new LineBorder(new Color(135, 206, 235), 3));
		panel.setBackground(new Color(135, 206, 250));
		panel.setSize(400, 300);
		contentPane.add(panel, BorderLayout.NORTH);

		// Panel for other Grandeur
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar);

		// Menu Items
		JMenu grandeur = new JMenu("Grandeur");
		menuBar.add(grandeur);

		
		grandeur.add(mntmTemps);
		mntmTemps.addActionListener(this);
		mntmTemps.setActionCommand("Temps");

		grandeur.add(mntmDistance);
		mntmDistance.addActionListener(this);

		grandeur.add(mntmDevise);
		mntmDevise.addActionListener(this);

		grandeur.add(mntmVitesse);
		mntmVitesse.addActionListener(this);

		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new CardLayout(0, 0));

		panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		panel_1.add(panel_2, "name_92463830470713");
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setVisible(false);

		///// Embedded panel for Input: Distance
		panelInputD = new JPanel();
		panel_1.add(panelInputD, "name_92223426256783");
		FlowLayout flowLayoutD = (FlowLayout) panelInputD.getLayout();
		flowLayoutD.setVgap(20);
		flowLayoutD.setHgap(10);
		panelInputD.setBorder(new LineBorder(new Color(135, 206, 250), 3));
		panelInputD.setBackground(new Color(135, 206, 250));
		panelInputD.setVisible(false);

		txtDistanceFRom = new JTextField();
		panelInputD.add(txtDistanceFRom);
		txtDistanceFRom.setColumns(10);
		txtDistanceFRom.setBounds(2, 10, 10, 10);
		txtDistanceFRom.setSize(30, 30);

		cBoxDistanceFrom = new JComboBox();
		cBoxDistanceFrom.setModel(new DefaultComboBoxModel(new String[] { "M", "km", "ft", "in", "cm", "mm", "mil" }));
		panelInputD.add(cBoxDistanceFrom);

		lblTo_2 = new JLabel("TO");
		lblTo_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelInputD.add(lblTo_2);

		cBoxDistanceTo = new JComboBox();
		cBoxDistanceTo.setModel(new DefaultComboBoxModel(new String[] { "M", "km", "ft", "in", "cm", "mm", "mil" }));
		panelInputD.add(cBoxDistanceTo);

		txtDistanceTo = new JTextField("resusltat");
		txtDistanceTo.setEnabled(false);
		txtDistanceTo.setText("Resultat");
		panelInputD.add(txtDistanceTo);
		txtDistanceTo.setColumns(10);

		///// Embedded panel for Input: Devise
		panelInputMoney = new JPanel();
		panel_1.add(panelInputMoney, "name_92231944919440");
		FlowLayout flowLayoutMoney = (FlowLayout) panelInputMoney.getLayout();
		flowLayoutMoney.setVgap(20);
		flowLayoutMoney.setHgap(10);
		panelInputMoney.setBorder(new LineBorder(new Color(135, 206, 250), 3));
		panelInputMoney.setBackground(new Color(135, 206, 250));
		panelInputMoney.setVisible(false);

		txtDeviseFRom = new JTextField();
		txtDeviseFRom.setText("0");
		panelInputMoney.add(txtDeviseFRom);
		txtDeviseFRom.setColumns(10);
		txtDeviseFRom.setBounds(2, 10, 10, 10);
		txtDeviseFRom.setSize(30, 30);

		cBoxDeviseFrom = new JComboBox();
		cBoxDeviseFrom.setModel(new DefaultComboBoxModel(new String[] { "\u20AC", "$", "dh", "\u20AC", "$" }));
		panelInputMoney.add(cBoxDeviseFrom);
		cBoxDeviseFrom.addItem("€");
		cBoxDeviseFrom.addItem("$");

		lblTo_1 = new JLabel("TO");
		lblTo_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelInputMoney.add(lblTo_1);

		cBoxDeviseTo = new JComboBox();
		cBoxDeviseTo.setModel(new DefaultComboBoxModel(new String[] { "\u20AC", "$", "dh" }));
		panelInputMoney.add(cBoxDeviseTo);
		cBoxDeviseTo.addItem("€");
		cBoxDeviseTo.addItem("$");

		txtDeviseTo = new JTextField();
		txtDeviseTo.setEnabled(false);
		txtDeviseTo.setText("Resultat");
		panelInputMoney.add(txtDeviseTo);
		txtDeviseTo.setColumns(10);

		///// Embedded panel for Input: Vitesse
		panelInputSpeed = new JPanel();
		panel_1.add(panelInputSpeed, "name_92231944919440");
		FlowLayout flowLayoutSpeed = (FlowLayout) panelInputSpeed.getLayout();
		flowLayoutSpeed.setVgap(20);
		flowLayoutSpeed.setHgap(10);
		panelInputSpeed.setBorder(new LineBorder(new Color(135, 206, 250), 3));
		panelInputSpeed.setBackground(new Color(135, 206, 250));
		panelInputSpeed.setVisible(false);

		/*
		 * txtDistanceFRom = new JTextField(); txtDistanceFRom.setText("0");
		 * panelInputSpeed.add(txtDistanceFRom); txtDistanceFRom.setColumns(10);
		 * txtDistanceFRom.setBounds(2, 10, 10, 10); txtDistanceFRom.setSize(30,
		 * 30);
		 */

		txtSpeedfrom = new JTextField();
		txtSpeedfrom.setText("0");
		panelInputSpeed.add(txtSpeedfrom);
		txtSpeedfrom.setColumns(10);
		txtSpeedfrom.setBounds(2, 10, 10, 10);
		txtSpeedfrom.setSize(30, 30);

		cBoxSpeedDFrom = new JComboBox();
		cBoxSpeedDFrom.setModel(new DefaultComboBoxModel(new String[] { "M", "km", "ft", "in", "cm", "mm", "mil" }));
		panelInputSpeed.add(cBoxSpeedDFrom);
		cBoxSpeedDFrom.addItem("m/s");
		cBoxSpeedDFrom.addItem("ft/s");
		cBoxSpeedDFrom.addItem("nd");

		cBoxSpeedTFrom = new JComboBox();
		cBoxSpeedTFrom
				.setModel(new DefaultComboBoxModel(new String[] { "S", "min", "H", "J", "mms", "m/s", "ft/s", "nd" }));
		panelInputSpeed.add(cBoxSpeedTFrom);
		cBoxSpeedTFrom.addItem("m/s");
		cBoxSpeedTFrom.addItem("ft/s");
		cBoxSpeedTFrom.addItem("nd");

		lblTo = new JLabel("TO");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelInputSpeed.add(lblTo);

		CBoxSpeedDTo = new JComboBox();
		CBoxSpeedDTo.setModel(new DefaultComboBoxModel(new String[] { "M", "km", "ft", "in", "cm", "mm", "mil" }));
		panelInputSpeed.add(CBoxSpeedDTo);

		CBoxSpeedTTo = new JComboBox();
		CBoxSpeedTTo.setModel(new DefaultComboBoxModel(new String[] { "S", "min", "H", "J", "mms" }));
		panelInputSpeed.add(CBoxSpeedTTo);

		txtSpeedTo = new JTextField();
		txtSpeedTo.setEnabled(false);
		txtSpeedTo.setText("Resultat");
		panelInputSpeed.add(txtSpeedTo);
		txtSpeedTo.setColumns(10);
		
		panelInputTemps = new JPanel();
		panel_1.add(panelInputTemps, "name_1534673168562");
		panelInputTemps.setBackground(new Color(135, 206, 250));
		panelInputTemps.setVisible(false);
		
		txtTempsfrom= new JTextField();
		txtTempsfrom.setText("0");
		panelInputTemps.add(txtTempsfrom);
		txtTempsfrom.setColumns(10);
		
		cBoxTempsFrom= new JComboBox();
		cBoxTempsFrom.setModel(new DefaultComboBoxModel(new String[] {"S", "mms", "min", "H", "J", "M", "ans"}));
		panelInputTemps.add(cBoxTempsFrom);
		
		TO = new JLabel("TO");
		TO.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelInputTemps.add(TO);
		
		cBoxTempsTo= new JComboBox();
		cBoxTempsTo.setModel(new DefaultComboBoxModel(new String[] {"S", "mms", "min", "H", "J", "M", "ans"}));
		panelInputTemps.add(cBoxTempsTo);
		
		txtTempsTo = new JTextField();
		panelInputTemps.add(txtTempsTo);
		txtTempsTo.setColumns(10);
		txtTempsTo.setEditable(false);
		btnConvert.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		btnConvert.setVisible(true);
		if (e.getSource().equals(mntmDevise)) {
			panelInputSpeed.setVisible(false);
			panel_2.setVisible(false);
			panelInputD.setVisible(false);
			panelInputMoney.setVisible(true);
			panelInputTemps.setVisible(false);
		}
		if (e.getSource().equals(mntmDistance)) {
			panelInputSpeed.setVisible(false);
			panel_2.setVisible(false);
			panelInputMoney.setVisible(false);
			panelInputD.setVisible(true);
			panelInputTemps.setVisible(false);
		}
		if (e.getSource().equals(mntmVitesse)) {
			panelInputSpeed.setVisible(true);
			panel_2.setVisible(false);
			panelInputD.setVisible(false);
			panelInputMoney.setVisible(false);
			panelInputTemps.setVisible(false);
		}
		if (e.getSource().equals(mntmTemps)) {
			panelInputSpeed.setVisible(false);
			panel_2.setVisible(false);
			panelInputD.setVisible(false);
			panelInputMoney.setVisible(false);
			panelInputTemps.setVisible(true);
		}

		if (e.getSource().equals(btnConvert)) {
			if (panelInputD.isVisible()) {
				String unitfrom = (String) cBoxDistanceFrom.getSelectedItem();
				String unitto = (String) cBoxDistanceTo.getSelectedItem();
				String t = txtDistanceFRom.getText();
				try {
					double d = Double.parseDouble(t);
					try {

						Map<String, UniteDistance> M = LoadF.LoadDistance();
						M.get(unitfrom).setamount(d);
						Unite.Converetion(M.get(unitfrom), M.get(unitto));
						txtDistanceTo.setText(String.valueOf((float)M.get(unitto).getamount()));

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
					}
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}

			}
			if (panelInputMoney.isVisible()) {
				String unitfrom = (String) cBoxDeviseFrom.getSelectedItem();
				String unitto = (String) cBoxDeviseTo.getSelectedItem();
				String t = txtDeviseFRom.getText();
				try {
					double d = Double.parseDouble(t);
					try {

						Map<String, UniteDevise> M = LoadF.LoadDevise();
						M.get(unitfrom).setamount(d);
						Unite.Converetion(M.get(unitfrom), M.get(unitto));
						txtDeviseTo.setText(String.valueOf((float) M.get(unitto).getamount()));

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
					}
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}

			}
			if (panelInputSpeed.isVisible()) {

				String unitdistancefrom = (String) cBoxSpeedDFrom.getSelectedItem();
				String unitdistanceto = (String) CBoxSpeedDTo.getSelectedItem();
				String unittempsfrom = (String) cBoxSpeedTFrom.getSelectedItem();
				String unittempsto = (String) CBoxSpeedTTo.getSelectedItem();
				String t = txtSpeedfrom.getText();
				try {
					double d = Double.parseDouble(t);
					try {

						Map<String, UniteDistance> distance = LoadF.LoadDistance();
						Map<String, UniteTemps> temps = LoadF.LoadTemps();
						UniteVitesse unitVfrom = new UniteVitesse(
								distance.get(unitdistancefrom).getNom() + "/" + temps.get(unittempsfrom).getNom(),
								unitdistancefrom + "/" + unitdistanceto, distance.get(unitdistancefrom),
								temps.get(unittempsfrom));
						UniteVitesse unitVto = new UniteVitesse(
								distance.get(unitdistanceto).getNom() + "/" + temps.get(unittempsto).getNom(),
								unitdistanceto + "/" + unitdistanceto, distance.get(unitdistanceto),
								temps.get(unittempsto));
						unitVfrom.setamount(d);
						UniteComp.Converetion(unitVfrom, unitVto);

						txtSpeedTo.setText(String.valueOf((float)unitVto.getamount()));

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
					}
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if (panelInputTemps.isVisible()) {

				String uniteTempsfrom = (String) cBoxTempsFrom.getSelectedItem();
				String unittempsto = (String) cBoxTempsTo.getSelectedItem();
				String t = txtTempsfrom.getText();
				try {
					double d = Double.parseDouble(t);
					try {
						Map<String, UniteTemps> T = LoadF.LoadTemps();
						T.get(uniteTempsfrom).setamount(d);
						Unite.Converetion(T.get(uniteTempsfrom), T.get(unittempsto));
						txtTempsTo.setText(String.valueOf((float) T.get(unittempsto).getamount()));
                         } catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
					}
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}

	}

}
