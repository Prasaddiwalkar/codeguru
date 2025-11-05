# Minimum Area Rectangle

You're given an array of points on the 2D plane. Each point is an integer pair `[x, y]`. Return the minimum area of any
axis-aligned rectangle (sides parallel to x and y axes) that can be formed using four of the points. If no rectangle can
be formed return `0`. Points are unique.

## Sample Input

```text
{ "points": [[1,5],[5,1],[4,2],[2,4],[2,2],[1,2],[4,5],[2,5],[-1,-2]] }
```

## Sample Output

```text
3
```

## Test Cases

### Test Case 1

```text
{ "points": [[1,5],[5,1],[4,2],[2,4],[2,2],[1,2],[4,5],[2,5],[-1,-2]] }
```

### Test Case 2

```text
{ "points": [] }
```

### Test Case 3

```text
{ "points": [[1,2],[4,2]] }
```

### Test Case 4

```text
{ "points": [[2,2],[3,2],[4,2]] }
```

### Test Case 5

```text
{ "points": [[0,1],[0,0],[2,1],[2,0],[4,0],[4,1],[0,2],[2,2],[4,2],[6,0],[6,1],[6,2],[7,1],[7,0]] }
```

### Test Case 6

```text
{ "points": [[0,1],[0,0],[2,1],[2,0],[4,0],[4,1],[0,2],[2,2],[4,2],[6,0],[6,1],[6,2],[7,1]] }
```

### Test Case 7

```text
{ "points": [[100,100],[76,67],[-100,100],[65,76],[100,-100],[3,4],[-100,-100],[5,6],[78,54],[-87,7],[1,4],[4,1],[-1,5]] }
```
