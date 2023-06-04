import java.util.HashSet;
import java.util.Set;
class Solution {


public String solution(String s, String skip, int index) {
    char[] sArr = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    Set<Character> skipSet = new HashSet<>();
    final int ALPHABET_MAX = 122;
    final int ALPHABET_MIN = 97;

    for (char c : skip.toCharArray()) {
        skipSet.add(c);
    }

    for (int i = 0; i < sArr.length; i++) {
        char current = sArr[i];
        for (int j = 0; j < index; j++) {
            current += current >= ALPHABET_MAX ? ALPHABET_MIN - ALPHABET_MAX : 1;
            if (skipSet.contains(current)) {
                j -= 1;
            }
        }
        sb.append(current);
    }

    return sb.toString();
}

}