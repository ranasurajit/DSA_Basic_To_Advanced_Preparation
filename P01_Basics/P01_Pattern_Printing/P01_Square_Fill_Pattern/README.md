# Square Fill Pattern

Print a solid square of characters of size **N × N**. By default, the fill character is `*`.

---

## Example

**Input**: `N = 5`, `ch = '*'`

**Output**:

```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

> The pattern shows 5 rows and 5 columns of `*`.

---

## Problem Statement

Given an integer `N` (number of rows and columns) and an optional character `ch`, print a filled square with `N` rows and `N` columns using `ch`.

* If `ch` is not provided, use `*`.
* `N ≥ 1`.

---

## Constraints

* `1 ≤ N ≤ 10^4` (printing time grows with `N²`)
* Character `ch` is any printable character

---

## Approach

The square is formed by printing the same line `N` times. Each line is the character `ch` repeated `N` times.

### Complexity

* **Time**: `O(N²)` (you print `N × N` characters)
* **Space**: `O(N)` for the pre-built line (or `O(1)` if you print directly in a loop)


