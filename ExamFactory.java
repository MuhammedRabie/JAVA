package exammanagementsystem;

import java.util.List;

public class ExamFactory {
    public Exam getExam(String type, String exId,String title, String Date,String subject ,String author){
        if (type.equalsIgnoreCase("weekly")){
            return new WeeklyExam( exId, title, Date,subject,author);
        }
        
        else if (type.equalsIgnoreCase("monthly")){
            return new MonthlyExam (exId, title, Date,subject,author);
        }
        
         else if (type.equalsIgnoreCase("final")){
            return new FinalExam(exId, title, Date,subject,author);
        }
         else return null;
    }
    
}
