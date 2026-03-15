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
    private Dock dock;
    private Node next;

    public Node(Dock dock) {
        this.dock = dock;
        next = null;
    }

    public Dock getDock() {
        return dock;
    }

    public void setDock(Dock dock) {
        this.dock = dock;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
