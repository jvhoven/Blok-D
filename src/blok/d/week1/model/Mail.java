/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week1.model;

/**
 *
 * @author Jeffrey
 */
public class Mail {

    private final String recipient;
    private final String sender;
    private final String message;
    
    public Mail(String recipient, String sender, String message) {
        this.recipient = recipient;
        this.sender = sender;
        this.message = message;
    }
    
    @Override
    public String toString() {
        return "From: " + this.sender + "\n" + "To: " + this.recipient + "\n" + this.message;
    }
    
}
