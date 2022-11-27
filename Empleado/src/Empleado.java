import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable, Bonus_Navidad{
    private final String name;
    private double salary;
    private Date altaContrato;

    // Lines 10 and 11 show how to create a static variable that can be accessed from the main
    private int Id;
    private static int IdNext = 1;


    public  Empleado(String name, double salary, int year, int month,int day){
        this.name = name;
        this.salary = salary;
        GregorianCalendar date = new GregorianCalendar(year,month-1,day);
        altaContrato = date.getTime();
        // from comment on line 9 the line 20 and 21 shows how to complete the process to access the static variable
        Id = IdNext;
        IdNext++;
    }

    public Empleado(String name){
        this.name = name;
        Id = IdNext;
        IdNext++;
    }

    // method getter to get the name of an object of the class
    public String getName() {
        return name;
    }

    // method getter to get the salary of an object of the class
    public double getSalary() {
        return salary;
    }

    // method getter to get the id "static" of an object of the class
    public int getId(){
        return Id;
    }

    // method getter to get the IdNext, this is a static method that can only be access using the class
    // to see this check Uso_Empleado.java line 24
    // Static methods can only access static variables, in this case IdNext is a static variable declared on line 11

    public static int getIdNext(){
        return IdNext;
    }

    // method getter to get the alcaContrato of an object of the class
    public Date getAltaContrato(){
        return altaContrato;
    }

    // method setter to set a new salary
    public void setNewSalary(double percentage){
        double increase_salary = salary * (percentage/100);
        salary+=increase_salary;
    }

// para observar como se tiene que sobreescribir el siguiente metodo se puede revisar la API de JAva
//    https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
    @Override
    public int compareTo(Object myObject) {
        Empleado otroEmpleado = (Empleado) myObject;
//        en este caso se usa salary para ordenar el objeto si se quisiera ordenar por cualquiera de los campos del objeto
//        se cambiaria salary por cualquier otro de los campos, ejemplo, id, name, year, month.
//        tengase en cuenta que si el campo es una cadena entonces habria que cambiar la instruccion del if para poder comparar
//        cadenas.
        if (this.salary < otroEmpleado.salary){
            return -1;
        }
        if (this.salary > otroEmpleado.salary) {
            return 1;
        }
        return 0;
    }

    @Override
    public double bonusNavidad() {
        double total_bonus = getSalary() + (getSalary()*0.05);
        return total_bonus;
    }
}
class Jefatura extends Empleado implements jefes {
    private double bonus;

    public Jefatura(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

//    thi is the method that overrides the method that requires the implementation of the interface jefes
    @Override
    public String tomar_decisiones(String decision) {
        return "un miembro de la direccion ha tomado una decision: " + decision;
    }

    @Override
    public double bonusNavidad() {
        double prima_extra = 2000;
        return super.bonusNavidad() + prima_extra;
    }
}

class Jefe extends Empleado{
    private double bonus;
    public Jefe(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;

    }
    public double getSalary(){
        double salaryJefe = super.getSalary();
        return bonus + salaryJefe ;
    }
}


