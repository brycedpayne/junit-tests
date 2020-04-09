package tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student newStudent;

    @Before
    public void createStudent() {
        newStudent = new Student();
        newStudent.setName("Bryce");
        newStudent.addGrade(95);
        newStudent.addGrade(95);
        newStudent.addGrade(95);
        newStudent.addGrade(95);
        newStudent.addGrade(95);
    }

    @Test
    public void testIfPropertiesExists() {
        assertNotNull(newStudent.name);
        assertNotNull(newStudent.id);
        assertNotNull(newStudent.grades);
    }

    @Test
    public void testCountWorks() {
        assertEquals(1, newStudent.getId(), 0);
    }

    @Test
    public void testIfNameIsCorrect() {
        assertEquals("Tests name correctness","Bryce",newStudent.getName());
        newStudent.setName("Bryan");
        assertEquals("Tests name correctness","Bryan",newStudent.getName());
    }

    @Test
    public void testAddingAGrade() {
        assertEquals(95,newStudent.getGrade(0));
        newStudent.addGrade(97);
        assertEquals(97,newStudent.getGrade(newStudent.grades.size()-1),0);
    }

    @Test
    public void testGradeAverage() {
        assertEquals(newStudent.getGradeAverage(), 95, 0.0);
        assertNotEquals(newStudent.getGradeAverage(), 94, 0.9);
        assertNotEquals(newStudent.getGradeAverage(), 96, 0.9);
    }
}
