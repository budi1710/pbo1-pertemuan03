package string;

public class Operasistring {
    private static String[] args;

    public static <string> void main(String[] args) {
        Operasistring.args = args;
        string kota = (string) "Banjarbaru";

        System.out.println(kota);

        char[] uniskaChar = { 'U','N','I','S','K','A' };
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);
    }
}
