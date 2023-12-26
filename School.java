package SchoolManagementSystem;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> Students;

    private static int  totalMoneyEarned;
    private  static int  totalMoneySpent;

    public School(List<Teacher> teachers,List<Student> students ) {
        this.teachers = teachers;
        this.Students = students;
        totalMoneyEarned  =0;
        totalMoneySpent =0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void UpdateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public  static void UpdateMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(Student student) {
        Students.add(student);
    }
}
