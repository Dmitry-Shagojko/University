package Model;

import java.util.Comparator;

public class Teacher extends People {

    private int salary;

    public Teacher(String name, String familyname, int age, String gender, Address address) {
        super(name, familyname, age, gender, address);
    }

    public void setSalary(int salary) {
        if (salary > 0 && salary <= 50) {
            this.salary = salary * 20;
        } else if (salary > 50 && salary <= 100) {
            this.salary = salary * 20 + 20;
        } else if (salary > 100) {
            this.salary = salary * 20 + 40;
        }
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher:" + " " + super.getName() + " " + super.getFamilyname() + ", " +
                super.getAge() + " years, " + super.getGender() + ";" + "\t";
//                "\t" + super.getAddress();
    }
}