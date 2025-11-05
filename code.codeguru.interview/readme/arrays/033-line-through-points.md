# Line Through Points

You're given an array of points plotted on a 2D graph (the xy-plane). Write a function that returns the maximum number
of points that a single line (or potentially multiple lines) on the graph passes through.

The input array will contain points represented by an array of two integers [x, y]. The input array will never contain
duplicate points and will always contain at least one point.

## Sample Input

```python
points = [
  [1, 1],
  [2, 2],
  [3, 3],
  [0, 4],
  [-2, 6],
  [4, 0],
  [2, 1],
]
```

## Sample Output

```python
4 # A line passes through points: [-2, 6], [0, 4], [2, 2], [4, 0].
```

## Hints

### Hint 1

The brute-force approach to solve this problem is to consider every single pair of points and to form a line using them.
Then, for each line, you determine how many points lie on that line by using the equation of the line you formed and
checking if each point's coordinates solve the equation. This solution runs in O(n^3) time; can you come up with a better approach?

### Hint 2

What does it mean if two lines have the same slope and share a point?

## Sample Input/Test Cases

### Test Case 1

```text
{
  "points": [
    [1, 1],
    [2, 2],
    [3, 3],
    [0, 4],
    [-2, 6],
    [4, 0],
    [2, 1]
  ]
}
```

### Test Case 2

```text
{
  "points": [
    [3, 3],
    [0, 4],
    [-2, 6],
    [4, 0],
    [2, 1],
    [3, 4],
    [5, 6],
    [0, 0]
  ]
}
```

### Test Case 3

```text
{
  "points": [
    [1, 4],
    [3, 5],
    [7, 1],
    [5, 4],
    [4, 5],
    [9, 2],
    [1, 3],
    [2, 8]
  ]
}
```

### Test Case 4

```text
{
  "points": [
    [1, 4],
    [4, 1],
    [3, 3]
  ]
}
```

### Test Case 5

```text
{
  "points": [
    [0, 0]
  ]
}
```

### Test Case 6

```text
{
  "points": [
    [1, 4],
    [4, 1],
    [1, 1],
    [4, 4],
    [2, 3],
    [3, 2],
    [3, 3],
    [2, 2],
    [0, 3]
  ]
}
```

### Test Case 7

```text
{
  "points": [
    [1, 4],
    [4, 1],
    [1, 1],
    [4, 4],
    [2, 3],
    [3, 2],
    [3, 3],
    [2, 2],
    [0, 3],
    [5, 3],
    [3, -1],
    [2, -3],
    [1, -5]
  ]
}
```

### Test Case 8

```text
{
  "points": [
    [-1, -1],
    [-3, -1],
    [-4, -1],
    [1, 1],
    [4, 1]
  ]
}
```

### Test Case 9

```text
{
  "points": [
    [1, 1],
    [1, 2],
    [1, 3],
    [1, 4],
    [1, 5],
    [2, 1],
    [2, 2],
    [2, 3],
    [2, 4],
    [2, 5],
    [3, 1],
    [3, 2],
    [3, 4],
    [3, 5],
    [4, 1],
    [4, 2],
    [4, 3],
    [4, 4],
    [4, 5],
    [5, 1],
    [5, 2],
    [5, 3],
    [5, 4],
    [5, 5],
    [6, 6],
    [2, 6]
  ]
}
```

### Test Case 10

```text
{
  "points": [
    [1, 1],
    [1, 2],
    [1, 3],
    [1, 4],
    [1, 5],
    [2, 1],
    [2, 2],
    [2, 4],
    [2, 5],
    [4, 1],
    [4, 2],
    [4, 4],
    [4, 5],
    [5, 1],
    [5, 2],
    [5, 4],
    [5, 5],
    [6, 6],
    [2, 6],
    [-1, -1],
    [0, 0],
    [-2, -2]
  ]
}
```

### Test Case 11

```text
{
  "points": [
    [-78, -9],
    [67, 87],
    [46, 87],
    [4, 5],
    [9, 83],
    [34, 47]
  ]
}
```

### Test Case 12

```text
{
  "points": [
    [1000000001, 1],
    [1, 1],
    [0, 0]
  ]
}
```
