package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = {"a","b","c","d","e"};
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2]="wut";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<strings.length;i++) {
			System.out.print(strings[i]+", ");
		}
		//6. make an array of 50 integers
		int[] thonk=new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i=0;i<thonk.length;i++) {
			Random randy = new Random();
			thonk[i]=randy.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int lowest=51;
		for(int i=0;i<thonk.length;i++) {
			int current;
			current=thonk[i];
			if(current<lowest) {
				lowest=current;
			}
		}
		System.out.println(lowest);
		//9 print the entire array to see if step 8 was correct
		for(int i=0;i<thonk.length;i++) {
			System.out.print(thonk[i]+", ");
		}
		//10. print the largest number in the array.
		int highest=-1;
		for(int i=0;i<thonk.length;i++) {
			int current;
			current=thonk[i];
			if(current>highest) {
				highest=current;
			}
		}
		System.out.println(highest);
	}
}
