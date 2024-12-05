package exammanagementsystem;
import java.util.List;


public class FinalExam extends Exam{


    public FinalExam( String exId, String title, String Date,String subject ,String author) {
        super(exId, title, Date,subject,author);
        this.setExamMark(50);
        this.setDurationInMinutes(60);
        this.addQuestions();
    }

    @Override
    public int getExamMark() {
        return super.getExamMark();
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


    public void addQuestions() {
        super.addQuestion("q1");
        super.addQuestion("q2");
        super.addQuestion("q3");
        super.addQuestion("q4");
        super.addQuestion("q5");
        super.addQuestion("q6");
        super.addQuestion("q7");
        super.addQuestion("q8"); 
        super.addAnswer("a1");
        super.addAnswer("a2");
        super.addAnswer("a3");
        super.addAnswer("a4");
        super.addAnswer("a5");
        super.addAnswer("a6");
        super.addAnswer("a7");
        super.addAnswer("a8");
    }

}
