package Practice;
class animal {
	//protected method
	protected void display() {
		System.out.println("I am an animal");
	}
}
 class Dogprotected extends animal {
	 public static void main(String[] args) {
		 //create an object of Dog class
		 Dogprotected d=new Dogprotected();
		 //access protected method
		 d.display();
	 }

}
