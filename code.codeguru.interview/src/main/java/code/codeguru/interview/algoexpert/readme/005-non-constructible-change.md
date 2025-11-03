# Non-Constructible Change

Given an array of positive integers representing the values of coins in your possession, write a function that returns the minimum amount of change (the minimum sum of money) that you **cannot** create.

The given coins can have any positive integer value and aren't necessarily unique.

You can have multiple coins of the same value.

For example, if you're given `coins = [1, 2, 5]`, the minimum amount of change that you can't create is `4`.

If you're given no coins, the minimum amount of change that you can't create is `1`.

## Sample Input

```text
coins = [5, 7, 1, 1, 2, 3, 22]
```

## Sample Output

```text
20
```

```text
Test Case 1
{
  "coins": [5, 7, 1, 1, 2, 3, 22]
}
Test Case 2
{
  "coins": [1, 1, 1, 1, 1]
}
Test Case 3
{
  "coins": [1, 5, 1, 1, 1, 10, 15, 20, 100]
}
Test Case 4
{
  "coins": [6, 4, 5, 1, 1, 8, 9]
}
Test Case 5
{
  "coins": []
}
Test Case 6
{
  "coins": [87]
}
Test Case 7
{
  "coins": [5, 6, 1, 1, 2, 3, 4, 9]
}
Test Case 8
{
  "coins": [5, 6, 1, 1, 2, 3, 43]
}
Test Case 9
{
  "coins": [1, 1]
}
Test Case 10
{
  "coins": [2]
}
Test Case 11
{
  "coins": [1]
}
Test Case 12
{
  "coins": [109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4]
}
Test Case 13
{
  "coins": [1, 2, 3, 4, 5, 6, 7]
}
```
