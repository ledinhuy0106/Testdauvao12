import java.math.BigInteger;
import java.util.Scanner;

public class Mail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1) System.out.println("4");
        else if (n == 2) System.out.println("7");
        else if (n == 3) System.out.println("5");
        else System.out.println(triBoNaCci(n).toString());
    }

    public static BigInteger triBoNaCci(int n) {
        BigInteger a = BigInteger.valueOf(4);
        BigInteger b = BigInteger.valueOf(7);
        BigInteger c = BigInteger.valueOf(5);
        BigInteger result = BigInteger.ZERO;
        for (int i = 4; i <= n; i++) {
            result = a.add(b).add(c);
            a = b;
            b = c;
            c = result;
        }
        return result;
    }
}
