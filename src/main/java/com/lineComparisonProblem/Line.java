package com.lineComparisonProblem;

public class Line {
	
	int x1, x2, y1, y2;
	
	Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public String length() {
		int lengthOfLine = (int) Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		return "" + lengthOfLine;
	}
	

}
