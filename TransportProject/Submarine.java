/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportprojectfinal;

import vehicle.*;

/**
 *
 * @author cruef
 */
public class Submarine extends TransportVehicle {

    

    //uss requin
    private final int MAX_DEPTH = 400; //feet. 120m
    private final double MAX_SPEED = 20.25; //knots
    private final int WATER_DISPLACED = 2414; //tons
    
    private int crewCount; //10
    private int endurance; //48 hrs @ 2 knots
    
    
   /**
     * @return the crewCount
     */
    public int getCrewCount() {
        return crewCount;
    }

    /**
     * @param crewCount the crewCount to set
     */
    public void setCrewCount(int crewCount) {
        this.crewCount = crewCount;
    }

    /**
     * @return the endurance
     */
    public int getEndurance() {
        return endurance;
    }

    /**
     * @param endurance the endurance to set
     */
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    
}
