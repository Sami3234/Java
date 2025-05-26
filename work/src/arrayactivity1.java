import java.util.Scanner;

class arrayactivity1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][4];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter array elements of row #" + (i + 1));
            for (int j = 0; j < 4; j++)
                array[i][j] = input.nextInt();
        }
        System.out.println("The given 2D array is...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
        int sum;
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++)
                sum += array[i][j];
            System.out.println("Sum of row " + (i + 1) + "is" + sum);
        }

    }
}