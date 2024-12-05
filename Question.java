package exammanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class Question {
    private String id;
    private String questionContent;
    private int correctAnswer;    
    private List<String> answersArray = new ArrayList<>();
    private List<Exam> containedInExams = new ArrayList<>();
    private Teacher author;

    public Question(String id, String questionContent, int correctAnswer, Teacher author) {
        this.id = id;
        this.questionContent = questionContent;
        this.correctAnswer = correctAnswer;
        this.author = author;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswersArray() {
        return answersArray;
    }

    public void setAnswersArray(List<String> answersArray) {
        this.answersArray = answersArray;
    }

    public List<Exam> getContainedInExams() {
        return containedInExams;
    }

    public void setContainedInExams(List<Exam> containedInExams) {
        this.containedInExams = containedInExams;
    }

    public Teacher getAuthor() {
        return author;
    }

    public void setAuthor(Teacher author) {
        this.author = author;
    }
}
