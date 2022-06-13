package Model;

public abstract class People {
    private String name;
    private String familyname;
    private int age;
    private String gender;
    Address address;

    public People(String name, String familyname, int age, String gender, Address address) {
        this.name = name;
        this.familyname = familyname;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getClass() + ": " + this.name + " " + this.familyname + ", " + this.age + " years, " + this.gender + ";"
                + "\t" + this.address.toString();
    }
}
