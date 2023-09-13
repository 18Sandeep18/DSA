
import java.util.HashMap;

public class Toggle {
    public static int toggleSwitch(int arr[], int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int count = 0;
        // System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            map.put(i + 1, false);
            arr[i] = i + 1;
        }
        int m = 1;

        while (m <= n) {
            for (int i = 0; i < map.size(); i++) {
                if (arr[i] % m == 0) {
                    if (map.get(i + 1) == false) {

                        map.put(i + 1, true);
                    } else {
                        map.put(i + 1, false);
                    }

                }

            }
            m++;

        }
        for (int i = 1; i <= map.size(); i++) {
            if (map.get(i) == true) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = new int[124];
        System.out.println(toggleSwitch(arr, 124));

    }

}
