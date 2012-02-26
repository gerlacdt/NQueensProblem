package de.schach;

public class Main {
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("USAGE: nqueens <checkboard_size>  (normal checkboard_size is 8");
		} else {
			int checkboard_size = Integer.parseInt(args[0]);
			NQueensAlgorithm nQueensAlgorithm = new NQueensAlgorithm();
			nQueensAlgorithm.execute(checkboard_size);
		}
	}
}
