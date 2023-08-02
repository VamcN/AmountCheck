
public class ArrayMerge {
	int[] merge(int arr1[],int arr2[]) {
		int i;
		int arr3[]=new int[arr1.length+arr2.length];
		for(i=0;i<=arr1.length-1;i++) {
			arr3[i]=arr1[i];
			}
		for(int j=0;j<=arr2.length-1;j++) {
			arr3[i]=arr2[j];
			i++;
		}
		
		return arr3;
	}
	}
