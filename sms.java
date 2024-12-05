/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystem;

public class sms extends NotificationDecorator {
        public sms() {
        super();
    }

    @Override
    public String SendNotification() {
        return super.SendNotification()+smsnotif(); 
    }
    
    private String smsnotif(){
        return " sms sent";
    }
}
