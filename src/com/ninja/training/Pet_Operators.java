package com.ninja.training;

public class Pet_Operators {

	public static void main(String[] args) {
		System.out.println("\nSUM AND DIFFERENCE");
		int catLimbs, combinedLimbs;
		int dogLimbs = catLimbs = 4, parrotLimbs = 2;

		combinedLimbs = catLimbs + dogLimbs + parrotLimbs;
		System.out.println("Combined Pet Limbs is : " + combinedLimbs);

		int catWeight = 5000, dogWeight = 10000;
		int differenceInWeight = dogWeight - catWeight;
		System.out.println("Pet Weight Difference is : " + differenceInWeight);

		// ---------------------------------------
		// Product, Division
		System.out.println("\nPRODUCT AND DIVISION");
		int noOfFishes = 15, fishWeight = 200;
		int totalFishWeight = noOfFishes * fishWeight;
		System.out.println("The total Weight in grams of " + noOfFishes + " is " + totalFishWeight);

		int gramsPerKg = 1000;
		System.out.println("The total weight of Fish in Kilogram is " + (totalFishWeight / gramsPerKg));

		// ---------------------------------------
		// Modulus Operator
		System.out.println("\nMODULUS");
		int fishWeightKg = totalFishWeight / gramsPerKg;
		int fishWeightGrams = totalFishWeight % gramsPerKg;
		System.out.println("My fishes weight : " + fishWeightKg + " kg [Using Division] and " + fishWeightGrams
		+ " grams [Using Modulus]");
		System.out.println("\nCOMPARISON");
		boolean isDogHeavierThanCat = dogWeight > catWeight;

		System.out.println("Is Dog Heavier? " + isDogHeavierThanCat);
		System.out.println("Is Cat Heavier? " + (dogWeight < catWeight));
		// Note to check equality, we use == AND NOT =
		// == is a comparison operator
		// = is an assignment operator
		boolean isCatLimbsEqualsParrotLimbs = (catLimbs == parrotLimbs);
		System.out.println(" Is catLimbs (" + catLimbs + ") equals parrotLimbs : " + isCatLimbsEqualsParrotLimbs);

		// ---------------------------------------
		// Logical Operator
		/*
		* && -> Logical AND || -> Logical OR | -> Logical NOT
		*/
		
		System.out.println("\nLOGICAL OPERATOR");
		boolean isDogHeaviest = dogWeight >= catWeight && dogWeight >= fishWeight;
		System.out.println("Is Dog heavier than cat and fish ? " + isDogHeaviest);

		boolean isCatHeavy = catWeight >= dogWeight || catWeight >= fishWeight;
		System.out.println("Is cat heavier than dog or fish or both? " + isCatHeavy);

		boolean isFishLessThanKilo = !(fishWeight > gramsPerKg); // Same as fishWeight <= gramsPerKg
		System.out.println(" Is combined age of pets not greater than 10 ? " + isFishLessThanKilo);
		} // End of Main Method
		 // End of Class

	}


