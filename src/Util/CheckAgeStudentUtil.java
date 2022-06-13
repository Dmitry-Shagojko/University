package Util;

import Model.Student;

public class CheckAgeStudentUtil {

    public static Student CheckAge(Student student){
        if (student.getAge() <= 0){
            System.out.println("Student's " +
                    String.join(" ", student.getName(), student.getFamilyname()) +
                    " age is negative or zero.");
            return new Student(student.getName(), student.getFamilyname(), 0, student.getGender(), student.getAddress());
        } else {
            return student;
        }
    }
}
