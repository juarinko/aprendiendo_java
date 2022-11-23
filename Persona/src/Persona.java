// abstract is used here as an abstract method will be used later on the developing of the class Persona
abstract public class Persona {
    private String name;
//  the constructor method Persona is implemented and receives as a parameter a name
    public Persona (String name){
        this.name = name;
    }

//  the method getName returns the instance name, as explained previously, name is implemented the same way on all
//  classes that inheritance from the class Persona
    public String getName(){
        return name;
    }

//  The class getDescription is abstract and only needs to be declared as shown below, then the implementation will
//  depend on those classes that inheritance from the class persona, this just let know those classes that the method
//  needs to be implemented
    public abstract String getDescription();


}
