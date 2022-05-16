import java.util.Arrays;

public class Group {
    private String nameGroup;
    private int course;
    private Student[] student;
    private Teacher teacher;
    private int numberOfStudents;

    public Group(String nameGroup, int course, Student[] student, Teacher teacher, int numberOfStudents) {
        this.nameGroup = nameGroup;
        this.course = course;
        this.student = student;
        this.teacher = teacher;
        this.numberOfStudents = numberOfStudents;
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
    public Student[] getStudent() {
        return student;
    }
    public void setStudent(Student[] student) {
        this.student = student;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
//    public Student[] changeNumberOfStudents(Student[] studentsA){
//        String[] array = new String[getNumberOfStudents()];
//        if (array.length-1 > studentsA.length - 1){
//            int k = array.length -1 - studentsA.length -1;
//        } String[] newArray = Arrays.copyOf(array)

//        }

    @Override
    public String toString() {
        return "Group - " + this.nameGroup + ", " + "course - " + this.course + ":" + "\n" +
                this.student.toString() + "\n" +
                this.teacher.toString() + "\n";
    }
}
