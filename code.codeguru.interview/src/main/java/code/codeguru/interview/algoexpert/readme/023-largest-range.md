# Largest Range

Write a function that takes in an array of integers and returns an array of length 2 representing the largest range of
consecutive integers contained in that array.

The first value should be the start of the range; the second value the end. A range is a set of integers that appear
consecutively (e.g. `[2, 6]` represents `{2,3,4,5,6}`). Numbers in the input need not be sorted or adjacent to form a
range. You can assume there is exactly one largest range.

## Sample Input

```python
array = [1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6]
```

## Sample Output

```python
[0, 7]
```

## Hints

### Hint 1

Use a hash set / map to achieve average O(1) containment checks to reach linear overall time.

### Hint 2

Insert every number into a hash map initially and mark each as unvisited. This lets you expand ranges only once.

### Hint 3

Iterate the array again. For each number not yet visited, expand left (num - 1, num - 2, ...) and right (num + 1, ...)
marking visited entries, tracking current range length and best range.

### Optimal Space & Time Complexity

O(n) time | O(n) space, where n is the number of integers.

## Test Cases

### Test Case 1

```json
{ "array": [1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6] }
```

### Test Case 2

```json
{ "array": [1] }
```

### Test Case 3

```json
{ "array": [1, 2] }
```

### Test Case 4

```json
{ "array": [4, 2, 1, 3] }
```

### Test Case 5

```json
{ "array": [4, 2, 1, 3, 6] }
```

### Test Case 6

```json
{ "array": [8, 4, 2, 10, 3, 6, 7, 9, 1] }
```

### Test Case 7

```json
{ "array": [19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14] }
```

### Test Case 8

```json
{ "array": [0, 9, 19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14] }
```

### Test Case 9

```json
{ "array": [0, -5, 9, 19, -1, 18, 17, 2, -4, -3, 10, 3, 12, 5, 16, 4, 11, 7, -6, -7, 6, 15, 12, 12, 2, 1, 6, 13, 14, -2] }
```

### Test Case 10

```json
{ "array": [-7, -7, -7, -7, 8, -8, 0, 9, 19, -1, -3, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, -6, 8, 7, 6, 15, 12, 12, -5, 2, 1, 6, 13, 14, -4, -2] }
```

### Test Case 11

```json
{ "array": [1, 1, 1, 3, 4] }
```

### Test Case 12

```json
{ "array": [-1, 0, 1] }
```

### Test Case 13

```json
{ "array": [10, 0, 1] }
```
