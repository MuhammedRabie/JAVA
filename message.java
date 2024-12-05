/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystem;

/**
 *
 * @author nour
 */
public class message extends NotificationDecorator {
    
    public message() {
        super();
    }

    @Override
    public String SendNotification() {
        return super.SendNotification()+messagenotif(); //To change body of generated methods, choose Tools | Templates.
    }

    private String messagenotif(){
        return " message sent";
    }
}
