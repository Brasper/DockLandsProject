/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docklandsproject;

import java.util.Stack;

/**
 *
 * @author paul1
 */
public class CompletedStack {
    
    private Stack<MaintenanceRequest> stack;

    public CompletedStack() {
        stack = new Stack<>();
    }
    
    public void push(MaintenanceRequest r) {
        stack.push(r);
    }
    
    public MaintenanceRequest pop(){
        if(! stack.isEmpty()){
            return stack.pop();
        }
        
        return null;
    }
    
    public void viewHistory(){
        if (stack.isEmpty()){
            System.out.println("No Completed requests done yet");
            return;
        }
        for(MaintenanceRequest r : stack){
            System.out.println(r.printDetails());
        }
    }
    
    public boolean isEmpty(){
        if (stack.isEmpty()){
        return true;
    } else {
            return false;
            }
    }
    
}
