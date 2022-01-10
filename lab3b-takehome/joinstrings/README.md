# Join Strings

## Problem Description

You are given a collection of N non-empty strings, denoted by S1, S2, …, Sn. Then you are given N-1 operations which you execute in the order they are given. The ith operation is has the following format: ‘a b’ (1-based indexing, without the quotes), which means that you have to make the following changes:

Sa = Sa + Sb, i.e. concatenate ath string and bth string and store the result in ath string,

Sb = "", i.e. make the bth string empty, after doing the previous step.

You are ensured that after the ith operation, there will be no future operation that will be accessing Sb. Given these operations to join strings, print the last string that will remain at the end of this process.

## Input

The first line contains an integer N (1 ≤ N ≤ 105) denoting the number of strings given. Each of the next N lines contains a string denoting the Si. All the characters in the string Si are lowercase alphabets from ‘a’ to ‘z’. The total number of characters over all the strings is at most 106, i.e |S1| + |S2| + ... + |Sn| ≤ 106,  where |S1|, |S2|, ..., |Sn| denotes the length of each string. After these N strings, each of the next N-1 lines contain two integers a and b, such that a ≠ b and 1 ≤ a,b ≤ N denoting the ith operation.

## Output

Print the last string which remains at the end of the N-1 operations.

## Warning

The I/O files are large. Please use fast I/O methods.

## Time & Memory Limit

1 second, 256MB

## File Restriction

You should upload at least a file named JoinStrings.java, and a JoinStrings class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching any Exception, if necessary. 

