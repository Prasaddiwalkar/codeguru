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

```json
{ "nums": [] }
```

### Test Case 2

```json
{ "nums": [0] }
```

### Test Case 3

```json
{ "nums": [1] }
```

### Test Case 4

```json
{ "nums": [1, 2, 3] }
```

### Test Case 5

```json
{ "nums": [1, 1, 1] }
```

### Test Case 6

```json
{ "nums": [-1, -1, -1] }
```

### Test Case 7

```json
{ "nums": [0, 0, 0] }
```

### Test Case 8

```json
{ "nums": [1, 2, -2, 3] }
```

### Test Case 9

```json
{ "nums": [2, -2] }
```

### Test Case 10

```json
{ "nums": [-1, 2, 3, 4, -5, -3, 1, 2] }
```

### Test Case 11

```json
{ "nums": [-2, -3, -1, 2, 3, 4, -5, -3, 1, 2] }
```

### Test Case 12

```json
{ "nums": [2, 3, 4, -5, -3, 4, 5] }
```

### Test Case 13

```json
{ "nums": [2, 3, 4, -5, -3, 5, 5] }
```

### Test Case 14

```json
{ "nums": [1, 2, 3, 4, 0, 5, 6, 7] }
```

### Test Case 15

```json
{ "nums": [1, 2, 3, -2, -1] }
```

### Test Case 16

```json
{ "nums": [-8, -22, 104, 73, -120, 53, 22, -12, 1, 14, -90, 13, -22] }
```

### Test Case 17

```json
{ "nums": [-8, -22, 104, 73, -120, 53, 22, 20, 25, -12, 1, 14, -90, 13, -22] }
```
