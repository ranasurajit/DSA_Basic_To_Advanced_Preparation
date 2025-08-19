# Pattern Printing — Pyramid of Stars

## Problem Statement
Given a positive integer `n`, print a pyramid pattern of stars (`*`).  
The pyramid has `n` rows, where the `i`-th row contains `i` stars, aligned in the center.

## Input Format
- A single integer `n` — the number of rows in the pyramid.

## Output Format
- Print `n` lines.
- On the `i`-th line (1-indexed), print `i` stars separated by a space.
- Each line should be centered such that the last row has no leading spaces.

## Constraints
- `1 ≤ n ≤ 100`

## Example 1

**Input**

`N = 5`

**Output**

```
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
```


## Example 2

**Input**

`N = 3`

**Output**

```
    * 
   * * 
  * * *
```


## Explanation
- The first row is right-aligned with `n-1` leading spaces and `1` star.  
- Each subsequent row increases the number of stars by 1 and decreases the leading spaces by 1.  
- Continue until the `n`-th row, which has `n` stars and no leading spaces.


