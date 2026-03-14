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
    
    void addDock(Dock d);
    
    void removeDock(int dockId);
    
    Dock findDock(int dockId);
    
    void updateDock( Dock d );
    
    void displayDocks();
    
}
