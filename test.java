
public class SecondLargestOptimal {

    public static void main(String[] args) {
        int a[] = { 1, 5, 2, 4, 7, 4, 8 };
        int n = a.length;

        Arrays.sort(a);
        int largest = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] != largest) {
                System.out.println(a[i]);
                break;
            }
        }

    }
}
