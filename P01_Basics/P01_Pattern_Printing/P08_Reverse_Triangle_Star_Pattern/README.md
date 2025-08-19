# Pattern Printing — Inverted Pyramid of Stars

## Problem Statement
Given a positive integer `n`, print an inverted pyramid pattern of stars (`*`).  
The first row contains `n` stars, and each subsequent row contains one fewer star, aligned to the right.

## Input Format
- A single integer `n` — the number of stars in the first row.

## Output Format
- Print `n` lines.
- On the `i`-th line (1-indexed), print `n - i + 1` stars separated by a space.
- Each line should be right-aligned, so the first star of each row shifts one position to the right compared to the row above.

## Constraints
- `1 ≤ n ≤ 100`


## Example 1

**Input**

`N = 5`

**Output**

```
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
```


## Example 2

**Input**

`N = 3`

**Output**

```
* * * 
 * * 
  * 
```


## Explanation
- The first row starts with `n` stars and no leading spaces.  
- Each subsequent row reduces the number of stars by `1` and increases the leading spaces by `1`.  
- Continue until the last row, which contains a single star with `n-1` leading spaces.


