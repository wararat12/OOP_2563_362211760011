package LAB4;
import java.util.Scanner;
public class ex_test_evennumber {
    public static void main(String[] args) {
        //user10
        Scanner scanner = new Scanner(System.in);
        int num, result;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer: ");
            num = scanner.nextInt();
            checkvalue(num);

        }

    }//main

    public  static  void checkvalue(int num){
        if (num%2==0)
        {
            System.out.println("Is even number");
        }else {
            System.out.println("Is odd number");
        }

    }//main
}//class
