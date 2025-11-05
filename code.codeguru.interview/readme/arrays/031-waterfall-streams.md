# Waterfall Streams

You're given a 2D array representing an indoor waterfall structure and an integer column index where water starts
(source). Water starts above row 0 at the given column and flows downward. Cells contain 0 (empty) or 1 (block). The
last row (buckets) always contains only 0s. Walls on the sides keep water inside the structure.

Flow rules:

- Water moves straight down through empty cells.
- Hitting a block splits the water: 50% attempts to go left, 50% right, sliding horizontally along the row immediately above the block until it can drop (a cell below is empty) or is trapped.
- If a direction is blocked entirely (wall or enclosed by blocks) its water is lost.

Return the percentage of water that ends in each bottom cell after all flow finishes (sum = 100). Represent empty output
cells with 0 when no water reaches them.

## Sample Input

```python
array = [
  [0, 0, 0, 0, 0, 0, 0],
  [1, 0, 0, 0, 0, 0, 0],
  [0, 0, 1, 1, 1, 0, 0],
  [0, 0, 0, 0, 0, 0, 0],
  [1, 1, 1, 0, 0, 1, 0],
  [0, 0, 0, 0, 0, 0, 1],
  [0, 0, 0, 0, 0, 0, 0]
]
source = 3
```

## Sample Output

```python
[0, 0, 0, 25, 25, 0, 0]
```

## Hints

### Hint 1

Simulate the water distribution row by row: keep an array of percentages for current row; propagate to next.

### Hint 2

When water encounters a block beneath its column, scan sideways (left then right) to find the first column where the
cell below is empty; accumulate split water there; otherwise that half is lost.

### Hint 3

Use floats or integers scaled by 100 to avoid precision drift; only the final row percentages are returned.

### Optimal Space & Time Complexity

Let h = rows, w = cols. Time: O(h * w^2) worst (side scans) | Space: O(w).

## Test Cases

### Test Case 1

```text
{ "array": [[0,0,0,0,0,0,0],[1,0,0,0,0,0,0],[0,0,1,1,1,0,0],[0,0,0,0,0,0,0],[1,1,1,0,0,1,0],[0,0,0,0,0,0,1],[0,0,0,0,0,0,0]], "source": 3 }
```

### Test Case 2

```text
{ "array": [[0],[0],[0],[0],[0],[0],[0]], "source": 0 }
```

### Test Case 3

```text
{ "array": [[0],[0],[0],[0],[0],[1],[0]], "source": 0 }
```

### Test Case 4

```text
{ "array": [[0,0,0,0,0,0,0],[1,0,1,0,1,0,0],[0,0,1,1,1,0,0],[0,0,0,0,0,0,0],[1,1,1,0,0,1,0],[0,0,0,0,0,0,1],[0,0,0,0,0,0,0]], "source": 3 }
```

### Test Case 5

```text
{ "array": [[0,0,0,0,0,0,0],[1,0,1,0,0,0,0],[0,0,1,1,1,0,0],[0,0,0,0,0,0,0],[1,1,1,0,0,1,0],[0,0,0,0,0,0,1],[0,0,0,0,0,0,0]], "source": 3 }
```

### Test Case 6

```text
{ "array": [[0,0,0,0,0,0,0],[1,0,0,0,0,0,0],[0,0,1,1,1,0,0],[0,0,1,0,0,0,1],[0,0,1,0,1,1,0],[0,1,0,0,0,0,0],[0,0,0,1,0,0,0],[0,0,1,0,1,0,0],[0,0,0,0,0,0,0]], "source": 3 }
```

### Test Case 7

```text
{ "array": [[0,0,0,0,0,0,0],[1,0,0,0,0,0,0],[0,0,1,1,1,0,0],[0,0,1,0,0,0,1],[0,0,1,0,1,1,0],[0,1,0,0,0,0,0],[0,0,0,1,0,0,0],[1,1,1,1,1,1,1],[0,0,0,0,0,0,0]], "source": 6 }
```

### Test Case 8

```text
{ "array": [[0,0,0,0,0,0,0,0,0,0,0,0,0,0],[0,0,1,1,1,1,1,1,1,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0,1,0],[0,0,0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0,0,0,0,0,0,0]], "source": 7 }
```
