import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class LogIn {

	private JFrame frmUkmbiz;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frmUkmbiz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUkmbiz = new JFrame();
		frmUkmbiz.setTitle("UKMBiz Log in");
		frmUkmbiz.getContentPane().setBackground(Color.WHITE);
		frmUkmbiz.setBounds(100, 100, 757, 495);
		frmUkmbiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUkmbiz.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(55, 187, 242, 32);
		frmUkmbiz.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(55, 259, 242, 32);
		frmUkmbiz.getContentPane().add(textField_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.GRAY);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(55, 170, 45, 13);
		frmUkmbiz.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(55, 242, 78, 13);
		frmUkmbiz.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(118, 360, 110, 40);
		frmUkmbiz.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setBounds(118, 103, 110, 40);
		frmUkmbiz.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setForeground(Color.GRAY);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(55, 300, 136, 21);
		frmUkmbiz.getContentPane().add(chckbxNewCheckBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(360, 0, 383, 458);
		frmUkmbiz.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\UKMBiz\\UKMBiz\\pictures\\ukm2.jpg"));
		lblNewLabel_2.setBounds(0, 28, 99, 59);
		panel.add(lblNewLabel_2);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblRegister.setBounds(107, 156, 161, 40);
		panel.add(lblRegister);
		
		JLabel lblNewLabel_3 = new JLabel("Don't have an account? Register Now!");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(67, 195, 256, 22);
		panel.add(lblNewLabel_3);
		
		JButton btnCreateAnAccount = new JButton("Create an Account");
		btnCreateAnAccount.setForeground(Color.RED);
		btnCreateAnAccount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCreateAnAccount.setBackground(Color.WHITE);
		btnCreateAnAccount.setBounds(77, 227, 223, 40);
		panel.add(btnCreateAnAccount);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(258, 11, 210, 85);
		frmUkmbiz.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\UKMBiz\\UKMBiz\\pictures\\ukmbizlogo2.jpg"));
	}
}
