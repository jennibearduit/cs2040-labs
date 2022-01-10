# Train Passengers

## Problem Description

The Nordic Company of Passing Carriages is losing money at an alarming rate because most of their trains are empty. However, on some lines the passengers are complaining that they cannot fit in the cars and have to wait for the next train!

The authorities want to fix this situation. They asked their station masters to write down, for a given train, how many people left the train at their station, how many went in, and how many had to wait. Then they hired your company of highly paid consultants to assign properly sized trains to their routes.

You just received the measurements for a train, but before feeding them to your optimisation algorithm you remembered that they were collected on a snowy day, so any sensible station master would have preferred to stay inside their cabin and make up the numbers instead of going outside and counting.

Verify your hunch by checking whether the input is inconsistent, i.e., at every time the number of people in the train did not exceed the capacity nor was below 0 and no passenger waited in vain (i.e., waited on the station when there was room in the train). The train should start and finish the journey empty, in particular passengers should not wait for the train at the last station.

## Input

The first line contains two integers C and n, the total capacity and the number of stations the train stops in, where 1 ≤ C ≤ 109, 2 ≤ n ≤ 100.The next n lines contain three integers each, the number of people that left the train, entered the train, and had to stay at a station. Lines are given in the same order as the train visits each station. All integers are between 0 and 109 inclusive.

## Output

One line containing one word: possible if the measurements are consistent, impossible otherwise.

## Time & Memory Limit

1 second, 256MB

## File Restriction

You should upload at least a file named TrainPassengers.java, and a TrainPassengers class in the .java file.

You should not amend any existing lines that is given in the skeleton file. You can, however, add code into the file.

However, you can remove the Kattio class, if you wish.
