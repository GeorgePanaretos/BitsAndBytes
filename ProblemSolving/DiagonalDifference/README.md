Here’s the markdown version with only the **problem description**, without the solution implementation:

```markdown
# Diagonal Difference

## Problem Statement

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

## Example

Consider the square matrix below:

```
1  2  3
4  5  6
9  8  9
```

- The left-to-right diagonal (primary diagonal) elements are `1, 5, 9`.
- The right-to-left diagonal (secondary diagonal) elements are `3, 5, 9`.

The absolute difference between their sums is:

```
| (1 + 5 + 9) - (3 + 5 + 9) |
```

## Function Description

Complete the function:

```java
int diagonalDifference(int[][] arr)
```

### Parameters:
- `arr[n][n]`: A square matrix of integers.

### Return:
- `int`: The absolute diagonal difference.

## Input Format

- The first line contains a single integer, `n`, the number of rows and columns in the square matrix.
- Each of the next `n` lines describes a row and consists of `n` space-separated integers.

## Constraints

- The matrix is always square (i.e., `n x n`).

## Output Format

- Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

## Sample Input

```
3
11 2 4
4 5 6
10 8 -12
```

## Sample Output

```
15
```

## Explanation

The **primary diagonal** elements are:

```
11
   5
     -12
```
Sum: `11 + 5 + (-12) = 4`

The **secondary diagonal** elements are:

```
     4
   5
10
```
Sum: `4 + 5 + 10 = 19`

Absolute difference:

```
|4 - 19| = 15
```
```
