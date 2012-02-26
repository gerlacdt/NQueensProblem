# Description

This project calculates all possible solutions for the
[nqueens](http://en.wikipedia.org/wiki/Eight_queens_puzzle) problem
and prints the solution to stdout.

You can build the project with:

    > cd ${PROJECT_HOME}
    > ant

The executable jar is in:

${PROJECT_HOME}/build/jar/

Then you can start the performance test with:

     > java -jar nqueens.jar "checkboard_size"

The normal checkboard size is 8.

The smallest board_size is 4. Executing 

    > java -jar nqueens.jar 4

will print:

X X Q X 0 
Q X X X 1 
X X X Q 2 
X Q X X 3 
0 1 2 3 

X Q X X 0 
X X X Q 1 
Q X X X 2 
X X Q X 3 
0 1 2 3 
counted solutions: 2

The "Q"s indicate where the queens are placed.
