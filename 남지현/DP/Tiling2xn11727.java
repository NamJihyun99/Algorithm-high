import java.io.*;

public class Main {

    static final int MOD = 10007;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] dp = new int[N];
        dp[0] = 1;
        if (N > 1)
            dp[1] = 3;
        for (int i=2; i<N; i++) {
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-2]) % MOD;
        }
        System.out.println(dp[N-1]);
    }
}
