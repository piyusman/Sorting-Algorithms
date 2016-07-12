/*
 * @Piyush
 */


public class MergeSort {
private int[] array;
private int[] temp;
private int length;
private void sort(int[] arr){
	this.array = arr;
	this.length = arr.length;
	this.temp = new int[length];
	doMergeSort(0,length-1);
}

private void doMergeSort(int low,int high){
	if(low<high){
		int mid = (low+high)/2;
		doMergeSort(low,mid);
		doMergeSort(mid+1,high);
		merger(low,mid,high);
		
	}	
	
}
private void merger(int l,int m, int h){
	for(int i =l;i<=h;i++){
		temp[i]= array[i];
	}
	int i=l;
	int j=m+1;
	int k=l;
	while(i<=m && j<=h){
		if(temp[i]<=temp[j]){
			array[k] = temp[i];
			i++;
		}
		else{
			array[k]=temp[j];
			j++;
		}
		k++;
	}
	while(i<=m){
		array[k]=temp[i];
		k++;i++;
	}
	
}
public static void main(String args[]){
	int[] array = {56,23,12,32,14,65,45,87,54,99,34};
	MergeSort ms = new MergeSort();
	ms.sort(array);
	for(int i: array){
		System.out.println(i);
	}
}

}
