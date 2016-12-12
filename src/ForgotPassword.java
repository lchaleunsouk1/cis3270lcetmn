import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotPassword extends JFrame {

	private JPanel contentPane;
	private JTextField userNameField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ForgotPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatIsYourUserName = new JLabel("Enter your username: ");
		lblWhatIsYourUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWhatIsYourUserName.setBounds(68, 115, 166, 23);
		contentPane.add(lblWhatIsYourUserName);
		
		userNameField = new JTextField();
		userNameField.setBounds(239, 116, 183, 23);
		contentPane.add(userNameField);
		userNameField.setColumns(10);
		
		JButton btnRetrievePassword = new JButton("Confirm");
		btnRetrievePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (userNameField.getText().equals("admin1!"))
				{
					System.out.println("Welcome!  You may now register as an administrator");
					Object newUser = new Admin();
					AdminOrCustomer.isAdmin = (newUser instanceof Admin);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Register frame = new Register();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			}
		});
		btnRetrievePassword.setBounds(325, 151, 97, 23);
		contentPane.add(btnRetrievePassword);
		
		JButton btnForgotUserName = new JButton("Forgot Username");
		btnForgotUserName.setBounds(216, 187, 206, 23);
		contentPane.add(btnForgotUserName);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(216, 151, 97, 23);
		contentPane.add(btnBack);
	}
}
