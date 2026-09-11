class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int prodl=1;
        int prodr=1;
        for(int i=0; i<n; i++){
            result[i]=prodl;
            prodl=prodl*nums[i];
        }
        for(int i=n-1; i>=0; i--){
            result[i]=result[i]*prodr;
            prodr=prodr*nums[i];
        }
    return result;
    }
}