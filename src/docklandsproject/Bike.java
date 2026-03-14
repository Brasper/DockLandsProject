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
    private int gearCount;

    public Bike() {
    }

    public Bike(int vehicleId, String type, int gearCount){
        super(vehicleId, type);
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }
    @Override
    public String printDetails(){
        return "Vehicle ID:" + getVehicleId() + "Type:" + getType() + "Gears:" + gearCount;
    }
}
