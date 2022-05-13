package Practice;


//Main.java
public class PublicAcessEx {
 public static void main( String[] args ) {
     // accessing the public class
     Animal1 animal = new Animal1();

     // accessing the public variable
     animal.legCount = 4;
     // accessing the public method
     animal.display();
 }
}