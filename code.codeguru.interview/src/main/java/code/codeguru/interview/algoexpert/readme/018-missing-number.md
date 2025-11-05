# Missing Numbers

You're given an unordered list of unique integers `nums` in
the range `[1, n]`, where `n` represents the length of `nums + 2`. This means that two numbers in this range are missing from the list.

Write a function that takes in this list and returns a new list with the two missing numbers, sorted numerically.

## Sample Input

```text
nums = [1, 4, 3]
```

## Sample Output

```text
[2, 5] // n is 5,
meaning the completed list should be [1, 2, 3, 4, 5]
```

## Hints

- How would you solve this problem if there was only one missing number? Can that solution be applied to this problem with two missing numbers?
- To efficiently find a single missing number, you can sum up all of the values in the array as well as sum up all of the values in the expected array (i.e. in the range [1, n]).
  The difference between these values is the missing number.
- Using the same logic as for a single missing number, you can find the total of the two missing numbers. How can you then find which numbers these are?
- If you take an average of the two missing numbers, one of the missing numbers must be less than that average, and one must be greater than the average.
- Since we know there is one missing number on each side of the average, we can treat each side of the list as its own problem to find one missing number in that list.

## Test Cases

### Test Case 1

```text
{ "nums": [3, 1] }
```

### Test Case 2

```text
{ "nums": [1, 2, 3] }
```

### Test Case 3

```text
{ "nums": [3, 2, 1] }
```

### Test Case 4

```text
{ "nums": [3, 1, 2] }
```

### Test Case 5

```text
{ "nums": [3, 4, 5] }
```

### Test Case 6

```text
{ "nums": [4, 5, 3] }
```

### Test Case 7

```text
{ "nums": [1, 3, 4, 5] }
```

### Test Case 8

```text
{ "nums": [4, 5, 1, 3] }
```

### Test Case 9

```text
{ "nums": [1, 2, 4, 5, 7] }
```

### Test Case 10

```text
{ "nums": [1, 2, 7, 5, 4] }
```

### Test Case 11

```text
{ "nums": [1, 2, 3, 4, 5, 6, 7] }
```

### Test Case 12

```text
{ "nums": [7, 6, 5, 4, 3, 2, 1] }
```

### Test Case 13

```text
{ "nums": [3, 5, 1, 2, 4, 7, 6] }
```

### Test Case 14

```text
{ "nums": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 20, 21, 22] }
```

### Test Case 15

```text
{ "nums": [3, 5, 7, 8, 1, 10, 11, 2, 4, 13, 17, 22, 18, 21, 16, 20, 6, 9, 15, 12] }
```

### Test Case 16

```text
{ "nums": [3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22] }
```

### Test Case 17

```text
{ "nums": [14, 15, 16, 17, 18, 19, 20, 21, 22, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13] }
```

### Test Case 18

```text
{ "nums": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22] }
```

### Test Case 19

```text
{ "nums": [11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] }
```
