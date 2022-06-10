import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.SystemColor;

public class SearchProduct extends JFrame {

	private JPanel contentPane;
	private JTextField txt_seacrh;
	private JLabel lblNewLabel;
	private JTable tbl_product;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchProduct frame = new SearchProduct();
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
	public SearchProduct() {
		setTitle("UKMBiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 370);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_product = new JLabel("Product");
		lbl_product.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl_product.setBounds(157, 100, 46, 14);
		contentPane.add(lbl_product);
		
		txt_seacrh = new JTextField();
		txt_seacrh.setBounds(213, 98, 142, 20);
		contentPane.add(txt_seacrh);
		txt_seacrh.setColumns(10);
		
		JButton btn_seacrh = new JButton("SEARCH");
		btn_seacrh.setBounds(365, 97, 89, 23);
		contentPane.add(btn_seacrh);
		
		lblNewLabel = new JLabel("UKMBiz");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 30));
		lblNewLabel.setBounds(228, 48, 109, 41);
		contentPane.add(lblNewLabel);
		
		tbl_product = new JTable();
		tbl_product.setBounds(38, 131, 496, 151);
		contentPane.add(tbl_product);
		
		JButton btn_Back = new JButton("BACK");
		btn_Back.setBounds(473, 297, 89, 23);
		contentPane.add(btn_Back);
	}
}
