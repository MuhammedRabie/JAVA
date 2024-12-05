package exammanagementsystem;

import java.util.*;

public class Student extends Account {
    
    public String getUsername() {
        return username;
    }

    private String name;
    private String grade;
    List<String> notif = new ArrayList();
    List<String> assignments = new ArrayList();
    List<String> Exams = new ArrayList();

    public Student(String name, String grade, String username, String password) {
        super(username, password);
        this.name = name;
        this.grade = grade;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    @Override
    public void login() {
        StudentForm s = new StudentForm();
            s.setVisible(true);
    }
    
    public void TakeExam() {
        
    }
    
    public void ViewGrade() {
        
    }
    
    public void WriteNote(String note) {
        School.principle.notes.add(note);
    }
}