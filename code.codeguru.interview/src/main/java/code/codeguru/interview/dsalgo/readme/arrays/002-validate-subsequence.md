# Validate Subsequence

**Difficulty:**

**Category:** Arrays

---

Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.

A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that are in the same order as they appear in the array.
For instance, the numbers [1, 3, 4] form a subsequence of the array [1, 2, 3, 4], and so do the numbers [2, 4].
Note that a single number in an array and the array itself are both valid subsequences of the array.

## Sample Input

```text
{
  "array": [5, 1, 22, 25, 6, -1, 8, 10],
  "sequence": [1, 6, -1, 10]
}
```

## Sample Output

```text
true
```

## More Sample Inputs

```text
[
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 22, 25, 6, -1, 8, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 22, 6, -1, 8, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [22, 25, 6] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [1, 6, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 22, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, -1, 8, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [25] },
  { "array": [1, 1, 1, 1, 1], "sequence": [1, 1, 1] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 22, 25, 6, -1, 8, 10, 12] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [4, 5, 1, 22, 25, 6, -1, 8, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 22, 23, 6, -1, 8, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 22, 22, 25, 6, -1, 8, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 22, 22, 6, -1, 8, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [1, 6, -1, -1] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [1, 6, -1, -1, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [1, 6, -1, -2] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [26] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 25, 22, 6, -1, 8, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 26, 22, 8] },
  { "array": [1, 1, 6, 1], "sequence": [1, 1, 1, 6] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [1, 6, -1, 10, 11, 11, 11, 11] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [5, 1, 22, 25, 6, -1, 8, 10, 10] },
  { "array": [5, 1, 22, 25, 6, -1, 8, 10], "sequence": [1, 6, -1, 5] }
]
```
