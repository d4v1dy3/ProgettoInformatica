package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaccia {

	private JFrame frame;
	private JTextField txtLaDiscoteca;
	private JTextField textField_1;
	private JTextField txtNome;
	private JTextField txtCognome;
	private JTextField txtEntrata;
	private JTextField txtEt;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtIngresso;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JPanel Visualizza;
	private JTextField textField_4;
	private JTextField txtNome_1;
	private JTextField txtCognome_1;
	private JTextField txtEntrata_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField txtUscita_1;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JPanel Esci;
	private JTextField textField_29;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JCheckBox chckbxNewCheckBox_4;
	private JCheckBox chckbxNewCheckBox_5;
	private JCheckBox chckbxNewCheckBox_6;
	private JCheckBox chckbxNewCheckBox_7;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JButton btnNewButton_4;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaccia window = new Interfaccia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaccia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Home = new JPanel();
		frame.getContentPane().add(Home, "name_67418652593919");
		Home.setLayout(null);
		
		JPanel Inserisci = new JPanel();
		Inserisci.setBackground(new Color(255, 102, 204));
		frame.getContentPane().add(Inserisci, "name_67537173380510");
		Inserisci.setLayout(null);
		
		JButton btnNewButton = new JButton("Vieni A Far Festa!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.setVisible(false);
				Inserisci.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(170, 260, 160, 49);
		Home.add(btnNewButton);
		btnNewButton.setIcon(null);
		btnNewButton.setSelectedIcon(new ImageIcon(Interfaccia.class.getResource("/View/festa-coronavirus.jpg")));
		btnNewButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 14));
		
		txtLaDiscoteca = new JTextField();
		txtLaDiscoteca.setBounds(0, 0, 500, 40);
		Home.add(txtLaDiscoteca);
		txtLaDiscoteca.setBackground(new Color(153, 50, 204));
		txtLaDiscoteca.setEditable(false);
		txtLaDiscoteca.setFont(new Font("Bodoni 72 Oldstyle", Font.ITALIC, 15));
		txtLaDiscoteca.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaDiscoteca.setText("La Discoteca By Diggh & Sbortoo");
		txtLaDiscoteca.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 0, 255));
		lblNewLabel.setBounds(0, 0, 500, 394);
		Home.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Interfaccia.class.getResource("/View/mansion-miami.jpg")));
		
		JPanel Entrata = new JPanel();
		frame.getContentPane().add(Entrata, "name_67755038939529");
		Entrata.setLayout(null);
		
		btnNewButton_9 = new JButton("Avanti");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entrata.setVisible(false);
				Visualizza.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(383, 6, 117, 29);
		Entrata.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("Indietro");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entrata.setVisible(false);
				Inserisci.setVisible(true);
			}
		});
		btnNewButton_10.setBounds(0, 6, 117, 29);
		Entrata.add(btnNewButton_10);
		
		textField_1 = new JTextField();
		textField_1.setText("La Discoteca By Diggh & Sbortoo");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Bodoni 72 Oldstyle", Font.ITALIC, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(153, 50, 204));
		textField_1.setBounds(0, 0, 500, 40);
		Entrata.add(textField_1);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setText("Nome:");
		txtNome.setBounds(6, 66, 130, 26);
		Entrata.add(txtNome);
		txtNome.setColumns(10);
		
		txtCognome = new JTextField();
		txtCognome.setEditable(false);
		txtCognome.setText("Cognome:");
		txtCognome.setBounds(6, 114, 130, 26);
		Entrata.add(txtCognome);
		txtCognome.setColumns(10);
		
		txtEntrata = new JTextField();
		txtEntrata.setEditable(false);
		txtEntrata.setText("Entrata");
		txtEntrata.setBounds(6, 233, 130, 26);
		Entrata.add(txtEntrata);
		txtEntrata.setColumns(10);
		
		txtEt = new JTextField();
		txtEt.setEditable(false);
		txtEt.setText("Età:");
		txtEt.setBounds(6, 165, 130, 26);
		Entrata.add(txtEt);
		txtEt.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(171, 66, 130, 26);
		Entrata.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(171, 114, 130, 26);
		Entrata.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(171, 165, 130, 26);
		Entrata.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Costo e Tipo", "Tavolo = 2,5€/h", "Privè = 5€/h", "Prevendita = 15€"}));
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(171, 234, 130, 27);
		Entrata.add(comboBox);
		
		txtIngresso = new JTextField();
		txtIngresso.setEditable(false);
		txtIngresso.setText("Ingresso");
		txtIngresso.setBounds(6, 306, 130, 26);
		Entrata.add(txtIngresso);
		txtIngresso.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.LIGHT_GRAY);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Ore", "20 ", "21", "22", "23", "00", "01", "02", "03", "04", "05", "06"}));
		comboBox_1.setBounds(171, 308, 130, 25);
		Entrata.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.LIGHT_GRAY);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Minuti ", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		comboBox_2.setBounds(313, 307, 115, 27);
		Entrata.add(comboBox_2);
		
		
		Visualizza = new JPanel();
		frame.getContentPane().add(Visualizza, "name_121948058798144");
		Visualizza.setLayout(null);
		
		btnNewButton_7 = new JButton("Indietro");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Visualizza.setVisible(false);
				Entrata.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(0, 13, 117, 29);
		Visualizza.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Avanti");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Esci.setVisible(true);
				Visualizza.setVisible(false);
			}
		});
		btnNewButton_8.setBounds(383, 13, 117, 29);
		Visualizza.add(btnNewButton_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(0, 6, 500, 40);
		textField_4.setText("La Discoteca By Diggh & Sbortoo");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Bodoni 72 Oldstyle", Font.ITALIC, 15));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(153, 50, 204));
		Visualizza.add(textField_4);
		
		txtNome_1 = new JTextField();
		txtNome_1.setEditable(false);
		txtNome_1.setBackground(Color.LIGHT_GRAY);
		txtNome_1.setText("Nome ");
		txtNome_1.setBounds(10, 58, 100, 26);
		Visualizza.add(txtNome_1);
		txtNome_1.setColumns(10);
		
		txtCognome_1 = new JTextField();
		txtCognome_1.setEditable(false);
		txtCognome_1.setBackground(Color.LIGHT_GRAY);
		txtCognome_1.setText("Cognome");
		txtCognome_1.setBounds(150, 58, 100, 26);
		Visualizza.add(txtCognome_1);
		txtCognome_1.setColumns(10);
		
		txtEntrata_1 = new JTextField();
		txtEntrata_1.setEditable(false);
		txtEntrata_1.setText("Entrata");
		txtEntrata_1.setBackground(Color.LIGHT_GRAY);
		txtEntrata_1.setBounds(300, 58, 75, 26);
		Visualizza.add(txtEntrata_1);
		txtEntrata_1.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(10, 96, 100, 26);
		Visualizza.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(10, 134, 100, 26);
		Visualizza.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(10, 172, 100, 26);
		Visualizza.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(10, 210, 100, 26);
		Visualizza.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(10, 248, 100, 26);
		Visualizza.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(10, 286, 100, 26);
		Visualizza.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(10, 324, 100, 26);
		Visualizza.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(150, 96, 100, 26);
		Visualizza.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(150, 134, 100, 26);
		Visualizza.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(150, 172, 100, 26);
		Visualizza.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(150, 210, 100, 26);
		Visualizza.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(150, 248, 100, 26);
		Visualizza.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(150, 286, 100, 26);
		Visualizza.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(150, 324, 100, 26);
		Visualizza.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(300, 96, 75, 26);
		Visualizza.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(300, 134, 75, 26);
		Visualizza.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(300, 172, 75, 26);
		Visualizza.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(300, 210, 75, 26);
		Visualizza.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(300, 248, 75, 26);
		Visualizza.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(300, 286, 75, 26);
		Visualizza.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(300, 324, 75, 26);
		Visualizza.add(textField_25);
		
		txtUscita_1 = new JTextField();
		txtUscita_1.setText("Uscita");
		txtUscita_1.setEditable(false);
		txtUscita_1.setColumns(10);
		txtUscita_1.setBackground(Color.LIGHT_GRAY);
		txtUscita_1.setBounds(404, 58, 75, 26);
		Visualizza.add(txtUscita_1);
		
		textField_51 = new JTextField();
		textField_51.setEditable(false);
		textField_51.setColumns(10);
		textField_51.setBounds(404, 96, 75, 26);
		Visualizza.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setEditable(false);
		textField_52.setColumns(10);
		textField_52.setBounds(404, 134, 75, 26);
		Visualizza.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setEditable(false);
		textField_53.setColumns(10);
		textField_53.setBounds(404, 172, 75, 26);
		Visualizza.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setEditable(false);
		textField_54.setColumns(10);
		textField_54.setBounds(404, 210, 75, 26);
		Visualizza.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setEditable(false);
		textField_55.setColumns(10);
		textField_55.setBounds(404, 248, 75, 26);
		Visualizza.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setEditable(false);
		textField_56.setColumns(10);
		textField_56.setBounds(404, 286, 75, 26);
		Visualizza.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setEditable(false);
		textField_57.setColumns(10);
		textField_57.setBounds(404, 324, 75, 26);
		Visualizza.add(textField_57);
		
		Esci = new JPanel();
		Esci.setLayout(null);
		frame.getContentPane().add(Esci, "name_123770689002122");
		
		JButton btnNewButton_5 = new JButton("Indietro");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Esci.setVisible(false);
				Visualizza.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(6, 13, 117, 29);
		Esci.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Avanti");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Esci.setVisible(false);
				Home.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(383, 13, 117, 29);
		Esci.add(btnNewButton_6);
		
		textField_29 = new JTextField();
		textField_29.setText("La Discoteca By Diggh & Sbortoo");
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setFont(new Font("Bodoni 72 Oldstyle", Font.ITALIC, 15));
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBackground(new Color(153, 50, 204));
		textField_29.setBounds(0, 6, 500, 40);
		Esci.add(textField_29);
		
		textField_58 = new JTextField();
		textField_58.setText("Nome ");
		textField_58.setEditable(false);
		textField_58.setColumns(10);
		textField_58.setBackground(Color.LIGHT_GRAY);
		textField_58.setBounds(10, 58, 100, 26);
		Esci.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setText("Cognome");
		textField_59.setEditable(false);
		textField_59.setColumns(10);
		textField_59.setBackground(Color.LIGHT_GRAY);
		textField_59.setBounds(150, 58, 100, 26);
		Esci.add(textField_59);
		
		textField_61 = new JTextField();
		textField_61.setEditable(false);
		textField_61.setColumns(10);
		textField_61.setBounds(10, 96, 100, 26);
		Esci.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setEditable(false);
		textField_62.setColumns(10);
		textField_62.setBounds(10, 134, 100, 26);
		Esci.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setEditable(false);
		textField_63.setColumns(10);
		textField_63.setBounds(10, 172, 100, 26);
		Esci.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setEditable(false);
		textField_64.setColumns(10);
		textField_64.setBounds(10, 210, 100, 26);
		Esci.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		textField_65.setBounds(10, 248, 100, 26);
		Esci.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setEditable(false);
		textField_66.setColumns(10);
		textField_66.setBounds(10, 286, 100, 26);
		Esci.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setEditable(false);
		textField_67.setColumns(10);
		textField_67.setBounds(10, 324, 100, 26);
		Esci.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setEditable(false);
		textField_68.setColumns(10);
		textField_68.setBounds(150, 96, 100, 26);
		Esci.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setEditable(false);
		textField_69.setColumns(10);
		textField_69.setBounds(150, 134, 100, 26);
		Esci.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setEditable(false);
		textField_70.setColumns(10);
		textField_70.setBounds(150, 172, 100, 26);
		Esci.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setEditable(false);
		textField_71.setColumns(10);
		textField_71.setBounds(150, 210, 100, 26);
		Esci.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setEditable(false);
		textField_72.setColumns(10);
		textField_72.setBounds(150, 248, 100, 26);
		Esci.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setEditable(false);
		textField_73.setColumns(10);
		textField_73.setBounds(150, 286, 100, 26);
		Esci.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setEditable(false);
		textField_74.setColumns(10);
		textField_74.setBounds(150, 324, 100, 26);
		Esci.add(textField_74);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("01");
		chckbxNewCheckBox_1.setBounds(272, 136, 50, 23);
		Esci.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("00");
		chckbxNewCheckBox_2.setBounds(275, 98, 50, 23);
		Esci.add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("02");
		chckbxNewCheckBox_3.setBounds(273, 174, 50, 23);
		Esci.add(chckbxNewCheckBox_3);
		
		chckbxNewCheckBox_4 = new JCheckBox("03");
		chckbxNewCheckBox_4.setBounds(274, 213, 50, 23);
		Esci.add(chckbxNewCheckBox_4);
		
		chckbxNewCheckBox_5 = new JCheckBox("04");
		chckbxNewCheckBox_5.setBounds(272, 249, 50, 23);
		Esci.add(chckbxNewCheckBox_5);
		
		chckbxNewCheckBox_6 = new JCheckBox("05");
		chckbxNewCheckBox_6.setBounds(272, 288, 50, 23);
		Esci.add(chckbxNewCheckBox_6);
		
		chckbxNewCheckBox_7 = new JCheckBox("06");
		chckbxNewCheckBox_7.setBounds(271, 325, 50, 23);
		Esci.add(chckbxNewCheckBox_7);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.LIGHT_GRAY);
		comboBox_3.setBounds(273, 61, 107, 25);
		Esci.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBackground(Color.LIGHT_GRAY);
		comboBox_4.setBounds(385, 62, 109, 27);
		Esci.add(comboBox_4);
		
		btnNewButton_4 = new JButton("Premere per Uscire");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Esci.setVisible(false);
				Visualizza.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(354, 211, 117, 29);
		Esci.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("Inserisci");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inserisci.setVisible(false);
				Entrata.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(151, 244, 189, 41);
		Inserisci.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Esci ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inserisci.setVisible(false);
				Esci.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(28, 83, 189, 41);
		Inserisci.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Visualizza \nEntrata");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inserisci.setVisible(false);
				Visualizza.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(270, 83, 189, 41);
		Inserisci.add(btnNewButton_3);
	}
}