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
    
    //private fields
    private Stack<MaintenanceRequest> stack;
    //constructor
    public CompletedStack() {
        stack = new Stack<>();
    }
    //pushes a completed request onto the top of the stack gets called when maintenacance request is processed
    public void push(MaintenanceRequest r) {
        stack.push(r);
    }
    //removes and returns the top from the stack and returns if null is empty
    public MaintenanceRequest pop(){
        // checks stack is empty before popping
        if(! stack.isEmpty()){
            return stack.pop();
        }
       
        return null;
    }
    // it displays all completed requests in the stack
    public void viewHistory(){
        //checks if stack is empty
        if (stack.isEmpty()){
            System.out.println("No Completed requests done yet");
            return;
        }
        //loops thouhg stack and prints each request
        for(MaintenanceRequest r : stack){
            System.out.println(r.printDetails());
        }
    }
    //returns true if the stack is empty and false if it is not
    public boolean isEmpty(){
        if (stack.isEmpty()){
        return true;
    } else {
            return false;
            }
    }
    
}
