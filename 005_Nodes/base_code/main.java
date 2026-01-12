import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {
	public static void main(String args[]) {
		/*
			Create an ArrayList of 100 Nodes
			Store random integers in each of them
			Print out all of the values
		*/
		
		ArrayList <Node> test = new ArrayList <Node>();
		for(int i = 0; i<100; i++){
			int temp = (int)(Math.random()*100);
			Node a = new Node(temp);
			test.add(a);
		}
		for(int i = 0; i<100; i++){
			System.out.print(test.get(i).getData());
			System.out.print(" ");
		}
	}
}
