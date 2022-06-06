package Model;

import java.util.ArrayList;

public class Group {
    private String nameGroup;
    private int course;
    private int yearOfAdmission;
    private int yearOfIssue;
    private ArrayList<Student> students;
    private Teacher teacher;

    public Group(String nameGroup, int course, int yearOfAdmission, int yearOfIssue,
                 ArrayList<Student> students, Teacher teacher) {
        this.nameGroup = nameGroup;
        this.course = course;
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfIssue = yearOfIssue;
        this.students = students;
        this.teacher = teacher;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> deleteStudent(ArrayList<Student> students, int numberOfStudent) {
        students.remove(numberOfStudent);
        return students;
    }

    public ArrayList<Student> addStudent(ArrayList<Student> students, Student student) {
        students.add(student);
        return students;
    }

    @Override
    public String toString() {
        return "Group - " + this.nameGroup + ", " + "course - " + this.course + ":" + "\n" + this.teacher + this.students.toString();
    }
}
