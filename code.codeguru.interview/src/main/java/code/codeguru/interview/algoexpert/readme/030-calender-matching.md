# Calendar Matching

You and a coworker want to schedule a meeting of a given duration. You each have a calendar for the day that lists your
meetings as `[startTime, endTime]` pairs (in 24-hour format, e.g. `9:00`, `13:30`). You also each have daily bounds:
`[earliestAvailable, latestAvailable]`. Return all time blocks during which the meeting can be scheduled, ordered from
earliest to latest. A returned time block should be a `[startTime, endTime]` pair and must be at least the meeting
duration.

Times are inclusive at the start and exclusive at the end (standard meeting interpretation). All input calendar meetings
are sorted by their start times.

## Sample Input

```python
calendar1 = [["9:00", "10:30"], ["12:00", "13:00"], ["16:00", "18:00"]]
dailyBounds1 = ["9:00", "20:00"]
calendar2 = [["10:00", "11:30"], ["12:30", "14:30"], ["14:30", "15:00"], ["16:00", "17:00"]]
dailyBounds2 = ["10:00", "18:30"]
meetingDuration = 30
```

## Sample Output

```python
[["11:30", "12:00"], ["15:00", "16:00"], ["18:00", "18:30"]]
```

## Hints

### Hint 1

First build a unified list of all "unavailable" intervals by combining both calendars and the daily bounds (treat bounds
outside availability as blocking intervals).

### Hint 2

Merge overlapping and back‑to‑back intervals to get a minimal set of blocked time ranges.

### Hint 3

Scan the gaps between merged blocked intervals; any gap whose length is at least the meeting duration is a candidate.
Convert minutes back to `H:MM` strings.

### Optimal Space & Time Complexity

O(c1 + c2) time | O(c1 + c2) space, where c1 and c2 are the counts of meetings in the two calendars.

## Test Cases

### Test Case 1

```json
{
  "calendar1": [["9:00", "10:30"], ["12:00", "13:00"], ["16:00", "18:00"]],
  "dailyBounds1": ["9:00", "20:00"],
  "calendar2": [["10:00", "11:30"], ["12:30", "14:30"], ["14:30", "15:00"], ["16:00", "17:00"]],
  "dailyBounds2": ["10:00", "18:30"],
  "meetingDuration": 30
}
```

### Test Case 2

```json
{
  "calendar1": [["9:00", "10:30"], ["12:00", "13:00"], ["16:00", "18:00"]],
  "dailyBounds1": ["9:00", "20:00"],
  "calendar2": [["10:00", "11:30"], ["12:30", "14:30"], ["14:30", "15:00"], ["16:00", "17:00"]],
  "dailyBounds2": ["10:00", "18:30"],
  "meetingDuration": 30
}
```

### Test Case 3

```json
{
  "calendar1": [["9:00", "10:30"], ["12:00", "13:00"], ["16:00", "18:00"]],
  "dailyBounds1": ["9:00", "20:00"],
  "calendar2": [["10:00", "11:30"], ["12:30", "14:30"], ["14:30", "15:00"], ["16:00", "17:00"]],
  "dailyBounds2": ["10:00", "18:30"],
  "meetingDuration": 45
}
```

### Test Case 4

```json
{
  "calendar1": [["9:00", "10:30"], ["12:00", "13:00"], ["16:00", "18:00"]],
  "dailyBounds1": ["8:00", "20:00"],
  "calendar2": [["10:00", "11:30"], ["12:30", "14:30"], ["14:30", "15:00"], ["16:00", "17:00"]],
  "dailyBounds2": ["7:00", "18:30"],
  "meetingDuration": 45
}
```

### Test Case 5

```json
{
  "calendar1": [["8:00", "10:30"], ["8:00", "10:30"], ["11:30", "13:00"], ["14:00", "16:00"], ["16:00", "18:00"]],
  "dailyBounds1": ["8:00", "18:00"],
  "calendar2": [["10:00", "11:30"], ["12:30", "14:30"], ["14:30", "15:00"], ["16:00", "17:00"]],
  "dailyBounds2": ["7:00", "18:30"],
  "meetingDuration": 15
}
```

### Test Case 6

```json
{
  "calendar1": [["10:00", "10:30"], ["10:45", "11:15"], ["11:30", "13:00"], ["14:15", "16:00"], ["16:00", "18:00"]],
  "dailyBounds1": ["9:30", "20:00"],
  "calendar2": [["10:00", "11:00"], ["12:30", "13:30"], ["14:30", "15:00"], ["16:00", "17:00"]],
  "dailyBounds2": ["9:00", "18:30"],
  "meetingDuration": 15
}
```

### Test Case 7

```json
{
  "calendar1": [["10:00", "10:30"], ["10:45", "11:15"], ["11:30", "13:00"], ["14:15", "16:00"], ["16:00", "18:00"]],
  "dailyBounds1": ["9:30", "20:00"],
  "calendar2": [["10:00", "11:00"], ["10:30", "20:30"]],
  "dailyBounds2": ["9:00", "22:30"],
  "meetingDuration": 60
}
```

### Test Case 8

```json
{
  "calendar1": [["10:00", "10:30"], ["10:45", "11:15"], ["11:30", "13:00"], ["14:15", "16:00"], ["16:00", "18:00"]],
  "dailyBounds1": ["9:30", "20:00"],
  "calendar2": [["10:00", "11:00"], ["10:30", "16:30"]],
  "dailyBounds2": ["9:00", "22:30"],
  "meetingDuration": 60
}
```

### Test Case 9

```json
{
  "calendar1": [],
  "dailyBounds1": ["9:30", "20:00"],
  "calendar2": [],
  "dailyBounds2": ["9:00", "16:30"],
  "meetingDuration": 60
}
```

### Test Case 10

```json
{
  "calendar1": [],
  "dailyBounds1": ["9:00", "16:30"],
  "calendar2": [],
  "dailyBounds2": ["9:30", "20:00"],
  "meetingDuration": 60
}
```

### Test Case 11

```json
{
  "calendar1": [],
  "dailyBounds1": ["9:30", "16:30"],
  "calendar2": [],
  "dailyBounds2": ["9:30", "16:30"],
  "meetingDuration": 60
}
```

### Test Case 12

```json
{
  "calendar1": [["7:00", "7:45"], ["8:15", "8:30"], ["9:00", "10:30"], ["12:00", "14:00"], ["14:00", "15:00"], ["15:15", "15:30"], ["16:30", "18:30"], ["20:00", "21:00"]],
  "dailyBounds1": ["6:30", "22:00"],
  "calendar2": [["9:00", "10:00"], ["11:15", "11:30"], ["11:45", "17:00"], ["17:30", "19:00"], ["20:00", "22:15"]],
  "dailyBounds2": ["8:00", "22:30"],
  "meetingDuration": 30
}
```
