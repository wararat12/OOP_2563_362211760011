package LAB5;

import java.util.Scanner;

//เขียนโปรแกรมรับค่าข้อมูลจากผู้ใช้ 5 จำนวน
//ผลรวม ค่าเฉลี่ย ค่ามากสุด ค่าน้อยสุด
public class ex_array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //input data
        int num[] = new  int[5];

        num = inputData(num);
    // display
        displayArray(num);
        //totel value in array
        int total = totalValue(num);
    System.out.println("Total value in array : "+total);

    //average value in array == total/value_count
        System.out.println("Average value im array: "+(total/num.length));

    //find maximum value in array
    findMax(num);

    //find minimum value in array
        findMan(num);

    }

    private static void findMan(int[] num) {
        int min = num[0];
        for (int v:num) {
            if (min<v)
                min = v;
        }
        System.out.println("The minimum value: "+min);
    }

    private static void findMax(int[] num) {
        int max = num[0];
        for (int v:num) {
            if (max<v)
                max = v;
        }
        System.out.println("The maximum value: "+max);
    }

    private static int totalValue(int[] num) {
        int total = 0;
        for (int v:num) {
            total += v;
        }
        return total;
    }

    private static void displayArray(int[] num) {
        System.out.println("Data in array : ");
    }

    private  static  int[] inputData(int[] num){

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter integer: ");
            num[i] = sc.nextInt();
        }
        return  num;
    }

}
