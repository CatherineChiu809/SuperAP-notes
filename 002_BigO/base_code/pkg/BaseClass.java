// package pkg;
// import java.util.Scanner;
// import java.util.Random;


// public class BaseClass {
// 	static int l;
//     int rand; 
//     int [] nums;
//     int returnRand;
//     int rrand;
// 	public BaseClass() {
// 		rand = (int)(Math.random()*200000);
//         returnRand=rand;
//         rrand = rand;
//         int count = 0;
//         while(rand>0){
// 			rand = rand/10;
// 			count++;
// 		}
// 		l = count;
// 	}
//     public int[] randomize(){
// 		nums = new int [l];
// 	    int count = l;
// 	    int i = 0;
// 		while(i<l){
// 			nums[count-1-i] = rrand%10;
// 			rrand = rrand/10;
// 			i++;
// 		}
// 		return nums;
//     }
//     public int getRand(){
//         return returnRand;
//     }
//     public int getLength(){
//         return l;
//     }
    
// 	// public boolean search(){
		
// 	// }
// 	public int [] bubble(int [] arr){
// 		for(int outer = 0; outer <arr.length-1; outer++){
// 			for(int inner = 0; inner< arr.length-outer-1 inner++){
// 				if(arr[inner]>arr[inner+1]){
// 					int temp = arr[inner];
// 					arr[inner] = arr[inner];
// 					arr[inner+1] = temp;
// 				}
// 			}
// 		}
// 		return arr;
// 	}
// 	public int[] insertion(int [] arr){
// 		int outer, inner, key;
// 		for(outer = 1; outer<arr.length; outer++){
// 			key = arr[outer];
// 			inner = outer-1;
// 			while(inner>=0 && arr[inner]>key){
// 				arr[inner+1]=arr[inner];
// 				inner = inner -1;
// 			}
// 			arr[inner+1]=key;
// 		}
// 		return arr;
// 	}
// 	public int [] selection(int [] arr){
// 		int outer, inner, min_index;
// 		for(outer = 0; outer<arr.length; outer++){
// 			min_index = outer;
// 			for(inner = outer+1; inner<arr.length; inner++){
// 				if(arr[inner]<arr[min_index]){
// 					min_index = inner;
// 				}
// 			}
// 			int temp = arr[outer];
// 			arr[outer]= arr[min_index];
// 			arr[min_index] = temp;
// 		}
// 		return arr;
// 	}

// }
