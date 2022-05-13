package Practice;
import java.util.*;

public class CollectionClass {
		    public static void main(String[] args) {
	        // Creating list using the ArrayList class
	        List<Integer> numbers = new ArrayList<>();
            List<String> languages=new ArrayList<>();
	        // Add elements to the list
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        System.out.println("Number List: " + numbers);
	        languages.add("Python");
	        languages.add("Java");
	        languages.add("HTML");
	        System.out.println("Language List: " + languages);
	        // Access element from the list
	        int number = numbers.get(2);
	        System.out.println("Accessed Element: " + number);
            String language=languages.get(1);
            System.out.println("Accessed String Elements:"+ language);
	        // Remove element from the list
	        int removedNumber = numbers.remove(1);
	        System.out.println("Removed Element: " + removedNumber);
	        //Change element of the array list
	        languages.set(2, "C");
	        System.out.println("Modified Arraylist"+languages);
	        //Creating Vector
	        System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector<>();
		      vec.addElement(15); 
		      vec.addElement(30); 
		      vec.addElement(40); 
		      System.out.println(vec);
		      //Using iterator
		      Iterator<Integer> iterate=vec.iterator();
		      System.out.print("Vector: ");
		      while(iterate.hasNext()) {
   	    	  System.out.print(iterate.next());
		      System.out.print(" ");
		      }
		     // Using remove element in vector
		      int element=vec.remove(2);
		      System.out.println(element);
		      System.out.println(vec);
		      
		      //Creating Stack
		      
		      Stack<String> animals= new Stack<>();

		        // Add elements to Stack
		        animals.push("Dog");
		        animals.push("Horse");
		        animals.push("Cat");

		        System.out.println("Stack: " + animals);
		     // Remove element stacks
		        String element1 = animals.pop();
		        System.out.println("Removed Element: " + element1);
		     // Add elements to Stack
		        animals.push("Cow");
		        animals.push("Buffalo");
		        animals.push("Pig");
		        System.out.println("Stack: " + animals);

		        // Access element from the top
		        String element2 = animals.peek();
		        System.out.println("Element at top: " + element2);
		     // Search an element
		        int position = animals.search("Horse");
		        System.out.println("Position of Horse: " + position);
		     // Check if stack is empty
		        boolean result = animals.empty();
		        System.out.println("Is the stack empty? " + result);
		      }

	    }
	

