import java.util.Scanner;

public class Check_age_IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("You are over 18");
        } else if (age >= 0){
            System.out.println("You are underage");
        } else {
            System.out.println("You aren't even born");
        }
    }
}
