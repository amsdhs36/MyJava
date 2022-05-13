package Practice;
//parameterized Constructor

class Student4{
	int id;
	String name;
	//Creating parameterized constructor

Student4(int i,String n){
	id=i;
	name=n;
}
   //Method to display the values
	void display() {
		System.out.println(id+""+name);
	}
	
}

public class ParametrizeConstruct {
	public static void main (String args[]) {
		//Creating objects and passing values
		Student4 S1=new Student4(111," Aryan");
		Student4 S2=new Student4(112," Ayansh");
		
		//Calling method to display the values of object
		S1.display();
		S2.display();
	}

}
