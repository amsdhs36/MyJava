package Practice;

class defAcces_Modifier {
void display()
{
	System.out.println("You are using default access specifier");
}
}
public class Acces_Modifier {
public static void main(String[]args)
//default
{
	System.out.println("default access specifier");
	defAcces_Modifier obj= new defAcces_Modifier();
	obj.display();
}
}
