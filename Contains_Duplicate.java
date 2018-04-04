/*
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
*/


class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            Integer count = map.get(i);    
            if (count == null ){
                map.put(i,0);
            } else {
                return true;
            }
        }
        return false;
        
    }
}
