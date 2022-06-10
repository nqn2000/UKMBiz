import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Seller_NewEntry {

	private JFrame frmUkmbiz;
	private JTextField txt_brand;
	private JTextField txt_model;
	private JTextField txt_price;
	private JTextField txt_qty;
	private JTextField txt_desc;
	private JTextField txt_attachimage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seller_NewEntry window = new Seller_NewEntry();
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
	public Seller_NewEntry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUkmbiz = new JFrame();
		frmUkmbiz.setTitle("UKMBiz Seller");
		frmUkmbiz.setBounds(100, 100, 901, 602);
		frmUkmbiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUkmbiz.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 890, 51);
		frmUkmbiz.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Seller Page");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(0, 0, 244, 51);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(0, 50, 890, 51);
		frmUkmbiz.getContentPane().add(panel_1);
		
		JButton btnNewEntry = new JButton("New Entry");
		btnNewEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewEntry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewEntry.setBorderPainted(false);
		btnNewEntry.setBackground(Color.PINK);
		btnNewEntry.setBounds(0, 0, 135, 51);
		panel_1.add(btnNewEntry);
		
		JButton btnCheckStock = new JButton("Check Stock");
		btnCheckStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCheckStock.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCheckStock.setBorderPainted(false);
		btnCheckStock.setBackground(Color.PINK);
		btnCheckStock.setBounds(134, 0, 135, 51);
		panel_1.add(btnCheckStock);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 103, 890, 462);
		frmUkmbiz.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		txt_brand = new JTextField();
		txt_brand.setColumns(10);
		txt_brand.setBounds(181, 83, 303, 31);
		panel_2.add(txt_brand);
		
		JLabel lblBrand = new JLabel("Brand :");
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBrand.setBounds(73, 84, 58, 22);
		panel_2.add(lblBrand);
		
		JLabel lblModel = new JLabel("Model :");
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblModel.setBounds(73, 125, 58, 22);
		panel_2.add(lblModel);
		
		txt_model = new JTextField();
		txt_model.setColumns(10);
		txt_model.setBounds(181, 124, 303, 31);
		panel_2.add(txt_model);
		
		txt_price = new JTextField();
		txt_price.setColumns(10);
		txt_price.setBounds(181, 165, 303, 31);
		panel_2.add(txt_price);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPrice.setBounds(73, 166, 58, 22);
		panel_2.add(lblPrice);
		
		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblQuantity.setBounds(73, 208, 99, 22);
		panel_2.add(lblQuantity);
		
		txt_qty = new JTextField();
		txt_qty.setColumns(10);
		txt_qty.setBounds(181, 207, 303, 31);
		panel_2.add(txt_qty);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDescription.setBounds(73, 248, 99, 22);
		panel_2.add(lblDescription);
		
		txt_desc = new JTextField();
		txt_desc.setColumns(10);
		txt_desc.setBounds(181, 248, 303, 111);
		panel_2.add(txt_desc);
		
		JLabel lblNewLabel = new JLabel("Product Details");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Siro-Bold", Font.BOLD, 28));
		lblNewLabel.setBounds(356, 28, 247, 45);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(604, 83, 188, 201);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lbl_image = new JLabel("");
		lbl_image.setBounds(0, 0, 188, 201);
		panel_3.add(lbl_image);
		lbl_image.setVerticalAlignment(SwingConstants.TOP);
		lbl_image.setBackground(Color.GRAY);
		
		lbl_image.setIcon(new ImageIcon(Seller_NewEntry.class.getResource("/images/187803-200.png")));
		
		txt_attachimage = new JTextField();
		txt_attachimage.setColumns(10);
		txt_attachimage.setBounds(574, 294, 160, 31);
		panel_2.add(txt_attachimage);
		
		JButton btn_attachimage = new JButton("Browse");
		btn_attachimage.setBackground(Color.RED);
		btn_attachimage.setForeground(Color.WHITE);
		btn_attachimage.setBounds(738, 294, 92, 30);
		panel_2.add(btn_attachimage);
		
		JButton btn_update = new JButton("Update");
		btn_update.setBackground(Color.RED);
		btn_update.setForeground(Color.WHITE);
		btn_update.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_update.setBounds(710, 379, 120, 36);
		panel_2.add(btn_update);
	}
}
