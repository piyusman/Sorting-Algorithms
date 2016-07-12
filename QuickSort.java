
public class QuickSort {
private int[] array;
private int length;

private void sort(int[] arr){
	if(arr == null || arr.length ==0){
		return;
	}
	
	this.array= arr;
	this.length=arr.length;
	quickSort(0,length-1);
	
}

private void quickSort(int low,int high){
	int i =low;
	int j= high;
	int pivot = array[(low+high)/2];
	while(i<=j){
		while(array[i]<pivot){
			i++;
		}
		while(array[j]>pivot){
			j--;
		}
		if(i<=j){
			swap(i,j);
			i++;
			j--;
		}
		
	}
	if(low<j){
		quickSort(low,j);
	}
	if(i<high){
		quickSort(i,high);
	}
}

private void swap(int i,int j){
	  int temp;
	 temp = array[i];
	 array[i] =array[j];
	 array[j] =temp;
}

public static void main (String args[]){
	int array[] = {87,34,23,12,65,25,45,28,94,54};
	QuickSort qs = new QuickSort();
	qs.sort(array);
	for(int i: array){
	System.out.println(i);	
	}
	
}
}
