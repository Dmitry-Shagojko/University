public class Student extends People{

    public Student(String name, String familyname, int age, Address address){
        super(name, familyname, age, address);
    }

    @Override
    public String toString() {
        return "Student: " + super.getName() + " " + this.getFamilyname() + ", " + this.getAge() + " years;" + "\t" +
                this.address.toString();
    }
}