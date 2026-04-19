import java.time.LocalDate;

public class Enrolment {
    private Student student;
    private Course course;
    private LocalDate date;

    public Enrolment(Student student, Course course, LocalDate date) {
        this.student = student;
        this.course = course;
        this.date = date;
    }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }

    public void displayDetails() {
        System.out.println(student.getName() + " enrolled in " + course.getCode() + " on " + date);
    }
}