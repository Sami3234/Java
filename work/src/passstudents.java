import java.util.Scanner;

public class passstudents {
    public static void main(String[] args) {
        int[] marks = new int[10];
        int n = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter the students marks" + n);
            marks[i] = sc.nextInt();
            n = n + 1;
        }
        System.out.println("enter the total marks");
        int total_marks = sc.nextInt();
        int half_marks = total_marks / 2;
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > half_marks) {
                count = count + 1;
            }
        }
        System.out.println("the total passed students" + count);

    }
}
