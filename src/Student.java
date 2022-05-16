public class Student extends People{

    public Student(String name, String familyname, int age, Address address){
        super(name, familyname, age, address);
    }

    @Override
    public String toString() {
        return null;
//                "Student: " + this.name + " " + this.familyname + ", " + this.age + " years;" + "\t" +
//                this.address.toString();
    }
}