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
    //Fields
    private int requestId;
    private int dockId;
    private String issueDescription;
    private int priorityLevel;

    public MaintenanceRequest() {
    }

    public MaintenanceRequest(int requestId, int dockId, String issueDescription, int priorityLevel) {
        this.requestId = requestId;
        this.dockId = dockId;
        this.issueDescription = issueDescription;
        this.priorityLevel = priorityLevel;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getDockId() {
        return dockId;
    }

    public void setDockId(int dockId) {
        this.dockId = dockId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
    
    @Override
    public int compareTo(MaintenanceRequest other){
        return Integer.compare(this.priorityLevel, other.priorityLevel);
    }
    
    public String printDetails(){
        return "Request ID:" + requestId + "Dock ID:" + dockId + "Issue:" + issueDescription + "Priority:" + priorityLevel;
    }
}
