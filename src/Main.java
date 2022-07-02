import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // aabbbcccc
    // []
    // [a] ,max = 2
    // [b], max = 3,
    // [c], max = 4

    // aabbcc
    // []
    // [a], max = 2
    // [a, b], max= 2
    // [a, b, c] max = 2

    // aabbccc
    // [a], max = 2
    // [a ,b], max = 2
    // [c], max = 3
    public static void printCharWithMaxFrequency(String s) {
        s = s.toLowerCase();
        // determina numarul maxim de aparitii ale unui element
        int maxFreq = 0;
        // ArrayList<char> maxFreqChars = initializare Array
        for (int i=0; i<s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                continue;
            }

            int charFreq = 1;
            // de cate ori apare caracterul de la pozitia i, in sirul [i + 1, s.length]
            for (int j=i+1; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    charFreq++;
                }
            }

            if (charFreq > maxFreq) {
                maxFreq = charFreq;
                // 1. sa goliti ArrayList-ul
                // 2. sa adaugati elementul s.charAt(i)
            } else if (charFreq == maxFreq) {
                // adaugat s.charAt(i) la array
            }
        }

    }
}
