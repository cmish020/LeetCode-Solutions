class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count = 0 
        digit = {}
        for num in nums:
            count += digit.setdefault(num, 0)
            digit[num] += 1 
        return count
           