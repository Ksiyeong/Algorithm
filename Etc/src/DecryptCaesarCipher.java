public class DecryptCaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("nzop delepd dfaazced jzf", 11);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world
    }

    static public String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String result = "";
        int c;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result += " ";
            } else {
                c = str.charAt(i) - secret;

                if (c < 97) {
                    c += 26;
                }
                result += String.format("%c", c);
            }
        }

        return result;
    }
}

// 97
// 122