public class Uso_Empleado {
    public static void main(String[] args) {
    /*
        Empleado empleado1 = new Empleado("Juan", 10050, 2020, 05, 15);
        Empleado empleado2 = new Empleado("Sarka", 120000, 2018, 8, 18);
        Empleado empleado3 = new Empleado("Cecilia", 10080, 2021, 5, 11);
     */

        Empleado [] employees = new Empleado[4];
        employees[0] = new Empleado("Juan Gomez",10050, 2020, 5, 15 );
        employees[1] = new Empleado("Sarka Strakova", 120000, 2018, 8, 18);
        employees[2] = new Empleado("Cecilia Villada", 10080, 2021, 5, 11);
        employees[3] = new Empleado("Petra Strakova");

        for (Empleado employee: employees){
            employee.setNewSalary(5);
        }

        for (Empleado employee: employees){
            System.out.print("The name of the employee is: " + employee.getName() +
                                " and the new salary is: " + employee.getSalary());
            System.out.println(" The id of the employee is:" + employee.getId());
        }

        System.out.println(Empleado.getIdNext());




    }
}
