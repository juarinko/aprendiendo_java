import java.util.Random;
import java.util.Scanner;

public class Use_ForEach{
    public static void main(String[] args) {
        /* Esta es una manera de usar el ForEach
        String [] paises = new String[8];
        paises[0] = "Spain";
        paises[1] = "Mexico";
        paises[2] = "Colombia";
        paises[3] = "Peru";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";

        for (String pais: paises) {
            System.out.println(pais);
            
        }

       *********************************************************************************
        This is another way to implement the code above

        String[] paises = new String[8];
        Scanner input = new Scanner(System.in);
        // El siguiente for tambien se puede cambiar por un ForEach
        for (int i=0; i<paises.length; i++) {
            System.out.println("Please enter the name of a country");
            String pais = input.nextLine();
            paises[i] = pais;
        }
        for (String pais: paises) {
            System.out.println(pais);
        }
        */

        int[] random_numbers = new int[150];
        int i = 0;
        Random random = new Random(); // this is a new way to generate random numbers
        for (int number:random_numbers) {
            random_numbers[i]=random.nextInt();
            i++;
        }
        for (int number:random_numbers) {
            System.out.println(number);
        }



    }
}
