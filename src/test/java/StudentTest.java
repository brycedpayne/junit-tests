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
    public void testGradeAverage() {
        assertEquals(newStudent.getGradeAverage(),95,0.0);
        assertNotEquals(newStudent.getGradeAverage(),94,0.9);
        assertNotEquals(newStudent.getGradeAverage(),96,0.9);
    }
}
