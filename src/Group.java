import java.util.ArrayList;
import java.util.Arrays;

public class Group {
    private String nameGroup;
    private int course;
    private ArrayList<Student> students;
    private Teacher teacher;

    public Group(String nameGroup, int course, ArrayList<Student> students, Teacher teacher) {
        this.nameGroup = nameGroup;
        this.course = course;
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
    public ArrayList<Student> deleteStudent (ArrayList<Student> students,int numberOfStudent){
        students.remove(numberOfStudent);
        return students;
    }
    public ArrayList<Student> addStudent(ArrayList<Student> students, Student student){
        students.add(student);
        return students;
    }

    @Override
    public String toString() {
        return "Group - " + this.nameGroup + ", " + "course - " + this.course + ":" + "\n" + students.toString();
    }
}
