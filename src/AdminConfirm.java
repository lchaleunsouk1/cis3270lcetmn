import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminConfirm extends JFrame {

	private JPanel contentPane;
	private JTextField userKey;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminConfirm frame = new AdminConfirm();
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
	public AdminConfirm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatIsThe = new JLabel("What is the administrator key?");
		lblWhatIsThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWhatIsThe.setBounds(68, 115, 225, 23);
		contentPane.add(lblWhatIsThe);
		
		userKey = new JTextField();
		userKey.setBounds(306, 116, 116, 22);
		contentPane.add(userKey);
		userKey.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (userKey.getText().equals("admin1!"))
				{
					User.isAdmin = true;
				}
				else
				{
					JOptionPane.showMessageDialog("Sorry, the key you entered is wrong.\nPlease try again or head back to make a customer account.");
				}
				
			}
		});
		btnConfirm.setBounds(325, 151, 97, 25);
		contentPane.add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(216, 151, 97, 25);
		contentPane.add(btnBack);
	}
}
