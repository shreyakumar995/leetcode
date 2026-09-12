class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>subnum=new HashMap<>();
        subnum.put(0,1);
        int total=0;
        int count=0;
        
        for(int n:nums){
            total+=n;
            if(subnum.containsKey(total-k)){
                count+=subnum.get(total-k);
            }
            subnum.put(total, subnum.getOrDefault(total, 0) + 1);
        }
        return count;
    }
}