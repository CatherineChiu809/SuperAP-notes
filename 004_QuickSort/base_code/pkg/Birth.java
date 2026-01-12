package pkg;
import java.util.Scanner;
import java.util.Random;


public class Birth {
	int year;
	int month;
	int day;
	int number;
	String gender;
	public Birth(){
		year = 0;
		month = 0;
		day = 0;
		number = 0;
		gender = null;
	}
	public Birth(int y, int m, int d, int n, String g){
		year = y;
		month = m;
		day = d;
		number = n;
		gender = g; 
	}
	public int getYear(){
		return year;
	}
		public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public String getGender(){
		return gender;
	}
	public int getNum(){
		return number;
	}
	
	
	

}
