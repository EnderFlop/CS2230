public class School {

    private final Teacher[] teachers;
    private int numTeachers;
    private final Student[] students;
    private int numStudents;
    public final String name;
    public final String mascot;

    public School(String n, String m) {
        name = n;
        mascot = m;
        teachers = new Teacher[40];
        students = new Student[1000];
        numStudents = 0;
        numTeachers = 0;
    }

    public void hireTeacher(Teacher t) {
        if (numTeachers == teachers.length) {
            System.out.println("No more budget for new teachers");
            return;
        }
        teachers[numTeachers] = t;
        numTeachers += 1;
    }

    public void enrollStudent(String first, String last, int grade) {
        if (numStudents == students.length) {
            System.out.println("No more room for new students");
            return;
        }
        Student s = new Student(first, last);
        s.enroll(grade);
        students[numStudents] = s;
        numStudents += 1;
    }

    public void assignStudents(Classroom c, int start, int end) {
        for (int i=start; i<end; i++) {
            c.assignStudent(students[i]);
        }
    }

    public static void main(String[] args) {
        School iowaElem = new School("Iowa Elementary", "Little Hawks");
        Teacher a = new Teacher("Alligator");
        Teacher b = new Teacher("Baboon");
        Teacher c = new Teacher("Crow");

        for (int i=0; i<100; i++) {
            iowaElem.enrollStudent("TestFirst"+i, "TestLast"+i, 2);
        }
        for (int i=100; i<200; i++) {
            iowaElem.enrollStudent("TestFirst"+i, "TestLast"+i, 4);
        }
        for (int i=200; i<300; i++) {
            iowaElem.enrollStudent("TestFirst"+i, "TestLast"+i, 6);
        }

        Classroom secondGrade = new Classroom(102, 2);
        secondGrade.assignTeacher(a);
        iowaElem.assignStudents(secondGrade, 0, 10);


        Classroom fourthGrade = new Classroom(104, 4);
        fourthGrade.assignTeacher(b);
        iowaElem.assignStudents(fourthGrade, 100, 113);

        Classroom sixthGrade = new Classroom(106, 6);
        sixthGrade.assignTeacher(c);
        iowaElem.assignStudents(sixthGrade, 200, 207);

        System.out.println(secondGrade);
        System.out.println(secondGrade.roster());

        secondGrade.graduate();

        System.out.println(secondGrade);
        System.out.println(secondGrade.roster());
    }
}
