package com.questionno3;
import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {

		//Creating array list to store the values of array
		ArrayList<Integer> array = new ArrayList<>();
		
		//inserting values to a array list
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		
		//retrieve all Odd numbers and store in a list
		List<Integer> oddNumbers = array.stream().filter(temp -> temp%2!=0).toList();
		
		//square those number and store those in a list
		List<Integer> squareNumbers = oddNumbers.stream().map(temp -> temp*temp).toList();
		
		//Finding sum of those squares
		int sum = squareNumbers.stream().mapToInt(temp -> temp).sum();
	
		//Printing all the results
		System.out.println("INPUT : "+array);
		System.out.println("ODD NUMBERS : "+oddNumbers);
		System.out.println("SQUARE NUMBERS : "+squareNumbers);
		System.out.println("SUM : "+sum);
		
	}

}