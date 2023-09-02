class Solution {
    // public int countBit(int n){
    //     int count = 0;
    //     while(n > 0){
    //         if(n%10 == 1){
    //             count++;
    //         }
    //         n /= 10;
    //     }
    //     return count;
    // }
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0; i<=n; i++){
            int count = 0;
            int num = i;
            while(num > 0){
                count += num%2;
                num /= 2;
            }
            ans[i] = count;
        }
        return ans;
    }
}