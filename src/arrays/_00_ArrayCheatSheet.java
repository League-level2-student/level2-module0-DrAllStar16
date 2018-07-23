package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] iList = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(iList[2]);
		// 3. set the third element to a different value
		iList[2] = "corn";
		// 4. print the third element again
		System.out.println(iList[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < iList.length; i++) {
			System.out.println(iList[i]);
		}

		// 6. make an array of 50 integers
		int[] yList = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		System.out.println("     ");
		for (int l = 0; l < yList.length; l++) {
			Random r = new Random();
			int ran = r.nextInt(200);
			yList[l] = ran;

			System.out.println(ran);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int s = 50;
		for (int o = 0; o < yList.length; o++) {

			if (yList[o] < s) {
				s = yList[o];
			}

		}
		System.out.println("     ");
		System.out.println(s);
		// 9 print the entire array to see if step 8 was correct
		// no thanks
		// 10. print the largest number in the array.
		int b = 0;
		for (int z = 0; z < yList.length; z++) {

			if (yList[z] > b) {
				b = yList[z];
			}

		}
		System.out.println(b);

	}
}
