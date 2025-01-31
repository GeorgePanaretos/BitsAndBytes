```markdown
# Plus Minus

## Problem Statement

Given an array of integers, calculate the ratios of its elements that are **positive**, **negative**, and **zero**. Print the decimal value of each fraction on a new line with **6 decimal places**.

## Example

Consider the array:

```
[-4, 3, -9, 0, 4, 1]
```

- **Positive numbers**: `3, 4, 1` → **3 elements**
- **Negative numbers**: `-4, -9` → **2 elements**
- **Zero numbers**: `0` → **1 element**

The ratios are:

```
3/6 = 0.500000
2/6 = 0.333333
1/6 = 0.166667
```

## Function Description

Implement the function:

```java
void plusMinus(int[] arr)
```

### Parameters:
- `arr[n]`: An array of integers.

### Output:
- Print the ratios of **positive**, **negative**, and **zero** values in the array.
- Each value should be printed on a **separate line**, formatted to **6 decimal places**.

## Input Format

- The first line contains an integer, `n`, the number of elements in the array.
- The second line contains `n` space-separated integers.

## Constraints

- `1 ≤ n ≤ 100`
- `-100 ≤ arr[i] ≤ 100`

## Output Format

Print the following **three** lines:

1. **Proportion of positive values**
2. **Proportion of negative values**
3. **Proportion of zeros**

Each printed value should be formatted to **6 decimal places**.

## Sample Input

```
6
-4 3 -9 0 4 1
```

## Sample Output

```
0.500000
0.333333
0.166667
```

## Explanation

- **3 positive numbers** → `3/6 = 0.500000`
- **2 negative numbers** → `2/6 = 0.333333`
- **1 zero** → `1/6 = 0.166667`

Each proportion is printed with **6 decimal places**.
```
