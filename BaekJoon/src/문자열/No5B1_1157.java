package S6문자열;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No5B1_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toUpperCase();

        Map<String, Integer> map = new HashMap<>();

        for (String s : word.split("")) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        int max1 = 0;
        String max2 = "";

        for (String s : map.keySet()) {
            if (map.get(s) > max1) {
                max1 = map.get(s);
                max2 = s;
            }
        }
        map.remove(max2);

        if (map.containsValue(max1)) System.out.println("?");
        else System.out.println(max2);
    }
}
