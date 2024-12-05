/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystem;

/**
 *
 * @author nour
 */
public class GradeNotification implements Notifacation {

    public GradeNotification() {
    }

    @Override
    public String SendNotification() { 
        return "Grade added on System";
    }

}
