import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please select one of the following options \n" +
                "1. Enter details \n" +
                "2. Exit the program");
        int option = input.nextInt();
        if(option==1){
            try {
                getDetails();
            } catch (InputMismatchException e) {
                System.out.println("You entered a wrong age");
                System.out.println("an error of the class " + e.getClass());
            }

        }
        else if (option == 2){
            System.out.println("Good bye");
            System.exit(0);
        } else {

            System.out.println("You entered a wrong option, Bye!");

//            las lines abajo es una manera de crear nosotros mismos un error
//            ArrayIndexOutOfBoundsException my_exception = new ArrayIndexOutOfBoundsException();
//            throw my_exception;
//            throw new ArrayStoreException();
        }


    }

    static void getDetails() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Hello" + name + " your age next year will be " + (age+1));
        input.close();
        System.out.println("Done");
    }


}