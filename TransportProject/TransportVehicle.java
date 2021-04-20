/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportprojectfinal;

import vehicle.*;

/**
 * SUPERCLASS representing a mode of transportation
 * PARENT class of plane, train, bus, car, and boat
 * 
 * abstract modifier may make sense in this class since all uses of a transport 
 * vehicle rely on instantiating a specific subtype
 * @author cruef
 */
public class TransportVehicle {
    
    private String callSign;
    private int passengerCount;
    private int capacity;
    private double avgSpeed;
    private double costPerPassengerMile;
    private double safetyCoefficient;
    private boolean inTransit;
    private double fuelCapacity;
    private double currentFuelLevel;
    
    
    
    
    
    
    //methods for getters and setters of our private member variables
    //GETTERS AND SETTERS
    
    //GETTER
    public int getPassengerCount(){
        //go into 'private vault' and retrrieve the value of a member variable
        return passengerCount;
    }//close getter
    
    //SETTER
    public void setPassengerCount(int count){
    //check incoming value for reasonableness and then injects into private vault (logic check)
    if(count > 0){
        passengerCount = count;
    }else{
        passengerCount = 0;
    }//close ifelse
    }//close SETTER
    
    public double getAvgSpeed(){
        return avgSpeed;
    }//close getter
    
    public void setAvgSpeed(double spd){
        avgSpeed = spd;
    }//close setter
    
    public double GetCostPerPassengerMile(){
        return costPerPassengerMile;
    }
    
    public void setCostPerPassengerMile(double cost){
        costPerPassengerMile = cost;
    }
    
    public double GetSafetyCoefficient(){
        return safetyCoefficient;
    }
    
    public void setSafeteyCoefficient(double coeff){
        safetyCoefficient = coeff;
    }
    
    public boolean getInTransit(){
        return inTransit;
    }
    
    public void setInTransit(boolean intrans){
        inTransit = intrans;
    }
    
    public double getFuelCapacity(){
        return fuelCapacity;
    }
    
    public void setFuelCapacity(double fuel){
        fuelCapacity = fuel;
    }
    
    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }
    
    public void setCurrentFuelLevel(double ctfuel){
        currentFuelLevel = ctfuel;
    }
    
    //END GETTERS AND SETTERS

    /**
     * @return the callSign
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * @param callSign the callSign to set
     */
    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }
    
}//close class TransportVehicle
