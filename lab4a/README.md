# Boxes

## Problem Description

Cats like to sit in cardboard boxes. Hence, Rar the Cat and his friends bought a total of R * C identical cardboard boxes and arranged them in a grid formation of R rows and C columns. For ease of reference, the rows are numbered from 0 to R - 1 from top to bottom and the columns are numbered from 0 to C - 1 from left to right. Each box also has a coordinate equals to the row number and the column number of the box. For example, given below is how the boxes will look like if R = 2 and C = 5. The values in the boxes are the coordinates of the box.

(0, 0)	(0, 1)	(0, 2)	(0, 3)	(0, 4)
(1, 0)	(1, 1)	(1, 2)	(1, 3)	(1, 4)

Cats do not like to share boxes. Some very picky cats don’t even like to share the entire row or column of boxes with other cats. As the number of boxes increases, he has difficulty managing the usage of these boxes such that no two cats will accidentally end up sitting in the same box. Hence, he envisions to have a system that supports the below operations to help him:

SIT x y
Records that a cat is now sitting in the box with coordinate (x, y).
It is guaranteed there is no existing cat in the box with coordinate (x, y).
BOX x y
Checks if there is a cat sitting in the box with coordinate (x, y).
ROW x
Checks if there is a cat sitting in any of the boxes in row x.
COL y
Checks if there is a cat sitting in any of the boxes in column y.
Input

The first line of input will contain integers Q (1 ≤ Q ≤ 100,000), R and C (1 ≤ R, C ≤ 109), the number of operations to be performed on the system, the number of rows of boxes and the number of columns of boxes respectively. Q lines will follow, representing an operation each. The operations should be executed in order and the format would be as described above, where x and y are integers, 0 ≤ x < R and 0 ≤ y < C.

## Output

You do not have to output anything for the SIT command.

For BOX command, output ‘Y’ if there is a cat in the box with coordinate (x, y) and ‘N’ if there isn’t.

For ROW command, output ‘Y’ if there is a cat in any one of the boxes in row x and ‘N’ if there isn’t.

For COL command, output ‘Y’ if there is a cat in any one of the boxes in column y and ‘N’ if there isn’t.

## Warning

The I/O files are large. Please use fast I/O methods.

## Time & Memory Limit

2 seconds, 256MB

## File Restriction

You should upload at least a file named Boxes.java, and a Boxes class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching Exception in the main function, if necessary.

Your main class should contain an public no-argument constructor (e.g. public Boxes() {} )
