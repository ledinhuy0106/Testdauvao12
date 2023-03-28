import java.util.Scanner;

public class Maii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1) System.out.println(4);
        else if (n == 2) System.out.println(7);
        else if (n == 3) System.out.println(5);
        else System.out.println(triBoNaCci(n));
    }

    public static long triBoNaCci(int n) {
        long[] arr = new long[n + 1];
        n = n - 1;
        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 5;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[n];
    }
}

