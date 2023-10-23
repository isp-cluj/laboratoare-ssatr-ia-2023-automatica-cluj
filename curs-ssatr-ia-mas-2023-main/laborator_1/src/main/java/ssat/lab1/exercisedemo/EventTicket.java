/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ssat.lab1.exercisedemo;

/**
 *
 * @author mihai
 */
public class EventTicket {
    private String eventId;

    public EventTicket(String eventId) {
        this.eventId = eventId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "EventTicket{" + "eventId=" + eventId + '}';
    }
    
    
}
