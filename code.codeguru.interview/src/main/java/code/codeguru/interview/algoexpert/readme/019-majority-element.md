# Majority Element

Write a function that takes in a non-empty, unordered array of positive integers and returns the array's majority
element without sorting the array and using only constant extra space.

A majority element is an element that appears strictly more than half of the time (in > n/2 indices). The most frequent
value isn't always a majority (e.g. `[3, 2, 2, 1]` has no majority). You may assume the input array always has a
majority element.

## Sample Input

```python
array = [1, 2, 3, 2, 2, 1, 2]
```

## Sample Output

```python
2  # 2 appears 4 times in length-7 array
```

## Hints

### Hint 1

If the array were sorted, the middle element would be the majority element. Can you avoid sorting (O(n log n)) and do
better?

### Hint 2

Use the Boyer–Moore voting idea: keep a candidate and a counter. Iterate; if counter is 0 set candidate to current
value; if current equals candidate increment counter else decrement. At end, candidate is majority (given it exists).

### Hint 3

Why does resetting the candidate when the counter reaches 0 work? Because the eliminated prefix had equal numbers of
candidate and non-candidate values; it cannot contain more than half of array size occurrences of any element unless
that element survives to the end.

### Hint 4 (Alternate Bit Approach)

For each bit position, count how many numbers have that bit set. If a bit is set in more than n/2 numbers, set it in the
result: reconstruct the majority element from bits. This uses O(1) extra space (ignoring output) and O(k * n) time where
k is number of bits in integer type.

### Optimal Space & Time Complexity

Boyer–Moore: O(n) time | O(1) space.

## Test Cases

### Test Case 1

```json
{ "array": [2] }
```

### Test Case 2

```json
{ "array": [1, 2, 1] }
```

### Test Case 3

```json
{ "array": [3, 3, 1] }
```

### Test Case 4

```json
{ "array": [4, 5, 5] }
```

### Test Case 5

```json
{ "array": [1, 2, 3, 2, 2, 1, 2] }
```

### Test Case 6

```json
{ "array": [1, 2, 3, 2, 3, 2, 2, 4, 2] }
```

### Test Case 7

```json
{ "array": [1, 1, 1, 1, 1, 1, 1] }
```

### Test Case 8

```json
{ "array": [5, 4, 3, 2, 1, 1, 1, 1, 1] }
```

### Test Case 9

```json
{ "array": [1, 1, 1, 1, 1, 5, 4, 3, 2] }
```

### Test Case 10

```json
{ "array": [1, 1, 1, 1, 2, 2, 2, 2, 2] }
```

### Test Case 11

```json
{ "array": [435, 6543, 6543, 435, 535, 6543, 6543, 12, 43, 6543, 6543] }
```

### Test Case 12

```json
{ "array": [1, 2, 2, 2, 1] }
```

### Test Case 13

```json
{ "array": [1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 3, 2, 1] }
```

### Test Case 14

```json
{ "array": [1, 2, 3, 2, 2, 4, 2, 2, 5, 2, 1] }
```
