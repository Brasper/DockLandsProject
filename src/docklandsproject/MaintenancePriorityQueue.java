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
    
    private PriorityQueue<MaintenanceRequest> queue;
    
    public MaintenancePriorityQueue(){
        queue = new PriorityQueue<>();
    }
    
    @Override
    public void addRequest(MaintenanceRequest r){
        queue.add(r);
    }
    
    @Override
    public MaintenanceRequest processRequest(){
        if (!queue.isEmpty()){
            return queue.poll();
        }
        return null;
    }
    
    @Override
    public MaintenanceRequest viewNextRequest(){
        if (!queue.isEmpty()){
            return queue.peek();
        }
        return null;
    }
    
    
    @Override
    public void updateRequest(int requestId, int newPriority){
        for (MaintenanceRequest r : queue){
            if(r.getRequestId() == requestId){
                r.setPriorityLevel(newPriority);
                return;
            }
        }
    }
    
    @Override
    public void deleteRequest(int requestId){
        MaintenanceRequest toRemove = null;
        for (MaintenanceRequest r : queue) {
            if(r.getRequestId() == requestId){
                toRemove = r;
                break;
            }
            
        }
        
        if (toRemove !=null){
            queue.remove(toRemove);
        }
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
}
