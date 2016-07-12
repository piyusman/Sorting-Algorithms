
public class InsertionSort {
public static void sort(int[] array){
	int length = array.length;
	for(int i =1;i<length;i++){
		for(int j=i;j>0;j--){
			if(array[j]<array[j-1]){
				int temp = array[j];
				array[j]=array[j-1];
				array[j-1]=temp;
			}
		}
	}
}

public static void main(String args[]){
	int[] array = {3,12,2,3,12,5,4,8,2,9};
	sort(array);
	for(int a : array){
		System.out.println(a);
	}
}
}
