/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportprojectfinal;

import vehicle.*;

/**
 * SUBCLASS in our TransportVehicle object hierarchy representing
 * a passenger plane
 * @author cruef
 */
public class Plane extends TransportVehicle {
    final int ENGINE_CYCLE_CUTOFF = 34000;
    final int HOURS_CUTOFF = 34000;
    
    private int crewCount;
    private double altitude;
    private double hoursOfOperation;
    private int engineCycles;
    
    //getters and setters
    
    public int getCrewCount(){
        return crewCount;
    }//close getter
    
    public void setCrewCount(int cc){
        crewCount = cc;
    }//close setter
    
    public double getAltitude(){
        return altitude;
    }//close getter
    
    public void setAltitude(double alt){
        if(alt>= 0){
            altitude = alt;
        }else{
            altitude = 0;
        }//close if else
    }//close setter
    
    public double getHoursOfOperation(){
        return hoursOfOperation;
    }
    
    public void setHoursOfOperation(double hrs){
        hoursOfOperation = hrs;
    }
    
    public int getEngineCycles(){
        return engineCycles;
    }
    
    public void setEngineCycles(int cycles){
        engineCycles = cycles;
    }
    
}//close class
