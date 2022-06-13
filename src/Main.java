import Model.*;
import Util.AgeTeacherUtil;
import Util.CheckAgeStudentUtil;
import Util.Converter;
import Util.MaxSalaryComparator;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
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
        Address address21 = new Address("Connellymouth", "Schinner Avenue", 32, 7);
        Address address22 = new Address("South Akeemtown", "Soledad Curve", 82, 6);
        Address address23 = new Address("South Karolina", "Soledad Avenue", 12, 3);

        Teacher teacher1 = new Teacher("Petra", "Gutmann", 45, "Female", address1);
        Teacher teacher2 = AgeTeacherUtil.checkAge(new Teacher("Bennett", "Pearson", 65, "Male", address2));
        Teacher teacher3 = AgeTeacherUtil.checkAge(new Teacher("Sheila", "Herzog", 28, "Female", address14));
        Teacher teacher4 = new Teacher("Reilly", "Altenwerth", 29, "Male", address15);
        Teacher teacher5 = new Teacher("Julien", "Kassulke", 34, "Male", address16);
        Teacher teacher6 = new Teacher("Cordia", "Quitzon", 58, "Female", address17);
        Teacher teacher7 = new Teacher("Newell", "Kunde", 66, "Male", address18);
        Teacher teacher8 = new Teacher("Gwendolyn", "Zemlak Jr.", 33, "Male", address19);
        Teacher teacher9 = new Teacher("Holly", "McDermott", 59, "Female", address20);

        Student students1 = CheckAgeStudentUtil.CheckAge(new Student("Kathlyn", "Alison", 19, "Female", address3));
        Student students2 = new Student("David", "Cobb", 20, "Male", address4);
        Student students3 = new Student("Thomas", "Willis", 22, "Male", address5);
        Student students4 = new Student("Arne", "Hintz II", 19, "Male", address6);
        Student students5 = new Student("Floyd", "Stanton", 20, "Male", address7);
        Student students6 = new Student("Rocky", "Lemke", 21, "Male", address8);
        Student students7 = new Student("Carmen", "Altenwerth IV", 18, "Female", address9);
        Student students8 = new Student("Annette", "Ryan", 19, "Female", address10);
        Student students9 = new Student("Lukas", "Bradtke", 20, "Female", address11);
        Student students10 = new Student("Chelsey", "Lowe", 21, "Female", address12);
        Student students11 = new Student("Harrison", "Hagenes", 20, "Male", address21);
        Student students12 = new Student("Hugh", "Swaniawski", 19, "Male", address22);
        ArrayList<Student> students = new ArrayList<Student>() {{
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
            add(students11);
            add(students12);
        }};

        teacher1.setSalary(110); // установить количество часов, отработанных за месяц
        teacher2.setSalary(50);
        teacher3.setSalary(100);
        teacher4.setSalary(130);
        teacher5.setSalary(30);
        teacher6.setSalary(150);
        teacher7.setSalary(70);
        teacher8.setSalary(85);
        teacher9.setSalary(74);

        Converter<Methodist, Teacher> converter = teacher -> new Methodist(teacher.getName(), teacher.getFamilyname(),
                teacher.getAge(), teacher.getGender(), teacher.getAddress());
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

        teachers.stream().forEach(System.out::println);         //отображение всех учителей

        System.out.println('\n' + "List of retired teachers: ");
        teachers.stream()                                       //вывод учителей на пенсии
                .filter(t -> (t.getGender().equals("Female") && t.getAge() > 54) ||
                        (t.getGender().equals("Male") && t.getAge() > 60))
                .forEach(t -> System.out.println(t));

        System.out.println('\n' + "List of teachers by salary level:");
        teachers.stream()                                       //вывод учителей, при условии, что ЗП > 2000 USD
                .filter(t -> (t.getSalary() > 2_000))
                .forEach(t -> System.out.println(t.getName() + " " + t.getFamilyname() + ", " + ": salary - " +
                        t.getSalary() + " USD;"));


        ArrayList<Student> studentsGroup1 = new ArrayList<>();
        ArrayList<Student> studentsGroup2 = new ArrayList<>();
        ArrayList<Student> studentsGroup3 = new ArrayList<>();
        ArrayList<Student> studentsGroup4 = new ArrayList<>();

        Group group1 = new Group("131B", 1, 2021, 2025, studentsGroup1, teacher1);
        Group group2 = new Group("120A", 2, 2020, 2024, studentsGroup2, teacher2);
        Group group3 = new Group("151F", 1, 2021, 2025, studentsGroup3, teacher3);
        Group group4 = new Group("110C", 2, 2020, 2024, studentsGroup4, teacher4);

        group1.addStudentsGroup1(studentsGroup1, students1);
        group1.addStudentsGroup1(studentsGroup1, students2);
        group1.addStudentsGroup1(studentsGroup1, students3);
        group1.addStudentsGroup1(studentsGroup1, new Student("Joy", "Lobe", 20, "Male", address23));
        group1.deleteStudentGroup1(studentsGroup1, 2);

        group2.addStudentsGroup2(studentsGroup2, students4);
        group2.addStudentsGroup2(studentsGroup2, students5);
        group2.addStudentsGroup2(studentsGroup2, students6);

        group3.addStudentsGroup3(studentsGroup3, students7);
        group3.addStudentsGroup3(studentsGroup3, students8);
        group3.addStudentsGroup3(studentsGroup3, students9);

        group4.addStudentsGroup4(studentsGroup4, students10);
        group4.addStudentsGroup4(studentsGroup4, students11);
        group4.addStudentsGroup4(studentsGroup4, students12);

        ArrayList<Group> listGroup = new ArrayList<>();
        Consumer<Group> addGroup = listGroup::add;
        addGroup.accept(group1);
        addGroup.accept(group2);
        addGroup.accept(group3);
        addGroup.accept(group4);

        System.out.println('\n' + "List of groups whose issue year is 2023 - 2024: ");
        listGroup.stream()                                      //ввывод списка групп, выпуск которых 2023 - 2024 года
                .filter(g -> g.getYearOfGraduation() >= 2023 && g.getYearOfGraduation() <= 2024)
                .forEach(g -> System.out.println("Group - " + g.getNameGroup() +
                        ". Year of issue - " + g.getYearOfGraduation()));

        System.out.println('\n' + "List of teachers in alphabetical order:"); //вывод списка учителей в алфавитном порядке
        ArrayList<String> sortedListTeacher = (ArrayList<String>) teachers.stream()
                .map(t -> t.getFamilyname().concat(" ").concat(t.getName()))
                .sorted()
                .collect(Collectors.toList());
        sortedListTeacher.forEach(System.out::println);

        //сортировка Comparable <Student>_по фамилии
        System.out.println('\n' + "Sorted by Comparable:");
        students.stream()
                .sorted()
                .forEach(t -> System.out.println(t.getFamilyname().concat(" ").concat(t.getName()).concat(", ")
                        .concat(String.valueOf(t.getAge())).concat(" years")));

        //сортировка Comparator <Teacher)_по ЗП
        System.out.println('\n' + "Sorted by Comparator:");
        MaxSalaryComparator maxSalaryComparator = new MaxSalaryComparator();
        teachers.stream()
                .sorted(maxSalaryComparator)
                .forEach(t -> System.out.println(t.getFamilyname().concat(" ").concat(t.getName()).concat(" ")
                        .concat(" ---> ").concat(String.valueOf(t.getSalary())).concat(" USD")));
    }
}
