public class GradeBook {
    private String courseName;
    private Student[] students;

    public GradeBook() {
    }

    public GradeBook(String courseName, Student[] students) {
        this.setCourseName(courseName);
        this.setStudents(students);
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
