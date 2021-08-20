package com.lineComparisonProblem;

public class LineComparison {
	
	public static void main(String args[]) {

		Line line1 = new Line(2,4,4,5);
		Line line2 = new Line(4,4,6,5);
		
		if (line1.length().equals(line2.length())) {
			System.out.println("The lines are equal");
		}
		else {
			System.out.println("Lines are not equal");
		}
		
	}

}
