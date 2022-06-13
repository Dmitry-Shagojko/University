package Model;

import Util.CheckAgeStudentUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student student;
    Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address("Minsk", "Sverlova", 23, 1);
        student = new Student("Jack", "Wilson", 20, "male", address);
    }
    @Test
    public void checkAge(){
        Assert.assertTrue(20 == student.getAge());
        student.setAge(-10);
        Assert.assertNotNull(CheckAgeStudentUtil.CheckAge(student));
        Assert.assertTrue(0 == CheckAgeStudentUtil.CheckAge(student).getAge());

    }
}