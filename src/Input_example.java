import java.util.Scanner;

public class Input_example {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine(); // depending on the input we use, nextLine, nextInt, nextFloat
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("Hola " + name + ", tu edad es " + age );

        // the next line is to show how the method printf works
        double number1 = 3.12345678;
        // from the expression "%1.2" %1 is required and the 2 is the number of decimals wanted, the same way we could
        // write "%1.4" and then the result would be 3.1234
        System.out.printf("%1.2f",number1);


    }
}
