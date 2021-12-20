import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name:");

        this.firstName = in.nextLine();
        System.out.println("Enter student last name:");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - for Junior\n4 - for Senior\nEnter student class level:");
        this.gradeYear = in.nextInt();
        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);


    }

    private void setStudentId() {
        id++;
        this.studentID = gradeYear + " " + id;

    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                System.out.println("BREAK!");
                break;
            }
        } while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE:" + tuitionBalance);
    }
}
