
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
public class BetterShapes {

	public static void main(String[] args)
	{
		printOutput();
		
		
	}    

	private static String choose_shape = "";
	private static String square = "";
	private static String tri = "";
	private static String trap = "";
	private static String circ = "";
	
	private static String height_ = "";
	private static String base_ = "";
	private static String tri_area = "";
	private static String square_area = "";
	private static String big_base = "";
	private static String small_base = "";
	private static String trap_area = "";
	private static String radius_ = "";
	private static String circle_area = "";
	

		
	public static void printOutput()
	{
		
		Scanner read = new Scanner(System.in);
		try
		{
			
			File files = new File("src/language.txt");
			Scanner sn = new Scanner(files);
			while(sn.hasNextLine())
			{
			String language1 = sn.nextLine();
			System.out.println(language1);
			}
			sn.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		int language1 = read.nextInt();
		while(language1 <= 0 || language1 > 10)
		{
			System.out.println("Please re-enter a number, from 1 to 10");
			language1 = read.nextInt();
		}
		
		
		
		try
		{
			File file = new File("src/" + language1 + ".txt");
		
			Scanner scn = new Scanner(file);
			
			while(scn.hasNextLine())
			{
				String line = scn.nextLine();
				

				String[] parts = line.split("=");
				if (parts[0].equalsIgnoreCase("CHOOSE_SHAPE"))
					choose_shape = parts[1];
				else if(parts[0].equalsIgnoreCase("SQUARE"))
					square = parts[1];
				else if(parts[0].equalsIgnoreCase("TRIANGLE"))
					tri = parts[1];
				else if(parts[0].equalsIgnoreCase("TRAPEZOID"))
					trap = parts[1];
				else if(parts[0].equalsIgnoreCase("CIRCLE"))
					circ = parts[1];
				else if(parts[0].equalsIgnoreCase("HEIGHT"))
					height_ = parts[1];
				else if(parts[0].equalsIgnoreCase("BASE"))
					base_ = parts[1];
				else if(parts[0].equalsIgnoreCase("TRI_AREA"))
					tri_area = parts[1];
				else if(parts[0].equalsIgnoreCase("SQUARE_AREA"))
					square_area = parts[1];
				else if(parts[0].equalsIgnoreCase("BIG_BASE"))
					big_base = parts[1];
				else if(parts[0].equalsIgnoreCase("SMALL_BASE"))
					small_base = parts[1];
				else if(parts[0].equalsIgnoreCase("TRAP_AREA"))
					trap_area = parts[1];
				else if(parts[0].equalsIgnoreCase("RADIUS"))
					radius_ = parts[1];
				else if(parts[0].equalsIgnoreCase("CIRCLE_AREA"))
					circle_area = parts[1];
				
			}
		
		scn.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		// NOW READ THE CORRESPONDING LANGUGE FILE
		
		
		System.out.println(choose_shape);
		System.out.println(square);
		System.out.println(tri);
		System.out.println(trap);
		System.out.println(circ);
		int shape = read.nextInt();
		
		if(shape == 2)
		{		
			System.out.println(height_);
			double height = read.nextInt();
			System.out.println(base_);
			double base = read.nextInt();
			double calcarea = (.5 * (base * height));
			System.out.println(tri_area);
			System.out.println(calcarea);
		}
				
		else if(shape == 1)	
		{
				System.out.println(height_);
				double height1 = read.nextInt();
				System.out.println(base_);
				double base1 = read.nextInt();
				double calcarea1 = (base1 * height1);
				System.out.println(square_area);
				System.out.println(calcarea1);
		}
				
		else if(shape == 3)
		{		
			System.out.println(height_);
			double height2 = read.nextInt();
			System.out.println(big_base);
			double bbase2 = read.nextInt();
			System.out.println(small_base);
			double sbase2 = read.nextInt();
			double calcarea2 = (.5 * (bbase2 + sbase2) * height2);
			System.out.println(trap_area);
			System.out.println(calcarea2);
		}
				
		else if(shape == 4)	
		{		System.out.println(radius_);
				double radius3 = read.nextInt();
				double calcarea3 = ((3.1415) * (radius3 * radius3));
				System.out.println(circle_area);
				System.out.println(calcarea3);
		}
		read.close();
	}
}
	
		
