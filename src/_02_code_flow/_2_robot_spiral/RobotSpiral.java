package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot r2d2 = new Robot();		
		// Set your robot's pen down 
r2d2.penDown ();
		// SPEED. Set the robot to go at max speed (100)
r2d2.setSpeed(100);
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
for(int x = 0;x < 50; x ++) {
				// Change the robot pen color to random
r2d2.setRandomPenColor();
				// DRAW.    Move the robot (5*i) pixels
				//          "i" is the variable in the for loop	
r2d2.move(5*x);			
				// TURN.    Turn the robot (360/7) degrees to the right
r2d2.turn(360/7);			
				// Change the robot pen width to (i)
r2d2.setPenWidth(x);
		
		// Check the pattern against the picture in the recipe. If it matches, you are done!
}		
	}
}
