# Subarray Sort

Write a function that takes in an array of at least two integers and that returns an array of the starting and ending indices of the smallest subarray in the input array that needs to be sorted in place
in order for the entire input array to be sorted (in ascending order).

If the input array is already sorted, the function should return [-1, -1].

## Sample Input

```text
array = [1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19]
```

## Sample Output

```text
[3, 9]
```

## Hints

- Realize that even a single out-of-order number in the input array can call for a large subarray to have to be sorted.
  This is because, depending on how out-of-place the number is, it might need to be moved very far away from its
  original position in order to be in its sorted position.
- Find the smallest and largest numbers that are out of order in the input array. You should be able to do this in a
  single pass through the array.
- Once you've found the smallest and largest out-of-order numbers mentioned in Hint #2,
  find their final sorted positions in the array. This should give you the extremities of
  the smallest subarray that needs to be sorted.

### Optimal Space & Time Complexity

O(n) time | O(1) space - where n is the length of the input array

## Test Cases

### Test Case 1

```text
{ "array": [1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19] }
```

### Test Case 2

```text
{ "array": [1, 2] }
```

### Test Case 3

```text
{ "array": [2, 1] }
```

### Test Case 4

```text
{ "array": [1, 2, 4, 7, 10, 11, 7, 12, 7, 7, 16, 18, 19] }
```

### Test Case 5

```text
{ "array": [1, 2, 4, 7, 10, 11, 7, 12, 13, 14, 16, 18, 19] }
```

### Test Case 6

```text
{ "array": [1, 2, 8, 4, 5] }
```

### Test Case 7

```text
{ "array": [4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7] }
```

### Test Case 8

```text
{ "array": [4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57] }
```

### Test Case 9

```text
{ "array": [-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57] }
```

### Test Case 10

```text
{ "array": [-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7] }
```

### Test Case 11

```text
{ "array": [1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11] }
```

### Test Case 12

```text
{ "array": [1, 2, 3, 4, 5, 6, 18, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19] }
```

### Test Case 13

```text
{ "array": [1, 2, 3, 4, 5, 6, 18, 21, 22, 7, 14, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 4, 14, 11, 6, 33, 35, 41, 55] }
```

### Test Case 14

```text
{ "array": [1, 2, 20, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19] }
```

### Test Case 15

```text
{ "array": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2] }
```

### Test Case 16

```text
{ "array": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20] }
```

### Test Case 17

```text
{ "array": [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89] }
```
