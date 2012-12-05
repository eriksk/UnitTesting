package se.innovationlab.coursemanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erikskoglund
 */
public class Course {
    
    private List<Student> students;
    private String name, grade, requirement, subject;

    public Course() {
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student student) throws Exception{
        if(requirement.equals("") || student.hasCompleted(requirement)){
            students.add(student);
        }else{
            throw new Exception("Student needs to complete " + requirement + " before applying to this course.");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getRequirement() {
        return requirement;
    }

    public String getSubject() {
        return subject;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
