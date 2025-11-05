# Count Squares

Write a function that takes in a list of Cartesian coordinates (points) and returns the number of axis-agnostic squares
that can be formed using those points as corners.

A valid square must have all four of its corner points present in the input. A single point can participate in multiple
squares. Coordinates are integer pairs `[x, y]`. You may assume no coordinate lies farther than 100 units from the
origin.

## Sample Input

```python
points = [
  [1, 1],
  [0, 0],
  [-4, 2],
  [-2, -1],
  [0, 1],
  [1, 0],
  [-1, 4]
]
```

## Sample Output

```python
2  # Squares: (1,1)-(0,0)-(0,1)-(1,0) and (1,1)-(-4,2)-(-2,-1)-(-1,4)
```

## Hints

### Hint 1

Given any two points there are exactly three other point pairs that could form a square with them (depending on which
edge/diagonal they represent). Use geometry (vectors / rotations) to enumerate candidate other corners.

### Hint 2

If two points are assumed to be diagonal corners, the other two corners are determined uniquely. Use midpoint and vector
perpendicular rotation to compute them.

### Hint 3

All four corners of a square are equidistant from the midpoint of its two diagonal points.

### Hint 4

The slopes of the two diagonals of a square are negative reciprocals (unless axis-aligned where one is infinite). Using
vector rotation avoids slope edge cases.

### Optimal Space & Time Complexity

Typical hash‑set approach: O(n^2) time | O(n) space, where n is number of points (iterate ordered point pairs, constant
checks for existence of computed other corners).

## Test Cases

### Test Case 1

```text
{ "points": [] }
```

### Test Case 2

```text
{ "points": [[1, 0]] }
```

### Test Case 3

```text
{ "points": [[0, 1], [1, 0]] }
```

### Test Case 4

```text
{ "points": [[0, 0], [0, 1], [1, 0]] }
```

### Test Case 5

```text
{ "points": [[1, 1], [0, 0], [0, 1], [1, 0]] }
```

### Test Case 6

```text
{ "points": [[1, 1], [0, 0], [-4, 2], [-2, -1], [0, 1], [1, 0], [-1, 4]] }
```

### Test Case 7

```text
{ "points": [[1, 1], [3, -3], [0, 0], [0, 1], [-1, 3], [6, 2], [0, -2], [1, 0], [4, 0], [5, 1], [1, 5], [-2, 0]] }
```

### Test Case 8

```text
{ "points": [[1, 1], [0, 0], [0, 1], [2, 0]] }
```

### Test Case 9

```text
{ "points": [[-1, -1], [1, 1], [-1, 1], [1, -1]] }
```

### Test Case 10

```text
{ "points": [[-2, -2], [2, 2], [0, 0], [-2, 2], [2, -2]] }
```

### Test Case 11

```text
{ "points": [[0, 0], [1, 1], [1, 0], [2, 1], [2, 0]] }
```

### Test Case 12

```text
{ "points": [[1, -1], [-1, 3], [3, 5], [5, 1]] }
```

### Test Case 13

```text
{ "points": [[1, 1], [0, 0], [0, 1], [1, 0], [2, 2], [1, 2], [2, 1]] }
```

### Test Case 14

```text
{ "points": [[1, 1], [0, 0], [0, 1], [1, 0], [-1, 3], [3, 5], [5, 1], [1, -1]] }
```

### Test Case 15

```text
{ "points": [[3, 1], [1, 1], [0, 0], [0, 1], [3, 7], [1, 0], [-1, 3], [3, 5], [5, 1], [9, 1], [1, -1], [9, 7]] }
```

### Test Case 16

```text
{ "points": [[3, 1], [1, 1], [0, 0], [0, 1], [3, 7], [1, 0], [-4, -2], [27, -5], [-1, 3], [3, 5], [5, 1], [10, -19], [9, 1], [1, -1], [9, 7], [13, 12]] }
```

### Test Case 17

```text
{ "points": [[3, 1], [1, 1], [21, 19], [0, 0], [0, 1], [3, 7], [1, 0], [12, -14], [-4, -2], [27, -5], [-1, 3], [3, 5], [5, 1], [10, -19], [9, 1], [1, -1], [9, 7], [13, 12], [0, 7], [33, -2]] }
```

### Test Case 18

```text
{ "points": [[21, 1], [3, 1], [1, 1], [21, 19], [0, 0], [0, 1], [2, 3], [22, 2], [3, 7], [1, 0], [12, -14], [-4, -2], [-22, 22], [27, -5], [-1, 3], [3, 5], [5, 1], [10, -19], [9, 1], [1, -1], [9, 7], [13, 12], [0, 7], [3, 19], [33, -2]] }
```
