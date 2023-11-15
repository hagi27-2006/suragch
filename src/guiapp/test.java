package guiapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class test extends JFrame {

 private JPanel contentPane;
 Timer tm1,tm2,tm3;
 // the panels default height = 60
    Integer pl1 = 60,pl2 = 60,pl3 = 60;
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     test frame = new test();
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
 public test() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 550, 435);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JPanel panel = new JPanel();
  panel.setBounds(376, 11, 148, 60);
  contentPane.add(panel);
  panel.setLayout(null);
  JButton btnNewButton = new JButton("New button");
  btnNewButton.setBackground(Color.ORANGE);
  btnNewButton.setBounds(0, 0, 148, 60);
  panel.add(btnNewButton);
  
  JButton button = new JButton("New button");
  button.setBackground(Color.ORANGE);
  button.setBounds(0, 61, 148, 60);
  panel.add(button);
  
  JButton button_1 = new JButton("New button");
  button_1.setBackground(Color.ORANGE);
  button_1.setBounds(0, 122, 148, 60);
  panel.add(button_1);
  
  JButton button_2 = new JButton("New button");
  button_2.setBackground(Color.ORANGE);
  button_2.setBounds(0, 183, 148, 60);
  panel.add(button_2);
  
  JButton button_3 = new JButton("New button");
  button_3.setBackground(Color.ORANGE);
  button_3.setBounds(0, 243, 148, 60);
  panel.add(button_3);
  
  JPanel panel_1 = new JPanel();
  panel_1.setLayout(null);
  panel_1.setBounds(211, 11, 148, 60);
  contentPane.add(panel_1);
  
  JButton button_4 = new JButton("New button");
  
  button_4.setBackground(Color.ORANGE);
  button_4.setBounds(0, 0, 148, 60);
  panel_1.add(button_4);
  
  JButton button_5 = new JButton("New button");
  button_5.setBackground(Color.ORANGE);
  button_5.setBounds(0, 61, 148, 60);
  panel_1.add(button_5);
  
  JButton button_6 = new JButton("New button");
  button_6.setBackground(Color.ORANGE);
  button_6.setBounds(0, 122, 148, 60);
  panel_1.add(button_6);
  
  JButton button_7 = new JButton("New button");
  button_7.setBackground(Color.ORANGE);
  button_7.setBounds(0, 183, 148, 60);
  panel_1.add(button_7);
  
  JButton button_8 = new JButton("New button");
  button_8.setBackground(Color.ORANGE);
  button_8.setBounds(0, 243, 148, 60);
  panel_1.add(button_8);
  
  JPanel panel_2 = new JPanel();
  panel_2.setLayout(null);
  panel_2.setBounds(42, 11, 148, 60);
  contentPane.add(panel_2);
  
  JButton button_9 = new JButton("New button");
  button_9.setBackground(Color.ORANGE);
  button_9.setBounds(0, 0, 148, 60);
  panel_2.add(button_9);
  
  JButton button_10 = new JButton("New button");
  button_10.setBackground(Color.ORANGE);
  button_10.setBounds(0, 61, 148, 60);
  panel_2.add(button_10);
  
  JButton button_11 = new JButton("New button");
  button_11.setBackground(Color.ORANGE);
  button_11.setBounds(0, 122, 148, 60);
  panel_2.add(button_11);
  
  JButton button_12 = new JButton("New button");
  button_12.setBackground(Color.ORANGE);
  button_12.setBounds(0, 183, 148, 60);
  panel_2.add(button_12);
  
  JButton button_13 = new JButton("New button");
  button_13.setBackground(Color.ORANGE);
  button_13.setBounds(0, 243, 148, 60);
  panel_2.add(button_13);
  
  tm1 = new Timer(20, new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {
    
    // 300 the maximum height
    if(pl1 > 300)
    {
     tm1.stop();
    }
    else{
     panel.setSize(panel.getWidth(),pl1);
     pl1 += 20;
    }
    
   }
  });
  
      tm2 = new Timer(20, new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {
    
    if(pl2 > 300)
    {
     tm2.stop();
    }
    else{
     panel_1.setSize(panel_1.getWidth(),pl2);
     pl2 += 20;
    }
    
   }
  });
      
      tm3 = new Timer(20, new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent e) {
    
    if(pl3 > 300)
    {
     tm3.stop();
    }
    else{
     panel_2.setSize(panel_2.getWidth(),pl3);
     pl3 += 20;
    }
    
   }
  });
  
  btnNewButton.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseEntered(MouseEvent arg0) {
    // set the panels to the dafault height
    panel_1.setSize(panel_1.getWidth(), pl2);
    panel_2.setSize(panel_2.getWidth(), pl3);
    tm1.start();
   }
   @Override
   public void mouseExited(MouseEvent e) {
    
    tm1.stop();
    pl1 = 60;
   }
  });
  
  button_4.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseEntered(MouseEvent arg0) {
    
    panel.setSize(panel.getWidth(), pl1);
    panel_2.setSize(panel_2.getWidth(), pl3);
    tm2.start();
   }
   @Override
   public void mouseExited(MouseEvent e) {
    tm2.stop();
    pl2 = 60;
   }
  });
  
  button_9.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseEntered(MouseEvent e) {
    
    panel_1.setSize(panel_1.getWidth(), pl2);
    panel.setSize(panel.getWidth(), pl1);
    tm3.start();
    
   }
   @Override
   public void mouseExited(MouseEvent e) {
    
    tm3.stop();
    pl3 = 60;
   }
  });
  
 }
}

