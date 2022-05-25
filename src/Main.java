import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Cruickshanktown", "Doris Camp", 2914, 13);
        //Address address2 = new Address("East Margarett", "Sabina Ranch", 1, 521);
        Address address3 = new Address("Marinaton", "Jovani Points Suite", 15, 101);
        Address address4 = new Address("Garrisonmouth", "Adrienne Parkways", 12, 22);
        Address address5 = new Address("West Robyn", "Elissa Squares", 20, 42);
        Address address6 = new Address("East Elzahaven", "Friesen Burgs", 706, 866);
        Address address7 = new Address("Gonzalobury", "Gonzalobury", 988, 732);
        Address address8 = new Address("Port Emilview", "Nicolette Glens", 72, 973);
        Address address9 = new Address("South Alena", "Blair Loaf Suite", 315, 174);
        Address address10 = new Address("East Felicitatown", "Erica Creek Suite", 22, 51);
        Address address11 = new Address("Lake Gabriella", "Sophia Parks", 396, 1);
        Address address12 = new Address("East Augustinestad", "Manley Mountains", 13, 33);
        Address address13 = new Address("Port Maverickberg", "Tromp Route Suite", 72, 29);

        Teacher teacher1 = new Teacher("Petra", "Gutmann", 45, address1);
        //Teacher teacher2 = new Teacher("Bennett", "Pearson", 45, address2);
        Student students1 = new Student("Kathlyn", "Alison", 19, address3);
        Student students2 = new Student("David", "Cobb", 20, address4);
        Student students3 = new Student("Thomas", "Willis", 22, address5);
        Student students4 = new Student("Arne", "Hintz II", 19, address6);
        Student students5 = new Student("Floyd", "Stanton", 20, address7);
        Student students6 = new Student("Rocky", "Lemke", 21, address8);
        Student students7 = new Student("Carmen", "Altenwerth IV", 18, address9);
        Student students8 = new Student("Annette", "Ryan", 19, address10);
        Student students9 = new Student("Lukas", "Bradtke", 20, address11);
        Student students10 = new Student("Chelsey", "Lowe", 21, address12);
        ArrayList<Student> students = new ArrayList<Student>(20){{
            add(students1);
            add(students2);
            add(students3);
            add(students4);
            add(students5);
            add(students6);
            add(students7);
            add(students8);
            add(students9);
            add(students10);
        }};
        Group group1 = new Group("131B", 1 , students, teacher1);
        students = group1.deleteStudent(students, 2);
        students = group1.addStudent(students, new Student("Toy", "Lowe", 19, address13));
        students.forEach(i -> System.out.println(i));
        teacher1.setSalary(110); // установить количество часов, отработанных за месяц
        System.out.println("Sallary of teacher: " + teacher1.getName() + " "
                + teacher1.getFamilyname() + " - " + teacher1.getSalary() + " USD."
                + "\n" + teacher1.getAddress());
    }
}
