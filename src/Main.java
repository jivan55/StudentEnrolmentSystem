// Student Enrolment System
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // create 2 students
        Student s1 = new Student("S2400369", "Jeevan", "Jeevan@gmail.com");
        Student s2 = new Student("S2400370", "Diwas", "Diwas@gmail.com");

        Course c1 = new Course("ITS101", "Programming", 2);
        Course c2 = new Course("ITS201", "Data Structures", 2);
        c2.addPrerequisite("ITS101");


        System.out.println(" ==>STUDENTS <==");
        s1.displayInfo();
        s2.displayInfo();

        System.out.println("\n ==> COURSES <== ");
        c1.displayDetails();
        c2.displayDetails();

        ArrayList<Enrolment> enrolments = new ArrayList<>();
        ArrayList<String> completedCourses;

        System.out.println("\n==>ENROLMENT<==");
        LocalDate today = LocalDate.now();

        enrolments.add(new Enrolment(s1, c1, today));
        enrolments.add(new Enrolment(s1, c2, today));
        System.out.println("Jeevan enrolled in ITS101 and ITS201");

        completedCourses = new ArrayList<>();
        for (Enrolment e : enrolments) {
            if (e.getStudent().getName().equals("Diwas")) {
                completedCourses.add(e.getCourse().getCode());
            }
        }

        // prerequisite checking (even student id)
        if (!completedCourses.contains("ITS101")) {
            System.out.println("Diwas cannot enrol in ITS201 - missing ITS101 prerequisite");
        } else {
            enrolments.add(new Enrolment(s2, c2, today));
            System.out.println("Diwas enrolled in ITS201");
        }
        // enrolling diwas
        enrolments.add(new Enrolment(s2, c1, today));
        System.out.println("Diwas enrolled in ITS101 and now can enrolled in another unit");

        enrolments.add(new Enrolment(s2, c2, today));
        System.out.println("Diwas enrolled in ITS201");

        //display all enrolments with dates
        System.out.println("\n ALL ENROLMENTS ");
        for (Enrolment e : enrolments) {
            e.displayDetails();
        }
    }
}