
public class HeapSort {
private static int length;

public static void sort(int[] array){
	
	length = array.length-1;
	heapify(array);
	for(int i=length;i>0;i--){
		swap(array,0,i);
		length = length-1;
		maxHeap(array,0);
	}
	
}
public static void heapify(int[] array){
	for(int i=length/2;i>=0;i--){
		maxHeap(array,i);
	}
}
public static void maxHeap(int[] array,int i){
	int left = 2*i;
	int right = 2*i+1;
	int max=i;
	if(left<=length && array[i]<array[left] ){
		max =left;
	}
	if(right<=length && array[max]<array[right]){
		max=right;
	}
	if(i!=max){
		swap(array,max,i);
		maxHeap(array,max);
		}

	}

public static void swap(int[] array, int i, int j){
	int temp = array[i];
	array[i]= array[j];
	array[j] = temp;	
}


public static void main(String args[]){
	int[] arr = {20,12,13,25,1,56,23,12,57,68,34,54};
	sort(arr);
	for(int i : arr){
		System.out.println(i);
	}
}

}
