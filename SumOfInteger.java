public class SumOfInteger {
    public static void main(String[] args) {
        int a = 1245;
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        System.out.println(sum  );
    }
}
