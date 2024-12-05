/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystem;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author nour
 */

public class Principle extends Account{
    
    private static Principle principle;
    List<String> notes = new ArrayList();

    public static Principle getInstance(){
        if(principle == null){
            principle = new Principle("princ","123");
        }
        return principle;
    }

    public Principle(String username, String password) {
        super(username, password);
    }

    @Override
    public void login() {
        PrinciblePage Pb =new PrinciblePage();
        Pb.setVisible(true);
    }
    
    public void AddTeacher(String username,String password,String name,String subject,String salary) throws IOException{
        Teacher NewTeacher = new Teacher(name,subject,salary,username,password);
        School.teachers.add(NewTeacher);
    }
    
    public void EditTeacher(int i,String subj,String sal){
        if (i!=-1) {
            School.teachers.get(i).setSalary(sal);
            School.teachers.get(i).setSubject(subj);
            JOptionPane.showMessageDialog(null, 
                              "Teacher Edited", 
                              "ALERT", 
                              JOptionPane.WARNING_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, 
                              "Teacher doesn't exist", 
                              "ALERT", 
                              JOptionPane.WARNING_MESSAGE); 
        }
        
    }
        
    public void DeleteTeacher(int i){
        Teacher remove = School.teachers.remove(i);
        JOptionPane.showMessageDialog(null, 
                              "Teacher Removed !", 
                              "ALERT", 
                              JOptionPane.WARNING_MESSAGE);
    }
    
    public void CreateStudent(String username,String password,String name,String grade) throws IOException{
        Student NewStud = new Student(name, grade,  username,  password);
        School.students.add(NewStud);
        
    }
    
    public void PrepTimeTable(){
             JOptionPane.showMessageDialog(null, 
                              "Timetable Set !", 
                              "TimeTable Function", 
                              JOptionPane.PLAIN_MESSAGE);
    }
    
    public void GetExamInfo(){
        
    }
}
