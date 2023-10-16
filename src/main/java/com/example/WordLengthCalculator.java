package com.example;

import java.util.Scanner;

public class WordLengthCalculator {
	    public static void main(String[] args) {
		            Scanner scanner = new Scanner(System.in);

			            System.out.print("Enter a word: ");
				            String inputWord = scanner.nextLine();

					            int wordLength = inputWord.length();

						            System.out.println("Length of the word is: " + wordLength);

							            scanner.close();
								        }
}
