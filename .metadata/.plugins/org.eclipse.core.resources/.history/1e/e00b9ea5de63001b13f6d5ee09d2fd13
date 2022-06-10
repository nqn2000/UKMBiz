import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Seller_check_Stock {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtStock;
	DefaultTableModel model;
	private JTextField txtBrand;
	private JTextField txtPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seller_check_Stock window = new Seller_check_Stock();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Connection connect=null;

	/**
	 * Create the application.
	 */
	public Seller_check_Stock() {
		initialize();
		//con= DbConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 898, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.RED);
		panel_4.setBounds(0, 0, 890, 51);
		frame.getContentPane().add(panel_4);
		
		JLabel lblNewLabel = new JLabel("Seller Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(0, 0, 244, 51);
		panel_4.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.PINK);
		panel_1_1.setBounds(0, 50, 890, 51);
		frame.getContentPane().add(panel_1_1);
		
		JButton btnNewEntry_1 = new JButton("New Entry");
		btnNewEntry_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewEntry_1.setBorderPainted(false);
		btnNewEntry_1.setBackground(Color.PINK);
		btnNewEntry_1.setBounds(0, 0, 135, 51);
		panel_1_1.add(btnNewEntry_1);
		
		JButton btnCheckStock_1 = new JButton("Check Stock");
		btnCheckStock_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCheckStock_1.setBorderPainted(false);
		btnCheckStock_1.setBackground(Color.PINK);
		btnCheckStock_1.setBounds(134, 0, 135, 51);
		panel_1_1.add(btnCheckStock_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 433, 890, 126);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEntrModel = new JLabel("Name :");
		lblEntrModel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEntrModel.setBounds(21, 20, 94, 33);
		panel.add(lblEntrModel);
		
		txtName = new JTextField();
		txtName.setBounds(69, 22, 189, 33);
		panel.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblSetQuantity = new JLabel("Set Quantity :");
		lblSetQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSetQuantity.setBounds(213, 65, 94, 33);
		panel.add(lblSetQuantity);
		
		txtStock = new JTextField();
		txtStock.setColumns(10);
		txtStock.setBounds(305, 63, 82, 33);
		panel.add(txtStock);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setForeground(Color.RED);
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdd.setBounds(583, 26, 108, 27);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(Color.RED);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDelete.setBounds(583, 71, 108, 27);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setForeground(Color.RED);
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUpdate.setBounds(719, 26, 108, 27);
		panel.add(btnUpdate);
		
		txtBrand = new JTextField();
		txtBrand.setColumns(10);
		txtBrand.setBounds(315, 20, 189, 33);
		panel.add(txtBrand);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(69, 67, 124, 33);
		panel.add(txtPrice);
		
		JLabel lblBrand = new JLabel("Brand :");
		lblBrand.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBrand.setBounds(268, 18, 54, 33);
		panel.add(lblBrand);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrice.setBounds(21, 65, 54, 33);
		panel.add(lblPrice);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.RED);
		btnClear.setBackground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(719, 71, 108, 27);
		panel.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 99, 890, 336);
		frame.getContentPane().add(scrollPane);
		
		JTable table = new JTable();
		model= new DefaultTableModel();
		Object[] column = {"Name", "Brand", "Price", "Stock"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		
	}

}
