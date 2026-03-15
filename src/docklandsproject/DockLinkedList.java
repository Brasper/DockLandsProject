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
    
    private Node head;
    
    public DockLinkedList(){
        head = null;
    }
    
    @Override
    public void addDock(Dock d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    @Override 
    public void removeDock(int dockId){
        if(head == null){
            return;
        }
        if(head.getDock().getDockId()== dockId){
            head = head.getNext();
            return; 
        }
        Node current = head;
        while(current.getNext()!=null){
            if (current.getNext().getDock().getDockId() == dockId){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }
    
    @Override
    public Dock findDock(int dockId) {
        Node current = head;
        while (current !=null){
            if (current.getDock().getDockId()== dockId){
                return current.getDock();
                }
            current = current.getNext();
        }
        return null;
    }
    
    @Override
    public void updateDock(Dock d ){
        Node current = head;
        while (current !=null) {
            if (current.getDock().getDockId()== d.getDockId()){
                current.setDock(d);
                return;
            }
            current = current.getNext();
        }
    }
    @Override
    public void displayDocks(){
        if(head == null) {
            System.out.println("No docks are in the system");
            return;
        }
        Node current = head;
        while (current !=null){
            System.out.println(current.getDock().printDetails());
            current = current.getNext();
        }
            
    }

   
}
    
    
    


