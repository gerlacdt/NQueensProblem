package de.schach;

import java.util.List;

public class Checkboard {

	boolean fields[][];
	int numberOfFields;

	public Checkboard(int n) {
		this.fields = new boolean[n][n]; // all set to false
		this.numberOfFields = n;
	}

	public Checkboard(List<Point> points, int n) {
		assert (points.size() == n);
		this.numberOfFields = n;
		this.fields = new boolean[n][n];
		
		// set fields to the given points
		for (Point p : points) {
			fields[p.getX()][p.getY()] = true;
		}
	}

	public void setQueen(Point p) {
		fields[p.getX()][p.getY()] = true;
	}

	public void unsetQueen(Point p) {
		fields[p.getX()][p.getY()] = false;
	}

	public boolean getField(Point p) {
		return fields[p.getX()][p.getY()];
	}

	public void print() {
		for (int i = 0; i < numberOfFields; i++) {
			if (i == 0) {

			} else {
				System.out.println();
			}
			for (int j = 0; j < numberOfFields; j++) {
				if (fields[j][i]) {
					System.out.print("Q ");
				} else {
					System.out.print("X ");
				}
				if (j == numberOfFields - 1) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < numberOfFields; i++) {
			System.out.print(i + " ");
		}
	}
}
