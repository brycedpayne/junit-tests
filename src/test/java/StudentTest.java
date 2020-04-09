import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student newStudent;

    @Before
    public void createStudent() {
        newStudent = new Student();
        newStudent.setName("Bryce");
    }

    @Test
    public void testIfPropertiesExists() {
        assertNotNull(newStudent.name);
        assertNotNull(newStudent.id);
        assertNotNull(newStudent.grades);
    }
}
