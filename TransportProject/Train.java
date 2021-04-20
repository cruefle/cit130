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
public class Train extends TransportVehicle implements Derailable{
    
    private int passengerCarCount;
    private int freightCarCount;
    private double grossWeight;
    
    //checks gross weight and speed to determine if this train can be derailed
    @Override
    public boolean canBeDerailed(){
        boolean derailSuccessLikely = false;
        if(grossWeight < 3000000 && this.getAvgSpeed() < 35){
            derailSuccessLikely = true;
        }
        return derailSuccessLikely;
    }
    
    public int getPassengerCarCount(){
        return passengerCarCount;
    }//close getter
    
    public void setPassengerCarCount(int count){
        passengerCarCount = count;
    }

    /**
     * @return the freightCarCount
     */
    public int getFreightCarCount() {
        return freightCarCount;
    }

    /**
     * @param freightCarCount the freightCarCount to set
     */
    public void setFreightCarCount(int freightCarCount) {
        this.freightCarCount = freightCarCount;
    }

    /**
     * @return the grossWeight
     */
    public double getGrossWeight() {
        return grossWeight;
    }

    /**
     * @param grossWeight the grossWeight to set
     */
    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }
    
}
