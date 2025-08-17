# Number Triangle Pattern

Print a centered number triangle where each row `i` contains the number `i` repeated `i` times, aligned as a pyramid.

---

## Example

**Input**: `N = 6`

**Output**:

```
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6
```

> Each row is indented with spaces to form a triangle shape.

---

## Problem Statement

Given an integer `N` (the number of rows), print a number triangle pattern such that:

* Row `i` contains the number `i`, repeated `i` times, separated by spaces.
* Rows are center-aligned by padding spaces on the left.

---

## Constraints

* `1 ≤ N ≤ 10^3`
* Numbers are separated by spaces.

---

## Approach

1. For each row `i` (1 to N):

   * Print `(N - i)` spaces before the numbers.
   * Print the number `i`, repeated `i` times with a space after each.
2. Move to the next line after printing each row.

### Complexity

* **Time**: `O(N²)` (total numbers and spaces printed)
* **Space**: `O(1)`

---

## I/O Format

**Input**

```
N
```

**Output**

```
Centered triangle pattern with numbers as described.
```

---

## Edge Cases

* `N = 1` → prints just `1`.
* Large `N` → printing may be slow but works.

---

## Testing

```
N=3
  1
 2 2
3 3 3
```

```
N=5
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
```

---

## Common Pitfalls

* Forgetting spaces before numbers, which breaks the pyramid shape.
* Extra trailing spaces after numbers (usually acceptable unless strict format is required).
* Miscounting leading spaces (should be `N - i`).

---

## Variations

* Continuous increasing numbers instead of repeating the row number.
* Hollow number triangle (only borders printed).
* Inverted number triangle.

