/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public class DockLinkedList implements DockOperations {
    
    //head points to the first node in the list
    private Node head;
    //constructor
    public DockLinkedList(){
        head = null;
    }
    //adds a new dock to the end of the linked lsit
    @Override
    public void addDock(Dock d) {
        //create new node witht he dock object
        Node newNode = new Node(d);
        // if the list is empty new node beocmes the head
        if (head == null) {
            head = newNode;
        } else {
            //travel to the end of the list
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // adds a new node at the end 
            current.setNext(newNode);
        }
    }
    // removes a dock from the list by its id
    @Override 
    public void removeDock(int dockId){
        // returns if list is empty
        if(head == null){
            return;
        }
        if(head.getDock().getDockId()== dockId){
            head = head.getNext();
            return; 
        }
        //travels list to find the node to remove
        Node current = head;
        while(current.getNext()!=null){
            if (current.getNext().getDock().getDockId() == dockId){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }
    //Finds and returns one dock by its ID
    @Override
    public Dock findDock(int dockId) {
        //start at the head and traverse the list
        Node current = head;
        while (current !=null){
            // return dock if ID matches
            if (current.getDock().getDockId()== dockId){
                return current.getDock();
                }
            current = current.getNext();
        }
        // returns null if dock is not found
        return null;
    }
    // updates existing dock in the list
    @Override
    public void updateDock(Dock d ){
        // starts at the head and traverse the list
        Node current = head;
        while (current !=null) {
            // find dock with the matching id and update it 
            if (current.getDock().getDockId()== d.getDockId()){
                current.setDock(d);
                return;
            }
            current = current.getNext();
        }
    }
    // displays all docks in the list
    @Override
    public void displayDocks(){
        if(head == null) {
            System.out.println("No docks are in the system");
            return;
        }
        //traverse the list and print each dock
        Node current = head;
        while (current !=null){
            System.out.println(current.getDock().printDetails());
            current = current.getNext();
        }
            
    }

   
}
    
    
    


