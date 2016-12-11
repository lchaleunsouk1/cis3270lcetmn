import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtLastName;
	private JTextField txtAddress;
	private JTextField txtZipCode;
	private JTextField txtState;
	private JTextField txtSSN;
	private JTextField txtSecurityQuestion;
	private JTextField txtSecurityAnswer;
	private JTextField txtFirstName;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	
	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(34, 25, 74, 14);
		contentPane.add(lblNewLabel);

		JLabel lblLastName = new JLabel("Last Name\r\n");
		lblLastName.setBounds(34, 52, 74, 14);
		contentPane.add(lblLastName);

		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setBounds(34, 187, 113, 14);
		contentPane.add(lblEmailAddress);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(34, 80, 46, 14);
		contentPane.add(lblAddress);

		JLabel lblState = new JLabel("State");
		lblState.setBounds(34, 134, 46, 14);
		contentPane.add(lblState);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(284, 187, 74, 14);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(284, 214, 74, 14);
		contentPane.add(lblPassword);

		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setBounds(34, 214, 113, 14);
		contentPane.add(lblSecurityQuestion);

		txtLastName = new JTextField();
		txtLastName.setBounds(144, 49, 128, 20);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);

		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(144, 77, 128, 20);
		contentPane.add(txtAddress);

		txtZipCode = new JTextField();
		txtZipCode.setColumns(10);
		txtZipCode.setBounds(144, 104, 128, 20);
		contentPane.add(txtZipCode);

		txtState = new JTextField();
		txtState.setColumns(10);
		txtState.setBounds(144, 131, 128, 20);
		contentPane.add(txtState);

		txtSSN = new JTextField();
		txtSSN.setColumns(10);
		txtSSN.setBounds(144, 158, 128, 20);
		contentPane.add(txtSSN);

		txtSecurityQuestion = new JTextField();
		txtSecurityQuestion.setColumns(10);
		txtSecurityQuestion.setBounds(144, 211, 128, 20);
		contentPane.add(txtSecurityQuestion);

		txtSecurityAnswer = new JTextField();
		txtSecurityAnswer.setColumns(10);
		txtSecurityAnswer.setBounds(144, 238, 128, 20);
		contentPane.add(txtSecurityAnswer);

		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(144, 22, 128, 20);
		contentPane.add(txtFirstName);

		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(34, 161, 46, 14);
		contentPane.add(lblSsn);

		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setBounds(34, 107, 63, 14);
		contentPane.add(lblZipCode);

		JLabel lblSecurityAnswer = new JLabel("Security Answer");
		lblSecurityAnswer.setBounds(34, 241, 113, 14);
		contentPane.add(lblSecurityAnswer);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\etheng\\Desktop\\Flights.jpg"));
		lblNewLabel_1.setBounds(301, 25, 182, 138);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				User.isAdmin = true;
				if (true)
				{
					Admin newAdmin = new Admin();
					newAdmin.setfName(txtFirstName.getText());
					newAdmin.setlName(txtLastName.getText());
					newAdmin.setSSN(txtSSN.getText());
					newAdmin.setAddress(txtAddress.getText());
					newAdmin.setEmail(txtEmail.getText());
					newAdmin.setPassword(txtPassword.getText());
					newAdmin.setSecAnswer(txtSecurityAnswer.getText());
					newAdmin.setSeqQuestion(txtSecurityQuestion.getText());
					newAdmin.setState(txtState.getText());
					newAdmin.setUserName(txtUsername.getText());
					newAdmin.setZip(txtZipCode.getText());

				}
			}
		});
	
    
		btnNewButton.setBounds(394, 236, 89, 25);
		contentPane.add(btnNewButton);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(144, 184, 128, 20);
		contentPane.add(txtEmail);

		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(355, 184, 128, 20);
		contentPane.add(txtUsername);

		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(355, 211, 128, 20);
		contentPane.add(txtPassword);
	}

	private void InsertUserData() {
		DatabaseConnection  = new DatabaseConnection();
		String firstname = txtFirstName.getText();
		String lastname = txtLastName.getText();
		String address = txtAddress.getText();
		String zip = txtZipCode.getText();
		String state = txtState.getText();
		String username = txtUsername.getText();
		String password = txtPassword.getText();
		String email = txtEmail.getText();
		String ssn = txtSSN.getText();
		String securityQuestion = txtSecurityQuestion.getText();
		String secAnswer = txtSecurityAnswer.getText();
		DatabaseConnection.InsertUserData(firstname, lastname, address, zip, state, username, password, email, ssn,
				securityQuestion, secAnswer);
	}
}