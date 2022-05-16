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

    @Override
    public String toString() {
        return "Group - " + this.nameGroup + ", " + "course - " + this.course + ":" + "\n" +
                this.student.toString() + "\n" +
                this.teacher.toString() + "\n";
    }
}
