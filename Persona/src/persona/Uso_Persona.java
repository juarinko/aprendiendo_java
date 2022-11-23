package persona;

public class Uso_Persona {
    public static void main(String[] args) {

        Persona [] personas = new Persona[2];

        personas[0] = new Empleado("Juan", 1000, 1984,05,15);
        personas[1] = new Alumno("Sarka", "Spanish Language");

        System.out.println(personas[0].getDescription());
        System.out.println(personas[1].getDescription());
 
    }

}