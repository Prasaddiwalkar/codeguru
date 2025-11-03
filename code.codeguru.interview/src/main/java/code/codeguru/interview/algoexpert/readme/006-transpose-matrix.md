# Transpose Matrix

You're given a 2D array of integers called `matrix`. Write a function that returns the transpose of the matrix.

The transpose of a matrix is a flipped version of the original matrix across its main diagonal (which runs from top-left to bottom-right); it switches the row and column indices of the original matrix.

You can assume the input matrix always has at least 1 value; however, its width and height are not necessarily the same.

## Sample Input 1

```text
matrix = [
  [1, 2],
]
```

## Sample Output 1

```text
[
  [1],
  [2]
]
```

## Sample Input 2

```text
matrix = [
  [1, 2],
  [3, 4],
  [5, 6]
]
```

## Sample Output 2

```text
[
  [1, 3, 5],
  [2, 4, 6]
]
```

## Sample Input 3

```text
matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

## Sample Output 3

```text
[
  [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9]
]
```

```text
Test Case 1
{
  "matrix": [
    [1]
  ]
}
Test Case 2
{
  "matrix": [
    [1],
    [-1]
  ]
}
Test Case 3
{
  "matrix": [
    [1, 2, 3]
  ]
}
Test Case 4
{
  "matrix": [
    [1],
    [2],
    [3]
  ]
}
Test Case 5
{
  "matrix": [
    [1, 2, 3],
    [4, 5, 6]
  ]
}
Test Case 6
{
  "matrix": [
    [0, 0, 0],
    [1, 1, 1]
  ]
}
Test Case 7
{
  "matrix": [
    [0, 1],
    [0, 1],
    [0, 1]
  ]
}
Test Case 8
{
  "matrix": [
    [0, 0, 0],
    [0, 0, 0]
  ]
}
Test Case 9
{
  "matrix": [
    [1, 4],
    [2, 5],
    [3, 6]
  ]
}
Test Case 10
{
  "matrix": [
    [-7, -7],
    [100, 12],
    [-33, 17]
  ]
}
Test Case 11
{
  "matrix": [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ]
}
Test Case 12
{
  "matrix": [
    [1, 4, 7],
    [2, 5, 8],
    [3, 6, 9]
  ]
}
Test Case 13
{
  "matrix": [
    [5, 6, 3, -3, 12],
    [-3, 6, 5, 2, -1],
    [0, 0, 3, 12, 3]
  ]
}
Test Case 14
{
  "matrix": [
    [0, -1, -2, -3],
    [4, 5, 6, 7],
    [2, 3, -2, -3],
    [42, 100, 30, -42]
  ]
}
Test Case 15
{
  "matrix": [
    [1234, 6935, 4205],
    [-23459, 314159, 0],
    [100, 3, 987654]
  ]
}
```
