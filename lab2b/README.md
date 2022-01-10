# Quick Brown Fox

## Problem Description

A pangram is a phrase that includes at least one occurrence of each of the 26 letters, ‘a’…‘z’. You’re probably familiar with this one: “The quick brown fox jumps over the lazy dog.”

Your job is to recognize pangrams. For phrases that don’t contain every letter, report what letters are missing. We’ll say that a particular letter occurs in the phrase if it occurs as either upper case or lower case.

## Input

Input starts with a line containing an integer 1 <= N <= 50. The next N lines are each a single phrase, possibly containing upper and lower case letters, spaces, decimal digits and punctuation characters ., ,, ?, !, ' and ". Each phrase contains at least one and no more than 100 characters.

## Output

For each input phrase, output “pangram” if it qualifies as a pangram. Otherwise, output the word “missing” followed by a space and then the list of letters that didn’t occur in the phrase. The list of missing letters should be reported in lower case and should be sorted alphabetically.

## Time & Memory Limit

1 second, 256MB

## File Restriction

You should upload at least a file named QuickBrownFox.java, and a QuickBrownFox class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.
