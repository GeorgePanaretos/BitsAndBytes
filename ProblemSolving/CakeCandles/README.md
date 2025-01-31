```markdown
# Birthday Cake Candles

## Problem Statement

You are in charge of the cake for a child's birthday. The cake will have **one candle for each year** of the child's total age. The child can only blow out the **tallest** candles. Your task is to count how many of the candles are the tallest.

## Example

For the input:

```
4
3 2 1 3
```

- The **tallest candle** height is `3`.
- There are **two** candles with this height.

The output should be:

```
2
```

## Function Description

Implement the function:

```java
int birthdayCakeCandles(int[] candles)
```

### Parameters:
- `candles[n]`: An array of integers representing the height of each candle.

### Returns:
- `int`: The number of candles that are the tallest.

## Input Format

- The first line contains a **single integer**, `n`, the number of candles.
- The second line contains `n` **space-separated integers**, where each integer represents the height of a candle.

## Constraints

- `1 ≤ n ≤ 10^5`
- `1 ≤ candles[i] ≤ 10^7`

## Output Format

- Print a **single integer**, the number of tallest candles.

## Sample Input

```
4
3 2 1 3
```

## Sample Output

```
2
```

## Explanation

The candle heights are: `[3, 2, 1, 3]`.

- The **tallest candle height** is `3`.
- There are **two** candles with this height.

So, the output is `2`.
```
