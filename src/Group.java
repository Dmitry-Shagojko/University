import java.util.Arrays;

public class Group {
    private String nameGroup;
    private int course;
    private Student[] students;
    private Teacher teacher;

    public Group(String nameGroup, int course, Student[] students, Teacher teacher) {
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
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Student[] deleteStudent (int numberOfStudent){
        int i = 0;
        int j = 0;
        Student[] finalNewPullStudents1 = new Student[students.length - 1];
        for (i = 0; i < students.length; i++){
            if (i == numberOfStudent){
                students[i] = null;
            } else {
                students[i] = students[i];
            }
        } for (i = 0, j = 0; i < students.length; i++){
            if (students[i] != null){
                finalNewPullStudents1[j] = students[i];
                j++;
            }
        }
        return Arrays.copyOf(finalNewPullStudents1, finalNewPullStudents1.length);
    }
    public Student[] addStudent(Student student){
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
        return Arrays.copyOf(students, students.length);
    }

    @Override
    public String toString() {
        return "Group - " + this.nameGroup + ", " + "course - " + this.course + ":" + "\n" + students.toString();
    }
}
