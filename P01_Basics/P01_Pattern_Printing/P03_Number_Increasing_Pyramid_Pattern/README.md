# Number-Increasing Pyramid Pattern

Print a pyramid of numbers where each row starts from **1** and increases up to the row number.

---

## Example

**Input**: `N = 6`

**Output**:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
```

> Each row prints numbers from 1 up to the row index.

---

## Problem Statement

Given an integer `N` (the number of rows), print a number-increasing pyramid with `N` rows. In the `i`th row, print numbers from `1` to `i`, separated by spaces.

* `N ≥ 1`

---

## Constraints

* `1 ≤ N ≤ 10^3` (printing time grows with `N²`)
* Numbers are separated by spaces.

---

### Complexity

* **Time**: `O(N²)` (total numbers printed = N(N+1)/2)
* **Space**: `O(1)` (only counters)

---

## I/O Format

**Input**

```
N
```

**Output**

```
Row 1: "1"
Row 2: "1 2"
...
Row N: "1 2 ... N"
```

---

## Edge Cases

* `N = 1` → prints only `1`.
* Large `N` → lots of numbers, so printing can be slow.

---

## Testing

```
N=3
1
1 2
1 2 3
```

```
N=5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

---

## Common Pitfalls

* Forgetting to print a space after numbers.
* Printing extra spaces at end of line (acceptable in most problems, but may need trimming in strict cases).
* Off-by-one loop errors.

---

## Variations

* Number-decreasing pyramid (start from i down to 1).
* Continuous number pyramid (numbers increase globally across rows).
* Centered pyramid with spaces to align numbers in middle.
