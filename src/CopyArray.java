import java.util.*;
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("neter trhe array length");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("eneter the array elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[arr1.length];
		for (int i=0;i<=arr2.length-1;i++) {
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		
	
	}

}
