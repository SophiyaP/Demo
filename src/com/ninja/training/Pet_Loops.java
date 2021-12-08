
package com.ninja.training;
import java.util.Scanner;

public class Pet_Loops {
static int maxattempts=3;
	public static void for_loop() {
	Scanner input=new Scanner(System.in);
System.out.println("////FOR LOOP");
for(int attemptcnt=1;attemptcnt<=maxattempts;attemptcnt++)
{
	System.out.println("Enter the number of limbs of your pet");
	int nooflimbs=input.nextInt();
	System.out.println("Your attempt count" +attemptcnt);

	switch(nooflimbs) {
		case 0:
			System.out.println("you hava a fish");
		break;
		case 2:
		System.out.println("You have a bird as pet");
		break;
		case 4:
			System.out.println("You have dog/cat/bunny");
		break;
		default:
		System.out.println("Sorry!! you dont have a pet");
	} // end of switch
	}//end of for loop
	input.close();
System.out.println("Sorry, you have reached maximum attempts");	
}// end of for method

public static void while_Loop(){
	System.out.println("//WHILE LOOP");
	int attemptcnt=1;
	Scanner input=new Scanner(System.in);
	while(attemptcnt<=maxattempts) {
	System.out.println("Enter the number of limbs");
	int nooflimbs=input.nextInt();
	System.out.println("your attempt" +attemptcnt);	
	
		switch(nooflimbs)
		{
		case 0:
		System.out.println("You got a fish");
		break;
		case 2:
			System.out.println("You got a bird pet");
			break;
		case 4:
			System.out.println("You got a Bunny/cat/dog");
			break;
		default:
			System.out.println("You dont have a pet");
			break;
		}// end of switch
	attemptcnt=attemptcnt+1;
} //end of while
input.close();
System.out.println("you reached your maximunm attempts"+attemptcnt);
	} // end of while loop method
	
	public static void do_while_loop() {
		System.out.println("DO WHILE LOOP");
		Scanner input=new Scanner(System.in);
		int countattempt = 1;
		
		do
		{
	
			System.out.println("Your attempt"+countattempt);
			System.out.println("Enter the number of limbs");
			int nooflimbs=input.nextInt();
			switch(nooflimbs) {
			case 0:{
			System.out.println("You got a fish");
			break;
			}
			case 2:{
				System.out.println("You got a bird pet");
				break;
				}
			case 4:{
				System.out.println("You got a Bunny/cat/dog");
				break;
				}
			default:{
				System.out.println("You dont have a pet");
				break;
			}
						} // end of switch
			countattempt=countattempt+1;
		}
			while(countattempt<=maxattempts);
		input.close();
		System.out.println("Reached your maximum attempts" +countattempt);
				}// end of do

	public static void main(String[] args) {
	for_loop();
	while_Loop();
		do_while_loop();
		}
		}
