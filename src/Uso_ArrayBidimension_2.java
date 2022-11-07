public class Uso_ArrayBidimension_2 {
    public static void main(String[] args) {
        double acumulado;
        double interes = 0.10;
        double [][] saldo = new double[6][5];

        for (int i=0; i<6; i++){
            saldo[i][0] = 10000;
            acumulado = 10000;
            for (int j=0; j<5; j++){
                saldo[i][j]= acumulado;
                acumulado = acumulado + (acumulado*interes);
            }
            interes = interes + 0.01;
        }
        for (double[] i:saldo) {
            System.out.println();
            for (double j: i ) { // cuando se usa el foreach dentro de otro for each, tener cuidado a la hora de recorrer el 2do ForEach, notese que se menciona i como array a recorrer y no saldo
                System.out.printf("%1.2f" , j);
                System.out.print("  ");
            }
        }
    }
}
