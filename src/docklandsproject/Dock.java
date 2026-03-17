/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public class Dock {
    // private Fields
    private int dockId;
    private String location;
    private int bikesAvailable;
    private int scootersAvailable;
    private String status;
    // default constructor
    public Dock() {
    }
    //full constructor sets all dock the docks fields
    public Dock(int dockId, String location, int bikesAvailable, int scootersAvailable, String status) {
        this.dockId = dockId;
        this.location = location;
        this.bikesAvailable = bikesAvailable;
        this.scootersAvailable = scootersAvailable;
        this.status = status;
    }
    //returns dockid
    public int getDockId() {
        return dockId;
    }
    // sets dockid
    public void setDockId(int dockId) {
        this.dockId = dockId;
    }
    // returns location
    public String getLocation() {
        return location;
    }
    //sets location
    public void setLocation(String location) {
        this.location = location;
    }
    // returnsm bikesavailable
    public int getBikesAvailable() {
        return bikesAvailable;
    }
    // sets bikesavailable
    public void setBikesAvailable(int bikesAvailable) {
        this.bikesAvailable = bikesAvailable;
    }
    // returns availablescooters
    public int getScootersAvailable() {
        return scootersAvailable;
    }
    // gets scootersavailable
    public void setScootersAvailable(int scootersAvailable) {
        this.scootersAvailable = scootersAvailable;
    }
    //returns status
    public String getStatus() {
        return status;
    }
    //sets status
    public void setStatus(String status) {
        this.status = status;
    }
    // returns all dock details as a String
    // it is used to display dokc infomration in the GUI
    public String printDetails(){
        return "Dock ID:" + dockId + "| Location:" + location + " | Bikes:" + bikesAvailable + " | Scooters:" + scootersAvailable + " |Status:" + status;
        
    }
}
