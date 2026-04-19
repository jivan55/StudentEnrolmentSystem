import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Jeevan", "Jeevan@gmail.com");
        Student s2 = new Student("S002", "Diwas", "Diwas@gmail.com");

        Course c1 = new Course("CS101", "Programming", 2);
        Course c2 = new Course("CS201", "Data Structures", 2);
        c2.addPrerequisite("CS101");


        System.out.println(" STUDENTS ");
        s1.displayInfo();
        s2.displayInfo();

        System.out.println("\n COURSES ");
        c1.displayDetails();
        c2.displayDetails();

        ArrayList<Enrolment> enrolments = new ArrayList<>();
        ArrayList<String> completedCourses;

        System.out.println("\n ENROLMENTS ");
        LocalDate today = LocalDate.now();

        enrolments.add(new Enrolment(s1, c1, today));
        enrolments.add(new Enrolment(s1, c2, today));
        System.out.println("Jeevan enrolled in CS101 and CS201");

        completedCourses = new ArrayList<>();
        for (Enrolment e : enrolments) {
            if (e.getStudent().getName().equals("Diwas")) {
                completedCourses.add(e.getCourse().getCode());
            }
        }

        if (!completedCourses.contains("CS101")) {
            System.out.println("Diwas cannot enrol in CS201 - missing CS101 prerequisite");
        } else {
            enrolments.add(new Enrolment(s2, c2, today));
            System.out.println("Diwas enrolled in CS201");
        }

        enrolments.add(new Enrolment(s2, c1, today));
        System.out.println("Diwas enrolled in CS101");

        enrolments.add(new Enrolment(s2, c2, today));
        System.out.println("Diwas enrolled in CS201 (now has prerequisite)");

        System.out.println("\n ALL ENROLMENTS ");
        for (Enrolment e : enrolments) {
            e.displayDetails();
        }
    }
}