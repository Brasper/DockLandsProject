/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public class Scooter extends Vehicle{
    private int maxSpeed;

    public Scooter() {
    }
    
    public Scooter(int vehicleId, String type, int maxSpeed){
        super(vehicleId, type);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    @Override
    public String printDetails(){
        return "Vehicle ID:" + getVehicleId() + "Type:" + getType() + "Max Speed:" + maxSpeed;
    }
}
