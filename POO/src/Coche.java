public class Coche {
    private int wheels;
    private int wide;
    private int length;
    private int weight;
    private int motor;
    private String color;
    private int peso_total;
    private boolean leather_seats, conditioning_air;

    public Coche(){
        wheels = 4;
        length = 2000;
        wide = 300;
        motor = 1600;
        weight = 500;
    }

    // method getter
    public String get_wheels(){
        return "The car has " + wheels + " wheels";
    }

    //method setter
    public void set_color(String color){
        this.color = color ;
    }

    public String get_color(){
        return "the color of the car is " + color;
    }

    public void setLeather_seats(String leather_seats){
        this.leather_seats = leather_seats.equals("yes");
    }
    public String getLeather_seats(){
        if (leather_seats)
        return "The car has leather seats ";
        else return "The has doesn't have leather seats";
    }

    public void setConditioning_air(String conditioning_air){
        this.conditioning_air = conditioning_air.equals("yes");
    }

    public String getConditioning_air(){
        if (conditioning_air)return "the car has A/C";
        else return "the car doesn't have A/C";
    }

    public int precio_coche(){
        int precio_final = 10000;
        if(leather_seats)precio_final+=2000;
        if (conditioning_air)precio_final+=1500;
        return  precio_final;
    }

}


