import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminOrCustomer extends JFrame {

	private JPanel contentPane;
	static boolean isAdmin = false;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public static boolean getIsAdmin() 
	{
		return isAdmin;
	}
	public AdminOrCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatTypeOf = new JLabel("What type of user are you?");
		lblWhatTypeOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWhatTypeOf.setBounds(160, 116, 200, 40);
		contentPane.add(lblWhatTypeOf);
		
		JButton btnAdministrator = new JButton("Admin");
		btnAdministrator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
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
		});
		btnAdministrator.setBounds(160, 169, 100, 25);
		contentPane.add(btnAdministrator);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Object newUser = new Customer();
				isAdmin = (newUser instanceof Admin);
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
		btnCustomer.setBounds(270, 169, 90, 25);
		contentPane.add(btnCustomer);
	}
}
