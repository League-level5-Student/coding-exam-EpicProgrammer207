package Coding_Exam_A;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExamA {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("How many robots do you want");
		String s2 = JOptionPane.showInputDialog("Give me the color you would like please! (Red, Green, or Blue)");
		String s3 = JOptionPane.showInputDialog("How many sides do you want each shape to be(Positive integer please)");
		int i = Integer.parseInt(s);
		int j = Integer.parseInt(s3);
		for(int k = 0; k<i; k++) {
			Robot r = new Robot();
			r.setX(150*(k+1));
			r.setY(250);
			r.penDown();
			if(s2.equalsIgnoreCase("Red")) {
				r.setPenColor(Color.RED);
			}
			else if(s2.equalsIgnoreCase("Blue")) {
				r.setPenColor(Color.BLUE);
			}
			else {
				r.setPenColor(Color.GREEN);
			}
			r.setSpeed(10);
			new Thread(()->{for(int m = 0; m<j; m++) {
				r.move(100);
				r.turn(360/j);
			}
			}).start();;
		}
		/*
		 * Write a program that asks the user for three pieces of information.
		 * 1. How many robots
		 * 2. The color of the shapes
		 * 3. How many sides each shape will have
		 * 
		 * Once the information has been collected, the program will then make the requested number of robots
		 * each draw the requested shape in the requested color. The robots should execute at the same time so 
		 * Threads will need to be used. Arrange the robots so that the shapes do not overlap.
		 * For full credit, define the Thread functions using lambdas.
		 * 
		 * See the Coding_Exam_A_Demo.jar for an example of what the finished product should look like.
		 */

	}
}
