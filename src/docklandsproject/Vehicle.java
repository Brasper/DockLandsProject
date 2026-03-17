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
    //private fields
    private int vehicleId;
    private String type;
    
    //default constructor
    public Vehicle() {
    }
    //full constructor - sets vehicleId and type
    public Vehicle(int vehicleId, String type) {
        this.vehicleId = vehicleId;
        this.type = type;
    }
    //returns vehicleId
    public int getVehicleId() {
        return vehicleId;
    }
    //sets vehicleId
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    //returns vehicle type
    public String getType() {
        return type;
    }
   
    //sets vehicle type
    public void setType(String type) {
        this.type = type;
    }
    //returns vehicle details as a string
    //overridden by bike an scooter to demonstrate the polymorphism
    public String printDetails(){
        return "Vehicle:" + vehicleId + " | Type:" + type;
    }
}
