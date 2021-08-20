package com.lineComparisonProblem;

public class LineComparison {
	
	public static void main(String args[]) {

		int x1 = 5;
		int x2 = 2;
		int y1 = 3;
		int y2 = 1;
		
		int lengthOfLine = (int) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println("The length of the line is " + lengthOfLine);
	}

}
