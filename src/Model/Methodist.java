package Model;

public class Methodist extends People{

    public Methodist(String name, String familyname, int age, Address address) {
        super(name, familyname, age, address);
    }
    @Override
    public String toString() {
        return "Methodist:" + " " + super.getName() + " " + super.getFamilyname() + ", " +
                super.getAge() + " years;"+ "\t" + "\t" + super.address.toString();
    }
}
