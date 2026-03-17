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
        //Creates new docklinkedlist object
        dockList.addDock(new Dock(1,"Grand Canal", 5, 3, "Active"));
        dockList.addDock(new Dock(2,"Custom House", 3, 2, "Active"));
        dockList.addDock(new Dock(3,"IFSC", 0, 0, "Maintenance"));
        
        // displays all docks in the list
        System.out.println("All Docks:");
        dockList.displayDocks();
        
        // finds 1 specific dock by ID
        System.out.println("Finding Dock 1:");
        Dock found = dockList.findDock(1);
        if (found !=null){
            System.out.println(found.printDetails());
        }
        
        //updates dock 1 with new details
        System.out.println("Updating Dock 1:");
        dockList.updateDock(new Dock(1, "Grand Canal", 8, 6, "Active"));
        dockList.displayDocks();
        
        //removes dock 3 from the list
        System.out.println("Removing Dock 3:");
        dockList.removeDock(3);
        dockList.displayDocks();
        
        // Testing Maintenance Priority Queue
        MaintenancePriorityQueue queue = new MaintenancePriorityQueue();
        
        //adds 3 Maintenenance requests to the queue
        queue.addRequest(new MaintenanceRequest(1,1,"Broken handle bar", 3));
        queue.addRequest(new MaintenanceRequest(2,2,"Flat tire", 1));
        queue.addRequest(new MaintenanceRequest(3,3,"Brakes broken", 5));
        
        //views the next highest priority request wihtout removing it 
        System.out.println("Next Request:");
        System.out.println(queue.viewNextRequest().printDetails());
        
        //Updates request 1 priority to 5
        System.out.println("Updating request 1 to priority 5:");
        queue.updateRequest(1, 5);
        
        //Deletes requests 2 from the queue
        System.out.println("Deleting request 2:");
        queue.deleteRequest(2);
        
        //Processes the next highest priority request
        System.out.println("Processing the next Request:");
        MaintenanceRequest processed = queue.processRequest();
        if(processed != null){
            System.out.println(processed.printDetails());
        }
        
     //testing CompletedStack
     CompletedStack stack = new CompletedStack();
     
     // processed request onto the top of the stack
     stack.push(processed);
     stack.push(new MaintenanceRequest(4, 1, "fixed Bike" , 2));
     
     //displays all completed requests in the stack
     System.out.println("Showing Completed History");
     stack.viewHistory();
     
     //removes and returns the top request from the stack
     System.out.println("Popping top request");
     MaintenanceRequest popped = stack.pop();
     if (popped !=null) {
         System.out.println(popped.printDetails());
         
     
     }
    
     
     //Testing Inheritance and Polymorphism
     //creates vehicles references using Bike and the scooter subclasses 
     Vehicle bike = new Bike(1, "Bike", 6 );
     Vehicle scooter = new Scooter(2, "Scooter", 40);
     System.out.println(bike.printDetails());
     System.out.println(scooter.printDetails());
     
     // Launch of the GUI
     //creates and displays the DockLandsGui window
     DockLandsGUI gui = new DockLandsGUI();
     gui.setVisible(true);
     
               
    
    }
    
}
