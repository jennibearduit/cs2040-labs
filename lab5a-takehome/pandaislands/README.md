# Panda Islands

## Problem Description

Mr Panda has recently bought N icy islands and has decided to repaint them with a chess theme! Since he is panda, he wishes to paint every island either black or white. Also, everyone knows that on a chessboard, white squares aren't next to white squares and black squares aren't next to black squares. Thus, in a similar vein, if two islands are connected by a bridge, one of them must be black and the other must be white. Also, since icy islands are already white (or at least, whitish), Mr Panda only needs to buy some black paint now. Help him find the minimum amount of black paint he needs! 

You are given the area of each island (in terms of Pm2, Panda metres squared) as well as a list of which islands are connected by bridges. Thus, output the minimum amount of area in Pm2 which needs to be painted black.

## Input

On the first line are integers N and E, where N is the number of icy islands and E is the number of bridges. (1 ≤ N ≤ 50,000, 1 ≤ E ≤ 300,000)

The next N lines each contain one integer X, with the i-th line representing the area of the island numbered i. (1 ≤ X ≤ 40,000)

The next E lines each contain two integers A and B, meaning that islands A and B are connected by a bridge. Note that the islands are 1-indexed, i.e. 1 ≤ A, B ≤ N

It is guaranteed that there is a way to paint the islands such that no two connected islands have the same colour.

It is NOT guaranteed that all islands are connected.

## Output

Output consists of a single line containing S, the minimum area which needs to be painted black, in Pm2.

## Warning

The I/O files are large. Please use fast I/O methods.

If you use recursive-based algorithms, you will not be able to pass all test cases. Please use non-recursive-based algorithms instead.

## Time & Memory Limit

2 second, 256MB

## File Restriction

You should upload at least a file named PandaIslands.java, and a PandaIslands class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching Exception in the main function, if necessary.

Your main class should contain an public no-argument constructor (e.g. public PandaIslands() {} )
