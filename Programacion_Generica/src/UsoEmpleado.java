import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {
    public static void main(String[] args) {

        // Para usar un ArrayList se declara de la siguiente manera.
        // No se puede crear un ArrayList de tipos de datos primitivos, por eso en el ejemplo se usa un objeto de la
        // clase Empleado
        // ArrayList<Nombre_Objeto> nombre_de_array = new Arraylist<Nombre_Objeto>();
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        // Un ArrayList en teoria tiene una capacidad ilimitada, pero eso dependera de los recursos que se dispongan en
        // el computador en el que se trabaje, por defect al crear un ArrayList este tiene una capacidad de 10 espacios
        // en memoria e ira creciendo dependiendo de la necesidad, pero esto hara que la maquina haga un consumo de
        // memoria que puede llegar a ser muy extenso, si se conoce de ante mano cuantos espaciones de memoria se van
        // a usar se puede usar el metodo de la clase ArrayList ensureCapacity() , esto no limita el tamano que el
        // ArrayList pueda tomar, solo da un inicio al ArrayList de memoria suficiente el cual ayuda a reducir el uso
        // de memoria innecesario.

        listaEmpleados.ensureCapacity(11);

        listaEmpleados.add(new Empleado("Juan", 38, 29000));
        listaEmpleados.add(new Empleado("Sarka", 33, 42000));
        listaEmpleados.add(new Empleado("Cecilia", 73, 25000));
        listaEmpleados.add(new Empleado("Natasha", 13, 1000));


        // para agregar un nuevo objeto en una posicion deseada, se usa el metodo add(arg1, arg2), siendo
        // arg1 el paremtro de la posicion donde deseamos insertar el objeto, y el segundo es el nuevo objeto a insertar
        // notece como el siguiente empleado no queda en la ultima posicion sino en la posicion 1 del ArrayList,
        listaEmpleados.add(1, new Empleado("Petra", 41, 23000));

        //listaEmpleados.set(0, listaEmpleados.get(4));


        // una vez se han creado los objetos del ArrayList es recomendado usar el metodo trimToSize() para eliminar las
        // copias del Array que se puedan haber creado al momento de crecer dinamicamente hasta cubrir las necesidades
        // del ArrayList. Esto se debe realizar para liberar recursos de memoria despues de terminar de obtener los valores
        // que el ArrayList va a guardar

        listaEmpleados.trimToSize();

        for (Empleado e : listaEmpleados) {
            System.out.println(e.dameDatos());

        }


        // otra manera de recorrer un ArrayList es usando el objeto Iterator.
        // An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
        // It is called an "iterator" because "iterating" is the technical term for looping.

        //To use an Iterator, you must import it from the java.util package.
        Iterator<Empleado> mi_iterador = listaEmpleados.iterator();
        while (mi_iterador.hasNext()){
            System.out.println(mi_iterador.next().dameDatos());
        }


    }
}
class Empleado{

    String nombre;
    int edad;
    double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String dameDatos(){
        return "El empleado " + nombre + " Tiene " + edad + " y una salario de " + salario;
    }

}