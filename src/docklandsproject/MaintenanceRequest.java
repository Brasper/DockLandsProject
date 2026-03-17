/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;


    

/**
 *
 * @author paul1
 */
public class MaintenanceRequest implements Comparable<MaintenanceRequest>{
    //private Fields
    private int requestId;
    private int dockId;
    private String issueDescription;
    private int priorityLevel;

    //default constructor
    public MaintenanceRequest() {
    }
    //full constructor sets all the maintenace request fields
    public MaintenanceRequest(int requestId, int dockId, String issueDescription, int priorityLevel) {
        this.requestId = requestId;
        this.dockId = dockId;
        this.issueDescription = issueDescription;
        this.priorityLevel = priorityLevel;
    }
    // returns request Id
    public int getRequestId() {
        return requestId;
    }
    //sets the request Id
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
    //returns the dock Id
    public int getDockId() {
        return dockId;
    }
    //sets the dockId
    public void setDockId(int dockId) {
        this.dockId = dockId;
    }
    // returns the issueDescription
    public String getIssueDescription() {
        return issueDescription;
    }
    //sets the issue description
    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }
    //returns the prioritylevel
    public int getPriorityLevel() {
        return priorityLevel;
    }
    //sets the priority level
    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
    // compares 2 maintenacnerequest by priortiy level
    //lower the number = the higher the priority
    @Override
    public int compareTo(MaintenanceRequest other){
        return Integer.compare(this.priorityLevel, other.priorityLevel);
    }
    // returns all request detials as a string
    // displays the reuest infromatioj in the gui output area
    public String printDetails(){
        return "Request ID:" + requestId + " | Dock ID:" + dockId + "| Issue:" + issueDescription + " | Priority:" + priorityLevel;
    }
}
