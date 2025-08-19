# Pattern Printing — Decreasing Rows

## Problem Statement
Given a positive integer `n`, print a pattern where the first row contains the numbers `1` to `n`.  
Each subsequent row contains one number fewer than the previous row, ending with a single `1`.

## Input Format
- A single integer `n` — the number of elements in the first row.

## Output Format
- Print `n` lines.
- On the `i`-th line (1-indexed), print the numbers from `1` to `n - i + 1`, separated by a single space.
- Do not print trailing spaces on any line.

## Constraints
- `1 ≤ n ≤ 100`

## Example 1

**Input**

`N = 5`

**Output**

```
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```


## Example 2

**Input**

`N = 3`

**Output**

```
1 2 3
1 2
1
```


## Notes
- Ensure exactly one space between numbers.
- No extra blank lines before, between, or after the output lines.

