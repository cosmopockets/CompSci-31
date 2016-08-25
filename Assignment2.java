
	/**
	 * Assignment two part A
	 * Write a program that calculates and displays a persons
	 * body mass index. The BMI is often used to determine whether a person with sedentary lifestyle is overweight
	 * or underweight for his or her height. A persons BMI is calculated with the following formula:
	 * BMI = Weight * 703/ Height^2
	 * 
	 * Weight = pounds
	 * Height = inches^2
	 * 
	 * Where weight is measured in pounds and height is measured in inches. 
	 * The program should display a message indicating whether the person has optimal weight, is underweight, or is overweight. 
	 * A sedentary person's weight is considered optimal if his or her BMI is between 18.5 and 25.
	 * If the BMI is less than 18.5, the person is considered underweight. If the BMI value is > than 25, the person is considered overweight
	 */
import java.util.Scanner;
public class Homeworktwo 
{

	static Scanner bmiInput = new Scanner(System.in);

	public static void main(String[] args) {
		
		double personLbs;
		double personHeight;
		double bmi;
		
		//Prompt the user for his or her weight in lbs
		Scanner Lbs = new Scanner(System.in);
		System.out.println("Enter your weight:");
		personLbs = Lbs.nextDouble();
		System.out.println("You entered " +personLbs);
		
		//Prompt the user to enter his or her height in inches
		Scanner Height = new Scanner(System.in);
		System.out.print("Enter your height in inches:");
		personHeight = Height.nextDouble();
		System.out.println("your height in inches is: " +personHeight);
		
		//Calculates the users BMI
		bmi = personLbs/(personHeight * personHeight) * 703;
		System.out.printf("Your Body Mass index is:%f", +bmi);
		
		/*Here it will display whether or not the user is in optimal weight, is underweight or is overweight
		 * I am going to assume i will need an if() statement
		 * maybe if(bmi <= 18.5 || bmi => 25)
		 * it should print "Your are in optimal weight"
		 * if(bmi <18.5) "You are underweight"
		 * if(bmi > 25) "You are considered over weight"
		 */

	}

}
