# Cat Infection

## Problem Description

It is common for cats to have puncture wounds with different severity of infections. To help her local neighbourhood, Dr. Chaka decided to open a clinic! However, there are too many injured cats that come so she needs to prioritise her patients.

Given the names of N injured cats, their level of severity, and subsequent updates of their infection level, determine which cat Dr. Chaka needs to give her most attention to.

A cat with higher infection level has higher priority. If there are more than one cat with the same infection level, Dr. Chaka will give priority to the cat who arrived at the clinic first.

There will be 4 types of commands:

ArriveAtClinic(catName, infectionLevel)
This will be indicated by a starting integer 0 followed by catName and infectionLevel.
The cat names are all unique.
infectionLevel is an integer (30 ≤ infectionLevel ≤ 100).
 e.g. 0 LUNA 31

UpdateInfectionLevel(catName, increaseInfection)
This will be indicated by a starting integer 1 followed by catName and increaseInfection.
catName is guaranteed to have already arrived at clinic.
increaseInfection is an integer (0 ≤ increaseInfection ≤ 70).
It is guaranteed that update infection commands are given in such a way that the overall infection level of any cat will not exceed 100 (i.e. the infection level of each cat has a maximum value of 100).
e.g. 1 LUNA 24

Treated(catName)
This will be indicated by a starting integer 2 followed by catName.
catName is guaranteed to have already arrived at the clinic.
catName leaves the clinic after being treated.
e.g. 2 KITTY

Query()
This will be indicated by a single integer 3.
Your job is to print the catName with the highest infection level or “The clinic is empty” if there are no more cats.
e.g. 3

## Input

The first line of input contains an integer N, denoting the number of commands (1 ≤ N ≤ 1000000). There will be up to 200000 cats. This will be followed by N commands as described above in the Problem Description.

## Output

Each time the Query() command is encountered, the catName with highest infection level or “The clinic is empty” is to be printed in one line.


## Warning

The I/O files are large. Please use fast I/O methods.

## Time & Memory Limit

4 second, 256MB

## File Restriction

You should upload at least a file named CatInfection.java, and a CatInfection class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.

Your main function should not throw an Exception, and you should handle catching Exception in the main function, if necessary.

Your main class should contain an public no-argument constructor (e.g. public CatInfection() {} )
