package guiapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JPasswordField;

public class newuser extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String com = null;
	private JPanel contentPane;
	private JTextField sName;
	private JTextField sMail;

	/**
	 * Launch the application.
	 */
	int xx,xy;
	private JPasswordField sPassword;
	private JTextField sCode;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newuser frame = new newuser();
					frame.setUndecorated(true);
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
	public newuser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 500, 710);
		panel_3.setBackground(new Color(128, 128, 128));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(0, 49, 550, 200);
		panel_3.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(newuser.class.getResource("/guiapp/images/210166517-7f0f3ae2-62bf-4e07-9b7d-4f7c1f5099c8.png")));
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY(); 
			}
		});

		lblNewLabel_5.setIcon(new ImageIcon(newuser.class.getResource("/guiapp/images/download.jpg")));
		lblNewLabel_5.setBounds(125, 348, 225, 224);
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(493, 14, 1, 1);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(499, 14, 1, 1);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(505, 14, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Бүртгүүлэх");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e) {
                String Sname = sName.getText();
                String Smail = sMail.getText();
                String Spassword = sPassword.getText();
                String Scode = sCode.getText();
                
                if (Sname.isEmpty() || Smail.isEmpty() || Spassword.isEmpty() || Scode.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ta dutuu bogolson baina");
                } else {
                    try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");

                        String query = "INSERT INTO oyutan(ner, tsahim_shuudan, nuuts_ug, oyutanID) VALUES(?,?,?,?)";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setString(1, Sname);
                        pst.setString(2, Smail);
                        pst.setString(3, Spassword);
                        pst.setString(4, Scode);

                        int rowsAffected = pst.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Амжилттай бүртгэгдэлээ.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Бүртгэгдэхэд алдаа гарлаа.");
                        }
                        con.close();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(600, 519, 300, 58);
		contentPane.add(btnNewButton);
		
		sName = new JTextField();
		sName.setBounds(600, 148, 300, 34);
		contentPane.add(sName);
		sName.setColumns(10);
		
		sMail = new JTextField();
		sMail.setColumns(10);
		sMail.setBounds(600, 229, 300, 34);
		contentPane.add(sMail);
		
		JLabel lblNewLabel = new JLabel("Хэрэглэгчийн нэр");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(600, 112, 300, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Цахим шуудан");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(600, 193, 109, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Нууц үг");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(600, 274, 109, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Сурагчийн код");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(600, 355, 225, 25);
		contentPane.add(lblNewLabel_3);
		
		sPassword = new JPasswordField();
		sPassword.setBounds(600, 310, 300, 34);
		contentPane.add(sPassword);
		
		sCode = new JTextField();
		sCode.setColumns(10);
		sCode.setBounds(600, 391, 300, 34);
		contentPane.add(sCode);
		
		JButton btnNewButton_1 = new JButton("Буцаах");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(600, 597, 300, 58);
		contentPane.add(btnNewButton_1);
	}
}
