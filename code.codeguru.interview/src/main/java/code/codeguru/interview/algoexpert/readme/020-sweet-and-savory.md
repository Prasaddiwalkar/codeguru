# Sweet and Savory

You are given an array of integers representing dishes. Each dish is either sweet (positive integer) or savory
(negative integer). You are also given a target integer. Find the pair of one sweet and one savory dish whose sum is
closest to the target (but not greater than the target). Return the pair as an array [savory, sweet].

## Sample Input

```python
# dishes = [-3, -2, 0, 1, 2, 4], target = 3
```

## Sample Output

```python
[-3, 4]
```

## Hints

- Sort the array and use two pointers to find the best pair.
- Only consider pairs with one sweet and one savory dish.
- If there are multiple pairs with the same sum, return the pair with the smallest savory dish.

## Test Cases

### Test Case 1

```text
{ "dishes": [], "target": 10 }
```

### Test Case 2

```text
{ "dishes": [4], "target": 10 }
```

### Test Case 3

```text
{ "dishes": [-5, 10], "target": 4 }
```

### Test Case 4

```text
{ "dishes": [], "target": -10 }
```

### Test Case 5

```text
{ "dishes": [4], "target": -10 }
```

### Test Case 6

```text
{ "dishes": [-5, 10], "target": -4 }
```

### Test Case 7

```text
{ "dishes": [5, -10], "target": -4 }
```

### Test Case 8

```text
{ "dishes": [-5, 10], "target": 5 }
```

### Test Case 9

```text
{ "dishes": [-5, 10], "target": 0 }
```

### Test Case 10

```text
{ "dishes": [5, -10], "target": 0 }
```

### Test Case 11

```text
{ "dishes": [10, -5], "target": 5 }
```

### Test Case 12

```text
{ "dishes": [10, -5], "target": 100 }
```

### Test Case 13

```text
{ "dishes": [5, -5, 5, -5, 5, -5], "target": 10 }
```

### Test Case 14

```text
{ "dishes": [5, -5, 5, -5, 5, -5], "target": 0 }
```

### Test Case 15

```text
{ "dishes": [3, 5, 7, 2, 6, 8, 1], "target": 10 }
```

### Test Case 16

```text
{ "dishes": [-3, -5, 1, 7], "target": 8 }
```

### Test Case 17

```text
{ "dishes": [-3, -5, 1, 7], "target": 0 }
```

### Test Case 18

```text
{ "dishes": [2, 5, -4, -7, 12, 100, -25], "target": -5 }
```

### Test Case 19

```text
{ "dishes": [2, 5, -4, -7, 12, 100, -25], "target": -7 }
```

### Test Case 20

```text
{ "dishes": [2, 4, -4, -7, 12, 100, -25], "target": -1 }
```

### Test Case 21

```text
{ "dishes": [2, 5, -4, -7, 12, 100, -25], "target": -20 }
```

### Test Case 22

```text
{ "dishes": [2, 5, -4, -7, 12, 100, -25], "target": 5 }
```

### Test Case 23

```text
{ "dishes": [2, 5, -4, -7, 12, 100, -25], "target": 7 }
```

### Test Case 24

```text
{ "dishes": [2, 5, -4, -7, 12, 100, -25], "target": 1 }
```

### Test Case 25

```text
{ "dishes": [2, 5, -4, -7, 12, 100, -25], "target": 20 }
```

### Test Case 26

```text
{ "dishes": [-5, -4, -3, -2, -1, 1, 2, 3, 4, 5], "target": 6 }
```

### Test Case 27

```text
{ "dishes": [-5, -4, -3, -2, -1, 1, 2, 3, 4, 5], "target": -6 }
```

### Test Case 28

```text
{ "dishes": [17, 37, 12, -102, 53, 49, -90, 102, 49, 16, 52], "target": 12 }
```

### Test Case 29

```text
{ "dishes": [17, 37, 12, -102, 53, 49, -90, 102, 49, 16, 52], "target": 11 }
```

### Test Case 30

```text
{ "dishes": [17, 37, 12, -102, 53, 49, -90, 102, 49, 16, 52], "target": -100 }
```

### Test Case 31

```text
{ "dishes": [17, 37, 12, -102, 53, 49, -90, 102, 49, 16, 52], "target": -28 }
```

### Test Case 32

```text
{ "dishes": [-12, 13, 100, -53, 540, -538, 53, 76, 32, -63], "target": 0 }
```

### Test Case 33

```text
{ "dishes": [-12, 13, 100, -53, 540, -538, 53, 76, 32, -63], "target": -34 }
```

### Test Case 34

```text
{ "dishes": [-12, 13, 100, -53, 540, -538, 53, 76, 32, -63], "target": -15 }
```

### Test Case 35

```text
{ "dishes": [-12, 13, 100, -53, 540, -538, 53, 76, 32, -63], "target": 42 }
```
