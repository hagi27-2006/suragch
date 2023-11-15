package guiapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;


public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearch;
	private Timer tm1;
	Integer pl1 = 60,pl2 = 60,pl3 = 60;

    // Assuming you have these panels

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtSearch = new JTextField();
        txtSearch.addKeyListener(new KeyAdapter() {
        	
        });
        txtSearch.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if(txtSearch.getText().equals("Search")) {
        			txtSearch.setText("");
        		}
        		else{
        			txtSearch.selectAll();
        		}
        	}
        	@Override
        	public void focusLost(FocusEvent arg0) {
        		if(txtSearch.getText().equals("")) {
        			txtSearch.setText("Search");
        		}
        	}
        });
        txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtSearch.setForeground(Color.DARK_GRAY);
        txtSearch.setText("Хайлтаа хийх");
        txtSearch.setBounds(486, 74, 433, 30);
        contentPane.add(txtSearch);
        txtSearch.setColumns(10);
        
       
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(200, -89, 273, 760);
		contentPane.add(panel);
		panel.setLayout(null);
		JButton btnNewButton_2_7 = new JButton("Олон нийтийн ажил");
		btnNewButton_2_7.setBounds(21, 615, 217, 30);
		panel.add(btnNewButton_2_7);
		btnNewButton_2_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2_1 = new JButton("Хэлний түвшин");
		btnNewButton_2_1.setBounds(44, 574, 160, 30);
		panel.add(btnNewButton_2_1);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2_8 = new JButton("Орсон хөтөлбөр");
		btnNewButton_2_8.setBounds(21, 533, 207, 30);
		panel.add(btnNewButton_2_8);
		btnNewButton_2_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton = new JButton("Дадлага");
		btnNewButton.setBounds(44, 492, 160, 30);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2_9 = new JButton("Тэнхим");
		btnNewButton_2_9.setBounds(44, 451, 160, 30);
		panel.add(btnNewButton_2_9);
		btnNewButton_2_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_1 = new JButton("Дугуйлан");
		btnNewButton_1.setBounds(44, 410, 160, 30);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2_4 = new JButton("Хичээлийн ирц");
		btnNewButton_2_4.setBounds(44, 369, 160, 30);
		panel.add(btnNewButton_2_4);
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2_5 = new JButton("Ирц");
		btnNewButton_2_5.setBounds(44, 328, 160, 30);
		panel.add(btnNewButton_2_5);
		btnNewButton_2_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2_3 = new JButton("Хичээлийн дүн");
		btnNewButton_2_3.setBounds(44, 287, 160, 30);
		panel.add(btnNewButton_2_3);
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2 = new JButton("Голч");
		btnNewButton_2.setBounds(44, 246, 160, 30);
		panel.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2_2 = new JButton("Хичээл");
		btnNewButton_2_2.setBounds(44, 205, 160, 30);
		panel.add(btnNewButton_2_2);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton_2_6 = new JButton("Оюутан");
		btnNewButton_2_6.addMouseListener(new MouseAdapter() {
		});
		btnNewButton_2_6.setBounds(44, 164, 160, 30);
		panel.add(btnNewButton_2_6);
		btnNewButton_2_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oyutan anotherWindow = new oyutan();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hicheel anotherWindow = new hicheel();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				golch anotherWindow = new golch();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hicheeliin_dun anotherWindow = new hicheeliin_dun();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				irts anotherWindow = new irts();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hicheeliin_irts anotherWindow = new hicheeliin_irts();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duguilan anotherWindow = new duguilan();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tenhim anotherWindow = new tenhim();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dadlaga anotherWindow = new dadlaga();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orson_hutulbur anotherWindow = new orson_hutulbur();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				helnii_tuvshin anotherWindow = new helnii_tuvshin();
                anotherWindow.setVisible(true);
			}
		});
		btnNewButton_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				olon_niitiin_ajil anotherWindow = new olon_niitiin_ajil();
                anotherWindow.setVisible(true);
			}
		});
		panel.setVisible(false);
			        tm1 = new Timer(20, new ActionListener() {
	        	   
	        	   @Override
	        	   public void actionPerformed(ActionEvent e) {
	        	    
	        	    // 300 the maximum height
	        	    if(pl1 > 900)
	        	    {
	        	     tm1.stop();
	        	    }
	        	    else{
	        	     panel.setSize(panel.getWidth(),pl1);
	        	     pl1 += 20;
	        	    }
	        	    
	        	   }
	        	  });
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(new Color(255, 255, 255));
	        panel_1.setBounds(0, 80, 239, 10);
	        panel.add(panel_1);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		String searchTerm = txtSearch.getText();
	        		JOptionPane.showMessageDialog(contentPane, "Searching for: " + searchTerm);
	        		
	        	}
	        });
	        lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/guiapp/images/pic (1).png")));
	        lblNewLabel.setBounds(929, 74, 46, 30);
	        contentPane.add(lblNewLabel);
	        
	        JButton btnNewButton_3 = new JButton("");
	        btnNewButton_3.setBounds(0, 0, 200, 41);
	        contentPane.add(btnNewButton_3);
	        btnNewButton_3.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseExited(MouseEvent e) {
	        		tm1.stop();
	        	    pl1 = 60;
	        	}
	        });
	        btnNewButton_3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		panel.setVisible(true);
	        	    panel.setSize(panel.getWidth(), pl2);
	        	    panel.setSize(panel.getWidth(), pl3);
	        	    tm1.start();
	        	   }
	        });
	        btnNewButton_3.setBackground(Color.LIGHT_GRAY);
	        btnNewButton_3.setIcon(new ImageIcon(Main.class.getResource("/guiapp/images/3-line-menu-icon-17.png")));
	        
	        JPanel panel_2 = new JPanel();
	        panel_2.setBounds(0, 40, 200, 620);
	        contentPane.add(panel_2);
	        panel_2.setBackground(Color.LIGHT_GRAY);
	        panel_2.setLayout(null);
	        
	        JButton btnNewButton_2_6_1 = new JButton("Удирдах самбар");
	        btnNewButton_2_6_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        btnNewButton_2_6_1.setBounds(10, 36, 180, 30);
	        panel_2.add(btnNewButton_2_6_1);
	        
	        JButton btnNewButton_2_6_2 = new JButton("Профайл");
	        btnNewButton_2_6_2.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		
	        	}
	        });
	        btnNewButton_2_6_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        btnNewButton_2_6_2.setBounds(10, 108, 160, 30);
	        panel_2.add(btnNewButton_2_6_2);
	        
	        JButton btnNewButton_2_6_4 = new JButton("Сонголтууд");
	        btnNewButton_2_6_4.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		songoltud anotherWindow = new songoltud();
	                anotherWindow.setVisible(true);
	        	}
	        });
	        btnNewButton_2_6_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        btnNewButton_2_6_4.setBounds(10, 178, 160, 30);
	        panel_2.add(btnNewButton_2_6_4);
	        
	        JButton btnNewButton_2_6_5 = new JButton("Гарах");
	        btnNewButton_2_6_5.addMouseListener(new MouseAdapter() {
	        	@Override
	        	public void mouseClicked(MouseEvent e) {
	        		 login login = new login();
	        	        login.setVisible(true);
	        	        dispose();
	        	        
	        	}
	        });
	        btnNewButton_2_6_5.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        btnNewButton_2_6_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        btnNewButton_2_6_5.setBounds(10, 251, 160, 30);
	        panel_2.add(btnNewButton_2_6_5);
	        
	        
	        
	        
	        
	        
	        
	        
	       
	       
	}
	
	


		

		public void setWelcomeMessage(String username) {
			JLabel lblNewLabel_4 = new JLabel("");
	        lblNewLabel_4.setBounds(221, 32, 449, 30);
	        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        contentPane.add(lblNewLabel_4);
			 lblNewLabel_4.setText(""+ username);
			
		}


		public void setMainUsername(String username) {
			JPanel panel_3 = new JPanel();
	        panel_3.setBounds(200, 0, 784, 48);
	        contentPane.add(panel_3);
	        panel_3.setBackground(Color.WHITE);
	        JLabel lblNewLabel_1 = new JLabel("");
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lblNewLabel_1.setBounds(486, 11, 329, 30);
	        panel_3.add(lblNewLabel_1);
	        
	        lblNewLabel_1.setText("Welcome "+ username);
			
		}
	}