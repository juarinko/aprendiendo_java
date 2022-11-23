import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona{

    private double salary;
    private Date altaContrato;

    // Lines 10 and 11 show how to create a static variable that can be accessed from the main
    private int Id;
    private static int IdNext = 1;


    public Empleado(String name, double salary, int year, int month,int day){
        super(name);
        this.salary = salary;
        GregorianCalendar date = new GregorianCalendar(year,month-1,day);
        altaContrato = date.getTime();
        // from comment on line 9 the line 20 and 21 shows how to complete the process to access the static variable
        Id = IdNext;
        IdNext++;
    }
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

    // method getter to get the altaContrato of an object of the class
    public Date getAltaContrato(){
        return altaContrato;
    }

    // method setter to set a new salary
    public void setNewSalary(double percentage){
        double increase_salary = salary * (percentage/100);
        salary+=increase_salary;
    }

    @Override
    public String getDescription() {
        return "Este empleado tiene un ID = " + getId() + " con un sueldo de: " + getSalary();
    }
}
