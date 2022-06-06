package Model;

public class Student extends People{

    public Student(String name, String familyname, int age, String gender, Address address){
        super(name, familyname, age, gender, address);
    }

    @Override
    public String toString() {
        return "Student: " + super.getName() + " " + super.getFamilyname() + ", " + super.getAge() + " years, " +
                super.getGender() + ";" + "\t" + "\t" + super.address.toString();
    }
}