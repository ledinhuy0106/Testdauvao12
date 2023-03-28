import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1) System.out.println("4");
        else if (n == 2) System.out.println("7");
        else if (n == 3) System.out.println("5");
        else System.out.println(triBoNaCci(n).toString());
    }

    public static BigInteger triBoNaCci(int n) {
        BigInteger[] arr = new BigInteger[n+1];
        n=n-1;
        arr[0] = BigInteger.valueOf(4);
        arr[1] = BigInteger.valueOf(7);
        arr[2] = BigInteger.valueOf(5);
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]).add(arr[i - 3]);
        }
        return arr[n];
    }
}
