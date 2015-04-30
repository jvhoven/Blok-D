/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.d.week1.model;

import java.util.ArrayList;

/**
 *
 * @author Jeffrey
 */
public class Mailbox {
    
    ArrayList<Mail> mails = new ArrayList<>();
    
    public void addMail(Mail m) {
        mails.add(m);
    }
    
    public Mail getMail(int i) {
        return mails.get(i);
    }
    
    public void removeMail(int i) {
        mails.remove(i);
    }
    
}
