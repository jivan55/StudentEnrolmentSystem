// represent a student in the enrolment system
public class Student {
    // private attributes for encapsulation
    private String id;
    private String name;
    private String email;

    //constructor
    public Student(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //getter methods
    public String getName() { return name; }
    public String getId() { return id; }

    // display student information
    public void displayInfo() {
        System.out.println(id + " | " + name + " | " + email);
    }
}