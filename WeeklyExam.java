package exammanagementsystem;

import java.util.List;

public class WeeklyExam extends Exam {

 @Override
    public int getExamMark() {
        return super.getExamMark(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getSubjectName() {
        return super.getSubjectName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTitle() {
        return super.getTitle(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getDurationInMinutes() {
        return super.getDurationInMinutes(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAuthor() {
        return super.getAuthor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getExId() {
        return super.getExId(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public List<String> getQuestionsList() {
        return super.getQuestionsList(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getDate() {
        return super.getDate(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public WeeklyExam( String exId, String title, String Date,String subject ,String author) {
        super(exId, title, Date,subject,author);
        this.setExamMark(5);
        this.setDurationInMinutes(15);
        this.addQuestions();
    }

    public void addQuestions() {
        super.addQuestion("q1");
        super.addQuestion("q2");
        super.addAnswer("a1");
        super.addAnswer("a2");
    }
    
    

}