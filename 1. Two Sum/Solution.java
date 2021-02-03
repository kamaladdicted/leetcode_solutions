class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(indexMap.get(target - nums[i]) != null){
                return new int[]{indexMap.get(target - nums[i]), i};
            }else{
                indexMap.put(nums[i], i);
            }
        }
        return null;
    }
}