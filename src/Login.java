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
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Login extends javax.swing.JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	private JFrame frame;

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
		lblNewLabel.setBounds(291, 82, 64, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(291, 118, 64, 14);
		frame.getContentPane().add(lblPassword);

		JTextField usernameField = new JTextField();
		usernameField.setForeground(new Color(0, 0, 0));
		usernameField.setBackground(new Color(255, 255, 255));
		usernameField.setBounds(365, 78, 144, 23);
		frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(365, 114, 144, 23);
		passwordField.setEchoChar('*');
		frame.getContentPane().add(passwordField);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
			}
		});
		btnLogin.setBounds(291, 217, 96, 25);
		btnLogin.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(btnLogin);

		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setBounds(291, 179, 218, 25);
		btnForgetPassword.setBackground(new Color(255, 255, 255));
		btnForgetPassword.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnForgetPassword);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(413, 217, 96, 25);
		btnRegister.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(btnRegister);

		JLabel lblPicture = new JLabel("New label");
		lblPicture.setIcon(new ImageIcon("C:\\Users\\ethen\\Desktop\\Admin.png"));
		lblPicture.setBounds(33, 49, 223, 225);
		frame.getContentPane().add(lblPicture);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember my login");
		chckbxNewCheckBox.setBounds(291, 147, 196, 29);
		frame.getContentPane().add(chckbxNewCheckBox);
	}

	private void btnLoginAction(){
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
}

}
