class Solution(object):
    def maximumSubarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        curr_sum = 0
        max_sum = 0
        map = {}

        n = len(nums)
        for i in range (0, k):
            map[nums[i]] = map.get(nums[i],0)+1
            curr_sum += nums[i]
            
        if len(map) == k:
            max_sum = curr_sum 
        
        for i in range (k, n):
            out_elem = nums[i-k]
            map[out_elem] -= 1

            if map[out_elem] == 0:
                del map[out_elem]
            curr_sum -= out_elem
            
            in_elem = nums[i]
            map[in_elem] = map.get(in_elem, 0)+1
            curr_sum += in_elem

            if len(map) == k:
                max_sum = max(max_sum, curr_sum)
            
        return max_sum   