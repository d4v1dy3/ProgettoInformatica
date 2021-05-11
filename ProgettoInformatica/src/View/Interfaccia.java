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
		
		JPanel dati = new JPanel();
		frame.getContentPane().add(dati, "name_67537173380510");
		dati.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Inserisci");
		btnNewButton_1.setBounds(40, 89, 117, 29);
		dati.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Esci ");
		btnNewButton_2.setBounds(189, 241, 117, 29);
		dati.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Visualizza");
		btnNewButton_3.setBounds(340, 89, 117, 29);
		dati.add(btnNewButton_3);
		
		JPanel home = new JPanel();
		frame.getContentPane().add(home, "name_67418652593919");
		home.setLayout(null);
		
		JButton btnNewButton = new JButton("Vieni A Far Festa!");
		btnNewButton.setBounds(45, 290, 145, 29);
		home.add(btnNewButton);
		btnNewButton.setIcon(null);
		btnNewButton.setSelectedIcon(new ImageIcon(Interfaccia.class.getResource("/View/festa-coronavirus.jpg")));
		btnNewButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 12));
		
		txtLaDiscoteca = new JTextField();
		txtLaDiscoteca.setBounds(0, 0, 500, 40);
		home.add(txtLaDiscoteca);
		txtLaDiscoteca.setBackground(new Color(153, 50, 204));
		txtLaDiscoteca.setEditable(false);
		txtLaDiscoteca.setFont(new Font("Bodoni 72 Oldstyle", Font.ITALIC, 15));
		txtLaDiscoteca.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaDiscoteca.setText("La Discoteca By Diggh & Sbortoo");
		txtLaDiscoteca.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 500, 394);
		home.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Interfaccia.class.getResource("/View/mansion-miami.jpg")));
		
		JPanel campi = new JPanel();
		frame.getContentPane().add(campi, "name_67755038939529");
		campi.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setText("La Discoteca By Diggh & Sbortoo");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Bodoni 72 Oldstyle", Font.ITALIC, 15));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(153, 50, 204));
		textField_1.setBounds(0, 0, 500, 40);
		campi.add(textField_1);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setText("Nome:");
		txtNome.setBounds(6, 66, 130, 26);
		campi.add(txtNome);
		txtNome.setColumns(10);
		
		txtCognome = new JTextField();
		txtCognome.setEditable(false);
		txtCognome.setText("Cognome:");
		txtCognome.setBounds(6, 114, 130, 26);
		campi.add(txtCognome);
		txtCognome.setColumns(10);
		
		txtEntrata = new JTextField();
		txtEntrata.setEditable(false);
		txtEntrata.setText("Entrata");
		txtEntrata.setBounds(6, 233, 130, 26);
		campi.add(txtEntrata);
		txtEntrata.setColumns(10);
		
		txtEt = new JTextField();
		txtEt.setEditable(false);
		txtEt.setText("Età:");
		txtEt.setBounds(6, 165, 130, 26);
		campi.add(txtEt);
		txtEt.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(171, 66, 130, 26);
		campi.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(171, 114, 130, 26);
		campi.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(171, 165, 130, 26);
		campi.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Costo e Tipo", "Tavolo = 2,5€/h", "Privè = 30€/h", "Prevendita = 15€", ""}));
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(171, 234, 130, 27);
		campi.add(comboBox);
	}
}
