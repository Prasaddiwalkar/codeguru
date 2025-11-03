# Smallest Difference

Write a function that takes in two non-empty arrays of integers, finds the pair of numbers (one from each array)
whose absolute difference is closest to zero, and returns an array containing these two numbers, with the number from the first array in the first position.

Note that the absolute difference of two integers is the distance between them on the real number line.
For example, the absolute difference of -5 and 5 is 10, and the absolute difference of -5 and -4 is 1.

You can assume that there will only be one pair of numbers with the smallest difference.

## Sample Input

```text
arrayOne = [-1, 5, 10, 20, 28, 3]
arrayTwo = [26, 134, 135, 15, 17]
```

## Sample Output

```text
[28, 26]
```

## Hints

- Instead of generating all possible pairs of numbers, try somehow only looking at pairs that you know could actually have the smallest difference.
- How can you accomplish this?
- Would it help if the two arrays were sorted?
- If the arrays were sorted and you were looking at a given pair of numbers, could you efficiently find the next pair of numbers to look at?
- What are the runtime implications of sorting the arrays?
- Start by sorting both arrays, as per Hint #2.
- Put a pointer at the beginning of both arrays and evaluate the absolute difference of the pointer-numbers.
- If the difference is equal to zero, then you've found the closest pair; otherwise, increment the pointer of the smaller of the two numbers to find a potentially better pair.
- Continue until you get a pair with a difference of zero or until one of the pointers gets out of range of its array.

**Optimal Space & Time Complexity:**
O(nlog(n) + mlog(m)) time | O(1) space - where n is the length of the first input array and m is the length of the second input array

## Test Cases

Test Case 1

```json
{
  "arrayOne": [-1, 5, 10, 20, 28, 3],
  "arrayTwo": [26, 134, 135, 15, 17]
}
```

Test Case 2

```json
{
  "arrayOne": [-1, 5, 10, 20, 3],
  "arrayTwo": [26, 134, 135, 15, 17]
}
```

Test Case 3

```json
{
  "arrayOne": [10, 0, 20, 25],
  "arrayTwo": [1005, 1006, 1014, 1032, 1031]
}
```

Test Case 4

```json
{
  "arrayOne": [10, 0, 20, 25, 2200],
  "arrayTwo": [1005, 1006, 1014, 1032, 1031]
}
```

Test Case 5

```json
{
  "arrayOne": [10, 0, 20, 25, 2000],
  "arrayTwo": [1005, 1006, 1014, 1032, 1031]
}
```

Test Case 6

```json
{
  "arrayOne": [240, 124, 86, 111, 2, 84, 954, 27, 89],
  "arrayTwo": [1, 3, 954, 19, 8]
}
```

Test Case 7

```json
{
  "arrayOne": [0, 20],
  "arrayTwo": [21, -2]
}
```

Test Case 8

```json
{
  "arrayOne": [10, 1000],
  "arrayTwo": [-1441, -124, -25, 1014, 1500, 660, 410, 245, 530]
}
```

Test Case 9

```json
{
  "arrayOne": [10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123],
  "arrayTwo": [-1441, -124, -25, 1014, 1500, 660, 410, 245, 530]
}
```

Test Case 10

```json
{
  "arrayOne": [10, 1000, 9124, 2142, 59, 24, 596, 591, 124, -123, 530],
  "arrayTwo": [-1441, -124, -25, 1014, 1500, 660, 410, 245, 530]
}
```
