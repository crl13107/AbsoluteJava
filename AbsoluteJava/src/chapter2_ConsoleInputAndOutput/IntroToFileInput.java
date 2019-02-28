package chapter2_ConsoleInputAndOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IntroToFileInput {

	public static void main(String[] args) {

		Scanner fileIn = null;
		String fileName = "player.txt";
		try {
			fileIn = new Scanner(new FileInputStream(fileName));
		} 
		
		catch (FileNotFoundException e) 
		{
			
			System.out.println("File not found");
			System.exit(0);
		}
		
		int highscores;
		String name = "hell";
		
		System.out.println("Text left to read? " + fileIn.hasNextLine());
		highscores = fileIn.nextInt();
		
		System.out.println("Name: " + name);
		System.out.println("High score: " + highscores);
		System.out.println("Text left to read?" + fileIn.hasNextLine());
		fileIn.close();
		
		
	}
}
