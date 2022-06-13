package Model;

import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class TeacherTest {
    @Test
    public void setSalary() {
        Address address1 = new Address("Adolfoland", "Jammie Rapids", 48, 9);
        Address address2 = new Address("Emeliafurt", "Griffin Ways", 64, 24);
        Address address3 = new Address("Casperstad", "Kacie Mountains", 71, 9);

        Teacher teacher1 = new Teacher("Reilly", "Altenwerth", 29, "Male", address1);
        Teacher teacher2 = new Teacher("Julien", "Kassulke", 34, "Male", address2);
        Teacher teacher3 = new Teacher("Cordia", "Quitzon", 58, "Female", address3);
        teacher1.setSalary(100);
        teacher2.setSalary(50);
        teacher3.setSalary(0);
        Assert.assertEquals(2020, teacher1.getSalary());
        Assert.assertEquals(1000, teacher2.getSalary());
        Assert.assertEquals(0, teacher3.getSalary());
        Assert.assertTrue(teacher1.getSalary() != 100);
    }
}