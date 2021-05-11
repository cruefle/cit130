/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackers;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.StrokeBorder;
/**
 *
 * @author cruef
 */
public class Hackers extends JFrame {
    
    private JLabel jlblMessage = new JLabel("MESS WITH THE BEST", JLabel.LEFT);
    private JCheckBox jchkBold = new JCheckBox("Bold");
    private JCheckBox jchkItalic = new JCheckBox("Italic");
            
    public static void main(String[] args) {
        
        Hackers frame = new Hackers(); //call constructor
        //frame.pack(); //make size of window the min possible to show components
        frame.setSize(new Dimension(1000,800));
        frame.setTitle("GUI Event Demo");
        frame.setLocationRelativeTo(null); //put window in middle of screen w null
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ///easier x button setup
        frame.setVisible(true);
    }//close main
    
    
    
    //CONSTRUCTOR
    public Hackers(){
        //customize the display of our JLabel component by setting a border
        jlblMessage.setBorder(new LineBorder(Color.BLACK,2));
        //stroke border vvv
        //jlblMessage.setBorder(new StrokeBorder(new BasicStroke(12,1,3,2)));
        //we've inhereted the supremely important add() method from our 
        //parent, javax.swing.JFrame which allows us to actually put a component
        //in our JFrame (ie, a window)
        add(jlblMessage, BorderLayout.CENTER);
        //add jpanel
        JPanel jpCheckBoxes = new JPanel();
        //tell the Jpanel how to organize the components we insert with .add()
        jpCheckBoxes.setLayout(new FlowLayout());
        //^^^ if u wanted them side by side, do 1,2. 1 row 2 columns
        jpCheckBoxes.add(jchkBold);
        jpCheckBoxes.add(jchkItalic);
        //add our mini panel to our master frame
        add(jpCheckBoxes, BorderLayout.EAST);
        
        //register listener with check boxes
        jchkBold.addActionListener(new ActionListener(){
            @Override   
            public void actionPerformed(ActionEvent e){
                //call our setFont() method
                setNewFont();
            }
        });
        
        jchkItalic.addActionListener(new ActionListener(){
            @Override   
            public void actionPerformed(ActionEvent e){
                //call our setFont() method
                setNewFont();
            }
        });
        
    }//close constructor
    
    private void setNewFont(){
        int fontStyle = Font.PLAIN;
        //strange looking if else
        fontStyle += (jchkBold.isSelected() ? Font.BOLD : Font.PLAIN);
        fontStyle += (jchkItalic.isSelected() ? Font.ITALIC : Font.PLAIN);
        
        Font font = jlblMessage.getFont();
        jlblMessage.setFont(new Font(font.getName(), fontStyle, font.getSize()));
        jlblMessage.setText("I;ve been changed");
    }
}//close class
