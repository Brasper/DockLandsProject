/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;
import java.util.PriorityQueue;

/**
 *
 * @author paul1
 */
public class MaintenancePriorityQueue implements MaintenanceOperations {
    
    //private PriorityQueue field stores MaintenanceRequest objects
    // stored automatically by priority level using compareTo
    private PriorityQueue<MaintenanceRequest> queue;
    //constructor
    public MaintenancePriorityQueue(){
        queue = new PriorityQueue<>();
    }
    //adds a new request to the priority queue
    @Override
    public void addRequest(MaintenanceRequest r){
        queue.add(r);
    }
    //removes and returns the highest priority request
    @Override
    public MaintenanceRequest processRequest(){
        if (!queue.isEmpty()){
            return queue.poll();
        }
        //returns null if queue is empty
        return null;
    }
    
    // views the next highest priority wihtout having to remove it
    @Override
    public MaintenanceRequest viewNextRequest(){
        if (!queue.isEmpty()){
            return queue.peek();
        }
        //returns null if queue is empty
        return null;
    }
    
    // Updates the priority level of a already exisiting request by the ID
    @Override
    public void updateRequest(int requestId, int newPriority){
        for (MaintenanceRequest r : queue){
            // finds the request with matching ID and updates the priority
            if(r.getRequestId() == requestId){
                r.setPriorityLevel(newPriority);
                
                return;
            }
        }
    }
    // removes a request from the queue by the ID
    @Override
    public void deleteRequest(int requestId){
        MaintenanceRequest toRemove = null;
        for (MaintenanceRequest r : queue) {
            //finds the request with matching ID
            if(r.getRequestId() == requestId){
                toRemove = r;
                break;
            }
            
        }
        // remove request if its found
        if (toRemove !=null){
            queue.remove(toRemove);
        }
    }
    //returns true if queue is emptty false if not
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
}
