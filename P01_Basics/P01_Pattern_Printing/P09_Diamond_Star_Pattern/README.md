# ⭐ Diamond Star Pattern

## Problem Statement

Given an integer `N` (number of rows in the **top half**, including the middle line), print a centered **diamond** made of asterisks (`*`).  

- The diamond’s **total height** is `2 × N − 1`.  
- The diamond’s **maximum width** (middle line) is `2 × N − 1` characters.  
- Each line is **centered** using leading spaces.

---

## Example (N = 6)

            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * * * 
  * * * * * * * * * * * 
    * * * * * * * * * 
      * * * * * * * 
        * * * * * 
          * * * 
            *



---

## Input Format

- A single integer `N` (`1 ≤ N ≤ 1000` recommended).

## Output Format

- Print `2 × N − 1` lines forming the centered diamond.
- No trailing spaces on any line.

---

## Examples

### Example 1

**Input**

```
N = 6
```

**Output**

            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 
  * * * * * * * * * * * 
  * * * * * * * * * * * 
    * * * * * * * * * 
      * * * * * * * 
        * * * * * 
          * * * 
            *



### Example 2

**Input**

```
N = 4
```

**Output**

        * 
      * * * 
    * * * * * 
  * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *


---

## Constraints & Notes

- `1 ≤ N`  
- Ensure **no extra spaces** at the end of lines.  
- Use **spaces** (not tabs) for alignment.  

---

## Intuition

The diamond is two pyramids back-to-back:

1. **Top pyramid** (increasing stars): for `i = 1 … N`  
   - `spaces = N − i`  
   - `stars  = 2 × i − 1`  

2. **Bottom pyramid** (decreasing stars): for `i = N − 1 … 1`  
   - `spaces = N − i`  
   - `stars  = 2 × i − 1`  

Each line is `" " * spaces + "*" * stars`.

---

## Step-by-Step Approach

1. Read `N`.  
2. Loop `i` from `1` to `N` and print the top half.  
3. Loop `i` from `N−1` down to `1` and print the bottom half.  
4. Avoid trailing spaces.  

---

## Algorithm (High Level)

1. **Top Half**  
   - For `i = 1` to `N`:  
     - Print `(N − i)` spaces  
     - Print `(2i − 1)` stars  

2. **Bottom Half**  
   - For `i = N − 1` down to `1`:  
     - Print `(N − i)` spaces  
     - Print `(2i − 1)` stars  

---

## Time & Space Complexity

- **Time:** `O(N²)` — You print ~`(2N−1)` lines with up to `2N−1` characters each.  
- **Space:** `O(1)` extra space.  

---

## Edge Cases

- `N = 1` → single `*`.  
- Very large `N` → ensure console width supports `2N−1` characters.  
- No trailing spaces after the last `*`.  

---

## Common Pitfalls

- Off-by-one in star count (should be `2i−1`).  
- Using tabs instead of spaces (misalignment).  
- Printing the middle line twice.  

---

---

## Hints

- **Hint 1:** Stars are always odd in count.  
- **Hint 2:** Think of it as two pyramids sharing the middle line.  
- **Hint 3:** Use integer arithmetic only.  

---

## Extensions

- Print with different characters (e.g., `#`, `+`).  
- Create a **hollow diamond** (stars only on the border).  
- Print an **offset diamond** starting from a given column.


