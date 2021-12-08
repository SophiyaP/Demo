package com.ninja.training;
import java.util.Scanner;
public class Pet_switch {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number of limbs of your pet");
	int nooflimbs=input.nextInt();
	input.close();
	switch(nooflimbs)
	{
	case 0:
		System.out.println("you have a Fish");
		break;
		case 4:
		System.out.println("you have a CAT/DOG/BUNNY");
		break;
    	default:
		System.out.println("you dont have pet");
	

	}

}
}