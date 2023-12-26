package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating teachers
        Teacher teacher1 = new Teacher(1, "Mr. Smith", 50000);
        Teacher teacher2 = new Teacher(2, "Mrs. Johnson", 60000);
        Teacher teacher3 = new Teacher(3, "Ms. Williams", 55000);
        Teacher teacher4 = new Teacher(4, "Mr. Brown", 53000);
        Teacher teacher5 = new Teacher(5, "Mrs. Jones", 62000);

        // Creating students
        Student student1 = new Student(1, "John Doe", 10);
        Student student2 = new Student(2, "Jane Smith", 11);
        Student student3 = new Student(3, "Emily Johnson", 10);
        Student student4 = new Student(4, "Michael Brown", 12);
        Student student5 = new Student(5, "Sarah Davis", 11);

        // Adding teachers and students to lists
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        teacherList.add(teacher5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        // Creating the school
        School algomaUniversity = new School(teacherList, studentList);

        // Students paying fees
        student1.payFees(5000);
        student2.payFees(6000);
        student3.payFees(5500);
        student4.payFees(5300);
        student5.payFees(6200);

        // Teachers receiving salaries
        teacher1.reciveSalary(500);
        teacher2.reciveSalary(600);
        teacher3.reciveSalary(550);
        teacher4.reciveSalary(530);
        teacher5.reciveSalary(620);

        // Displaying the total money earned and spent
        System.out.println("Total Money Earned by Algoma University: $" + algomaUniversity.getTotalMoneyEarned());
        System.out.println("Total Money Spent by Algoma University: $" + algomaUniversity.getTotalMoneySpent());

        // Displaying details of teachers and students
        System.out.println("---- Teachers at Algoma University ----");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }

        System.out.println("---- Students at Algoma University ----");
        for (Student student : studentList) {
            System.out.println(student.getName() + ", Grade: " + student.getGrade() + ", Fees Paid: $" + student.getfeepaid());
        }
    }
}

