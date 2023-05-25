import java.util.*;

class StudentMarksheet{
    // Member variables
    int roll;
    String name;
    int math;
    int phy;
    int comp;
    int total;
    double avg;
    String grade;

    // Member methods

    //default constructor
    public StudentMarksheet(){
        roll = 0;
        name = "";
        math = 0;
        phy = 0;
        comp = 0;
    }

    // Parameterised constructor
    public StudentMarksheet(int r, String n, int m, int p, int c){
        roll = r;
        name = n;
        math = m;
        phy = p;
        comp = c;
    }

    void setStudentDetails(){
        int roll;
        String name;
        int math;
        int phy;
        int comp;

        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Enter the Roll no: ");
        roll = sc.nextInt();

        System.out.println("");
        System.out.print("Enter the name: ");
        name = sc.nextLine();

        System.out.println("");
        System.out.print("Enter marks obtained in Maths: ");
        math = sc.nextInt();

        System.out.println("");
        System.out.print("Enter marks obtained in Physics: ");
        phy = sc.nextInt();

        System.out.println("");
        System.out.print("Enter marks obtained in Computer Science: ");
        comp = sc.nextInt();

        this.roll = roll;
        this.name = name;
        this.math = math;
        this.phy = phy;
        this.comp = comp;

        sc.close();
    }

    boolean isVAlid(){
        if(math > 100 && math < 0){
            return false;
        }
        else if(phy > 100 && phy < 0){
            return false;
        }
        else if(comp > 100 && comp < 0){
            return false;
        }
        else{
            return true;
        }
    }

    void generateMarksheet(){
        if(isVAlid()){
            total = math + phy + comp;
            avg = total/3;

            if(avg >= 90){
                grade = "O";
            }
            if(avg >= 80 && avg < 90){
                grade = "E";
            }
            if(avg >= 70 && avg < 80){
                grade = "VG";
            }
            if(avg >= 60 && avg < 70){
                grade = "G";
            }
            if(avg < 60){
                grade = "C";
            }
        }
    }

    void printMarksheet(){
        System.out.print("Student Roll: " + roll);
        System.out.print("          ");
        System.out.print("Student Name: " + name);

        System.out.println("");
        System.out.println("Maths: " + math);
        System.out.println("Physics: " + phy);
        System.out.println("Computer Science: " + comp);
        System.out.println("---------------------------");
        System.out.println("Total: " + total);
        System.out.println("Avg: " + avg);
        System.out.println("Grade: " + grade);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

}

public class Ques2 {
    public static void main(String args[]){
    
        StudentMarksheet student1 = new StudentMarksheet(1,"Sayan Dey", 77, 85, 60);
        student1.generateMarksheet();
        student1.printMarksheet();

        StudentMarksheet student2 = new StudentMarksheet();
        student2.setStudentDetails();
        student2.generateMarksheet();
        student2.printMarksheet();
    }
}
