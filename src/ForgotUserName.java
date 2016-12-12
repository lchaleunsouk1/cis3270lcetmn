import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ForgotUserName extends JFrame {

	private JPanel contentPane;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotUserName frame = new ForgotUserName();
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
	public ForgotUserName() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatIsYourEmail = new JLabel("Enter your email: ");
		lblWhatIsYourEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWhatIsYourEmail.setBounds(68, 115, 166, 23);
		contentPane.add(lblWhatIsYourEmail);
		
		emailField = new JTextField();
		emailField.setBounds(239, 116, 183, 23);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		JButton btnRetrievePassword = new JButton("Confirm");
		btnRetrievePassword.setBounds(325, 151, 97, 23);
		contentPane.add(btnRetrievePassword);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(216, 151, 97, 23);
		contentPane.add(btnBack);
	}

}
