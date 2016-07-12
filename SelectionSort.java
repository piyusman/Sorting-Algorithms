/*
 * @Piyush
 */


public class SelectionSort {
	public static int[] sort(int[] array){
		int length = array.length;
		for(int i=0;i<length-1;i++){
			int index = i;
			for(int j = i+1 ; j<length;j++){
				if(array[j]<array[index]){
					index = j;
				}
			}
			if(index!=i){
					int temp = array[index];
					array[index]= array[i];
					array[i] = temp;
			}
				
		}
		return array;
	}
	
	public static void main(String args[]){
		int array[] = {2,12,4,2,1,5,6,3,9,8,7};
		int[] arr = sort(array);
		for(int a: arr){
			System.out.println(a);
		}
	}
}
