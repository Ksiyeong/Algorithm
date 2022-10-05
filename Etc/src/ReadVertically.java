import java.util.ArrayList;

public class ReadVertically {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

        input = new String[]{
                "hi",
                "wolrd",
        };
        output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"
    }

    public static String readVertically(String[] arr) {
        // TODO:
        ArrayList<String> arrList = new ArrayList<>();

        for (String str : arr) {
            for (int i = 0; i < str.length(); i++) {
                if (arrList.size() - 1 < i) {
                    arrList.add(String.valueOf(str.charAt(i)));
                } else {
                    arrList.set(i, arrList.get(i) + str.charAt(i));
                }
            }
        }

        String result = "";
        for (String str : arrList) {
            result += str;
        }

        return result;
    }
}
