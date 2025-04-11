import java.util.Scanner;
    public class print_days_in_month_12{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Month Number (1-12): ");
        int Month=sc.nextInt();
        if (Month==1){
            System.out.println("In this month days :: 31");
        }
        else if (Month==2){
        System.out.println("Press for leap year = 1\n Press for not leap year = 2");
        int choose=sc.nextInt();
            if(choose==1){
            System.out.println("In this month days :: 28");
            }else if(choose==2){
            System.out.println("In this month days :: 29");
            }
        }
        else if(Month == 3){
            System.out.println("In this month days :: 31");
        }
        else if(Month == 4){
            System.out.println("In this month days :: 30");
        }
        else if(Month == 5){
            System.out.println("In this month days :: 31");
        }
        else if(Month == 6){
            System.out.println("In this month days :: 30");
        }
        else if(Month == 7){
            System.out.println("In this month days :: 31");
        }
        else if(Month == 8){
            System.err.println("In this month days :: 30");
        }
        else if(Month == 9){
            System.err.println("In this month days :: 31");
        }
        else if(Month == 10){
            System.err.println("In this month days :: 30");
        }
        else if(Month == 11){
            System.err.println("In this month days :: 31");
        }
        else if(Month == 12){
            System.err.println("In this month days :: 30");
        }
        else{
            System.err.println("invalid Number");
        }
    }
    }
   