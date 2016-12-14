import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotPassword extends JFrame {
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
	public ForgotPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 359);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatIsYourPassword = new JLabel("Enter your password: ");
		lblWhatIsYourPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWhatIsYourPassword.setBounds(68, 115, 166, 23);
		contentPane.add(lblWhatIsYourPassword);
		
		JTextField passwordField = new JTextField();
		passwordField.setBounds(239, 116, 183, 23);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		JButton btnRetrievePassword = new JButton("Confirm");
		btnRetrievePassword.setBounds(325, 151, 97, 23);
		contentPane.add(btnRetrievePassword);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login window = new Login();

							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBack.setBounds(216, 151, 97, 23);
		contentPane.add(btnBack);
	}
	}
}
