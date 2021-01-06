package LAB3;

import java.util.Scanner;

public class assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 3) {
            System.out.print("Username : ");
            String usr = sc.nextLine();

            System.out.print("Password : ");
            String pwd = sc.nextLine();
            if (usr.equals("admin") && pwd.equals("saiyai"))
            {
                System.out.println("Welcome to MT Website.");
                break;
            }

            else{
                System.out.println("username or password not correct.");
                count++;
            }
            if (count == 3) {
                System.out.println("You account has been locked.Please, contect admin.");
            }

        }//while
    }//main
}//class
