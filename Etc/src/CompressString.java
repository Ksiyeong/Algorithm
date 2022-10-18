public class CompressString {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }

    static public String compressString(String str) {
        // TODO:
        if (str.length()==0) return "";

        String result = "";
        int len = str.length();
        int count = 1;

        for (int i = 0; i < len-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count += 1;
            } else if (count > 2) {
                result = result + count + str.charAt(i);
                count = 1;
            } else {
                for (int j = 0; j < count; j++) {
                    result += str.charAt(i);
                }
                count = 1;
            }
        }

        if (count > 2) {
            result = result + count + str.charAt(str.length() - 1);
        } else {
            for (int i = 0; i < count; i++) {
                result += str.charAt(str.length() - 1);
            }
        }

        return result;
    }
}
