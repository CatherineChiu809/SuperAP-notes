import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		tester a = new tester();
		int length = a.getLength();
		int rand = a.getRand();
		System.out.println(rand);
		System.out.println(length);
		int [] nums = a.randomize();
		for(int z = 0; z<length; z++){
            System.out.println(nums[z]);
        }
        

	}
}
