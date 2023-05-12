public static String reverseString(String input) {
    char[] charArray = input.toCharArray();
    int start = 0;
    int end = input.length() - 1;
    
    while (start < end) {
        swap(charArray, start, end);
        start++;
        end--;
    }
    
    return new String(charArray);
}

private static void swap(char[] charArray, int i, int j) {
    char temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
}

public static String reverseString(String input) {
    return new StringBuilder(input).reverse().toString();
}
