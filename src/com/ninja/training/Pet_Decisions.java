package com.ninja.training;
import java.util.Scanner;

public class Pet_Decisions {

	public static void main(String[] args) {
	
Scanner input=new Scanner(System.in); // to get input from the user
System.out.println("Enter the number of limbs");
int numberoflimbs=input.nextInt();
input.close();

//if statement
if((numberoflimbs>0) && (numberoflimbs<=4) || !(numberoflimbs==1)&& !(numberoflimbs==3))
{
System.out.println("Result of if Statement");
	System.out.println("Do you have a pet with " +numberoflimbs +"limbs");
}

//if-else

if((numberoflimbs>0) && (numberoflimbs<=4) && !(numberoflimbs==1) && !(numberoflimbs==3))
{
	System.out.println("Result of if  -else Statement");
	System.out.println("You have a pet with" +numberoflimbs +"limbs");
}
else
{
	System.out.println("Result of if  -else Statement");
	System.out.println("You have a pet with "+numberoflimbs +"limbs");
}
//if else if
if((numberoflimbs>0) && (numberoflimbs<=4) && !(numberoflimbs==1) && !(numberoflimbs==3))
{
	System.out.println("Result of if  else if Statement");
	System.out.println("You got a bird/cat/Dog as pet");
}
else if(numberoflimbs==0  )
{
	System.out.println("You got a fish");
}
else 
{
	
	System.out.println("you dont have a pet");
}

//Short hand if elseTernary operator syntax:   variable=condition ? exp1:exp2

String result=((numberoflimbs>4) || ((numberoflimbs==3) || (numberoflimbs==1)))?"Not a Pet":"Mightbe Bird/DOG/CAT/FISH";
System.out.println(result);
}
}
