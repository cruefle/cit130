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
public class Automobile extends TransportVehicle{
    private int carSeats;
    private double milesPerHour;
    private double milesOnEngine;
    private double maxSpeed;
    private double wheelBaseInches;
    /**
     * @return the carSeats
     */
    public int getCarSeats() {
        return carSeats;
    }

    /**
     * @param carSeats the carSeats to set
     */
    public void setCarSeats(int carSeats) {
        this.carSeats = carSeats; //this means use the variable in this object
    }

    /**
     * @return the milesPerHour
     */
    public double getMilesPerHour() {
        return milesPerHour;
    }

    /**
     * @param milesPerHour the milesPerHour to set
     */
    public void setMilesPerHour(double milesPerHour) {
        this.milesPerHour = milesPerHour;
    }

    /**
     * @return the milesOnEngine
     */
    public double getMilesOnEngine() {
        return milesOnEngine;
    }

    /**
     * @param milesOnEngine the milesOnEngine to set
     */
    public void setMilesOnEngine(double milesOnEngine) {
        this.milesOnEngine = milesOnEngine;
    }

    /**
     * @return the maxSpeed
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @param maxSpeed the maxSpeed to set
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return the wheelBaseInches
     */
    public double getWheelBaseInches() {
        return wheelBaseInches;
    }

    /**
     * @param wheelBaseInches the wheelBaseInches to set
     */
    public void setWheelBaseInches(double wheelBaseInches) {
        this.wheelBaseInches = wheelBaseInches;
    }
   
    
    
    
}
