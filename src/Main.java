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

        Teacher teacher1 = new Teacher("Petra", "Gutmann", 45, address1);
        Teacher teacher2 = new Teacher("Bennett", "Pearson", 45, address2);
        Student[] pullStudents1 = new Student[10];
        pullStudents1[0] = new Student("Kathlyn", "Alison", 19, address3);
        pullStudents1[1] = new Student("David", "Cobb", 20, address4);
        pullStudents1[2] = new Student("Thomas", "Willis", 22, address5);
        pullStudents1[3] = new Student("Arne", "Hintz II", 19, address6);
        pullStudents1[4] = new Student("Floyd", "Stanton", 20, address7);
        pullStudents1[5] = new Student("Rocky", "Lemke", 21, address8);
        pullStudents1[6] = new Student("Carmen", "Altenwerth IV", 18, address9);
        pullStudents1[7] = new Student("Annette", "Ryan", 19, address10);
        pullStudents1[8] = new Student("Lukas", "Bradtke", 20, address11);
        pullStudents1[9] = new Student("Chelsey", "Lowe", 21, address12);

        Group group1 = new Group("131B", 1 , pullStudents1, teacher1);
        //Group group2 = new Group("142A", 2, pullStudents2, teacher2);
        Student[] newPullStudents1 = group1.deleteStudent(pullStudents1, 2);
        for (int i =0; i < newPullStudents1.length; i++){
            System.out.println(newPullStudents1[i]);
        }
        //group1.deleteStudents(pullStudents1, Student("Carmen", "Altenwerth IV", 18, address9));
        //group1.setNumberOfStudents(3);
        //group2.setNumberOfStudents(6);

        System.out.println(group1);
        //System.out.println(group2);
        teacher1.setSalary(110); // установить количество часов, отработанных за месяц
        teacher2.setSalary(90);
        System.out.println("Sallary of teacher: " + teacher1.getName() + " "
                + teacher1.getFamilyname() + " - " + teacher1.getSalary() + " USD.");
        System.out.println("Sallary of teacher: " + teacher2.getName() + " "
                + teacher2.getFamilyname() + " - " + teacher2.getSalary() + " USD.");
    }
}
