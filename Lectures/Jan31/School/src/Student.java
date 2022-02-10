public class Student {
    private String firstName;
    private String lastName;
    private int grade;

    public Student(String first, String last) {
        firstName = first;
        lastName = last;
        grade = -1;
    }

    public String fullName() {
        return lastName + ", " + firstName;
    }

    public void enroll(int gradeLevel) {
        grade = gradeLevel;
    }

    public int gradeLevel() {
        return grade;
    }

    public String toString() {
        return "Student " + fullName() + " in grade " + grade;
    }
}
