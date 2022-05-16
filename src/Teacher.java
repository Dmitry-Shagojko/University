public class Teacher extends People{

    private int salary;

    public Teacher(String name, String familyname, int age, Address address){
        super(name, familyname, age,address);
    }
    public void setSalary(int salary) {
        if (salary >0 && salary<= 50) {
            this.salary = salary * 20;
        } else if (salary > 50 && salary <=100) {
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
        return null;
//                "Teacher:" + " " + this.name + " " + this.familyname + ", " + this.age + " years;"+ "\t" +
//                this.address.toString();
    }
}