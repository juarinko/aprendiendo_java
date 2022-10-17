import java.util.Scanner;

public class Input_example {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine(); // depending on the input we use, nextLine, nextInt, nextFloat
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Hola " + name + ", tu edad es " + age );

    }
}
