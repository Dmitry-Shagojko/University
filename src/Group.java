import java.util.Arrays;

public class Group {
    private String nameGroup;
    private int course;
    private Student[] student;
    private Teacher teacher;

    public Group(String nameGroup, int course, Student[] student, Teacher teacher) {
        this.nameGroup = nameGroup;
        this.course = course;
        this.student = student;
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
    public Student[] deleteStudent (Student [] pullStudents1, int numberOfStudent){
        //int newNumb = pullStudents1.length;
        int i = 0;
        int j = 0;
        Student[] newPullStudents1 = new Student[pullStudents1.length];
        Student[] finalNewPullStudents1 = new Student[pullStudents1.length - 1];
        for (i = 0; i < newPullStudents1.length; i++){
            if (i == numberOfStudent){
                newPullStudents1[i] = null;
            } else {
                newPullStudents1[i] = pullStudents1[i];
            }

        } for (i = 0, j = 0; i < pullStudents1.length; i++){
            if (newPullStudents1[i] != null){
                finalNewPullStudents1[j] = newPullStudents1[i];
                j++;
            }
        }

        return Arrays.copyOf(finalNewPullStudents1, finalNewPullStudents1.length);
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
