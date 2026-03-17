/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package docklandsproject;

/**
 *
 * @author paul1
 */
public interface DockOperations {
    
    // adds a new dock to the linked list
    void addDock(Dock d);
    // removes a dock in the linked list by its ID
    void removeDock(int dockId);
    // finds and returns dock by ID
    Dock findDock(int dockId);
    // Updates an exsisting dock in the linked list
    void updateDock( Dock d );
    // displays all docks in the linked lists
    void displayDocks();
    
}
