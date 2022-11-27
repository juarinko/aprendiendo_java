import java.util.Arrays;

public class Uso_Empleado {
    public static void main(String[] args) {

//    This is to test the commenting on IntelliJ, select the code that needs to be uncommented
//        Empleado empleado1 = new Empleado("Juan", 10050, 2020, 05, 15);
//        Empleado empleado2 = new Empleado("Sarka", 120000, 2018, 8, 18);
//        Empleado empleado3 = new Empleado("Cecilia", 10080, 2021, 5, 11);

//       el objeto jefe de la clase Jefatura no va a usar el polimorfismo pero mostrara como se puede usar una clase que hereda de otra
        Jefatura jefe = new Jefatura("Juan Jefe sin usar polimorfismo", 1110, 2010, 5, 15);

//      el objeto jefe2 en cambio si usara el polimorfismo el cual se muestra en la linea donde employees[4] = jefe2 esta, por ahora es la linea 20
        Jefatura jefe2 = new Jefatura("Juan Jefe usando polimorfismo", 1110, 2010, 5, 15);
//      para darle un bonus al jefe se usa la clase setBonus la cual pertenece a la clase Jefatura la cual extiende o hereda de la clase Empleado
//      esto se puede ver en la clase Empleado linea 66
        jefe2.setBonus(600);

        Empleado [] employees = new Empleado[6];
        employees[0] = new Empleado("Juan Gomez",10050, 2020, 5, 15 );
        employees[1] = new Empleado("Sarka Strakova", 120000, 2018, 8, 18);
        employees[2] = new Empleado("Cecilia Villada", 10080, 2021, 5, 11);
        employees[3] = new Empleado("Petra Strakova");

//      aca se muestra como se aplica el principio de substitucion
        employees[4] = jefe2;

//      the object employees[5] is created just to show how to do casting on an object
        employees[5] = new Jefatura("Natasha", 95000, 25, 12, 1998);

//      si utilizo el siguien codigo se podra observar que employee[5] no puede hacer uso de la clase getter setBonus
//      employees[5].setBonus();
//      muestra como convertir un objeto de tiempo Empleado en un objeto de tipo Jefe haciendo casting
        Jefatura jefe3 =(Jefatura) employees[5];

//      lo que antes no era posible de hacer en linea donde employee[5] trataba de usar el metodo setbonus ahora se puede hacer
//      ya que se hizo un casting y jefe3 es un objeto de tipo Jefatura y no de la clase Empleado
        jefe3.setBonus(5000);

        for (Empleado employee: employees){
            employee.setNewSalary(5);
        }

//        para poder hacer uso del sort de un objeto hay que implementar la interfaz Comparable que se puede ver en la
//        API de Java, este indica que dicha interfaz se de implementar en la clase principal del objeto, en este caso
//        es la clase Empleado, dicho interfaz nos obliga a sobre escribit el metodo compareTo
        Arrays.sort(employees);

        for (Empleado employee: employees){
            System.out.print("The name of the employee is: " + employee.getName() +
                                " and the new salary is: " + employee.getSalary());
            System.out.println(" The id of the employee is:" + employee.getId());
        }
        System.out.println(Empleado.getIdNext());
        jefe.setBonus(500);
        System.out.println("the id of the jefe object is :" + jefe.getId());
        System.out.println("the salary of the boss including the bonus is " + jefe.getSalary());

    }
}
