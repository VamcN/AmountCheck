import java.util.Scanner;

/*
 * by taking length as input from the user . take the contents of the array from user and store the contents in the array. Display the contents of the array by incrementing each value present in the array by 5 on to the console.

Note:Use Enhanced For Loop*/
public class EnchancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter array lemngth");
		int n =sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter content");
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
		for (int i : arr) {
			System.out.print  (i+5+" ");
			
		}
		

	}

}
