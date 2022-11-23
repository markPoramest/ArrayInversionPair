import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (arr[j] >= a && arr[j] <= b) {
                    list.add(arr[j]);
                }
            }

            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                for (int l = j + 1; l < list.size(); l++) {
                    if (list.get(j) > list.get(l)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
