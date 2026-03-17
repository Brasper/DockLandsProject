/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public class Node {
    //private fields
    //stores the dock object in the node
    private Dock dock;
    // stores the reference to the next node in the list
    private Node next;
    
    // constructor creates a new node with a dock object
    // next is set to null as the new node has no connetion
    public Node(Dock dock) {
        this.dock = dock;
        next = null;
    }
    // returns the dock object
    public Dock getDock() {
        return dock;
    }
    //sets dock object
    public void setDock(Dock dock) {
        this.dock = dock;
    }
    // returns the next node
    public Node getNext() {
        return next;
    }
    // sets the next node
    //whihc is used to connect nodes together when building the list
    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
