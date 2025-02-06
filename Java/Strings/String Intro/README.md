# Java Strings Exercise

## Introduction
This exercise tests your understanding of Java Strings. Strings in Java are sequences of characters, and their properties can be manipulated using built-in methods.

## Problem Statement
Given two strings, `A` and `B`, perform the following operations:
1. Compute the sum of their lengths.
2. Determine if `A` is lexicographically greater than `B`.
3. Capitalize the first letter of both `A` and `B` and print them on a single line, separated by a space.

## Input Format
- The first line contains a string `A`.
- The second line contains another string `B`.
- Both strings consist only of lowercase English letters.

## Output Format
Your program should produce three lines of output:
1. The sum of the lengths of `A` and `B`.
2. "Yes" if `A` is lexicographically greater than `B`, otherwise "No".
3. The capitalized versions of `A` and `B`, printed on a single line separated by a space.

## Example
### **Input**
```
hello
java
```

### **Output**
```
9
No
Hello Java
```

## Explanation
- The length of `hello` is `5`, and the length of `java` is `4`. Their total length is `9`.
- Lexicographically, "hello" comes before "java", so `A` is not greater than `B`, and the output is "No".
- The first letters of `hello` and `java` are capitalized, resulting in "Hello Java".

## How to Run the Program
1. Write a Java program that implements the described operations.
2. Compile and run the program.
3. Enter two lowercase strings as input.
4. Observe the output as per the specifications.

## Summary
This exercise reinforces key Java String operations such as:
- Determining string length (`length()`)
- Lexicographical comparison (`compareTo()`)
- String manipulation (`substring()`, `toUpperCase()`).

Happy coding! 🚀
