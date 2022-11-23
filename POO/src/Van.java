// the keyword extends is used to indicate the class that inherits from
public class Van extends Coche{
    private int capacidad_carga;
    private int asientos_extra;
    public Van(int asientos_extra, int capacidad_carga
    ){
        // with the keyword super we call the constructor from the class Coche or super class
        super();
        this.capacidad_carga = capacidad_carga;
        this.asientos_extra = asientos_extra;
    }
    public String getCapacidad_carga() {
        return "La capacidad de carga de la van es: " +capacidad_carga;
    }

    public String getAsiento_extra(){
        return "La van tiene " + asientos_extra + " asientos";
    }
}
