package SchoolManagementSystem;
// THIS Project to further develop my skills in java and apply oop conceot to this
//This class is to keep track of students fee, name, grade, id and e.t.c
public class Student {
     private int id;
     private String name;
     private int grade;
     private int feepaid;

     private int feeTotal;

    /**
     * fees for students  will be 30k
     *TO create a new student by intalizing
     * @param id id for student: unique
     * @param name name for student
     * @param grade grade for student
     */

     public Student(int id, String name, int grade){
         this.feepaid=0;
         this.feeTotal=30000;
         this.id = id;
         this.name = name;
         this.grade = grade;
     }

     //Not going  to alter the student name and id
    public void setGrade(int grade) {
         this.grade = grade;

    }
    public void payFees(int fees){
         feepaid+= fees;
         School.UpdateTotalMoneyEarned(feepaid);
    }

    public int getfeepaid() {
        return feepaid;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeeTotal() {
        return feeTotal;
    }

    public int getId() {
        return id;
    }


    public int getRemanningFees  () {
        return feeTotal-feepaid;
    }
    public  String toString() {
         return "Student name : "   + name + " total feepaid so far  : " + feepaid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
