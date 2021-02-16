/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *models a sinlge line of a lyric in a song
 * and contains timing data
 * @author celia
 */
public class LyricLine {
    
    //Member variables
    String lineText;
    public long timeToDisplayMilli;
    
    // Default, no-argument constructor lives here
    
        //demo output in constructor
        //constructor names are always identical to
        //to the class name, with optional input arguments
    public LyricLine(){
        //System.out.println("Hey an instance of LyricLine is being constructed");
        //System.out.println("I'm coming alive!");
        
        System.out.println("Inside no-arg constructor");
        
        //initializing member variables to sensible defaults
        lineText = "[no lyric]";
        //inject a sensible default display time
        timeToDisplayMilli = 1000;
    }//close no-arg constructor
    
    /**
     * creates an instance of LyricLine
     * @param lt - actual lines text
     * @param ms - number of milliseconds to display line
     */
    
    public LyricLine(String lt, long ms){ //<< same name but dif signature
        //vvv comments for testing constructor vvv
        //System.out.println("inside two-arg constructor");
        //System.out.println("recieved lt of: " + lt);
        //System.out.println("recieved ms of: " + ms);
    //transfer input parameters
    lineText = lt;
    timeToDisplayMilli = ms;
    }//close 2-arg constructor
    
}//close class
