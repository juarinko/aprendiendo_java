public class Uso_Array {
    public static void main(String[] args) {
        int[] mi_matriz = new int[5];
        for (int i=0; i<mi_matriz.length; i++){
            mi_matriz[i] = 5 + i;
            System.out.println("the value at the position " + i + " is " + mi_matriz[i]);
        }

    }
}
