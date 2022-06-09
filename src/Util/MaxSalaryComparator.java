package Util;

import Model.Teacher;

import java.util.Comparator;

public class MaxSalaryComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o2.getSalary() - o1.getSalary() == 0) {
            return o1.getFamilyname().compareTo(o2.getFamilyname());
        }
        return o2.getSalary() - o1.getSalary();
    }
}
