import java.util.Scanner;

public class Access_app_WHILE {
    public static void main(String[] args) {
        String password = "Juan";
        String check_password = "";

        Scanner input = new Scanner(System.in);

        while(!check_password.equals(password)){
            System.out.println("Please enter the correct password");
            check_password = input.next();
            if (!check_password.equals(password)){
                System.out.println("wrong password");
            }
        }
        System.out.println("You have entered the correct password");
    }
}
