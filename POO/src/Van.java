public class Van extends Coche{
    private int capacidad_carga;
    private int asientos_extra;
    public Van(int capacidad_carga, int asientos_extra){
        // with the keyword super we call the constructor from the class Coche or super class
        super();
        this.capacidad_carga = capacidad_carga;
        this.asientos_extra = asientos_extra;
    }
}
