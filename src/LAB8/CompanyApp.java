package LAB8;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employee do you have?: ");
        int num = sc.nextInt();

        ArrayList<Employee> myemp = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("Please,enter employee info "+(i+1)+":");
            Employee c = inputDataObject();
            myemp.add(c);
        }

        //display data in ArrayList
        displayObject(myemp);




    }//main

    private static Employee inputDataObject() {
        Scanner sc = new Scanner(System.in);

        Employee c = new Employee();

        System.out.print("Enter  id: ");
        String id = sc.nextLine();
        c.setPid(id);

        System.out.print("Enter name: ");
        c.setName(sc.nextLine());

        System.out.print("Enter Age: ");
        c.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("Enter Gender: ");
        c.setGender(sc.nextLine());

        System.out.print("Enter  tel: ");
        String tel = sc.nextLine();
        c.setTel(tel);

        return c;

    }

    private static void displayObject(ArrayList<Employee> myemp) {
        System.out.println("All object in ArrayList: ");
        for (Employee c:myemp) {
            System.out.println(c.toString());

        }
    }


}//class
