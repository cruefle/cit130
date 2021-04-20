/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportprojectfinal;
import vehicle.*;
import java.util.Random;
/**
 *
 * @author cruef
 */
public class TransportSafetySimulator {
    public static void main(String[] args) {
        TransportVehicle ussRequin = new Submarine();
        ussRequin.setPassengerCount(10); //crew count
        ussRequin.setAvgSpeed(8.75); //knots
        
        Random rd = new Random(); //random generator
        
        //generate current depth of ussRequin
        int depth = rd.nextInt(400); //max depth
        
        //generate if it is hit by a torpedo
        boolean torpedo = rd.nextBoolean();
        System.out.println("Is the USS Requin hit by a torpedo?: " + torpedo);
        
        if (torpedo == false){
            System.out.println("The USS did not sink. There are no casualties.");
            
        }else{
            System.out.println("The USS was hit by a torpedo and sank. There were"
                    + " 10 crew mates on board.");
            //calculate casualties 
            int survivors = rd.nextInt(10);
            System.out.println("Of the 10 crewmates, only " + survivors + 
                    " were able to swim to the surface and survive.");
            
        }//close if else
       
        
    }//close main
}//close class
