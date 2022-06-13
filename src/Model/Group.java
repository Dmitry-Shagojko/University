package Model;

import java.util.ArrayList;

public class Group {
    private String nameGroup;
    private int course;
    private int yearOfEntry;
    private int yearOfGraduation;
    private ArrayList<Student> students;
    private Teacher teacher;

    public Group(String nameGroup, int course, int yearOfEntry, int yearOfGraduation,
                 ArrayList<Student> students, Teacher teacher) {
        this.nameGroup = nameGroup;
        this.course = course;
        this.yearOfEntry = yearOfEntry;
        this.yearOfGraduation = yearOfGraduation;
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

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
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

    public void deleteStudentGroup1(ArrayList<Student> studentsGroup1, int numberOfStudent) {
        studentsGroup1.remove(numberOfStudent);
    }
    public void deleteStudentGroup2(ArrayList<Student> studentsGroup2, int numberOfStudent) {
        studentsGroup2.remove(numberOfStudent);
    }
    public void deleteStudentGroup3(ArrayList<Student> studentsGroup3, int numberOfStudent) {
        studentsGroup3.remove(numberOfStudent);
    }
    public void deleteStudentGroup4(ArrayList<Student> studentsGroup4, int numberOfStudent) {
        studentsGroup4.remove(numberOfStudent);
    }
    public void addStudentsGroup1(ArrayList<Student> studentsGroup1, Student student) {
        studentsGroup1.add(student);
    }
    public void addStudentsGroup2(ArrayList<Student> studentsGroup2, Student student) {
        studentsGroup2.add(student);
    }
    public void addStudentsGroup3(ArrayList<Student> studentsGroup3, Student student) {
        studentsGroup3.add(student);
    }
    public void addStudentsGroup4(ArrayList<Student> studentsGroup4, Student student) {
        studentsGroup4.add(student);
    }

    @Override
    public String toString() {
        return "Group - " + this.nameGroup + ", " + "course - " + this.course + ":" + "\n" + this.teacher +
                this.students.toString();
    }
}
