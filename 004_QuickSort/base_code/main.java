import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

class main {
	public static void main(String args[]) {
		Birth days = new Birth();
		ArrayList <Birth> females = new ArrayList <Birth>();
		ArrayList <Birth> males = new ArrayList <Birth>();
		String births = "births.csv";
        String csvSplitBy = ",";
        
		try (BufferedReader br = new BufferedReader(new FileReader(births))) {
    	String line;
    	while ((line = br.readLine()) != null) {
    		String[] parts = line.split(",");
        	int year  = Integer.parseInt(parts[0].trim());
        	int month = Integer.parseInt(parts[1].trim());
        	int day;
        	if (parts[2].equals("null")) {
        	    day = 0;
    		}
    		else {
            	day = Integer.parseInt(parts[2].trim());
        	}
        	String gender = parts[3].trim();
        	int num = Integer.parseInt(parts[4].trim());
        	Birth b = new Birth(year, month, day, num, gender);
        	if (gender.equals("F")) {
    	 	females.add(b);
        	} 
        	else {
            	males.add(b);
        	}
    	}

		} catch (Exception e) {
    		e.printStackTrace();
		}
		Birth[] arrF = females.toArray(new Birth[0]);
		Birth[] arrM = males.toArray(new Birth[0]);
		for(int j = 0; j<arrF.length; j++){
			quick(arrF, 0, arrF.length-1);
		}			
		System.out.print(arrF[arrF.length-1].getNum());
		System.out.println();
		toCSV(arrF, "sorted_female.csv");
		
		System.out.println();
		for(int j = 0; j<arrM.length; j++){
			quick(arrM, 0, arrM.length-1);
		}
		System.out.print(arrM[arrM.length-1].getNum());
		System.out.println();
		toCSV(arrM, "sorted_male.csv");

	}
	public static void quick(Birth arr[], int low, int high){
		if(low<high){
			int pi = partition(arr,low,high);
			quick(arr,low,pi-1);
			quick(arr,pi+1,high);
		}
	}
	public static int partition(Birth arr[], int low, int high){
		int pivot = arr[high].getNum();
		int i = (low-1);
		for(int j = low; j<=high-1; j++){
			if(arr[j]!=null && arr[j].getNum()<pivot){
				i++;
				Birth temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		Birth temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return (i+1);
	}
	public static void toCSV(Birth arr[], String name){
		try {
        FileWriter writer = new FileWriter(name);

        for (Birth b : arr) {
            if (b != null) {
                writer.write(
                    b.getYear() + "," +
                    b.getMonth() + "," +
                    b.getDay() + "," +
                    b.getGender() + "," +
                    b.getNum() + "\n"
                );
            }
        }

        writer.close();
        System.out.println("CSV export complete!");
    } catch (IOException e) {
        System.out.println("Error writing CSV: " + e.getMessage());
    }
	}
}
