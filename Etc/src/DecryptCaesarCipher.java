public class DecryptCaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world
    }

    static public String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += String.format("%c", str.charAt(i) - secret);
        }

        return result;
    }
}
