/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
/**
 *
 * @author cruef
 */
public class HackersMain {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("HACKERS");
        //this closes the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(700,500);
        //this makes it unable to be resized
        frame.setResizable(false);
        //set background color
        frame.getContentPane().setBackground(Color.gray);
        //set icon
        ImageIcon image = new ImageIcon("C:\\Users\\cruef\\Documents\\NetBeansProjects\\cit130\\src\\guis\\ferret.jpg");
        frame.setIconImage(image.getImage());
        
        //LAYOUT
        frame.setLayout(null);
        
        //FIRST LABEL - PROTOCOL
        //import image icon
        ImageIcon protocolImg = new ImageIcon("C:\\Users\\cruef\\Documents\\NetBeansProjects\\cit130\\src\\guis\\protocol.png");
        //create label and add img to label
        JLabel protocolLabel = new JLabel("PROTOCOL",protocolImg,JLabel.LEFT);
        //set vertical alignment
        protocolLabel.setVerticalAlignment(JLabel.TOP);
        //change font color
        protocolLabel.setForeground(Color.WHITE);
        protocolLabel.setFont(new Font("OCR A Extended",Font.PLAIN,15));
        //add image to frame
        frame.add(protocolLabel);
        
        //LABEL - WORLD/LOCAL
        ImageIcon worldImg = new ImageIcon("C:\\Users\\cruef\\Documents\\NetBeansProjects\\cit130\\src\\guis\\worldlocal.png");
        JLabel worldLabel = new JLabel("WORLD/LOCAL",worldImg,JLabel.LEFT);
        worldLabel.setVerticalAlignment(JLabel.TOP);
        worldLabel.setForeground(Color.WHITE);
        worldLabel.setFont(new Font("OCR A Extended",Font.PLAIN,15));
        
        //LABEL - BACKTRACK
        ImageIcon backImg = new ImageIcon("C:\\Users\\cruef\\Documents\\NetBeansProjects\\cit130\\src\\guis\\backtrack.png");
        JLabel backLabel = new JLabel("BACKTRACK",backImg,JLabel.LEFT);
        backLabel.setVerticalAlignment(JLabel.TOP);
        backLabel.setForeground(Color.WHITE);
        backLabel.setFont(new Font("OCR A Extended",Font.PLAIN,15));
        
        //LABEL - connect
        JLabel connectLabel = new JLabel ("CONNECT");
        connectLabel.setFont(new Font("OCR A Extended",Font.PLAIN,12));
        
        //LABEL - TRACE
        JLabel traceLabel = new JLabel("SACH    TRACE   TRACH");
        traceLabel.setFont(new Font ("OCR A Extended",Font.PLAIN,14));
        traceLabel.setForeground(Color.white);
        traceLabel.setVerticalAlignment(JLabel.TOP);
        
        //LABEL - TRACE
        JLabel homeLabel = new JLabel("HOME    AND    LINE");
        homeLabel.setFont(new Font ("OCR A Extended",Font.PLAIN,14));
        homeLabel.setForeground(Color.white);
        homeLabel.setVerticalAlignment(JLabel.TOP);
        
       //PANEL - MAIN
        JPanel panel = new JPanel();
        panel.setBounds(25,150,630,300);
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(panel,BorderLayout.SOUTH);
        panel.setLayout(new BorderLayout());
        //label for text
        JLabel mess = new JLabel("MESS WITH THE BEST",JLabel.LEFT);
        mess.setVerticalAlignment(JLabel.TOP);
        mess.setForeground(Color.green);
        mess.setFont(new Font("OCR A Extended",Font.BOLD,40));
        panel.add(mess);
       
        //PANEL2 - PROTOCOL
        JPanel panel2 = new JPanel();
        panel2.setBounds(25,75,170,60);
        panel2.setBackground(Color.black);
        panel2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(panel2,BorderLayout.NORTH);
        panel2.setLayout(new BorderLayout());
        panel2.add(protocolLabel);
        
        //PANEL3 - WORLD/LOCAL
        JPanel panel3 = new JPanel();
        panel3.setBounds(200,75,170,60);
        panel3.setBackground(Color.black);
        panel3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(panel3,BorderLayout.NORTH);
        panel3.setLayout(new BorderLayout());
        panel3.add(worldLabel);
        
        //PANEL3 - WORLD/LOCAL
        JPanel panel4 = new JPanel();
        panel4.setBounds(375,75,170,60);
        panel4.setBackground(Color.black);
        panel4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(panel4,BorderLayout.NORTH);
        panel4.setLayout(new BorderLayout());
        panel4.add(backLabel);
        
        //PANEL4 - TRACE
        JPanel panel12 = new JPanel();
        panel12.setBounds(25,25,250,35);
        panel12.setBackground(Color.black);
        panel12.add(traceLabel);
        frame.add(panel12);
        
        //PANEL5 - HOME
        JPanel panel13 = new JPanel();
        panel13.setBounds(295,25,250,35);
        panel13.setBackground(Color.black);
        panel13.add(homeLabel);
        frame.add(panel13);
        
        //PANELS - CONNECT
        JPanel panel5 = new JPanel();
        panel5.setBounds(560,75,10,50);
        panel5.setBackground(Color.black);
        frame.add(panel5);
        
        JPanel panel6 = new JPanel();
        panel6.setBounds(574,75,10,50);
        panel6.setBackground(Color.black);
        frame.add(panel6);
        
        JPanel panel7 = new JPanel();
        panel7.setBounds(588,75,10,50);
        panel7.setBackground(Color.black);
        frame.add(panel7);
        
        JPanel panel8 = new JPanel();
        panel8.setBounds(602,75,10,50);
        panel8.setBackground(Color.black);
        frame.add(panel8);
        
        JPanel panel9 = new JPanel();
        panel9.setBounds(616,75,10,50);
        panel9.setBackground(Color.black);
        frame.add(panel9);
        
        JPanel panel10 = new JPanel();
        panel10.setBounds(630,75,10,50);
        panel10.setBackground(Color.black);
        frame.add(panel10);
        
        JPanel panel11 = new JPanel();
        panel11.setBounds(563,125,75,25);
        panel11.setBackground(Color.gray);
        frame.add(panel11);
        panel11.add(connectLabel);
        
        
        
        
        
        
        
        frame.setVisible(true);
    }
}
