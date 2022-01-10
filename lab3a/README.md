# Sort of Sorting

## Program Description

Can you believe school has already started? It seems like we were just finishing last semester. Last semester was tough because the administration had a hard time keeping records of all the students in order, which slowed everything down. This year, they are going to be on top of things. They have recognized that you have the skills to help them get into shape with your programming ability, and you have volunteered to help. You recognize that the key to getting to student records quickly is having them in a sorted order. However, they don’t really have to be perfectly sorted, just so long as they are sort-of sorted.

Write a program that sorts a list of student last names, but the sort only uses the first two letters of the name. Nothing else in the name is used for sorting. However, if two names have the same first two letters, they should stay in the same order as in the input (this is known as a ‘stable sort’). Sorting is case sensitive based on ASCII order (with uppercase letters sorting before lowercase letters, i.e., A < B < … < Z < a < b < … < z).

## Input

Input consists of a sequence of up to 500 test cases. Each case starts with a line containing an integer 1 ≤ n ≤ 200. After this follow n last names made up of only letters (a–z, lowercase or uppercase), one name per line. Names have between 2 and 20 letters. Input ends when n = 0.

## Output

For each case, print the last names in sort-of-sorted order, one per line. Print a blank line between cases.

## Time & Memory Limit

2 seconds, 256MB

## File Restriction

You should upload at least a file named SortOfSorting.java, and a SortOfSorting class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching any Exception, if necessary. 
