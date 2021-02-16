/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;
/**
 * client class of Lyrics. its a karaoke machine!
 * @author celia
 */
public class SongLand {
    public static void main(String[] args) {
        //welcome user
        System.out.println("Welcome to the I've Set Sail karaoke machine!");
        System.out.println("Please go to one of these links to find I've Set Sail by Toh Kay:");
        System.out.println("\t *YouTube: https://bit.ly/2ZnHnLu");
        System.out.println("\t *Spotify: https://spoti.fi/2LUAHkT");
        System.out.println("Press [ENTER] once the artist starts singing to start the karaoke machine!");
       
        //wait for an enter press before displaying lyrics
        Scanner scan = new Scanner(System.in);
        String wait = scan.nextLine();
        
        //call method
        buildLyricLineArray();
        
        //bid farewell
        System.out.println("Thank you for using the I've Set Sail karaoke machine!");
        
    }//close main method
    
    
    /**
     * method for building the array of lyrics
     * 
     */
    public static void buildLyricLineArray(){
        //create an array size 5 verse 1
        LyricLine[] verse1 = new LyricLine[5];
        verse1[0] = new LyricLine("It's soon but I've set sail again",2200);
        verse1[1] = new LyricLine("The wind feels right this time",1750);
        verse1[2] = new LyricLine("The waves are small but they rock my boat",2070);
        verse1[3] = new LyricLine("Just enough", 730);
        verse1[4] = new LyricLine("It's soon but I've set sail again", 6880);
        
        //verse 2 
        LyricLine[] verse2 = new LyricLine[7];
        verse2[0] = new LyricLine("I've put my trust in the constellations", 2740);
        verse2[1] = new LyricLine("The pinholes of hope", 1070);
        verse2[2] = new LyricLine("That steer my boat",1160);
        verse2[3] = new LyricLine("I've put my heart in the hands",1540);
        verse2[4] = new LyricLine("Of the man in the moon",1160);
        verse2[5] = new LyricLine("It's soon but I've set sail again",2530);
        verse2[6] = new LyricLine("It's soon but I've set sail again",13880);
        
        //verse 3
        LyricLine[] verse3 = new LyricLine[4];
        verse3[0] = new LyricLine ("And if you get seasick",4750);
        verse3[1] = new LyricLine ("I'll drop anchor and hold you close",3850);
        verse3[2] = new LyricLine ("And if you get sunstroke",4100);
        verse3[3] = new LyricLine ("I'll let you sit in the hull of my boat",13820);
        
        //verse4
        LyricLine[]verse4 = new LyricLine[6];
        verse4[0] = new LyricLine("It's soon but I've set sail again",2440);
        verse4[1] = new LyricLine("The moon feels right this time",1610);
        verse4[2] = new LyricLine("It's big and its bright",1075);
        verse4[3] = new LyricLine("And it's in line with the stars",1760);
        verse4[4] = new LyricLine("It's soon but I've set sail again",6700);
        verse4[5] = new LyricLine("It's soon but I've set sail again",9000);
        
        //verse 5 & 6
        LyricLine[] chorus = new LyricLine[9];
        chorus[0] = new LyricLine ("And if you get seasick",4000);
        chorus[1] = new LyricLine ("I'll drop anchor and hold you close",4430);
        chorus[2] = new LyricLine ("And if you get sunstroke",4560);
        chorus[3] = new LyricLine ("I'll let you sit in the hull of my boat",30830);
        chorus[4] = new LyricLine ("",0);
        chorus[5] = new LyricLine ("And if you get seasick",4950);
        chorus[6] = new LyricLine ("I'll drop anchor and hold you close",3700);
        chorus[7] = new LyricLine ("And if you get sunstroke",4100);
        chorus[8] = new LyricLine ("I'll let you sit in the hull of my boat",10920);
        
        
        //pass our arrays of LyricLines to our karaoke simulator 
        karaokeSim(verse1);
        System.out.println("");
        karaokeSim(verse2);
        System.out.println("");
        karaokeSim(verse3);
        System.out.println("");
        karaokeSim(verse4);
        System.out.println("");
        karaokeSim(chorus);
        System.out.println("");
        
    }//end buildLyric
    
    /* Method that displays lines of lyrics with timings
    *@param kTape - array of instantiated lyric line objects
    */
    public static void karaokeSim(LyricLine[] kTape){
       
        //iterate over our incoming array of LyricLines, one at a time
        for(int line = 0; line < kTape.length; line++){
            //extract the lyricline object for our current row
            //and store temporarily 
            LyricLine tempLine = kTape[line];
            //dump lyric to console
            System.out.println(tempLine.lineText);
            try{
            Thread.sleep(tempLine.timeToDisplayMilli);
            }catch (InterruptedException ex){
                //do nothing
            }// dont worry abt this rn 
        }//end for loop
            
    }//end karaokesim
    
   
    
    /*
    utility mthod for displaying guts of a lyric line
    */
    private static void displayLyricLineInfo(LyricLine line){
        System.out.println("Text: " + line.lineText);
        System.out.println("Time to display: " + line.timeToDisplayMilli);
        
    }//end displayLyricLineInfo
}//close class
