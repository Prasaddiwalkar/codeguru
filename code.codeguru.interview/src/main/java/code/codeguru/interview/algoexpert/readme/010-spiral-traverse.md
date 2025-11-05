# Spiral Traverse

**Difficulty:**

**Category:** Arrays

---

Write a function that takes in an n x m two-dimensional array (that can be square-shaped when n == m) and returns a one-dimensional array of all the array's elements in spiral order.

Spiral order starts at the top left corner of the two-dimensional array, goes to the right, and proceeds in a spiral pattern all the way until every element has been visited.

## Sample Input

```text
array = [
  [1,   2,  3, 4],
  [12, 13, 14, 5],
  [11, 16, 15, 6],
  [10,  9,  8, 7],
]
```

## Sample Output

```text
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
```

## Hints

- You can think of the spiral that you have to traverse as a set of rectangle perimeters that progressively get smaller.
- These perimeters progressively move inwards in the two-dimensional array.
- Declare four variables: a starting row, a starting column, an ending row, and an ending column.
- These four variables represent the bounds of the first rectangle perimeter in the spiral that you have to traverse.
- Traverse that perimeter using those bounds, and then move the bounds inwards.
- End your algorithm once the starting row passes the ending row or the starting column passes the ending column.
- You can solve this problem both iteratively and recursively following very similar logic.

**Optimal Space & Time Complexity**
O(n) time | O(n) space - where n is the total number of elements in the array

## Test Cases

Test Case 1

```json
{
  "array": [
    [1, 2, 3, 4],
    [12, 13, 14, 5],
    [11, 16, 15, 6],
    [10, 9, 8, 7]
  ]
}
```

Test Case 2

```json
{
  "array": [
    [1]
  ]
}
```

Test Case 3

```json
{
  "array": [
    [1, 2],
    [4, 3]
  ]
}
```

Test Case 4

```json
{
  "array": [
    [1, 2, 3],
    [8, 9, 4],
    [7, 6, 5]
  ]
}
```

Test Case 5

```json
{
  "array": [
    [19, 32, 33, 34, 25, 8],
    [16, 15, 14, 13, 12, 11],
    [18, 31, 36, 35, 26, 9],
    [1, 2, 3, 4, 5, 6],
    [20, 21, 22, 23, 24, 7],
    [17, 30, 29, 28, 27, 10]
  ]
}
```

Test Case 6

```json
{
  "array": [
    [4, 2, 3, 6, 7, 8, 1, 9, 5, 10],
    [12, 19, 15, 16, 20, 18, 13, 17, 11, 14]
  ]
}
```

Test Case 7

```json
{
  "array": [
    [27, 12, 35, 26],
    [25, 21, 94, 11],
    [19, 96, 43, 56],
    [55, 36, 10, 18],
    [96, 83, 31, 94],
    [93, 11, 90, 16]
  ]
}
```

Test Case 8

```json
{
  "array": [
    [1, 2, 3, 4],
    [10, 11, 12, 5],
    [9, 8, 7, 6]
  ]
}
```

Test Case 9

```json
{
  "array": [
    [1, 2, 3],
    [12, 13, 4],
    [11, 14, 5],
    [10, 15, 6],
    [9, 8, 7]
  ]
}
```

Test Case 10

```json
{
  "array": [
    [1, 11],
    [2, 12],
    [3, 13],
    [4, 14],
    [5, 15],
    [6, 16],
    [7, 17],
    [8, 18],
    [9, 19],
    [10, 20]
  ]
}
```

Test Case 11

```json
{
  "array": [
    [1, 3, 2, 5, 4, 7, 6]
  ]
}
```

Test Case 12

```json
{
  "array": [
    [1],
    [3],
    [2],
    [5],
    [4],
    [7],
    [6]
  ]
}
```
