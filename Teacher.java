package exammanagementsystem;
import java.util.*;

/**
 *
 * @author nour
 */

public class Teacher extends Account{
    
    private String name;
    private String subject;
    private String salary;
    List<Exam> exams = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Teacher(String name, String subject, String salary, String username, String password) {
        super(username, password);
        this.name = name;
        this.subject = subject;
        this.salary = salary;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    public void AddExam(String type, String exId, String title, String Date ) {
        
        ExamFactory Factory1=new ExamFactory();
        Exam Exam1=Factory1.getExam(type,exId,title,Date,this.subject,this.name);
        this.exams.add(Exam1);
    }
    
    public void EditExam(String name, List answerList,List questionsList) {
         for (int i = 0; i < this.exams.size(); i++) {
            if (exams.get(i).getTitle().equalsIgnoreCase(name)) {
                exams.get(i).setAnswerList(answerList);
                exams.get(i).setQuestionsList(questionsList);
            }
        }
       
    }
    
    public void DeleteExam(String name) {
        for (int i = 0; i < this.exams.size(); i++) {
            if (exams.get(i).getTitle().equalsIgnoreCase(name)) {
                exams.remove(i);
            }
        }        
    }
    
    public void CheckStudGrades() {
        
    }
    
    public void IssueReport() {
        
    }
    
    public void Assignment(String grade,String assignment) {
        for (int i = 0; i < School.students.size(); i++) {
            if (School.students.get(i).getGrade().equalsIgnoreCase(grade)) {
                 School.students.get(i).assignments.add(assignment);
            }
        }
    }
    
    public void NotifyStud() {
        
    }

    @Override
    public void login() {
        Teachers t = new Teachers();
            t.setVisible(true);
    }
}
