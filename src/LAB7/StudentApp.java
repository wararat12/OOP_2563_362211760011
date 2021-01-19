package LAB7;

public class StudentApp {
    public static void main(String[] args) {
        //create object of student class
        Student std1 = new Student();

        std1.introduce();
        //assign data to object
        std1.name = "Wararat Prasit";
        std1.age = 22;
        std1.major = "MIT";

        std1.introduce();

        Student std2 = new Student();
        std2.name = "Numphuing";
        std2.age = 18;
        std2.major = "AC";
        std2.introduce();

        std2.major = "MIT";
        std2.introduce();

        std1.changeFaculty("Engineer RUTS");

        std1.introduce();
        std2.introduce();
    }
}
