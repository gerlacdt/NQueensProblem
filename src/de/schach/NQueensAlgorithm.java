package de.schach;

import java.util.ArrayList;
import java.util.List;

public class NQueensAlgorithm {
	
	private int numberOfSolutions = 0;

	public void execute(int numberOfFields) {

		List<Point> points = new ArrayList<Point>();
		// initialize arraylist
		for (int i = 0; i < numberOfFields; i++) {
			points.add(new Point(0, 0));
		}
		// start algorithm in column 0 and with initialize point-list
		backtrack(0, points);
		System.out.println("\ncounted solutions: " + numberOfSolutions);
	}

	public void backtrack(int currentColumn, List<Point> points) {
		Checkboard brett;
		Point currentPoint;
		// go column for column and place one queen on this column such that
		// this queen not intersect with the queens placed before
		for (int i = 0; i < points.size(); i++) {
			currentPoint = new Point(currentColumn, i);
			// test if currentPoint fits in field
			if (isFree(currentColumn, currentPoint, points)) {
				// add queen-place to pointarray
				points.set(currentColumn, currentPoint);
				if (currentColumn == points.size() - 1) {
					// solution found; print Field
					System.out.println("\n");
					brett = new Checkboard(points, points.size());
					brett.print();
					numberOfSolutions++; // count all solutions
				} else {
					backtrack(currentColumn + 1, points); // place one queen
					// more on field
				}
			}
		}
	}

	private boolean isFree(int currentColumn, Point pointToTest,
			List<Point> points) {
		Point currentPoint;
		for (int i = 0; i < currentColumn; i++) {
			// test every queen placed before if they interfere with current
			// queen
			currentPoint = points.get(i);
			if (currentPoint.doInterfere(pointToTest)) {
				return false;
			}
		}
		return true;
	}
	
	public int getNumberOfSolutions() {
		return numberOfSolutions;
	}
}
