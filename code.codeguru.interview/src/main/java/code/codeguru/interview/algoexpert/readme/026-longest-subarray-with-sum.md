# Longest Subarray With Sum

Write a function that takes in a non-empty array of non-negative integers and a non-negative integer
representing a target sum. The function should find the longest subarray where the values collectively sum up
to equal the target sum. Return an array containing the starting index and ending index of this subarray,
both inclusive.

If there is no subarray that sums up to the target sum, the function should return an empty array.
You can assume that the given inputs will only ever have one answer.

## Sample Input

```text
{
  "array": [1, 2, 3, 4, 3, 3, 1, 2, 1, 2],
  "targetSum": 10
}
```

## Sample Output

```text
[4, 8]
```

## Hints

- Using intuition you can develop a brute force approach.
  If you are trying to find the longest subarray that sums to equal the target sum, then look at every possible subarray.
  Calculate the sum of each subarray, and when the sum is equal to the target sum, check the length against the current maximum.
- Since the array contains only non-negative numbers, once a subarray sum is greater than the target sum,
  there is no possible way adding more numbers to that subarray will get its sum to equal the target sum.
  Can you use this information to optimize the solution?
- Looking at every possible subarray is very time consuming.
  However, you can use a sliding window approach to improve the time complexity.
  Think about how a sliding window might work in this case.
  You should look at different subarrays while you traverse the array.
  How might you update a sliding window if you are looking for subarrays with a sum that is equal to the target sum?
- Add elements to the sliding window when the current subarray sum is less than the target sum,
  and remove elements when the current subarray sum is greater than the target sum.
  When you find a current subarray sum in the sliding window that is equal to the target sum,
  then you can check and see if you found a new longest subarray.
  If that is the case then update the result, otherwise continue traversing.

## Optimal Space & Time Complexity

O(n) time | O(1) space - where n is the length of the input array

## Test Cases

### Test Case 1

```text
{"array": [1, 2, 3, 4, 3, 3, 1, 2, 1], "targetSum": 10}
```

### Test Case 2

```text
{"array": [1, 2, 3, 4, 0, 0, 0, 0, 0, 3, 3, 1, 2, 1], "targetSum": 10}
```

### Test Case 3

```text
{"array": [0, 0, 0, 0, 0, 0, 0, 0, 0, 1], "targetSum": 1}
```

### Test Case 4

```text
{"array": [0, 0, 0, 0, 0, 1, 0, 0, 0, 0], "targetSum": 1}
```

### Test Case 5

```text
{"array": [25, 25, 25, 25, 100, 0, 0, 0, 0, 0, 0, 0], "targetSum": 100}
```

### Test Case 6

```text
{"array": [1, 2, 3, 4, 5, 5, 5, 5], "targetSum": 15}
```

### Test Case 7

```text
{"array": [0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 5, 5, 5, 5, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1], "targetSum": 20}
```

### Test Case 8

```text
{"array": [1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10], "targetSum": 15}
```

### Test Case 9

```text
{"array": [61, 54, 1, 499, 2212, 4059, 1, 2, 3, 1, 3], "targetSum": 19}
```

### Test Case 10

```text
{"array": [0], "targetSum": 0}
```

### Test Case 11

```text
{"array": [10], "targetSum": 10}
```

### Test Case 12

```text
{"array": [5], "targetSum": 0}
```

### Test Case 13

```text
{"array": [5], "targetSum": 10}
```
