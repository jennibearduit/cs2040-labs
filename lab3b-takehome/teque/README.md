# Question 2: Teque

## Problem Description

You have probably heard about the deque (double-ended queue) data structure, which allows for efficient pushing and popping of elements from both the front and back of the queue. Depending on the implementation, it also allows for efficient random access to any index element of the queue as well. Now, we want you to bring this data structure up to the next level, the teque (triple-ended queue)!

The teque supports the following four operations:

push_back x: insert the element x into the back of the teque.
push_front x: insert the element x into the front of the teque.
push_middle x: insert the element x into the middle of the teque. The inserted element x now becomes the new median element of the teque, where the median is defined as the ( (size of teque) + 1 ) / 2 indexed element (0-based).
get i: prints out the ith index element (0-based) of the teque.

## Input

The first line contains an integer N (1 ≤ N ≤ 106) denoting the number of operations for the teque. Each of the next N lines contains a string S, denoting one of the above commands, followed by one integer x. If S is a push_back, push_front, or push_middle command, x (1 ≤ x ≤ 109), else for a get command, i (0 ≤ i ≤ (size of teque) − 1). We guarantee that the teque is not empty when any get command is given.

## Output

For each get i command, print the value inside the ith index element of the teque in a new line.

## Warning

The I/O files are large. Please use fast I/O methods.

## Hints

If you failed any private test cases, consider the following:

Have you covered all corner cases?
Data structure that supports fast insertion from back and random access is needed.
Data structure that supports fast insertion from front and random access is needed.
You will need to use the best possible data structure(s)/algorithm(s) to handle large test cases.

## Time & Memory Limit

2 seconds, 256MB

## File Restriction

You should upload at least a file named Teque.java, and a Teque class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching any Exception, if necessary. 
