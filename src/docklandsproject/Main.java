/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testing the DockLinkedList
        DockLinkedList dockList = new DockLinkedList();
        //Create
        dockList.addDock(new Dock(1,"Grand Canal", 5, 3, "Active"));
        dockList.addDock(new Dock(2,"Custom House", 3, 2, "Active"));
        dockList.addDock(new Dock(3,"IFSC", 0, 0, "Maintenance"));
        
        //Read
        System.out.println("All Docks:");
        dockList.displayDocks();
        
        //Read/ Find dock 1 
        System.out.println("Finding Dock 1:");
        Dock found = dockList.findDock(1);
        if (found !=null){
            System.out.println(found.printDetails());
        }
        
        //Update
        System.out.println("Updating Dock 1:");
        dockList.updateDock(new Dock(1, "Grand Canal", 8, 6, "Active"));
        dockList.displayDocks();
        
        //Delete
        System.out.println("Removing Dock 3:");
        dockList.removeDock(3);
        dockList.displayDocks();
        
        // Testing Maintenenance Priority Queue
        MaintenancePriorityQueue queue = new MaintenancePriorityQueue();
        
        //Create 
        queue.addRequest(new MaintenanceRequest(1,1,"Broken handle bar", 3));
        queue.addRequest(new MaintenanceRequest(2,2,"Flat tire", 1));
        queue.addRequest(new MaintenanceRequest(3,3,"Brakes broken", 5));
        
        //Read
        System.out.println("Next Request:");
        System.out.println(queue.viewNextRequest().printDetails());
        
        //Update 
        System.out.println("Updating request 1 to priority 5:");
        queue.updateRequest(1, 5);
        
        //Delete
        System.out.println("Deleting request 2:");
        queue.deleteRequest(2);
        
        //Process
        System.out.println("Processing the next Request:");
        MaintenanceRequest processed = queue.processRequest();
        if(processed != null){
            System.out.println(processed.printDetails());
        }
        
     //testing CompletedStack
     CompletedStack stack = new CompletedStack();
     
     //Push
     stack.push(processed);
     stack.push(new MaintenanceRequest(4, 1, "fixed Bike" , 2));
     
     //View History
     System.out.println("Showing Complted History");
     stack.viewHistory();
     
     //Pop
     System.out.println("Popping top request");
     MaintenanceRequest popped = stack.pop();
     if (popped !=null) {
         System.out.println(popped.printDetails());
         
     
     }
    
     
     //Testing Inheritance and Polymorhsism
     Vehicle bike = new Bike(1, "Bike", 6 );
     Vehicle scooter = new Scooter(2, "Scooter", 40);
     System.out.println(bike.printDetails());
     System.out.println(scooter.printDetails());
     
     // Launch of the GUI
     DockLandsGUI gui = new DockLandsGUI();
     gui.setVisible(true);
     
               
    
    }
    
}
