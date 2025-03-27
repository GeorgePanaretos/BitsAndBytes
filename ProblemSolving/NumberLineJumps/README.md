## Kangaroo Problem

You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e., toward positive infinity).

The first kangaroo starts at location `x1` and moves at a rate of `v1` meters per jump.  
The second kangaroo starts at location `x2` and moves at a rate of `v2` meters per jump.  
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.  
If it is possible, return `YES`, otherwise return `NO`.

---

### Example

After one jump, they are both at the same location `(x1 + v1 == x2 + v2)`, so the answer is `YES`.

---

### Function Description

Complete the function `kangaroo` in the editor below.

```java
public static String kangaroo(int x1, int v1, int x2, int v2)
```

#### Parameters:

- `int x1`, `int v1`: starting position and jump distance for kangaroo 1  
- `int x2`, `int v2`: starting position and jump distance for kangaroo 2

#### Returns:

- `String`: either `"YES"` or `"NO"`

---

### Input Format

A single line of four space-separated integers denoting the respective values of `x1`, `v1`, `x2`, and `v2`.

---

### Constraints

---

### Sample Input 0

```
0 3 4 2
```

### Sample Output 0

```
YES
```

### Explanation 0

The two kangaroos jump through the following sequence of locations:

![Kangaroo Jump](https://s3.amazonaws.com/hr-assets/0/1516005283-e74e76ff0c-kangaroo.png)

They meet at the same location (number 12 on the number line) after the same number of jumps (4 jumps), so the result is `YES`.

---

### Sample Input 1

```
0 2 5 3
```

### Sample Output 1

```
NO
```

### Explanation 1

The second kangaroo has a starting location that is ahead (further to the right) of the first kangaroo's starting location (i.e., x2 > x1).  
Because the second kangaroo moves at a faster rate (v2 > v1) and is already ahead of the first kangaroo, the first kangaroo will never be able to catch up.  
Thus, we print `NO`.

---
