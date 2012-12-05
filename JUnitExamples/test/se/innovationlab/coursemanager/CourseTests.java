package se.innovationlab.coursemanager;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erikskoglund
 */
public class CourseTests {

    Course course;
    Student student;
    
    @Before
    public void setUp(){
        course = new Course();
        course.setGrade("15 hp");
        course.setName("OOAD");
        course.setRequirement("Visual C# or equivalent");
        course.setSubject("Programming");
        
        student = new Student("Pelle");
    }
    
    @Test
    public void testCourseShouldHaveUsers(){
        assertTrue("Course should have a list of users", course.getStudents() != null);
    }
    
    @Test
    public void testCourseShouldHaveASubject(){ 
        assertTrue("Course should have a subject", course.getSubject() != null);
    }
    
    @Test
    public void testCourseShouldHaveAName(){
        assertTrue("Course should have a name", course.getName() != null);
    }
    
    @Test
    public void testCourseShouldHaveAGrade(){
        assertTrue("Course should have a grade", course.getGrade() != null);
    }
    
    @Test
    public void testCourseShouldHaveARequirement(){
        assertTrue("Course should have a requirement", course.getRequirement() != null);
    }
    
    @Test
    public void testAddStudentToCourse() throws Exception{   
        course.setRequirement("");
        course.addStudent(student);
        assertTrue("Student should be added to course", course.getStudents().size() == 1);
    }
    
    @Test(expected= Exception.class)
    public void testAddStudentToCourseWithoutCorrectRequirements() throws Exception{
        course.addStudent(student);
    }
    
    @Test
    public void testAddStudentToCourseWithCorrectRequirements() throws Exception{
        student.getCourseRequirements().add("Visual C# or equivalent");
        course.addStudent(student);
        assertTrue("Course should have one applied student", course.getStudents().size() == 1);
    }
    
    @Test
    public void testRemoveStudentFromCourse(){
        
    }
}