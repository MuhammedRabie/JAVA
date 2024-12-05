/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystem;

/**
 *
 * @author nour
 */
public abstract class Account {
    String username; 
    String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public abstract void login();
}
