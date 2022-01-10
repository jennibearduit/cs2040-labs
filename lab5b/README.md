# Cat Neighbours

## Problem Description

A bunch of N cats have taken over a H by W units wide space. They have divided it into blocks of 1 by 1 unit and each block is 'owned' by 1 cat. However, a cat can own more than one block and the blocks a cat owned need not be adjacent.

Cats hate socialising with their neighbours but are still curious about how many neighbours they have.

If two cats own blocks which share an edge (not corner), they are known to be neighbours with each other. In other words, if two blocks are adjacent in 4-directional movement, the owners of these two blocks will be neighbours with each other.

Cats are labelled from 0 to N-1 and you will be provided with a H by W map denoting which cat owns which block.

For each cat, output the number of neighbours it has! It is possible that a cat happen to not own any blocks. In that case, it will have 0 neighbours.

## Input

The first line of input will contain 3 integers H, W, N (1 ≤ H, W ≤ 1000, 1 ≤ N ≤ 1,000,000).

It is then followed by H lines containing W integers each. Each integer will be between 0 and N-1, which represents who is the owner of that block.

## Output

The output should contain N integers, where the i-th integer is the number of neighbours cat i has, where 0 ≤ i ≤ N-1.

## Warning

The I/O files are large. Please use fast I/O methods.

## Time & Memory Limit

4 seconds, 256MB

## File Restriction

You should upload at least a file named CatNeighbours.java, and a CatNeighbours class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching Exception in the main function, if necessary.

Your main class should contain an public no-argument constructor (e.g. public CatNeighbours() {} )
