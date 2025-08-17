# Reverse Right Half Pyramid Pattern

Print a right half pyramid of characters inverted (decreasing row length) with height **N**. By default, the fill character is `*`.

---

## Example

**Input**: `N = 6`, `ch = '*'`

**Output**:

```
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
*
```

> Each row has one fewer character than the row above.

---

## Problem Statement

Given an integer `N` (the number of rows) and an optional character `ch`, print a reverse right half pyramid with `N` rows using `ch`.

* Row 1 has `N` characters.
* Row 2 has `N-1` characters.
* Row N has 1 character.
* If `ch` is not provided, use `*`.

---

## Constraints

* `1 ≤ N ≤ 10^4`
* Character `ch` is any printable character.

---

## Approach

The pyramid is formed by printing decreasing numbers of characters from N down to 1.

### Complexity

* **Time**: `O(N²)` (total printed characters = N(N+1)/2)
* **Space**: `O(N)` for one row string

---

## I/O Format

**Input**

```
N
[ch]
```

* `ch` on the second line is optional; if omitted, use `*`.

**Output**

```
Row 1: N copies of ch
Row 2: N-1 copies of ch
...
Row N: 1 copy of ch
```

---

## Edge Cases

* `N = 1` → prints a single character.
* Large `N` → avoid slow concatenation inside loops (use `StringBuilder` or pre-built row).

---

## Testing

```
N=3, ch=#
###
##
#
```

```
N=5, ch=*
*****
****
***
**
*
```

---

## Common Pitfalls

* Off-by-one loop bounds leading to empty rows or missing last row.
* Forgetting to reduce row length each iteration.

---

## Variations

* Inverted Left Half Pyramid (aligned to the right with spaces).
* Full Inverted Pyramid (centered with spaces).

