public class Palindrome {
    public static void main(String[] args) {
        String a = "Rotor";
        a = a.toLowerCase();
        boolean Ispalindrome = true;
        for (int i = 0; i < a.length()/2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                Ispalindrome = false;
            }
        }
        System.out.print(a + " is palindrome " + Ispalindrome);
    }
}
