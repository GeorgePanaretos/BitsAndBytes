```markdown
# Mini-Max Sum

## Problem Statement

Given **five positive integers**, find the **minimum and maximum** values that can be calculated by summing exactly **four** of the five integers. Then print the respective **minimum and maximum** values as a single line of two space-separated long integers.

## Example

For the input:

```
1 2 3 4 5
```

- The **minimum sum** is `1 + 2 + 3 + 4 = 10`
- The **maximum sum** is `2 + 3 + 4 + 5 = 14`

The output should be:

```
10 14
```

## Function Description

Implement the function:

```java
void miniMaxSum(int[] arr)
```

### Parameters:
- `arr[5]`: An array of **five** positive integers.

### Output:
- Print two space-separated integers:
  - **Minimum sum** of four elements.
  - **Maximum sum** of four elements.

## Input Format

- A single line containing **five space-separated integers**.

## Constraints

- `1 ≤ arr[i] ≤ 10^9`
- The output values **may exceed 32-bit integers**, so use a **64-bit integer type**.

## Output Format

- Print two space-separated long integers representing:
  1. The **minimum sum** (sum of the four smallest numbers).
  2. The **maximum sum** (sum of the four largest numbers).

## Sample Input

```
1 2 3 4 5
```

## Sample Output

```
10 14
```

## Explanation

The five numbers are: `1, 2, 3, 4, 5`.

- **Minimum sum**: Excluding `5`, sum of `1 + 2 + 3 + 4 = 10`
- **Maximum sum**: Excluding `1`, sum of `2 + 3 + 4 + 5 = 14`

Each sum is printed as a **64-bit integer**.
```
