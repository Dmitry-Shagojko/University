public class Student extends People{

    public Student(String name, String familyname, int age, Address address){
        super(name, familyname, age, address);
    }

    @Override
    public String toString() {
        return "Student: " + super.getName() + " " + super.getFamilyname() + ", " + super.getAge() + " years;" + "\t"
                + "\t" + super.address.toString();
    }
}