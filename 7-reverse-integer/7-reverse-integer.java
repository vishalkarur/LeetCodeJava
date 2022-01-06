class Solution {
    public int reverse(int x) {
        long ans = 0;
        while (x!=0) {
            int rem = x % 10;
            x = x / 10;
            ans = ans *10 + rem;
        }
if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
    return 0;
}
        else {
            return (int) ans ;
        }
    }
}