package com.lineComparisonProblem;

public class LineComparison {
	
	public static void main(String args[]) {

		Line line1 = new Line(2,4,8,5);
		Line line2 = new Line(4,4,6,5);
		
		int lineDifference = line1.length().compareTo(line2.length());
		
		if (lineDifference == 0) {
			System.out.println("Both the lines are equal");
		}
		else if(lineDifference > 0){
			System.out.println("Line 1 is greater by " + lineDifference);
		}
		else {
			System.out.println("Line 2 is greater by " + Math.abs(lineDifference));
		}
		
		
	}

}
