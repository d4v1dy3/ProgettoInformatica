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

public class Interfaccia {

	private JFrame frame;
	private JTextField txtLaDiscoteca;

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
		frame.getContentPane().setLayout(null);
		
		txtLaDiscoteca = new JTextField();
		txtLaDiscoteca.setBounds(0, 0, 500, 40);
		txtLaDiscoteca.setBackground(new Color(153, 50, 204));
		txtLaDiscoteca.setEditable(false);
		txtLaDiscoteca.setFont(new Font("Bodoni 72 Oldstyle", Font.ITALIC, 15));
		txtLaDiscoteca.setHorizontalAlignment(SwingConstants.CENTER);
		txtLaDiscoteca.setText("La Discoteca By Diggh & Sbortoo");
		frame.getContentPane().add(txtLaDiscoteca);
		txtLaDiscoteca.setColumns(10);
		
		JButton btnNewButton = new JButton("Vieni A Far Festa!");
		btnNewButton.setIcon(null);
		btnNewButton.setSelectedIcon(new ImageIcon(Interfaccia.class.getResource("/View/festa-coronavirus.jpg")));
		btnNewButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 12));
		btnNewButton.setBounds(20, 80, 145, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interfaccia.class.getResource("/View/mansion-miami.jpg")));
		lblNewLabel.setBounds(0, 37, 500, 335);
		frame.getContentPane().add(lblNewLabel);
	}
}
