class Student {
        String name;
        int rollNo;
        double gpa;
    }
public class arrayofobj {
    

    public static void main(String[] args) {
        Student[] students = new Student[3];
        
        students[0] = new Student();
        students[0].name = "Alice";
        students[0].rollNo = 101;
        students[0].gpa = 3.8;
        
        students[1] = new Student();
        students[1].name = "Bob";
        students[1].rollNo = 102;
        students[1].gpa = 3.5;
        
        students[2] = new Student();
        students[2].name = "Charlie";
        students[2].rollNo = 103;
        students[2].gpa = 3.9;
        
        for(Student s : students) {
            System.out.println("Name: " + s.name + ", Roll: " + s.rollNo + ", GPA: " + s.gpa);
        }
    }
}
