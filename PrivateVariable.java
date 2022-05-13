package Practice;
class data{
private String name;

// getter method
public String getName() {
    return this.name;
}
// setter method
public void setName(String name) {
    this.name= name;
}
}
public class PrivateVariable {
public static void main(String[] main){
    data d = new data();

    // access the private variable using the getter and setter
    d.setName("Programiz");
    System.out.println(d.getName());
}
}

