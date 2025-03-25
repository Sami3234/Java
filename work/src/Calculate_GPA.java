import java.util.Scanner;
    public class Calculate_GPA{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        double gpa = 0.0;
        if (marks >= 85){
            System.out.println("Your grade is A+");
            gpa = 3.67+(marks-85)*(3.67-4.00)/(85-100);
            System.out.println("Your GPA is : "+gpa);
        }
        else if (marks >= 80){
            System.out.println("Your grade is A-");
            gpa = 3.34+(marks-80)*(3.34-3.66)/(80-84);
            System.out.println("Your GPA is : "+gpa);
        }
        else if (marks >= 75){
            System.out.println("Your grade is B+");
            gpa = 3.01+(marks-75)*(3.01-3.33)/(75-79);
            System.out.println("Your GPA is : "+gpa);

        }
        else if (marks >= 71){
            System.out.println("Your grade is B");
            gpa = 2.67+(marks-71)*(2.67-3.00)/(71-74);
            System.out.println("Your GPA is : "+gpa);
        }
        else if (marks >= 68){
            System.out.println("Your grade is B-");
            gpa = 2.34+(marks-68)*(2.34-2.66)/(68-70);
            System.out.println("Your GPA is : "+gpa);
        }
        else if (marks >= 64){
            System.out.println("Your grade is C+");

            gpa = 2.01+(marks-64)*(2.01-2.33)/(64-67);
            System.out.println("Your GPA is : "+gpa);
        }
        else if (marks >= 61){
            System.out.println("Your grade is C");
            gpa = 1.67+(marks-61)*(1.67-2.00)/(61-63);
            System.out.println("Your GPA is : "+gpa);
        }
        else if (marks >= 58){
            System.out.println("Your grade is C-");
            gpa = 1.31+(marks-58)*(1.31-1.66)/(58-60);
            System.out.println("Your GPA is : "+gpa);
        }
        else if (marks >= 54){
            System.out.println("Your grade is D+");
            gpa = 1.01+(marks-54)*(1.01-1.30)/(54-57);
            System.out.println("Your GPA is : "+gpa);
        } 
        else if (marks >= 50){
            System.out.println("Your grade is D");
            gpa = 0.10+(marks-50)*(0.10-1.00)/(50-53);
            System.out.println("Your GPA is : "+gpa);
        }
        else {
            System.out.println("Your grade is F");
            System.out.println("Your GPA is : 0.00");

        }
        
        sc.close();
    }
}