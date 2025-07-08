import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // print stars and space between
        // for (int j = 1; j <= (2 * i - 1); j++) {
        // if (j == 1 || j == (2 * i - 1)) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // // for (int i = n - 1; i >= 1; i--) {
        // // for (int j = 1; j <= n - i; j++) {
        // // System.out.print(" ");
        // // }
        // // // print stars and space between
        // // for (int j = 1; j <= (2 * i - 1); j++) {
        // // if (j == 1 || j == (2 * i - 1)) {
        // // System.out.print("*");
        // // } else {
        // // System.out.print(" ");
        // // }
        // // }
        // // System.out.println();
        // // }
        // }
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows = 5;
        // for (int i = 1; i <= rows; i++) {
        // for (int j = i; j <= rows; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}