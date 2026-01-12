import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		MySinglyLinkedList lst = new MySinglyLinkedList();
		for(int i = 0; i<20; i++){
			int temp = (int)(Math.random()*10);
			lst.insert(i,temp);
		}
		System.out.print("20 random numbers: ");
		lst.printList();
		System.out.println();
		System.out.println();
		for(int j = 0; j<20; j++){
			int temp = (int)(Math.random()*20);
			lst.insert(temp,-1);
		}
		System.out.print("20 random numbers and 20 -1s in random spots: ");
		lst.printList();
		System.out.println();
		System.out.println();
		
		int counter = 40;
		for(int j = 39; j>=0; j--){
			int a = lst.get(j);
			lst.insert(counter,a);
			counter++;
		}

		System.out.println();
		
		for(int k = 0; k<40; k++){
			lst.remove(0);
		}
		System.out.print("List backwards: ");
		lst.printList();
	}
}
