package Array;

//import java.util.*;

public class Arrays {

	public static void main(String[] args) {

		int[] num1Array = new int[10];

		for (int i = 0; i < num1Array.length; i++) {

			num1Array[i] = i + 1;
		
			
		for (int j = 0; j < 10; j++) {
			System.out.print(num1Array[i] + "\t"); //System.out.print(num1Array[i] + " "); // the " " leaves no space between columns whereas "\t" does
		}
		System.out.println();

		}

	}
}