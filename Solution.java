package Practice;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:");
		 int n = sc.nextInt();
	        int[] a = new int[n];
	        int[] b = new int[n];
	        for (int i = 0; i < n; i++)
	            a[i] = sc.nextInt();
	        for (int i = 0; i < n; i++)
	            b[i] = sc.nextInt();
	        int min = a[0];
	        for (int i = 0; i < n; i++) {
	            if (min > a[i])
	                min = a[i]-b[i];
	        }
	        int res = 0;
	        for (int i = 0; i < n; i++) {
	            while (a[i] > min && b[i] != 0) {
	                a[i] -= b[i];
	                res++;
	            }
	            if (a[i] != min){
	                res = -1;
	                break;
	            }
	        }
	        System.out.println(res);
	    }
	}


