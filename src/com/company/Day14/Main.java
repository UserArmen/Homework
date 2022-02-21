package com.company.Day14;

public class Main {

    public static void main(String[] args) {

    }

    /**
     * 1.Write a function which returns the length of a given String.
     */
    public static int lengthOfString(String str) {
        return str.length();

    }

    /**
     * 2.Write a function which returns a character of a given index,from a given String. Pass as a
     * parameters String str, int index
     */
    public static char indexOfString(String str, int index) {
        return str.charAt(index);
    }

    /**
     * 3.Write a function which checks if the given String contains a given character.Pass as parameters
     * String str, char ch
     */
    public static boolean checkIsSymbol(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    /**
     * 4.Write a function which returns the count of vowels of a given String
     * - - write also an overloaded function which returns count of constants.
     */
    public static int vowelsOfStr(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                    vowelCount++;
            }
        }
        return vowelCount;
    }

    /**
     * 5.Write a function called reverseString, which prompts the user for a String, and prints the
     * reverse of the String by extracting and processing each character. The output shall look like:
     * Enter a String: abcdef
     * The reverse of the String &quot;abcdef&quot; is &quot;fedcba&quot;
     */
    public static String reversOfString(String str) {
        String str1 = new String();
        for (int i = 0; i < str.length(); i++) {
            str1 += str.charAt(str.length() - i - 1);
        }
        return str1;
    }

    /**
     * 6.Write a program called countVowelsDigits, which get as parameter a String, counts the
     * number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints
     * the counts and the percentages (rounded to 2 decimal places).
     */
    public static void valueOfStr(String str) {

        double percentOfVowels = (double) vowelsOfStr(str) * 100 / str.length();
        double percentOfStrNum = (double) valueOfStrNum(str) * 100 / str.length();
        System.out.printf("Number of digits: %d,(%f)", valueOfStrNum(str), percentOfStrNum);
        System.out.printf("Number of vowels: %d,(%f)", vowelsOfStr(str), percentOfVowels);

    }

    public static int valueOfStrNum(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '0' && str.charAt(i) < '9') {
                count++;
            }
        }
        return count;
    }

    /**
     * 7.Caesar&#39;s Code is one of the simplest encryption techniques. Each letter in the plaintext is
     * replaced by a letter with some fixed number of positions (n) down the alphabet cyclically.
     */
    public void cesar(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + n > 90) {
                int m = str.charAt(i) + n - 90;
                s += (char) (64 + m);
            } else if (str.charAt(i) + n > 122) {
                int m = str.charAt(i) + n - 122;
                s += (char) (96 + m);
            } else {
                char c = (char) (str.charAt(i) + n);
                s += c;
            }
        }
        System.out.println(s);
    }

    /**
     * 8.Write a function to check if the passed String palindrome or not
     * Print “xxx” is|is not a Palindrome.
     */
    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        String str1 = (reversOfString(str));
        return str1.equals(str);
    }

    /**
     * 9.The binary number system uses 2 symbols, 0 and 1. Write a function called checkBinStr to
     * verify a binary string. The program shall prompt the user for a binary string; and decide if the input
     * string is a valid binary string.
     */
    public static boolean checkBinStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '2') {
                return false;
            }
        }
        return true;
    }

    /**
     * 10.The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f). Write a
     * program to verify a hex string. The function gets a hex string; and decides if the input string is a
     * valid hex string.
     */
    public static boolean hexadecimal(String str) {
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' && (str.charAt(i) > 'F' || str.charAt(i) < '0' && str.charAt(i) < 'A')) {
                return false;
            }
        }
        return true;
    }

    /**
     * 11.Write a function called bin2Dec to convert an input binary string into its equivalent decimal
     * number. Your output shall look like:
     */
    public static int binaryConvertToDecimal(String str) {


        int num = Integer.parseInt(str, 2);

        return num;
    }

    /**
     * 12.Write a function that counts duplicate characters from a given string.
     */
    public static int countOfDuplicate(String str) {
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    /**
     * 13.Write a function that returns the first non-repeated character from a given string.
     */
        public static char firstNonRepeated(String str){
            char [] ch = str.toCharArray();
            for (int i = 0; i <str.length()-1 ; i++) {
                if (ch[i]==ch[i+1]){
                    return ch[i];
                }
            }
            return 0;
        }
    /**
     * 14.Write a function that counts occurrences of a certain character in a given string.
     * Pass as a argument (String str, char ch)
     */
    public static int countsOfOccurrences(String str, char ch){
       int count = 0;
        char [] ch1 = str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            if (ch1[i]==ch){
                count++;
            }
        }
        return count;
    }
}




