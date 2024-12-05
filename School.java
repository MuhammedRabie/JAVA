package exammanagementsystem;

import java.io.*;
import java.util.*;


/**
 *
 * @author nour
 */
public class School {
    public static Principle principle = Principle.getInstance();
    static List<Student> students = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();

    public School() throws IOException {
        principle.AddTeacher("a21","a21","ahmed", "sc21","3000");
        principle.AddTeacher("i22","i22","islam", "sc22","3000");
        principle.AddTeacher("m23","m23","mohamed", "sc23","3000");
        principle.CreateStudent("a322","a322", "ahmed","4th");
        principle.CreateStudent("m323","m323", "mohamed","5th");
        principle.CreateStudent("a300","a300", "ahmed","6th");
        teachers.get(0).AddExam("weekly", "Ex1", "Quiz 1", "14 March");
        teachers.get(1).AddExam("weekly", "Ex2", "Quiz 1", "15 March");
    }
}