public class ReverseInteger {
    public static void main(String[] args) {
        int a = 1245;
        int reverse = 0;
        while (a>0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a / 10;
        }
        System.out.println(reverse);
    }

}
