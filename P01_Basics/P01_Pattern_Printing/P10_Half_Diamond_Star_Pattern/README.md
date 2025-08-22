# ⭐ Star Triangle Pattern (Pyramid Up and Down)

## Problem Statement

Given an integer `N`, print a **symmetric triangle star pattern** where:  

- The pattern first increases from `1` star to `N` stars.  
- Then it decreases back down to `1` star.  
- Each star (`*`) is separated by a single space.  

---

## Example (N = 5)

```
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
```

---

## Input Format

- A single integer `N` (`1 ≤ N ≤ 1000` recommended).

## Output Format

- Print the star pattern with `2 × N − 1` rows.  
- Each row contains stars separated by exactly one space.  
- No trailing spaces at the end of a line.  

---

## Examples

### Example 1

**Input**

```
N = 6
```

**Output**

```
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
*
```

---

## Constraints & Notes

- `1 ≤ N`  
- Must avoid trailing spaces after the last star.  
- Star count always increases by `1` per row until row `N`, then decreases symmetrically.  

---

## Intuition

This pattern can be thought of as:

1. **Top Half (Increasing Triangle)**  
   - Row `i` (1 to N): contains `i` stars separated by spaces.  

2. **Bottom Half (Decreasing Triangle)**  
   - Row `i` (N−1 down to 1): contains `i` stars separated by spaces.  

---

## Step-by-Step Approach

1. Read input `N`.  
2. Loop `i = 1` to `N`: print row with `i` stars.  
3. Loop `i = N-1` down to `1`: print row with `i` stars.  
4. Ensure no trailing spaces at the end of each row.  

---

## Algorithm (High Level)

1. For top half (`i = 1` to `N`):  
   - Print `i` stars separated by spaces.  

2. For bottom half (`i = N−1` down to `1`):  
   - Print `i` stars separated by spaces.  

---

## Time & Space Complexity

- **Time Complexity:** `O(N²)` — Printing up to `N` stars across `2N−1` rows.  
- **Space Complexity:** `O(1)` — Extra space aside from the output itself.  

---

## Edge Cases

- `N = 1` → single `*`.  
- Large `N` should still align properly.  
- Must avoid extra spaces at the end of each row.  

---

## Common Pitfalls

- Printing extra spaces after the last star.  
- Forgetting to stop the bottom half at `i = 1` (avoiding duplicate middle row).

---

## Hints

- **Hint 1:** Think of it as two right-angled triangles joined at the base.  
- **Hint 2:** Use nested loops: outer loop for rows, inner loop for stars.  
- **Hint 3:** Be careful with trailing spaces — last star in a row should not be followed by space.  

---

## Extensions

- Print the same pattern with different characters (e.g., `#`, `+`).  
- Print a **hollow version** (only print first and last star of each row).  
- Print **mirrored version** aligned to the right side.  


