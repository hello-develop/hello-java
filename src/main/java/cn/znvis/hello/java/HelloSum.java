package cn.znvis.hello.java;

import java.util.HashMap;
import java.util.Map;

public class HelloSum {
    public static int[] twoSum(int[] nums, int target){
        int[] twoSum = new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    twoSum[0] = i;
                    twoSum[1] = j;
                    break;
                }
            }
        }
        return twoSum;
    }

    /**
     * HashMap方式，哈希方式是最佳获取索引和元素对应关系的方式，将时间复杂度从O(n)降到O(1)
     * 同时需要将值作为key，便于直接获取value，因不便于从value获取key
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }
        }

        return null;
    }

    /**
     * 回看模式
     * @param nums 初始数组
     * @param target 目标和值
     * @return 满足要求的数组
     */
    protected static int[] twoSum3(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}

