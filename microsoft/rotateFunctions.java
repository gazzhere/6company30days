class Solution {
    public int maxRotateFunction(int[] nums) {
        int allsum=0;
        int factorial=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
              factorial+=i*nums[i];
              allsum+=nums[i];
        }
        int maxi=factorial;
        for(int i=n-1;i>=1;i--){
            factorial=factorial+allsum-n*nums[i];
            maxi=Math.max(factorial,maxi);
        }
        return  maxi;
    }
}