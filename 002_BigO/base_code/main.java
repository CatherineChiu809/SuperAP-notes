import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;


class main {
	public static void main(String args[]) {
		int [] times = {10, 100, 1000, 10000, 100000, 1000000, 10000000};
		int [] nums = new int[100];
		Stopwatch s = new Stopwatch();
		System.out.println("-------------------Test-------------------");
		System.out.println("");
		for(int i : times){
			System.out.println("Interval: " + i);
			s.start();	
			nums = new int[i];
			randomize(nums);
			//insertion(nums);
			//search(nums);
			//bubble(nums);
			//selection(nums);
			//sort(nums);
			quick(nums, 0, nums.length-1);
			s.stop();
			System.out.println("Duration: " + Stopwatch.readable(s.read()));
			System.out.println("");
		}

	}
	public static void randomize(int [] arr){
		for(int z =0; z<arr.length; z++){
			arr[z]=(int)(Math.random()*200000);
		}
	}
	public static boolean search(int [] arr){
		int a = (int)(Math.random()*200000);
		for(int i=0; i<arr.length; i++){
			if(arr[i]==a){
				return true;
			}
		}
		return false;
	}
	public static int [] bubble(int [] arr){
		for(int outer = 0; outer <arr.length-1; outer++){
			for(int inner = 0; inner< arr.length-outer-1; inner++){
				if(arr[inner]>arr[inner+1]){
					int temp = arr[inner];
					arr[inner] = arr[inner+1];
					arr[inner+1] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] insertion(int [] arr){
		int outer, inner, key;
		for(outer = 1; outer<arr.length; outer++){
			key = arr[outer];
			inner = outer-1;
			while(inner>=0 && arr[inner]>key){
				arr[inner+1]=arr[inner];
				inner = inner -1;
			}
			arr[inner+1]=key;
		}
		// for(int z = 0; z<arr.length; z++){
		// 	System.out.print(arr[z]);
		// }
		return arr;
	}
	public static int [] selection(int [] arr){
		int outer, inner, min_index;
		for(outer = 0; outer<arr.length; outer++){
			min_index = outer;
			for(inner = outer+1; inner<arr.length; inner++){
				if(arr[inner]<arr[min_index]){
					min_index = inner;
				}
			}
			int temp = arr[outer];
			arr[outer]= arr[min_index];
			arr[min_index] = temp;
		}
		// for(int z = 0; z<arr.length; z++){
		// 	System.out.print(arr[z]);
		// }
		return arr;
	}
	public static void merge(int [] combined, int [] arr1, int [] arr2){
		int indexArr1 = 0;
		int indexArr2 = 0;
		for(int i = 0; i<combined.length; i++){
			if(indexArr1 == arr1.length){
				combined[i]=arr2[indexArr2];
				indexArr2++;
			}
			else if(indexArr2==arr2.length){
				combined[i]=arr1[indexArr1];
				indexArr1++;
			}
			else if(arr1[indexArr1]<arr2[indexArr2]){
				combined[i] = arr1[indexArr1];
				indexArr1++;
			}
			else{
				combined[i] = arr2[indexArr2];
				indexArr2++;
			}
		}
		
		
	} 
	public static void sort(int []arr){
		if(arr.length <=1){
			return;
		}
		else if(arr.length ==2){
			if(arr[0]>arr[1]){
				int temp = arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
			}
		}
		else{
			int mid = arr.length/2;
			int [] end = new int [arr.length-mid];
			for(int i = 0; i<end.length; i++){
				end[i]=arr[mid+i];
			}
			int [] beginning = new int[arr.length-end.length];
			for(int i = 0; i<beginning.length; i++){
				beginning[i]= arr[i];
			}
			sort(beginning);
			sort(end);
			merge(arr,beginning, end);
			
		}
	}
	public static void quick(int arr[], int low, int high){
		if(low<high){
			int pi = partition(arr,low,high);
			quick(arr,low,pi-1);
			quick(arr,pi+1,high);
		}
	}
	public static int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = (low-1);
		for(int j = low; j<=high-1; j++){
			if(arr[j]<pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return (i+1);
		
	}
	
}

