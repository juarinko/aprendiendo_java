import java.util.Random;

public class Uso_ArrayBidemension {
    public static void main(String[] args) {
        // how to create a 2 dimensions Array
        int [][] matrix = new int[3][3];

        Random random = new Random();
        // the following for will fill the array with random numbers as this is a 2 dimensions array then i and j will help to go through it

        for (int i =0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j] = random.nextInt();
            }
        }

        for (int i =0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("The value in position " + (i+1) + ":" + (j+1) + " = " + matrix[i][j]);
            }
        }

    }
}
