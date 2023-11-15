package guiapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class login extends JFrame {

	private static final long IL = 0;
	private static final long serialVersionUID = IL;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField name;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton burtguuleh;
	private JPasswordField pass;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setText("ШИНЭ МОНГОЛ \r\n");
		lblNewLabel_1.setBounds(143, 57, 201, 38);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(login.class.getResource("/guiapp/images/sur logo 1.png")));
		lblNewLabel_2.setBounds(58, 57, 75, 85);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("ТЕХНОЛОГИЙН КОЛЛЕЖ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(143, 80, 219, 32);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("СУРАГЧИЙН БҮРТГЭЛИЙН ");
		lblNewLabel_4.setBounds(143, 106, 163, 32);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		
		
		
		burtguuleh = new JButton("бүртгүүлэх");
		burtguuleh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	newuser NewBurtgel2 = new newuser();
            	NewBurtgel2.setVisible(true);
            }
        });
		
		
		
		burtguuleh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		burtguuleh.setBackground(new Color(255, 255, 255));
		burtguuleh.setBounds(124, 324, 110, 24);
		contentPane.add(burtguuleh);
		
	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(UIManager.getBorder("Button.border"));
		panel.setBounds(523, 0, 351, 464);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 339, 464);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/guiapp/images/sur (1).jpg")));
		
		
		lblNewLabel_5 = new JLabel("нэр*");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(124, 167, 58, 14);
		contentPane.add(lblNewLabel_5);
		
		name = new JTextField("");
		name.setBounds(124, 192, 253, 32);
		contentPane.add(name);
		name.setColumns(10);
		
		
		
		lblNewLabel_6 = new JLabel("нууц үг*");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(124, 247, 58, 23);
		contentPane.add(lblNewLabel_6);
		
		pass = new JPasswordField("");
		pass.setBounds(124, 281, 253, 32);
		contentPane.add(pass);
		
		JComboBox<Object> utype = new JComboBox<>();
        utype.setBounds(255, 323, 89, 23);
        utype.setFont(new Font("Tahoma", Font.PLAIN, 15));
        utype.setModel(new DefaultComboBoxModel<>(new String[] {"Admin", "Student"}));
        contentPane.add(utype);
		

		JButton btnNewButton = new JButton("нэвтрэх");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		    	Connection con;
		                 PreparedStatement pst;
		                 ResultSet rs;
		                 try {
		                     if (name.getText().isEmpty() || new String(pass.getPassword()).isEmpty()) {
		                         JOptionPane.showMessageDialog(login.this, "Username or password is blank");
		                     } else {
		                         String username = name.getText();
		                         @SuppressWarnings("deprecation")
		                         String Spassword = pass.getText();
		                         Class.forName("com.mysql.cj.jdbc.Driver");

		                         String selectedUserType = (String) utype.getSelectedItem();

		                         if ("Admin".equals(selectedUserType)) {
		                         	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");
		  	                        pst = con.prepareStatement("SELECT * FROM oyutan WHERE ner = ? AND nuuts_ug = ?");
		                             // ...
		                         } else if ("Student".equals(selectedUserType)) {
		                         	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");
		  	                        pst = con.prepareStatement("SELECT * FROM student WHERE ner = ? AND nuuts_ug = ?");
		                         } else {
		                             return;
		                         }

		                         pst.setString(1, username);
		                         pst.setString(2, Spassword);
		                         rs = pst.executeQuery();

		                         if (rs.next()) {
		                             if ("Admin".equals(selectedUserType)) {
		                                 // Perform admin-specific actions
		                                 // For example, open an admin dashboard
		                                 Main adminDashboard = new Main();
		                                 adminDashboard.setVisible(true);
		                                 adminDashboard.setMainUsername(username);
		                                 dispose();
		                             } else if ("Student".equals(selectedUserType)) {
		                                 // Perform student-specific actions
		                                 // For example, open a student dashboard
		                                 Student studentDashboard = new Student();
		                                 studentDashboard.setStudentUsername(username);
		                                 studentDashboard.setVisible(true);
		                                 dispose();
		                             }
		                         } else {
		                             JOptionPane.showMessageDialog(login.this, "Username or password do not match.");
		                             name.setText("");
		                             pass.setText("");
		                             name.requestFocus();
		                         }
		                     }
		                 } catch (SQLException e1) {
						
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
						
							e1.printStackTrace();
						}
		             }
		         });

			
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(198, 382, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
