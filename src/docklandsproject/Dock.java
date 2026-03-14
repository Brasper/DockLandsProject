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
    //Fields
    private int dockId;
    private String location;
    private int bikesAvailable;
    private int scootersAvailable;
    private String status;

    public Dock() {
    }

    public Dock(int dockId, String location, int bikesAvailable, int scootersAvailable, String status) {
        this.dockId = dockId;
        this.location = location;
        this.bikesAvailable = bikesAvailable;
        this.scootersAvailable = scootersAvailable;
        this.status = status;
    }

    public int getDockId() {
        return dockId;
    }

    public void setDockId(int dockId) {
        this.dockId = dockId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBikesAvailable() {
        return bikesAvailable;
    }

    public void setBikesAvailable(int bikesAvailable) {
        this.bikesAvailable = bikesAvailable;
    }

    public int getScootersAvailable() {
        return scootersAvailable;
    }

    public void setScootersAvailable(int scootersAvailable) {
        this.scootersAvailable = scootersAvailable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String printDetails(){
        return "Dock ID:" + dockId + "Location:" + location + "Bikes:" + bikesAvailable + "Scooters:" + scootersAvailable + "Status:" + status;
        
    }
}
