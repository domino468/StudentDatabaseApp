import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String  studentID;
    private String courses;
    private String tuitionBalance;
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
    private void setStudentId(){
        id++;
        this.studentID =  gradeYear + " " + id;

    }
}
