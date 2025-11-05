# Zero Sum Subarray

You're given a list of integers `nums`. Write a function that returns a boolean representing whether there exists a zero-sum subarray of `nums`.

A zero-sum subarray is any subarray where all of the values add up to zero. A subarray is any contiguous section of the array.
For the purposes of this problem, a subarray can be as small as one element and as long as the original array.

## Sample Input

```text
nums = [-5, -5, 2, 3, -2]
```

## Sample Output

```text
True // The subarray [-5, 2, 3] has a sum of 0
```

## Optimal Space & Time Complexity

O(n) time | O(n) space - where n is the length of nums

## Test Cases

### Test Case 1

```text
{ "nums": [] }
```

### Test Case 2

```text
{ "nums": [0] }
```

### Test Case 3

```text
{ "nums": [1] }
```

### Test Case 4

```text
{ "nums": [1, 2, 3] }
```

### Test Case 5

```text
{ "nums": [1, 1, 1] }
```

### Test Case 6

```text
{ "nums": [-1, -1, -1] }
```

### Test Case 7

```text
{ "nums": [0, 0, 0] }
```

### Test Case 8

```text
{ "nums": [1, 2, -2, 3] }
```

### Test Case 9

```text
{ "nums": [2, -2] }
```

### Test Case 10

```text
{ "nums": [-1, 2, 3, 4, -5, -3, 1, 2] }
```

### Test Case 11

```text
{ "nums": [-2, -3, -1, 2, 3, 4, -5, -3, 1, 2] }
```

### Test Case 12

```text
{ "nums": [2, 3, 4, -5, -3, 4, 5] }
```

### Test Case 13

```text
{ "nums": [2, 3, 4, -5, -3, 5, 5] }
```

### Test Case 14

```text
{ "nums": [1, 2, 3, 4, 0, 5, 6, 7] }
```

### Test Case 15

```text
{ "nums": [1, 2, 3, -2, -1] }
```

### Test Case 16

```text
{ "nums": [-8, -22, 104, 73, -120, 53, 22, -12, 1, 14, -90, 13, -22] }
```

### Test Case 17

```text
{ "nums": [-8, -22, 104, 73, -120, 53, 22, 20, 25, -12, 1, 14, -90, 13, -22] }
```
