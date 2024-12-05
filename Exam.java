package exammanagementsystem;
import java.util.ArrayList;
import java.util.List;

public abstract class Exam {
    
    private String subjectName;
    private int examMark;
    private String exId;
    private String author;
    private List<String> questionsList = new ArrayList<>();
    private List<String> answerList = new ArrayList<>();
    private int durationInMinutes;
    private String title;
    private String Date;

    public Exam( String exId, String title, String Date ,String subject ,String author) {
        this.exId = exId;
        this.title = title;
        this.Date = Date;
        this.author=author;
        this.subjectName=subject;
    }

    public void setQuestionsList(List<String> questionsList) {
        this.questionsList = questionsList;
    }

    public List<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }

    


    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void addAnswer(String answer) {
        this.answerList.add(answer);
    }

    public void addQuestion(String question) {
        this.questionsList.add(question);
    }
        
    public List<String> getQuestionsList() {
        return questionsList;
    }
    
        
    
    public String getExId() {
        return exId;
    }

    public void setExId(String exId) {
        this.exId = exId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getExamMark() {
        return examMark;
    }

    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }
}
