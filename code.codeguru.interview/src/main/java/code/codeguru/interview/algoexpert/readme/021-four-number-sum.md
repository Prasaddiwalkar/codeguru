# Four Number Sum

Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. The
function should find all quadruplets in the array that sum up to the target sum and return a two-dimensional array of
all these quadruplets in no particular order.

If no four numbers sum up to the target sum, the function should return an empty array.

## Sample Input

```python
array = [7, 6, 4, -1, 1, 2]
targetSum = 16
```

## Sample Output

```python
[[7, 6, 4, -1], [7, 6, 1, 2]]  # order of quadruplets or numbers inside them does not matter
```

## Hints

### Hint 1

Using four for loops to calculate the sums of all possible quadruplets in the array would generate an algorithm that
runs in O(n^4) time. Can you come up with something faster using fewer loops?

### Hint 2

You can calculate the sums of every pair of numbers in the array in O(n^2) time using just two for loops. Then, store
these sums in a hash map: sum -> list of pairs (values). You can check for each new pair if targetSum - currentPairSum
exists in the map to form quadruplets, ensuring numbers aren't reused.

### Hint 3

Alternatively, store pair sums in a map of sum -> list of index pairs. Iterate through the array; for each i, j with j > i,
look for complement sums from prior indices only (k < i) to avoid duplicates and overlaps. After processing all pairs ending
at j, add earlier pairs (i, j) to the map for future use.

### Optimal Space & Time Complexity

Average: O(n^2) time | O(n^2) space
Worst: O(n^3) time | O(n^2) space

## Test Cases

### Test Case 1

```text
{ "array": [7, 6, 4, -1, 1, 2], "targetSum": 16 }
```

### Test Case 2

```text
{ "array": [1, 2, 3, 4, 5, 6, 7], "targetSum": 10 }
```

### Test Case 3

```text
{ "array": [5, -5, -2, 2, 3, -3], "targetSum": 0 }
```

### Test Case 4

```text
{ "array": [-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9], "targetSum": 4 }
```

### Test Case 5

```text
{ "array": [-1, 22, 18, 4, 7, 11, 2, -5, -3], "targetSum": 30 }
```

### Test Case 6

```text
{ "array": [-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5], "targetSum": 20 }
```

### Test Case 7

```text
{ "array": [1, 2, 3, 4, 5], "targetSum": 100 }
```

### Test Case 8

```text
{ "array": [1, 2, 3, 4, 5, -5, 6, -6], "targetSum": 5 }
```
