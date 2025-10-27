public class ReverseString {
    public static void main(String[] args) {
        String a = "Character is good";
                for (int i = a.length()-1; i >= 0; i--) {
                    char b = a.charAt(i);
                    System.out.print(b);
                }
    }
}
