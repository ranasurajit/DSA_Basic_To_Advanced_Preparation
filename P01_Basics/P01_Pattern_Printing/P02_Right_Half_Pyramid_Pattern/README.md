# Right Half Pyramid Pattern

Print a right half pyramid of characters of height **N**. By default, the fill character is `*`.

---

## Example

**Input**: `N = 6`, `ch = '*'`

**Output**:

```
*
**
***
****
*****
******
```

> The pyramid grows one character per row.

---

## Problem Statement

Given an integer `N` (the number of rows) and an optional character `ch`, print a right half pyramid with `N` rows using `ch`.

* If `ch` is not provided, use `*`.
* `N ≥ 1`.

---

## Constraints

* `1 ≤ N ≤ 10^4` (printing time grows with `N²`)
* Character `ch` is any printable character

---

## Approach

The pyramid is formed by printing increasing numbers of characters from 1 up to N.

### Complexity

* **Time**: `O(N²)` (total printed characters = 1 + 2 + … + N = N(N+1)/2)
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
Row 1: 1 copy of ch
Row 2: 2 copies of ch
...
Row N: N copies of ch
```

---

## Edge Cases

* `N = 1` → prints a single character.
* Large `N` → avoid string concatenation in nested loops (use `StringBuilder` or precompute row if needed).
* `ch` is whitespace → pattern looks blank; replace with visible symbol for debugging.

---

## Testing

```
N=3, ch=#
#
##
###
```

```
N=5, ch=*
*
**
***
****
*****
```

---

## Common Pitfalls

* Forgetting newline after each row.
* Printing the wrong number of characters per line.
* Off-by-one in loop bounds.

---

## Variations

* Left Half Pyramid (aligned to right with spaces).
* Full Pyramid (centered).
* Inverted Right Half Pyramid (start with N, decrease).
