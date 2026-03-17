/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public interface MaintenanceOperations {
    
    // adds a new maintenace request to the priority queue
    void addRequest(MaintenanceRequest r);
    // removes and returns highest priority request from queue
    MaintenanceRequest processRequest();
    //views the next highest priority request wihtout removing it 
    MaintenanceRequest viewNextRequest();
    //updates the priority of a already exsisting request by the ID
    void updateRequest(int requestId, int newPriority);
    // removes a request from the queue by the ID
    void deleteRequest(int requestId);
    

    
}
