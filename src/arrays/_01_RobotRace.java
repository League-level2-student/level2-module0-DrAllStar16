package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method

	public static void main(String[] args) {
		int s = 600;
		int w = 0;
		Random r = new Random();
		// 2. create an array of 5 robots.
		Robot[] iList = new Robot[8];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < iList.length; i++) {
			iList[i] = new Robot("mini");
			iList[i].setX(i * 100 + 50);
			iList[i].setY(600);
			iList[i].setSpeed(15);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		while (s > 25) {

			for (int i = 0; i < iList.length; i++) {
				iList[i].move(r.nextInt(50));
				if (iList[i].getY() < s) {
					s = iList[i].getY();
					w = i;
				}
			}
			
		}
		System.out.println(w+" is the winner");
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}