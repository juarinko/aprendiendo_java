package persona;

public class Alumno extends Persona{
    private String course;

    public Alumno(String name, String course){
        super(name);
        this.course = course;

    }

    @Override
    public String getDescription() {
        return "El nombre del estudiante es: " + getName() + ", y estudia: " + course;
    }
}
