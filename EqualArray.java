package Practice;

import java.util.Scanner;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input the number of elements in array
		        
				Scanner sc=new Scanner(System.in);
			//	System.out.println("Enter length of array:");
				int n=sc.nextInt();
			//	System.out.println("Please enter "+n +" elements in array1\n");
				int[] arr1 =new int[n];
				int count=-1;
							
				//Input the array1 elements
				Scanner a1=new Scanner(System.in);
				for(int i=0;i<n;i++) {
		           arr1[i]=a1.nextInt();
		           
		        	}
			//	System.out.println("Array1 elements are:");
			 //   for (int i=0; i < arr1.length; i++) {
			//      System.out.print(arr1[i]+"\t");
			//    }
			 //   System.out.println("\nPlease enter "+n +" elements in array2\n");
				int[] arr2 =new int[n];
			  //Input the array2 elements
				Scanner a2=new Scanner(System.in);
				for(int i=0;i<n;i++) {
		           arr2[i]=a2.nextInt();
		           
		        	}
			//	System.out.println("Array2 elements are:");
			//    for (int i=0; i <n; i++) {
			 //     System.out.print(arr2[i]+"\t");
			//    }
			    
			    for(int i=0; i <n; i++)
			    {
			    	
			    	if(arr1[i]>=arr2[i])
			    		
			    		{ 
			    		
			    		arr1[i]=arr1[i]-arr2[i];
			    		//System.out.println(arr1[i]);
			       		count++;
			       		}
			    	    
			    	    else 
			    	        count=-1;
			    	    	
    }
			    
			//    for(int i=0;i<n;i++)
			    	//System.out.println("\n"+arr1[i]);
			    System.out.println("\n"+count);
			  			    
	}

}
