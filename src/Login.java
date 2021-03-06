import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;

public class Login extends javax.swing.JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	Connection connection = null;

	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 547, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(291, 74, 64, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(291, 118, 64, 14);
		frame.getContentPane().add(lblPassword);

		JTextField usernameField = new JTextField();
		usernameField.setForeground(new Color(0, 0, 0));
		usernameField.setBackground(new Color(255, 255, 255));
		usernameField.setBounds(365, 70, 144, 23);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(365, 114, 144, 23);
		passwordField.setEchoChar('*');
		frame.getContentPane().add(passwordField);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(291, 217, 96, 23);
		btnLogin.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(btnLogin);

		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.setBounds(291, 183, 218, 23);
		btnForgotPassword.setBackground(new Color(255, 255, 255));
		btnForgotPassword.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ForgotPassword frame = new ForgotPassword();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnForgotPassword);

		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AdminOrCustomer frame = new AdminOrCustomer();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnRegister.setBounds(413, 217, 96, 23);
		btnRegister.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(btnRegister);

		JLabel lblPicture = new JLabel("New label");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\ethen\\Desktop\\Admin.png"));
		lblPicture.setBounds(27, 49, 223, 225);
		frame.getContentPane().add(lblPicture);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember my login");
		chckbxNewCheckBox.setBounds(291, 147, 196, 29);
		frame.getContentPane().add(chckbxNewCheckBox);
	}

	/*private void btnLoginAction(){
		conn = DatabaseConnection.getConnection();
	String sql = "Select * from login where username = ? and password = ?";
	try{
		pst = conn.prepareStatement(sql);
		pst.setString(1,usernameField.getText());
		pst.setString(2,passwordField.getText());
		rs = pst.executeQuery();
		if(rs.next(){
			JOptionPane.showMessageDialog(null, "Welcome user");
			welcome w = new welcome();
			w.setvisible(true);
		}else

	{
		JOptionPane.showMessageDialog(null, "Invalid username or password", "Access Denied", JOptionPane.ERROR_MESSAGE);
	}
}*/

}
