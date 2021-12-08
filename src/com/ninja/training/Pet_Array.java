package com.ninja.training;
import java.util.Arrays;

public class Pet_Array {

	public static void main(String[] args) {
		String[] petanimals= {"fish","parrot","bunny","cat","dog"};
		String[] name= {"silver","max","Bunn","muthu","Scooby"};
		int[] nooflimbs= {0,2,3,4,4};
		int[] petweight= {10,50,500,1000,5000};
		int index = Arrays.binarySearch(petanimals, "bunny");
		System.out.println("index is"+index);
		int bunnyweight=petweight[index];
		System.out.println(" Bunny weight is "+bunnyweight);
		for(int position=0;position<petanimals.length;position++)
		{
		System.out.println("pet animals name as in array index"+position +" is " +petanimals[position]);
		}
	//For -each loop	Syn:	for(type variablename:arrayname) {  }
	
		for(String individualpetname:name)
		{
			System.out.println("Pet Name is : "+individualpetname); 
		}
		
	}}


