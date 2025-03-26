# HackerLand University Grading System

HackerLand University has the following grading policy:

- Every student receives a grade in the inclusive range from **0 to 100**.
- Any grade less than **38** is considered a **failing grade**.
- Sam, a professor at the university, rounds each student's grade according to these rules:

### Rounding Rules:

1. If the grade is less than **38**, no rounding occurs — it remains a failing grade.
2. If the difference between the grade and the next multiple of 5 is **less than 3**, round the grade up to that multiple.
3. If the difference is **3 or more**, the grade remains unchanged.

---

## 🔢 Function Signature

```java
public static List<Integer> gradingStudents(List<Integer> grades)
```

### Parameters:

- `grades`: A list of integers representing students' grades before rounding.

### Returns:

- A list of integers representing the grades after applying the rounding rules.

---

## 🧪 Sample Input

```
4
73
67
38
33
```

## ✅ Sample Output

```
75
67
40
33
```

---

## 💡 Explanation

| Original Grade | Next Multiple of 5 | Difference | Rounded? | Final Grade |
|----------------|--------------------|------------|----------|--------------|
| 73             | 75                 | 2          | ✅ Yes    | 75           |
| 67             | 70                 | 3          | ❌ No     | 67           |
| 38             | 40                 | 2          | ✅ Yes    | 40           |
| 33             | -                  | -          | ❌ No     | 33           |

---

## 🧱 Constraints

- `1 <= n <= 60`
- `0 <= grade <= 100`

---

## 📘 Sample Java Implementation (Classic Loop)

```java
public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> finalGrades = new ArrayList<>();
    for (int grade : grades) {
        if (grade < 38) {
            finalGrades.add(grade);
        } else {
            int nextMultiple = ((grade + 4) / 5) * 5;
            finalGrades.add(nextMultiple - grade < 3 ? nextMultiple : grade);
        }
    }
    return finalGrades;
}
```

---

## ⚡ Stream API Implementation (Functional Style)

```java
public static List<Integer> gradingStudents(List<Integer> grades) {
    return grades.stream()
        .map(grade -> {
            if (grade < 38) return grade;
            int nextMultiple = ((grade + 4) / 5) * 5;
            return (nextMultiple - grade < 3) ? nextMultiple : grade;
        })
        .collect(Collectors.toList());
}
```

This version leverages Java Stream API to create a more concise, readable, and functional-style implementation of the rounding logic.

---

## 🏁 How to Use

1. Read an integer `n` representing the number of students.
2. Read `n` lines of integer grades.
3. Pass the list to the `gradingStudents()` function.
4. Print the final grades after rounding.
