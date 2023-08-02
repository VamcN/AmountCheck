import java.util.*;
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("neter trhe array1 length");
		int arr1[]=new int[sc.nextInt()];
		System.out.println("eneter the array1 elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("neter trhe array2 length");
		int arr2[]=new int[sc.nextInt()];
		System.out.println("eneter the array2 elements");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=sc.nextInt();
		}
		ArrayMerge arraymerge=new ArrayMerge();
		int[] res=arraymerge.merge(arr1,arr2);
		for (int i : res) {
			System.out.println(i+" ");
		}
	//System.out.println(res);
	}

}
