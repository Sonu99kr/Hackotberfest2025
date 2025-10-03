class Solution {
    static final int MOD = 1000000007;
    public long modPow(long base, long exp){
        long res = 1;
        base %= MOD;
        while(exp > 0){
            if((exp & 1) == 1)res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long oddP = n/2;
        long evenP = n - oddP;

        long res = (modPow(5, evenP) * modPow(4, oddP)) % MOD;
        return (int)res;
    }
}
