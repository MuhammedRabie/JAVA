package exammanagementsystem;

import java.util.List;

public class MonthlyExam extends Exam {

    public MonthlyExam(String exId, String title, String Date,String subject ,String author) {
        super(exId, title, Date,subject,author);
        this.setExamMark(20);
        this.setDurationInMinutes(30);
        this.addQuestions();
    }

    public void addQuestions() {
        super.addQuestion("q1");
        super.addQuestion("q2");
        super.addQuestion("q3");
        super.addQuestion("q4");
        super.addAnswer("a1");
        super.addAnswer("a2");
        super.addAnswer("a3");
        super.addAnswer("a4");
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
    public int getExamMark() {
        return super.getExamMark(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDurationInMinutes() {
        return super.getDurationInMinutes(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String getAuthor() {
        return super.getAuthor(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
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

}