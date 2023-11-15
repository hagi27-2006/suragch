package guiapp;
	
	import java.awt.Color;
	import java.awt.EventQueue;
	import java.awt.Font;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Date;
	import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.table.DefaultTableModel;
	import javax.swing.table.TableModel;
	
	import com.toedter.calendar.JDateChooser;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
	
	
	public class oyutan extends JFrame {
	
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField ovogField;
	    private JTextField nerField;
	    private JTextField dugaarField;
	    private JTextField ocodeField;
	    private JTextField textField;
	    private final JPanel panel_2 = new JPanel();
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	            	
	                try {
	                    oyutan frame = new oyutan();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	
	    public oyutan() {
	    	
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 1000, 700);
	
	        contentPane = new JPanel();
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	
	        JPanel panel = new JPanel();
	        panel.setBounds(0, 0, 532, 660);
	        panel.setBackground(new Color(153, 153, 153));
	        contentPane.add(panel);
	
	        // Labels
	        JLabel[] labels = new JLabel[9];
	        labels[0] = new JLabel("Оюутан код:");
	        labels[1] = new JLabel("Овог:");
	        labels[2] = new JLabel("Оюутны нэр:");
	        labels[3] = new JLabel("Төрсөн он сар өдөр:");
	        labels[4] = new JLabel("Утасны дугаар:");
	        labels[5] = new JLabel("Гэрийн хаяг:");
	        labels[6] = new JLabel("Тэнхим:");
	        labels[7] = new JLabel("Хүйс:");
	        labels[8] = new JLabel("Үе:");
	
	        for (JLabel label : labels) {
	            label.setFont(new Font("Tahoma", Font.PLAIN, 16));
	            panel.add(label);
	        }
	        
	        // Text Fields
	        ovogField = new JTextField();
	        ovogField.setBounds(244, 163, 261, 27);
	        nerField = new JTextField();
	        nerField.setBounds(244, 217, 261, 27);
	        dugaarField = new JTextField();
	        dugaarField.setBounds(244, 338, 261, 27);
	        panel.setLayout(null);
	        ocodeField = new JTextField();
	        ocodeField.setBounds(244, 103, 261, 27);
	
	        panel.add(ocodeField);
	        panel.add(ovogField);
	        panel.add(nerField);
	
	        panel.add(dugaarField);
	
	        JTextArea haygArea = new JTextArea();
	        haygArea.setBounds(244, 409, 261, 91);
	        panel.add(haygArea);
	
	        // Buttons
	        JButton burtgehButton = new JButton("Бүртгэх");
	        burtgehButton.setBounds(338, 511, 184, 63);
	        burtgehButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(burtgehButton);
	
	        JButton butsaahButton = new JButton("Шинэчлэх");
	        butsaahButton.setBounds(41, 585, 184, 63);
	        butsaahButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(butsaahButton);
	
	        JLabel label = new JLabel("Оюутны код");
	        label.setBounds(41, 109, 143, 21);
	        label.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(label);
	
	        JLabel label_1 = new JLabel("Овог");
	        label_1.setBounds(41, 169, 143, 21);
	        label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(label_1);
	
	        JLabel label_2 = new JLabel("Оюутны нэр");
	        label_2.setBounds(41, 223, 143, 21);
	        label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(label_2);
	
	        JLabel label_3 = new JLabel("Төрсөн он сар");
	        label_3.setBounds(41, 280, 143, 21);
	        label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(label_3);
	
	        JLabel label_4 = new JLabel("Утасны дугаар");
	        label_4.setBounds(41, 338, 143, 21);
	        label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(label_4);
	
	        JLabel label_5 = new JLabel("Гэрийн хаяг");
	        label_5.setBounds(41, 395, 143, 21);
	        label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(label_5);
	        
	        JDateChooser dateChooser = new JDateChooser();
	        dateChooser.setBounds(247, 281, 258, 27);
	        panel.add(dateChooser);
	
	        JButton butsaahButton_1 = new JButton("Устгах");
	        butsaahButton_1.setBounds(41, 511, 184, 63);
	        
	        JComboBox<Object> comboBox = new JComboBox<Object>();
            comboBox.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		
            	}
            });
            comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"БДБИ", "ХИ", "КУ", "ЦЭИ", "МИ"}));
            comboBox.setBounds(181, 61, 261, 27);
            panel_2.add(comboBox);
            
            JLabel label_6 = new JLabel("Тэнхим");
            label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
            label_6.setBounds(42, 67, 143, 21);
            panel_2.add(label_6);
            
            JLabel label_6_1 = new JLabel("Хүйс");
            label_6_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
            label_6_1.setBounds(42, 99, 143, 21);
            panel_2.add(label_6_1);
            
	        JComboBox<Object> comboBox_1 = new JComboBox<Object>();
            comboBox_1.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		
            	}
            });
            comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"Эрэгтэй", "Эмэгтэй"}));
            comboBox_1.setBounds(181, 99, 261, 27);
            panel_2.add(comboBox_1);
            
            JLabel label_6_1_1 = new JLabel("Үе");
            label_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
            label_6_1_1.setBounds(42, 137, 143, 21);
            panel_2.add(label_6_1_1);
            
            JComboBox<Object> comboBox_1_1 = new JComboBox<Object>();
            comboBox_1_1.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		
            	}
            });
            comboBox_1_1.setModel(new DefaultComboBoxModel<Object>(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
            comboBox_1_1.setBounds(181, 139, 261, 27);
            panel_2.add(comboBox_1_1);
	        
	        butsaahButton_1.addMouseListener(new MouseAdapter() {
	        	
	            @Override
	            public void mouseClicked(MouseEvent e) {
	            	
	                ocodeField.setText("");
	                ovogField.setText("");
	                nerField.setText("");
	                dugaarField.setText("");
	                dateChooser.setDate(null); 
	                haygArea.setText("");
	                comboBox.setSelectedItem(null);
	                comboBox_1.setSelectedItem(null);
	                comboBox_1_1.setSelectedItem(null);
	            }
	        });
	        butsaahButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(butsaahButton_1);
	
	        JButton butsaahButton_2 = new JButton("Буцах");
	        butsaahButton_2.setBounds(338, 585, 184, 63);
	        butsaahButton_2.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                dispose();
	            }
	        });
	        butsaahButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        panel.add(butsaahButton_2);
	        
	                JLabel code = new JLabel("Оюутан бүртгэл");
	                code.setBounds(111, 11, 295, 49);
	                panel.add(code);
	                code.setFont(new Font("Tahoma", Font.PLAIN, 40));
	        
	       
	
	        JTable table = new JTable();
	        DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] {
	                "Оюутан код", "Овог", "Оюутны нэр", "Төрсөн он сар өдөр", "Утасны дугаар", "Гэрийн хаяг","Тэнхим","Хүйс","Үе"
	        });
	        table.setModel(model);
	        JScrollPane scrollPane = new JScrollPane(table);
	        scrollPane.setBounds(532, 303, 452, 377);
	        contentPane.add(scrollPane);
	            // Create the frame and set its properties
	            
	
	            
	            // Add the JTable to the frame
	            getContentPane().add(scrollPane);
	            panel_2.setBackground(new Color(153, 153, 153));
	            panel_2.setBounds(532, 0, 452, 305);
	            contentPane.add(panel_2);
	                    panel_2.setLayout(null);
	                    
	                    JPanel panel_1 = new JPanel();
	                    panel_1.setBounds(0, 230, 462, 135);
	                    panel_2.add(panel_1);
	                    panel_1.setBackground(Color.LIGHT_GRAY);
	                    panel_1.setLayout(null);
	                    
	                    textField = new JTextField();
	                    textField.addActionListener(new ActionListener() {
	                        public void actionPerformed(ActionEvent e) {
	                            String searchQuery = textField.getText().trim();

	                            // Check if the search query is empty
	                            if (searchQuery.isEmpty()) {
	                                JOptionPane.showMessageDialog(null, "Хайлт хоосон байж болохгүй.");
	                            } else {
	                                performSearch(searchQuery);
	                            }
	                        }

	                        private void performSearch(String searchQuery) {
	                            DefaultTableModel searchResultModel = (DefaultTableModel) table.getModel();
	                            searchResultModel.setRowCount(0);

	                            try {
	                                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");

	                                if (searchQuery.equalsIgnoreCase("bugd")) {
	                                    // Fetch all students
	                                    String query = "SELECT * FROM burtgel";
	                                    try (Statement statement = connection.createStatement();
	                                         ResultSet resultSet = statement.executeQuery(query)) {
	                                        while (resultSet.next()) {
	                                            int ocodeField = resultSet.getInt("idburtgel");
	                                            String ovogField = resultSet.getString("ovog");
	                                            String nerField = resultSet.getString("ner");
	                                            Date hugatsaaField = resultSet.getDate("hugatsaa");
	                                            String dugaarField = resultSet.getString("dugaar");
	                                            String haygField = resultSet.getString("hayg");
	                                            String comboBox = resultSet.getString("tenhim");
	                                            String comboBox_1 = resultSet.getString("huis");
	                                            String comboBox_1_1 = resultSet.getString("uy");
	                                            searchResultModel.addRow(new Object[]{ocodeField, ovogField, nerField, hugatsaaField, dugaarField, haygField,comboBox,comboBox_1,comboBox_1_1});
	                                        }
	                                    }
	                                } else {
	                                    // Perform a regular search
	                                    String query = "SELECT * FROM burtgel WHERE ner LIKE ?";

	                                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                                        String wildcardSearchQuery = "%" + searchQuery + "%";
	                                        preparedStatement.setString(1, wildcardSearchQuery);
	                                        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                                            while (resultSet.next()) {
	                                                int ocodeField = resultSet.getInt("idburtgel");
	                                                String ovogField = resultSet.getString("ovog");
	                                                String nerField = resultSet.getString("ner");
	                                                Date hugatsaaField = resultSet.getDate("hugatsaa");
	                                                String dugaarField = resultSet.getString("dugaar");
	                                                String haygField = resultSet.getString("hayg");
	                                                String comboBox = resultSet.getString("tenhim");
		                                            String comboBox_1 = resultSet.getString("huis");
		                                            String comboBox_1_1 = resultSet.getString("uy");
	                                                searchResultModel.addRow(new Object[]{ocodeField, ovogField, nerField, hugatsaaField, dugaarField, haygField,comboBox,comboBox_1,comboBox_1_1});
	                                            }
	                                        }
	                                    }
	                                }
	                            } catch (SQLException e1) {
	                                e1.printStackTrace();
	                            }
	                        }


	                    });
	                    
	                    	            textField.setBounds(0, 11, 452, 42);
	                    	            panel_1.add(textField);
	                    	            textField.setForeground(Color.DARK_GRAY);
	                    	            textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
	                    	            textField.setColumns(10);
	                    	            
	                    	            
	                    	            
	
	            // Make the frame visible
	            setVisible(true);
	        
	
	        // Action Listeners
	            butsaahButton.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    try {
	                        // Update the selected record in the database
	                        String sql = "UPDATE burtgel " +
	                                "SET ovog = ?, ner = ?, hugatsaa = ?, dugaar = ?, hayg = ?, tenhim=?, huis = ?, uy = ? " +
	                                "WHERE idburtgel = ?";
	
	                        Class.forName("com.mysql.cj.jdbc.Driver");
	                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");
	                        PreparedStatement statement = connection.prepareStatement(sql);
	                        
	                        statement.setString(1, ovogField.getText());
	                        statement.setString(2, nerField.getText());
	                        statement.setDate(3, new java.sql.Date(dateChooser.getDate().getTime()));
	                        statement.setString(4, dugaarField.getText());
	                        statement.setString(5, haygArea.getText());
	                        statement.setString(6, ocodeField.getText());
	                        statement.setString(7, comboBox.getSelectedItem().toString());
                            statement.setString(8, comboBox_1.getSelectedItem().toString());
                            statement.setString(9, comboBox_1_1.getSelectedItem().toString());
	                        statement.executeUpdate();
	                        JOptionPane.showMessageDialog(null, "Updated successfully");
	
	                        // Refresh table data
	                        refreshTableData();
	                    } catch (Exception e2) {
	                        e2.printStackTrace();
	                    }
	                }
	
	
	                private void refreshTableData() {
	                    try {
	                        // Retrieve data from the database
	                        String query = "SELECT * FROM burtgel";
	
	                        Class.forName("com.mysql.cj.jdbc.Driver");
	                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");
	                        Statement statement = connection.createStatement();
	                        ResultSet rs = statement.executeQuery(query);
	
	                        DefaultTableModel model = (DefaultTableModel) table.getModel();
	                        model.setRowCount(0); // Clear the table
	
	                        while (rs.next()) {
	                            // Add the retrieved data to the table model
	                            String idburtgel = rs.getString("idburtgel");
	                            String ovog = rs.getString("ovog");
	                            String ner = rs.getString("ner");
	                            Date hugatsaa = rs.getDate("hugatsaa");
	                            String dugaar = rs.getString("dugaar");
	                            String hayg = rs.getString("hayg");
	                            String tenhim = rs.getString("tenhim");
                                String huis = rs.getString("huis");
                                String uy = rs.getString("uy");
	                            model.addRow(new Object[] { idburtgel, ovog, ner, hugatsaa, dugaar, hayg, tenhim, huis, uy });
	                        }
	
	                        connection.close();
	                    } catch (Exception ex1) {
	                        ex1.printStackTrace();
	                    }
	                }
	
						
	                
	            });
	            table.addMouseListener(new MouseAdapter() {
	            	@Override
	            	public void mouseClicked(MouseEvent e) {
	            	// Mouse clicked on table row
	            	DefaultTableModel dm = (DefaultTableModel) table.getModel();
	            	int selectedRow = table.getSelectedRow();
	            	ocodeField.setText(dm.getValueAt(selectedRow, 0).toString());
	            	comboBox.setToolTipText(dm.getValueAt(selectedRow, 0).toString());
	            	comboBox_1.setToolTipText(dm.getValueAt(selectedRow, 0).toString());
	            	comboBox_1_1.setToolTipText(dm.getValueAt(selectedRow, 0).toString());
	            	nerField.setText(dm.getValueAt(selectedRow, 1).toString());
	            	String[] a = dm.getValueAt(selectedRow, 4).toString().split("%");
	            	ovogField.setText(dm.getValueAt(selectedRow, 2).toString());
	            	if (selectedRow >= 0 && selectedRow < dm.getRowCount()) {
	            	    // Assuming the date information is in column 3
	            	    Object dateValue = dm.getValueAt(selectedRow, 3);

	            	    // Check if dateValue is not null and is compatible with setToolTipText
	            	    if (dateValue != null) {
	            	        dateChooser.setToolTipText(dateValue.toString());
	            	    } else {
	            	        // Handle the case where the value is null
	            	        dateChooser.setToolTipText("No date information available");
	            	    }
	            	} else {
	            	    // Handle the case where selectedRow is not a valid index
	            	    dateChooser.setToolTipText("Invalid row selection");
	            	}
	            	dugaarField.setText(dm.getValueAt(selectedRow, 5).toString());
	            	haygArea.setText(a[0]);
	            	}
	            	});
	            
	            burtgehButton.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    try {
	                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");

	                        // Check if a record with the same primary key already exists
	                        String checkQuery = "SELECT * FROM burtgel WHERE idburtgel = ?";
	                        PreparedStatement checkPst = con.prepareStatement(checkQuery);
	                        checkPst.setString(1, ocodeField.getText());

	                        ResultSet checkResult = checkPst.executeQuery();

	                        if (checkResult.next()) {
	                            JOptionPane.showMessageDialog(null, "Record with the same ID already exists.");
	                        } else {
	                            // Insert the new record using parameterized query
	                            String insertQuery = "INSERT INTO burtgel(idburtgel, ovog, ner, hugatsaa, dugaar, hayg,tenhim,huis,uy) VALUES(?,?,?,?,?,?,?,?,?)";
	                            PreparedStatement pst = con.prepareStatement(insertQuery);
	                            pst.setString(1, ocodeField.getText());
	                            pst.setString(2, ovogField.getText());
	                            pst.setString(3, nerField.getText());
	                            pst.setDate(4, new java.sql.Date(dateChooser.getDate().getTime()));
	                            pst.setString(5, dugaarField.getText());
	                            pst.setString(6, haygArea.getText());
	                            pst.setString(7, comboBox.getSelectedItem().toString());
	                            pst.setString(8, comboBox_1.getSelectedItem().toString());
	                            pst.setString(9, comboBox_1_1.getSelectedItem().toString());
	                            

	                            int rowsAffected = pst.executeUpdate();
	                            if (rowsAffected > 0) {
	                                // Add data to the table
	                                Object[] rowData = { ocodeField.getText(), ovogField.getText(), nerField.getText(),
	                                        new java.sql.Date(dateChooser.getDate().getTime()), dugaarField.getText(), haygArea.getText(),comboBox.getSelectedItem(),comboBox_1.getSelectedItem(),comboBox_1_1.getSelectedItem() };
	                                DefaultTableModel model = (DefaultTableModel) table.getModel();
	                                model.addRow(rowData);

	                                JOptionPane.showMessageDialog(null, "Амжилттай бүртгэгдлээ.");
	                            } else {
	                                JOptionPane.showMessageDialog(null, "Бүртгэгдэхэд алдаа гарлаа.");
	                            }
	                        }

	                        con.close();
	                    } catch (SQLException e1) {
	                        e1.printStackTrace();
	                    }
	                    table();
	                }
	           
	            public void table() {
	            	try {
	            	// Retrieve student data from the database
	            	String a = "SELECT * FROM burtgel";
	            	Class.forName("com.mysql.cj.jdbc.Driver");
	            	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oyutnii_medeelel", "root", "W@2915djkq#");
	            	Statement statement = (Statement) connection.createStatement();
	            	ResultSet rs = ((java.sql.Statement) statement).executeQuery(a);
	            	// Set up the table model with the retrieved data
	            	table.setModel(buildTableModel(rs));
	            	} catch (Exception ex1) {
	            	JOptionPane.showMessageDialog(null, ex1.getMessage());
	            	}
	            	}
				private TableModel buildTableModel(ResultSet rs) throws SQLException {
					ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();
					// Get column names
					Vector<String> columnNames = new Vector<String>();
					int columnCount = metaData.getColumnCount();
					for (int column = 1; column <= columnCount; column++) {
					columnNames.add(metaData.getColumnName(column));
					}
					// Get table data
					Vector<Vector<Object>> data = new Vector<Vector<Object>>();
					while (rs.next()) {
					Vector<Object> vector = new Vector<Object>();
					for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
					vector.add(rs.getObject(columnIndex));
					}
					data.add(vector);
					}
					return new DefaultTableModel(data, columnNames);
				}
	        });
	        
			
	    }
	}