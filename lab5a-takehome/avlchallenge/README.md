# AVL Tree Challenge Part I

## Problem Description

In lecture, a basic Binary Search Tree (BST) implementation and the various cases of rotations in an AVL tree was covered. However, the implementation of those rotations was left as an exercise to the reader. This question is the exercise. In this question, you will have to implement the rotations for an AVL tree. For simplicity, you do not need to support any delete operations.

In summary, you need to implement an AVL tree that supports the following operations:

I x
Insert x into the AVL tree.

P x
Get the largest element in the AVL tree smaller than x, also known as the predecessor of x and output the value.

S x
Get the smallest element in the AVL tree larger than x, also known as the successor of x and output the value.
All the operations should run in O(log N) time where N is the number of elements in the BST.

In addition, print all the elements left in the BST at the end of all the operations in increasing order. This should be done in O(N) time. It is guaranteed there will be at least one element in the BST at the end of all the operations. 

## Input

The first line of input contains an integer Q. It is guaranteed that 1 ≤ Q ≤ 200000.

Q lines will follow, representing an operation each. The operations should be executed in order and the format of the operations is described in the Program Description. It is guaranteed that:

x is an integer, where 1 ≤ x ≤ 109.
For the operation I x, it Is guaranteed the element x does not currently exist in the AVL tree.
For the operation P x, it is guaranteed that x currently exists in the AVL tree and x is not the smallest element.
For the operation S x, it is guaranteed that x currently exists in the AVL tree and x is not the largest element.

## Output

For each P x and S x operation, output the element.

At the end of all Q operations, output all the elements left in the AVL Tree at the end of all the operations in increasing order. Add a single space between two consecutive values. Print a space before the first value and do not print a space after the last value. Instead, remember to print an end-line character at the end of the output.

## Warning

The I/O files are large. Please use fast I/O methods.

You should develop your program by either extending the BST class given in lecture provided in BST.java, or create your AVL tree class from scratch.

You are NOT allowed to import any additional Java classes. Your marks will be overridden to 0 if you do not implement your own AVL tree.

This programming question is worth 0.6% of your CS2040 grade, instead of the usual 1%.

## Time & Memory Limit

3 second, 256MB

## File Restriction

You should upload at least a file named AvlChallenge.java, and a AvlChallenge class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching Exception in the main function, if necessary.

Your main class should contain an public no-argument constructor (e.g. public AvlChallenge() {} )

# AVL Tree Challenge Part II

## Problem Description

You should complete the AVL Tree Challenge Part I in Week 5A Take Home Assignment, before attempting this challenge.

One of the operations not provided by the Java API for TreeSet is the getRank() operation. This allows to get the rank of an element in a BST of N elements where 1 is rank of the smallest element and N is the rank of the largest element. In this exercise, you will extend your implementation of AVL tree from the previous challenge to support this operation.

In summary, you need to implement an AVL tree that supports the following operations:

I x
Insert x into the AVL tree.

R x
Get the rank of x in the AVL tree

All the operations should run in O(log N) time where N is the number of elements in the BST.

In addition, print all the elements left in the BST at the end of all the operations in increasing order. This should be done in O(N) time. It is guaranteed there will be at least one element in the BST at the end of all the operations. 

## Input

The first line of input contains an integer Q. It is guaranteed that 1 ≤ Q ≤ 200000.

Q lines will follow, representing an operation each. The operations should be executed in order and the format of the operations is described in the Program Description. It is guaranteed that:

x is an integer, where 1 ≤ x ≤ 109.
For the operation I x, it Is guaranteed the element x does not currently exist in the AVL tree.
For the operation R x, it is guaranteed that x currently exists in the AVL tree.

## Output

For each R x operation, output the rank.

At the end of all Q operations, output all the elements left in the AVL Tree at the end of all the operations in increasing order. Add a single space between two consecutive values. Print a space before the first value and do not print a space after the last value. Instead, remember to print an end-line character at the end of the output.

## Warning

The I/O files are large. Please use fast I/O methods.

You should develop your program by extending your program submitted in AVL Tree Challenge Part I in Week 5A Take Home Assignment.

You are NOT allowed to import any additional Java classes. Your marks will be overridden to 0 if you do not implement your own AVL tree.

This programming question is worth 0.4% of your CS2040 grade, instead of the usual 1%.

## Time & Memory Limit

3 second, 256MB

## File Restriction

You should upload at least a file named AvlChallenge.java, and a AvlChallenge class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching Exception in the main function, if necessary.

Your main class should contain an public no-argument constructor (e.g. public AvlChallenge() {} )
