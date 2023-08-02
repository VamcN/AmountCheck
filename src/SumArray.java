import java.util.*;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
	
		System.out.println("neter trhe array length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("eneter the array elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for (int i : arr) {
			sum=i+sum;
		}
System.out.println(sum);
	} 

}
