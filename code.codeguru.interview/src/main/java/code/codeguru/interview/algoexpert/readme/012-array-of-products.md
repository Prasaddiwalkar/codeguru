# Array Of Products

Write a function that takes in a non-empty array of integers and returns an array of the same length, where each element in the output array is equal to the product of every other number in the input array.

In other words, the value at `output[i]` is equal to the product of every number in the input array other than `input[i]`.

Note that you're expected to solve this problem without using division.

## Sample Input

```text
array = [5, 1, 4, 2]
```

## Sample Output

```text
[8, 40, 10, 20]
// 8 is equal to 1 x 4 x 2
// 40 is equal to 5 x 4 x 2
// 10 is equal to 5 x 1 x 2
// 20 is equal to 5 x 1 x 4
```

## Hints

- Think about the most naive approach to solving this problem. How can we do exactly what the problem wants us to do without focusing at all on time and space complexity?
- Understand how output[i] is being calculated. How can we calculate the product of every element other than the one at the current index?
- Can we do this with just one loop through the input array, or do we have to do multiple loops?
- For each index in the input array, try calculating the product of every element to the left and the product of every element to the right.
- You can do this with two loops through the array: one from left to right and one from right to left.
- How can these products help us?

**Optimal Space & Time Complexity**
O(n) time | O(n) space - where n is the length of the input array

## Test Cases

Test Case 1

```json
{
  "array": [5, 1, 4, 2]
}
```

Test Case 2

```json
{
  "array": [1, 8, 6, 2, 4]
}
```

Test Case 3

```json
{
  "array": [-5, 2, -4, 14, -6]
}
```

Test Case 4

```json
{
  "array": [9, 3, 2, 1, 9, 5, 3, 2]
}
```

Test Case 5

```json
{
  "array": [4, 4]
}
```

Test Case 6

```json
{
  "array": [0, 0, 0, 0]
}
```

Test Case 7

```json
{
  "array": [1, 1, 1, 1]
}
```

Test Case 8

```json
{
  "array": [-1, -1, -1]
}
```

Test Case 9

```json
{
  "array": [-1, -1, -1, -1]
}
```

Test Case 10

```json
{
  "array": [0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
}
```

Test Case 11

```json
{
  "array": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
}
```
