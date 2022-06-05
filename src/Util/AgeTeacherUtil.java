package Util;

import Exception.YoungTeacherException;
import Exception.OldTeacherException;
import Model.Address;
import Model.Teacher;

public class AgeTeacherUtil {

    public static Teacher checkAge(Teacher teacher) {
        try {
            checkYongTeacherAge(teacher.getAge());
            checkOldTeacherAge(teacher.getAge());
            System.out.println("New teacher " + teacher.getName()
                    + " " + teacher.getFamilyname() + " added at university!");
            return teacher;
        } catch (YoungTeacherException | OldTeacherException e) {
            e.printStackTrace();
            System.out.println("New teacher " + teacher.getName()
                    + " " + teacher.getFamilyname() + " is not added at university!");
            return null;
        }
    }

    public static void checkYongTeacherAge(int age) throws YoungTeacherException {
        if (age < 25) {
            throw new YoungTeacherException("New teacher is young.");
        }
    }

    public static void checkOldTeacherAge(int age) throws OldTeacherException {
        if (age > 65) {
            throw new OldTeacherException("New teacher is old.");
        }
    }
}
