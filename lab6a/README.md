# Cat Mortar

## Problem Description

After changing the colors of the cats in Week 5A, Rar is back again to perform some more tricks involving mortars with the cats.

To perform the trick with the mortars, Rar first casts a spell onto a cat, making it almost as smart as the humans. The cat is placed at a starting point a, and cat treats are placed at ending point b. Multiple cat-friendly mortars are also placed near point a and b. The cat can choose to travel from a to b by either running straight from a to b, or run to a mortar and launch itself to somewhere else. From there, the cat can continue running towards point b, or it can continue to use other mortars to get there more quickly.

For example, given the following point a and b with the position of the mortars:

<img width="441" alt="Screenshot 2022-01-10 at 5 31 14 PM" src="https://user-images.githubusercontent.com/77873928/148743988-1b464b7d-6138-4ff0-a855-cd30469b1f94.png">

A cat can choose to follow a path to get from point a and b. Note that the arrows show places where the cat launch itself out of a mortar, and the lines show where it ran to the next mortar or to the destination.

<img width="393" alt="Screenshot 2022-01-10 at 5 31 32 PM" src="https://user-images.githubusercontent.com/77873928/148744009-7efe9de1-cd7c-450c-8a56-c59fe5c5feb9.png">

All of Rar's cats run at 5 meters per second. All mortars launch cats to a distance of 50 metres strictly in any direction it likes. Climbing into a mortar, launching itself, and landing takes a total of 2 seconds. (i.e. If a cat uses a mortar, it travels 50 meters strictly in 2 seconds). Mortars are not much of an obstacle to cats; they can jump over it without slowing them down if they choose to run over it.

Since the cats are as smart as the humans, they will travel from point a to the cat treats in point b in the shortest time as possible.

## Input

The first line gives a pair of real numbers ax and ay representing the coordinates of point a.

The next line gives a pair of real numbers bx and by representing the coordinates of point b.

The next line gives an integer n, representing the number of mortars available (0 <= n <= 100).

The next n lines contain a pair of real numbers ix and iy, representing the coordinates of the mortars  at the i-th line.

Note that all coordinates are measured in metres.

## Output

Print a single line of output, which contains the total number of seconds required for the cats to travel from point a to point b in the shortest amount of time. Your answer will be accepted if it is accurate to within 0.001 seconds.

## Warning

The I/O files are large. Please use fast I/O methods.

This is the second question out of the two released in Week 6A one-day assignment. You can attempt both questions, but only the best attempt out of the two questions will be reflected in your assignment grade.

## Time & Memory Limit

1 second, 256MB

## File Restriction

You should upload at least a file named CatMortar.java, and a CatMortar class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching Exception in the main function, if necessary.

Your main class should contain an public no-argument constructor (e.g. public CatMortar() {} )
