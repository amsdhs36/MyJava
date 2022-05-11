package Practice;
import java.util.*;
public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input the number of elements in array
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Please enter "+n +" elements in array");
		int[] arr =new int[n];
		
		//Input the array elements
		Scanner a=new Scanner(System.in);
		for(int i=0;i<n;i++) {
           arr[i]=a.nextInt();
           
        	}
		System.out.println("Array elements are:");
	    for (int i=0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }
	}

}
