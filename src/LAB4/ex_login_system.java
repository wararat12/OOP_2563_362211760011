package LAB4;
import java.util.Scanner;
public class ex_login_system {
    public static void main(String[] args) {
      //login 3
      Scanner sc = new Scanner(System.in);
      int count = 0 ;
      do {
          System.out.print("Enter user name: ");
          String u = sc.nextLine();
          System.out.print("Enter password: ");
          String p = sc.nextLine();

          boolean x = checkLogin(u, p);
          if (x){
              System.out.println("Welcome to RUTS SAIYAI.");
          }else {
              count++;
              System.out.println("Username or Password not corrected");
              if (count == 3){
                  System.out.println("Please, contect admin.");
              }
          }

      } while (count !=3 );


    }//main

    public  static  boolean checkLogin(String u,String p){

        String user = "admin";
        String password = "1234";

        if (u.equals(user) && password.equals(p)){
            return true;
        } else {
            return  false;
        }

    }
}//class
