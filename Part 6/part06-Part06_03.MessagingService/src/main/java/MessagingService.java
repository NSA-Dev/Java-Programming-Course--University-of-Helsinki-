/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService() {
        messages = new ArrayList(); 
    }
    
    public void add(Message message) {
        int messageLength = message.getContent().length(); 
        
        if(messageLength <= 280) {
            messages.add(message); 
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages; 
    }
    
}
