import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class ProductDetails extends JFrame {

	private JPanel contentPane;
	private JTextField txt_productid;
	private JTextField txt_name;
	private JTextField txt_price;
	private JTextField txt_colour;
	private JTextField txt_category;
	private JTextField txt_stock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductDetails frame = new ProductDetails();
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
	public ProductDetails() {
		setTitle("UKMBiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_productInfo = new JLabel("Product Information");
		lbl_productInfo.setFont(new Font("Sylfaen", Font.PLAIN, 27));
		lbl_productInfo.setBounds(10, 11, 232, 36);
		contentPane.add(lbl_productInfo);
		
		JLabel lbl_productID = new JLabel("Product ID");
		lbl_productID.setBounds(20, 61, 65, 14);
		contentPane.add(lbl_productID);
		
		JLabel lbl_Name = new JLabel("Name");
		lbl_Name.setBounds(20, 86, 65, 14);
		contentPane.add(lbl_Name);
		
		JLabel lbl_Price = new JLabel("Price");
		lbl_Price.setBounds(20, 111, 65, 14);
		contentPane.add(lbl_Price);
		
		JLabel lbl_colour = new JLabel("");
		lbl_colour.setBounds(20, 136, 46, 14);
		contentPane.add(lbl_colour);
		
		JLabel lblNewLabel_4 = new JLabel("Colour");
		lblNewLabel_4.setBounds(20, 136, 65, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lbl_category = new JLabel("Category");
		lbl_category.setBounds(20, 161, 65, 14);
		contentPane.add(lbl_category);
		
		txt_productid = new JTextField();
		txt_productid.setEditable(false);
		txt_productid.setBounds(95, 58, 158, 20);
		contentPane.add(txt_productid);
		txt_productid.setColumns(10);
		
		txt_name = new JTextField();
		txt_name.setEditable(false);
		txt_name.setColumns(10);
		txt_name.setBounds(95, 83, 158, 20);
		contentPane.add(txt_name);
		
		txt_price = new JTextField();
		txt_price.setEditable(false);
		txt_price.setColumns(10);
		txt_price.setBounds(95, 108, 158, 20);
		contentPane.add(txt_price);
		
		txt_colour = new JTextField();
		txt_colour.setEditable(false);
		txt_colour.setColumns(10);
		txt_colour.setBounds(95, 133, 158, 20);
		contentPane.add(txt_colour);
		
		txt_category = new JTextField();
		txt_category.setEditable(false);
		txt_category.setColumns(10);
		txt_category.setBounds(95, 158, 158, 20);
		contentPane.add(txt_category);
		
		txt_stock = new JTextField();
		txt_stock.setEditable(false);
		txt_stock.setColumns(10);
		txt_stock.setBounds(95, 183, 158, 20);
		contentPane.add(txt_stock);
		
		JLabel lbl_picproduct = new JLabel("Picture Product");
		lbl_picproduct.setBounds(346, 61, 131, 142);
		contentPane.add(lbl_picproduct);
		
		JLabel lbl_stock = new JLabel("Stock");
		lbl_stock.setBounds(20, 186, 65, 14);
		contentPane.add(lbl_stock);
		
		JButton btn_Back = new JButton("BACK");
		btn_Back.setBounds(417, 227, 89, 23);
		contentPane.add(btn_Back);
		
		JButton btn_AddToCart = new JButton("ADD TO CART");
		btn_AddToCart.setBounds(296, 227, 111, 23);
		contentPane.add(btn_AddToCart);
	}
}
