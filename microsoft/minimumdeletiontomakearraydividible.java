class Solution {
    static int findGCD(int []nums){
        int gcd=nums[0];
        for(int i=1;i<nums.length;i++){
           int num=nums[i];
           while(num>0){
               int temp=gcd%num;
               gcd=num;
               num=temp;
           }
        }
        return gcd;
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd=findGCD(numsDivide);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(gcd%nums[i]==0){
                return i;
            }

        }
        return -1;
    }
}