import java.util.Scanner;

public class Use_FOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter e-mail");
        String email = input.nextLine();
        int arroba = 0;
        for(int i=0; i<email.length(); i++){
            String check = String.valueOf(email.charAt(i));
            if (check.equals("@")) arroba++;
        }
        if (arroba!=1){
            System.out.println("This is not an email");
        }else {
            System.out.println("Thank you for the email");
        }
    }
}
