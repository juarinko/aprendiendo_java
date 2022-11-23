import java.util.Scanner;

public class Uso_vehicle {
    public static void main(String[] args) {
        /*
        Coche Renault = new Coche(); // this is how to create an instance of the class Coche

        System.out.println(Renault.get_wheels());
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the color of the car");
        String data_input = input.nextLine();
        Renault.set_color(data_input);

        System.out.println("Please write yes if seats are made with leather");
        data_input = input.nextLine();
        Renault.setLeather_seats(data_input);

        System.out.println("Please write yes if car has A/C");
        data_input = input.nextLine();
        Renault.setConditioning_air(data_input);

        System.out.println(Renault.get_color());
        System.out.println(Renault.getConditioning_air());
        System.out.println(Renault.getLeather_seats());

        System.out.println("The total price of the car is: " + Renault.precio_coche());


         */
        Coche myVehicle = new Coche();
        myVehicle.set_color("blue");
        Van myVan = new Van(550, 5);
        myVan.set_color("green");
        myVan.setConditioning_air("yes");
        myVan.setLeather_seats("No");
        System.out.println( myVan.get_color() + "\n" +
                            myVan.getLeather_seats() + "\n" +
                            myVan.get_wheels() + "\n" +
                            myVan.getAsiento_extra()+ "\n" +
                            myVan.getCapacidad_carga());


    }
}
