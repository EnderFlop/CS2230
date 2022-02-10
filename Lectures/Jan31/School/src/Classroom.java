public class Classroom {

    public final int roomNumber;
    public final int gradeLevel;
    private Teacher teacher;
    private Student[] students;
    private int numStudents;

    public Classroom(int room, int grade) {
        roomNumber = room;
        gradeLevel = grade;
        students = new Student[30];
        numStudents = 0;
    }

    public void assignTeacher(Teacher t) {
        teacher = t;
    }

    public void assignStudent(Student s) {
        if (numStudents == students.length) {
            System.out.println(this + " is full");
            return;
        }
        if (s.gradeLevel() != gradeLevel) {
            System.out.println("Cannot enroll " + s + " in " + this);
            return;
        }

        students[numStudents] = s;
        numStudents += 1;
    }

    public void graduate() {
        for (int i=0; i<numStudents; i++) {
            students[i].enroll(gradeLevel + 1);
        }
    }

    public String toString() {
        return "Classroom " + roomNumber + " grade:" + gradeLevel;
    }

    public String roster() {
        StringBuilder s = new StringBuilder();
        for (int i=0; i<numStudents; i++) {
            s.append(students[i].toString());
            s.append("\n"); // newline
        }
        return s.toString();
    }

}
