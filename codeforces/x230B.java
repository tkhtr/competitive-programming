import java.io.*;
import java.util.*;

public class x230B {

    public static Set<Long> isPrime() {
        final int MAX = 1_000_000;
        boolean[] isPrimeNumbers = new boolean[MAX + 1];
        isPrimeNumbers[0] = false;
        isPrimeNumbers[1] = false;

        for(long i = 2; i <= MAX; i++) {
            if(!isPrimeNumbers[(int)i]) {
                for(long j = i * i; j <= MAX; j += i) {
                    isPrimeNumbers[(int)j] = true;
                }
            }
        }

        Set<Long> tPrimes = new HashSet<>();
        for(long i = 2; i <= MAX; i++) {
            if(!isPrimeNumbers[(int)i]) {
                tPrimes.add(i * i);
            }
        }
        return tPrimes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        Set<Long> result = isPrime();
        
        for (long i = 0; i < n; i++) {
            long x = sc.nextLong();
            sb.append(result.contains(x) ? "YES" : "NO").append('\n');
        }

        System.out.println(sb);
    }
}
