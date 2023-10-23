/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssat.lab1.exercisedemo;

/**
 *
 * @author mihai
 */
public class PurchasedTicket {
    private EventTicket eventTicket;
    private String owner;
    private String purchaseId;

    public PurchasedTicket(EventTicket eventTicket, String owner) {
        this.eventTicket = eventTicket;
        this.owner = owner;
        purchaseId = eventTicket.getEventId()+"_"+owner;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }
    
    

    public EventTicket getEventTicket() {
        return eventTicket;
    }

    public void setEventTicket(EventTicket eventTicket) {
        this.eventTicket = eventTicket;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "PurchasedTicket{" + "eventTicket=" + eventTicket + ", owner=" + owner + '}';
    }
    
    
    
}
