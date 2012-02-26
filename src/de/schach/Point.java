package de.schach;

public class Point {

	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean doInterfere(Point other) {

		// Points are on the same height or diagonal
		if ((this.getY() == other.getY()) || this.getX() == other.getX()
				|| (Math.abs(this.getX() - other.getX()) == Math.abs(this
						.getY() - other.getY()))) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "x: " + this.x + " ; y: " + this.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
