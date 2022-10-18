import java.util.Scanner;

public class Areas_IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option: \n1: Square \n2: Triangle \n3: Circle");
        int option_figure = input.nextInt();
        double area = 0;
        switch (option_figure) {
            case 1 -> {
                System.out.println("Enter the size of the side:");
                int size_square = input.nextInt();
                area = Math.pow(size_square, 2);
                System.out.print("The are of the square is: " + area);
            }
            case 2 -> {
                System.out.println("Please enter the base:");
                double base = input.nextDouble();
                System.out.println("Please enter the height");
                double height = input.nextDouble();
                area = base * height;
                System.out.print("The are of the Rectangle is: " + area);
            }
            case 3 -> {
                System.out.println("Enter the radio of the circle:");
                double radio = input.nextDouble();
                area = Math.PI * (Math.pow(radio, 2));
                System.out.print("The are of the circle is: ");
                System.out.printf("%1.2f", area);
            }
        }
    }
}
