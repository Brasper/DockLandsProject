/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public class Bike extends Vehicle {
    //private fields 
    private int gearCount;
    
    //default construtor
    public Bike() {
    }
    
    // full constructor
    // calls super to pass vehicle id and type to the parent vehicle class
    public Bike(int vehicleId, String type, int gearCount){
        super(vehicleId, type);
        this.gearCount = gearCount;
    }
    //returns gear count
    public int getGearCount() {
        return gearCount;
    }
    // sets the gear count
    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
    //overrides vehicle printDetails to include gearcount
    // demonstrates polymorphism
    @Override
    public String printDetails(){
        return "Vehicle ID:" + getVehicleId() + " |Type:" + getType() + " | Gears:" + gearCount;
    }
}
