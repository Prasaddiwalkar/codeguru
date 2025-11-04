# Two Number Sum

**Difficulty:**

**Category:** Arrays

## Problem Statement

---

Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order.
If no two numbers sum up to the target sum, the function should return an empty array.

Note that the target sum has to be obtained by summing two different integers in the array;
you can't add a single integer to itself in order to obtain the target sum.

You can assume that there will be at most one pair of numbers summing up to the target sum.

---

## Sample Input

```json
{
  "array": [3, 5, -4, 8, 11, 1, -1, 6],
  "targetSum": 10
},
{
  "array": [4, 6],
  "targetSum": 10
},
{
  "array": [4, 6, 1],
  "targetSum": 5
},
{
  "array": [4, 6, 1, -3],
  "targetSum": 3
},
{
  "array": [1, 2, 3, 4, 5, 6, 7, 8, 9],
  "targetSum": 17
},
{
  "array": [1, 2, 3, 4, 5, 6, 7, 8, 9, 15],
  "targetSum": 18
},
{
  "array": [-7, -5, -3, -1, 0, 1, 3, 5, 7],
  "targetSum": -5
},
{
  "array": [-21, 301, 12, 4, 65, 56, 210, 356, 9, -47],
  "targetSum": 163
},
{
  "array": [-21, 301, 12, 4, 65, 56, 210, 356, 9, -47],
  "targetSum": 164
},
{
  "array": [3, 5, -4, 8, 11, 1, -1, 6],
  "targetSum": 15
},
{
  "array": [14],
  "targetSum": 15
},
{
  "array": [15],
  "targetSum": 15
}
```
