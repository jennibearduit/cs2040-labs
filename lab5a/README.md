# Rainbow Cats

## Problem Description

The hatred for cats has been rising ever since Week 4A. Rar, who is studying CS2040 right now, hated cats so much that he started to use cats in some of his magical experiments. Recently, he has mastered a colour changing spell, and he is going to try it out on some cats.

Rar has a row of N cats in front of him, numbered from 0 to N - 1. Initially, all the cats have red fur.
Rar will perform Q of the following two types of operations on the cats:

A colour change operation, with the input format 1 a b c. This means that Rar will change the fur colour of all cats from numbered a to b (inclusive) to colour c. c will be one of R, Y, B, G, representing red, yellow, blue, green respectively.
A query operation, with the input format 2 a. This means that Rar wants to know the fur colour of the cat numbered a.
Help Rar predict what the colours of his cats will be, by answering all the query operations correctly.

## Input

The first line of input will contain two integers N and Q, as defined above. It is guaranteed that 1 ≤ N ≤ 1,000,000,000 and 1≤Q ≤ 300,000.
The next Q lines of input will each contain one operation as defined above. It is guaranteed that a and b are integers, 0 ≤ a ≤ b <N and c will be one of R, Y, B, G for colour change operations, and 0 ≤ a <N for query operations.

## Output

There should be one line of output for every query operation, containing a single character (one of R, Y, B, G), denoting the colour of the cat.

## Warning

The I/O files are large. Please use fast I/O methods.

## Time & Memory Limit

2 seconds, 256MB

## File Restriction

You should upload at least a file named RainbowCats.java, and a RainbowCats class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching Exception in the main function, if necessary.

Your main class should contain an public no-argument constructor (e.g. public RainbowCats() {} )

## Notes

The CS2040 teaching team do not endorse animal abuse.

No cats have been harmed in the making of this programming question.

Below is a picture of TA Tzerbin's co-owned cat for you to enjoy.
