package Practice;
//default constructor
public class ConstructClass{
//class EmpInfo{
	int id;
	String name;

void display()
{
	System.out.println(id+"Hello"+name);
}

//public class ConstructClass {
public static void main(String[]args) {
	ConstructClass emp1=new ConstructClass();
	ConstructClass emp2=new ConstructClass();
	emp1.display();
	emp2.display();
	
}
	
}

