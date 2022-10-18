import java.util.Scanner;

public class Guess_number_WHILE {
    public static void main(String[] args) {
        int random = (int) (Math.random()*100);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int compare = input.nextInt();
        while (random!=compare){
            if(compare<random){
                System.out.println("Please enter a bigger number");
            }
            else System.out.println("Please enter a smaller number");
            compare = input.nextInt();
        }
        System.out.println("Congratulations, you guessed the number");
    }
}
