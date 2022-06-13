package Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GroupTest {
    ArrayList<Student> actualListStudent;
    ArrayList<Student> expectedListStudent;
    Group group1;
    Group group2;
    Address address1;
    Address address2;
    Address address3;
    Address address4;
    Teacher teacher1;
    Student student1;
    Student student2;
    Student student3;

    @Before
    public void setUp() throws Exception {
        actualListStudent = new ArrayList<>();
        expectedListStudent = new ArrayList<>();
        student1 = new Student("Kathlyn", "Alison", 19, "Female", address1);
        student2 = new Student("David", "Cobb", 20, "Male", address2);
        student3 = new Student("Thomas", "Willis", 22, "Male", address3);
        address1 = new Address("Cruickshanktown", "Doris Camp", 2914, 13);
        address2 = new Address("East Margarett", "Sabina Ranch", 1, 521);
        address3 = new Address("Marinaton", "Jovani Points Suite", 15, 101);
        address4 = new Address("Garrisonmouth", "Adrienne Parkways", 12, 22);
        teacher1 = new Teacher("Petra", "Gutmann", 45, "Female", address4);
        actualListStudent.add(student1);
        actualListStudent.add(student2);
        actualListStudent.add(student3);
        group1 = new Group("100", 2, 2020, 2024, actualListStudent, teacher1);
        group2 = new Group("100", 2, 2020, 2024, expectedListStudent, teacher1);

    }

    @Test
    public void addStudent() {

        group2.addStudentsGroup2(expectedListStudent, student1);
        group2.addStudentsGroup2(expectedListStudent, student2);
        group2.addStudentsGroup2(expectedListStudent, student3);

        Assert.assertNotNull(expectedListStudent);
        Assert.assertTrue(expectedListStudent.get(1).equals(actualListStudent.get(1)));
        Assert.assertEquals(3, expectedListStudent.size());
    }

    @Test
    public void deleteStudent() {

        ArrayList<Student> expectedListStudent = actualListStudent;
 
        actualListStudent.remove(student2);

        group2.deleteStudentGroup2(expectedListStudent, 1);
        Assert.assertEquals(expectedListStudent, actualListStudent);
        Assert.assertEquals(1, expectedListStudent.size());
    }
}