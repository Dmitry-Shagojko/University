public abstract class People {
    private String name;
    private String familyname;
    private int age;
    Address address;

    public People(String name, String familyname, int age, Address address){
        this.name = name;
        this.familyname = familyname;
        this.age = age;
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
    public Address getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return getClass() + ": " + this.name + " " + this.familyname + ", " + this.age + " years;" + "\t" +
                this.address.toString();
    }
}
