/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssat.lab1.exercisedemo;

import java.util.*;
/**
 *
 * @author mihai
 */
public class TicketsManager {
    private ArrayList<EventTicket> eventsList = new ArrayList<>();
    private ArrayList<PurchasedTicket> purchasedList = new ArrayList<>();
    
    public void addEventTicket(EventTicket et){
        eventsList.add(et);
    }
    
    public boolean purchseTicket(String owner, String eventId){
        for(EventTicket t:eventsList){
            if(t.getEventId().equals(eventId)){
                PurchasedTicket pt = new PurchasedTicket(t, owner);
                purchasedList.add(pt);
                return true;
            }
        }
        return false;
    }
    
    public void viewAllEvenets(){
        //....
    }
    
    
    public void viewAllSoldTickets(){
        //....
    }
    
    
    public boolean checkin(String purchaseId){
        // implementare unei logici de checkin ticket
        // .... 
        return false;
    }
    
}
