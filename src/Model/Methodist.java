package Model;

public class Methodist extends People {

    public Methodist(String name, String familyname, int age, String gender, Address address) {
        super(name, familyname, age, gender, address);
    }

    @Override
    public String toString() {
        return "Methodist:" + " " + super.getName() + " " + super.getFamilyname() + ", " +
                super.getAge() + " years, " + super.getGender() + ";" + "\t" + "\t" + super.address.toString();
    }
}
