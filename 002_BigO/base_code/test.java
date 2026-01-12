package pkg;
import java.util.Scanner;
import java.util.Random;

public class test {
//     int l;
//     int rand = (int)(Math.random()*200000);
//     public int [] randomize(int i){
//         System.out.println(rand);
// 		int count = 0;
// 		int nrand = rand;
// 		while(rand>0){
// 			rand = rand/10;
// 			count++;
// 		}
// 		//l=count;
// 		int [] nums = new int [count];
// 		//int i = 0;
// 		//while(count>0){
// 			nums[i] = nrand%10;
// 			nrand = nrand/10;
// 			//count--;
// 		//}
// // 		for(int j =0; j<nums.length; j++){
// // 		    System.out.println(nums[j]);
// // 		}
// 		return nums;
//    }
    public static void main(String args[]) {
        tester a = new tester();
		
        for(int z = 0; z<5; z++){
            System.out.println(a.randomize(z));
        }
    }
    
}