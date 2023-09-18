class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[]  = new int[k];
        ArrayList<Integer>temp = new ArrayList<>();
        for(int i=0; i<mat.length; i++){
            int count = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            temp.add(count);
        }
        int a = 0;
        int idx = 0;
        while(a<k){
        int min = Integer.MAX_VALUE;
            for(int i=0; i<temp.size(); i++){
                if(temp.get(i)<min){
                    min = temp.get(i);
                    idx = i;
                }
            }
            ans[a] = idx;
            temp.set(idx,9999);
            a++;
        }
        return ans;
    }
}