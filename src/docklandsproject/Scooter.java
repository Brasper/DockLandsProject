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
    //private int field
    private int maxSpeed;

    //empty constructor
    public Scooter() {
    }
    //full constructor calls super to pass vehicleId and type to the parent vehicle class
    public Scooter(int vehicleId, String type, int maxSpeed){
        super(vehicleId, type);
        this.maxSpeed = maxSpeed;
    }
    //returns the maxspeed
    public int getMaxSpeed() {
        return maxSpeed;
    }
    //sets the max speed
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    // overrides vehicle printDetails to include max speed and demonstrates polymorphism
    @Override
    public String printDetails(){
        return "Vehicle ID:" + getVehicleId() + " | Type:" + getType() + " | Max Speed:" + maxSpeed;
    }
}
