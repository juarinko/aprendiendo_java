public class testing_static {

    private final String name;
    private String area;
    public testing_static(String name){
        this.name = name;
        area = "Admin";
    }

    public void setData(String area){
        this.area = area;
    }

    public String getData(){
        return "The name is: " + name + " and is " + area;
    }

}

