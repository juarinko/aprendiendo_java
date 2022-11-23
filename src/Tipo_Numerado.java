/*public class Tipo_Numerado {
    enum Talla{Mini, Mediano, Grande, Muy_Grande}
    public static void main(String[] args){
        Talla s = Talla.Mini;
        Talla m = Talla.Mediano;
        Talla l= Talla.Grande;
        Talla xl = Talla.Muy_Grande;
    }
}
 */
import java.util.*;
public class Tipo_Numerado {
    // to use numerated types those need to be declared before the main and use the keyword "enum"
    // this type can be used as above on the commented code where only gives values a variable can take or can also
    // be used to create constructors, getters and setters, this can be later used within the main as shown below
    // line 32 using the static method Enum
    enum Talla{
        Mini("S"), Mediano("M"), Grande("L"), Muy_Grande("XL");
        private Talla(String abr){
            this.abr = abr;
        }
        public String getAbr(){
            return abr;
        }
        private String abr;
    }

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Escribre una talla: Mini, Mediano, Grande, Muy_Grande");
        String entrada_datos = intro.next();
        Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla = " + la_talla);
        System.out.println("Abreviatura :" + la_talla.getAbr());

    }
}
