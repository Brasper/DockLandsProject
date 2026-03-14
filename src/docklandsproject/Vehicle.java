/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */

public class Vehicle {
    private int vehicleId;
    private String type;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, String type) {
        this.vehicleId = vehicleId;
        this.type = type;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String printDetails(){
        return "Vehicle:" + vehicleId + "Type:" + type;
    }
}
