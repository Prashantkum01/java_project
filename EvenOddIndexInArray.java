import java.util.ArrayList;

public class EvenOddIndexInArray {
    public static void main(String[] args) {
        int[] a = {1,2,4,5};
        ArrayList even = new ArrayList<>();
        ArrayList odd = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even.add(a[i]);
            }
                else {
                    odd.add(a[i]);
                }

        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
