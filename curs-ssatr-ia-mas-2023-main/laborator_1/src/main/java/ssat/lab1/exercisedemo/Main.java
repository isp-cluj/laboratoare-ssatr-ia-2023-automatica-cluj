/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssat.lab1.exercisedemo;

/**
 *
 * @author mihai
 */
public class Main {
    public static void main(String[] args) {
        EventTicket et = new EventTicket("Event 1");
        System.out.println(et);
        
        PurchasedTicket pt = new PurchasedTicket(et, "Alin");
        
        System.out.println(pt);
        
        
        TicketsManager tm = new TicketsManager();
        
        tm.addEventTicket(et);
        tm.addEventTicket(new EventTicket("Event 2"));
        
        
        tm.purchseTicket("Dan", "Event 2");
        
        // ....
        
    }
}
