package LAB5;

import java.util.Scanner;

public class ex_array2D {

    public static void main(String[] args) {
        int num[][] = new  int[2][3];

        //input data to array2D
        num = inputData(num);
        //display data in array2D
        displayArray(num);


    }

    private static void displayArray(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");

            }
            System.out.println();
        }
    }

    private static int[][] inputData(int[][] num) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {//row
            for (int j = 0; j < num[i].length; j++) {//column
                System.out.println("Enter integer: ");
                num[i][j] = sc.nextInt();
            }

        }
        return num;
    }
}
