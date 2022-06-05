import Model.*;
import Util.AgeTeacherUtil;
import Util.Converter;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Cruickshanktown", "Doris Camp", 2914, 13);
        Address address2 = new Address("East Margarett", "Sabina Ranch", 1, 521);
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
        Address address14 = new Address("Darrinton", "Granville Greens", 34, 52);
        Address address15 = new Address("Adolfoland", "Jammie Rapids", 48, 9);
        Address address16 = new Address("Emeliafurt", "Griffin Ways", 64, 24);
        Address address17 = new Address("Casperstad", "Kacie Mountains", 71, 9);
        Address address18 = new Address("West Adrienne", "Schaefer Junction", 1, 3);
        Address address19 = new Address("Olinshire", "Jett Brook", 35, 70);
        Address address20 = new Address("West Burley", "Barrows Flats", 30, 1);

        Teacher teacher1 = new Teacher("Petra", "Gutmann", 45, address1);
        Teacher teacher2 = AgeTeacherUtil.checkAge(new Teacher("Bennett", "Pearson", 35, address2));
        Teacher teacher3 = AgeTeacherUtil.checkAge(new Teacher("Sheila", "Herzog", 28, address14));
        Teacher teacher4 = new Teacher("Reilly", "Altenwerth", 29, address15);
        Teacher teacher5 = new Teacher("Julien", "Kassulke", 34, address16);
        Teacher teacher6 = new Teacher("Cordia", "Quitzon", 38, address17);
        Teacher teacher7 = new Teacher("Newell", "Kunde", 26, address18);
        Teacher teacher8 = new Teacher("Gwendolyn", "Zemlak Jr.", 33, address19);
        Teacher teacher9 = new Teacher("Holly", "McDermott", 39, address20);


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
        ArrayList<Student> students = new ArrayList<Student>(20) {{
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
        Group group1 = new Group("131B", 1, students, teacher1);
        students = group1.deleteStudent(students, 2);
        students = group1.addStudent(students, new Student("Toy", "Lowe", 19, address13));
        System.out.println(group1);
        students.forEach(i -> System.out.println(i));
        teacher1.setSalary(110); // установить количество часов, отработанных за месяц
        System.out.println("Sallary of teacher: " + teacher1.getName() + " "
                + teacher1.getFamilyname() + " - " + teacher1.getSalary() + " USD."
                + "\n" + teacher1.getAddress());

        Converter<Methodist, Teacher> converter = teacher -> new Methodist(teacher.getName(), teacher.getFamilyname(),
                teacher.getAge(), teacher.getAddress());
        Methodist methodist1 = converter.convert(teacher8);
        List<Teacher> teachers = new ArrayList<>();
        Consumer<Teacher> addListAllTeachers = teacher -> teachers.add(teacher);
        addListAllTeachers.accept(teacher1);
        addListAllTeachers.accept(teacher2);
        addListAllTeachers.accept(teacher3);
        addListAllTeachers.accept(teacher4);
        addListAllTeachers.accept(teacher5);
        addListAllTeachers.accept(teacher6);
        addListAllTeachers.accept(teacher7);
        addListAllTeachers.accept(teacher8);
        addListAllTeachers.accept(teacher9);    //создан общий список учителей

        List<Teacher> listTeachers = teachers.stream()
                .filter(s -> !(s.getName() == methodist1.getName() && s.getFamilyname() == methodist1.getFamilyname()
                        && s.getAge() == methodist1.getAge() && s.getAddress() == methodist1.getAddress()))
                .collect(Collectors.toList());
                                                //создан список учителей, относящийся к методисту (без методиста)
        System.out.println(methodist1);
        listTeachers.stream().forEach(System.out::println);
    }
}
