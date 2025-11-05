# Apartment Hunting

You're looking to move into a new apartment on a specific street, and you're given a list of contiguous blocks on that
street where each block contains an apartment that you could move into.

You also have a list of requirements: a list of buildings that are important to you. For instance, you might value
having a school and a gym near your apartment. The list of blocks that you have
contains information at every block about all of the buildings that are present and absent at the block in question.
For instance, for every block, you might know whether a school, a pool, an office, and a gym are present.

In order to optimize your life, you want to pick an apartment block such that you minimize the farthest distance you'd
have to walk from your apartment to reach any of your required buildings.

Write a function that takes in a list of contiguous blocks on a specific street and a list of your required buildings
and that returns the location (the index) of the block that's most optimal for you.

If there are multiple most optimal blocks, your function can return the index of any one of them.

## Sample Input

```json
{
  "blocks": [
    {"gym": false, "school": true, "store": false},
    {"gym": true, "school": false, "store": false},
    {"gym": true, "school": true, "store": false},
    {"gym": false, "school": true, "store": false},
    {"gym": false, "school": true, "store": true}
  ],
  "reqs": ["gym", "school", "store"]
}
```

## Sample Output

```json
3
```

## Hints

### Hint 1

For every block, you want to go through every requirement, and for every requirement, you want to find the closest other
block with that requirement (or rather, the smallest distance to another block with that requirement).
Once you've done that for every requirement and for every block, you want to pick, for every block, the distance of the
farthest requirement. You can do this with three nested "for" loops.

### Hint 2

Is there a way to optimize on the solution mentioned in Hint #1 (that uses three nested "for" loops) by precomputing the
smallest distances of every requirement from every block?

### Hint 3

For every requirement, you should be able to precompute its smallest distances from every block by doing two simple
passes though the array of blocks: one pass from left to right and one pass
from right to left. Once you have these precomputed values, you can iterate through all of the blocks and pick the
biggest of all the precomputed distances at that block.

## Optimal Space & Time Complexity

O(br) time | O(br) space - where b is the number of blocks and r is the number of requirements

## Test Cases

### Test Case 1

```json
{
  "blocks": [
    {
      "gym": false,
      "school": true,
      "store": false
    },
    {
      "gym": true,
      "school": false,
      "store": false
    },
    {
      "gym": true,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "school": true,
      "store": true
    }
  ],
  "reqs": ["gym", "school", "store"]
}
```

### Test Case 2

```json
{
  "blocks": [
    {
      "gym": false,
      "office": true,
      "school": true,
      "store": false
    },
    {
      "gym": true,
      "office": false,
      "school": false,
      "store": false
    },
    {
      "gym": true,
      "office": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "school": true,
      "store": true
    }
  ],
  "reqs": ["gym", "office", "school", "store"]
}
```

### Test Case 3

```json
{
  "blocks": [
    {
      "gym": false,
      "office": true,
      "school": true,
      "store": false
    },
    {
      "gym": true,
      "office": false,
      "school": false,
      "store": false
    },
    {
      "gym": true,
      "office": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "school": true,
      "store": true
    }
  ],
  "reqs": ["gym", "office", "school", "store"]
}
```

### Test Case 4

```json
{
  "blocks": [
    {
      "foo": true,
      "gym": false,
      "kappa": false,
      "office": true,
      "school": true,
      "store": false
    },
    {
      "foo": true,
      "gym": true,
      "kappa": false,
      "office": false,
      "school": false,
      "store": false
    },
    {
      "foo": true,
      "gym": true,
      "kappa": false,
      "office": false,
      "school": true,
      "store": false
    },
    {
      "foo": true,
      "gym": false,
      "kappa": false,
      "office": false,
      "school": true,
      "store": false
    },
    {
      "foo": true,
      "gym": true,
      "kappa": false,
      "office": false,
      "school": true,
      "store": false
    },
    {
      "foo": true,
      "gym": false,
      "kappa": false,
      "office": false,
      "school": true,
      "store": true
    }
  ],
  "reqs": ["gym", "school", "store"]
}
```

### Test Case 5

```json
{
  "blocks": [
    {
      "gym": true,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "school": false,
      "store": true
    },
    {
      "gym": true,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "school": true,
      "store": false
    }
  ],
  "reqs": ["gym", "school", "store"]
}
```

### Test Case 6

```json
{
  "blocks": [
    {
      "gym": true,
      "pool": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "pool": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "pool": false,
      "school": false,
      "store": true
    },
    {
      "gym": true,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "pool": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "pool": true,
      "school": false,
      "store": false
    }
  ],
  "reqs": ["gym", "pool", "school", "store"]
}
```

### Test Case 7

```json
{
  "blocks": [
    {
      "gym": true,
      "office": false,
      "pool": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "office": true,
      "pool": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "office": true,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "pool": false,
      "school": false,
      "store": true
    },
    {
      "gym": true,
      "office": true,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "pool": true,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "pool": false,
      "school": false,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "pool": false,
      "school": true,
      "store": false
    },
    {
      "gym": false,
      "office": false,
      "pool": true,
      "school": false,
      "store": false
    }
  ],
  "reqs": ["gym", "pool", "school", "store"]
}
```
