import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char ch = sc.next().charAt(0);
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            char[] result = new char[word.length()];
            for (int i = 0; i <= index; i++) {
                result[i] = word.charAt(index - i);
            }
            for (int i = index + 1; i < word.length(); i++) {
                result[i] = word.charAt(i);
            }
            System.out.println(new String(result));
        } else {
            System.out.println(word);
        }
    }
}
