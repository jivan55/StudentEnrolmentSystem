// represent a course with prerequisites
import java.util.ArrayList;

public class Course {
    private String code;
    private String name;
    private int maxCapacity;
    private ArrayList<String> prerequisites = new ArrayList<>();

    //constructor
    public Course(String code, String name, int maxCapacity) {
        this.code = code;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public String getCode() { return code; }
    public int getMaxCapacity() { return maxCapacity; }
    public ArrayList<String> getPrerequisites() { return prerequisites; }

    // add a prerequisites course
    public void addPrerequisite(String prereq) {
        prerequisites.add(prereq);
    }
    // display course details
    public void displayDetails() {
        System.out.println(code + " - " + name + " (Max: " + maxCapacity + ")");
        System.out.println("  Prerequisites: " + prerequisites);
    }
}