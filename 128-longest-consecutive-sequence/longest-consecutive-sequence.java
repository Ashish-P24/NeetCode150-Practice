class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int longest=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int least=1;
                while(set.contains(num+least)){
                    least++;;
                }
                longest=Math.max(longest, least);
            }
        }
        return longest;
    }
}