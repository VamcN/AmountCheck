import java.util.*;
public class Main {

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
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		

	}

}
