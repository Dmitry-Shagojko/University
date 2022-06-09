package Model;

public class Student extends People implements Comparable<Student> {

    public Student(String name, String familyname, int age, String gender, Address address) {
        super(name, familyname, age, gender, address);
    }

    @Override
    public String toString() {
        return "Student: " + super.getName() + " " + super.getFamilyname() + ", " + super.getAge() + " years, " +
                super.getGender() + ";" + "\t" + "\t" + super.address.toString();
    }

    @Override
    public int compareTo(Student o) {
        if (this.getFamilyname().compareTo(o.getFamilyname()) == 0) {
            return this.getName().compareTo(o.getName());
        }
        return this.getFamilyname().compareTo(o.getFamilyname());
    }
}