```markdown
# Staircase

## Problem Statement

Given a number `n`, print a staircase of size `n` using `#` symbols and spaces. The staircase should be **right-aligned**.

## Example

For `n = 6`, the output should be:

```
     #
    ##
   ###
  ####
 #####
######
```

## Function Description

Implement the function:

```java
void staircase(int n)
```

### Parameters:
- `n`: An integer representing the size of the staircase.

### Output:
- Print a staircase of size `n` using `#` symbols and spaces.

## Input Format

- A **single integer**, `n`, representing the size of the staircase.

## Constraints

- `1 ≤ n ≤ 100`

## Output Format

- Print a staircase of size `n` where:
  - The last row contains exactly `n` `#` symbols.
  - Each row above has one less `#` symbol and is **right-aligned**.

## Sample Input

```
6
```

## Sample Output

```
     #
    ##
   ###
  ####
 #####
######
```

## Explanation

- The staircase is **right-aligned**.
- The number of `#` symbols in each row increases from `1` to `n`.
- The remaining spaces before `#` ensure **right alignment**.
```
