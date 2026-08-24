class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        count = 0
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                return True
        
        return False

sol = Solution()
list = [1,2,3,1]
sol.containsDuplicate(list)
list = [1,2,3,4]
sol.containsDuplicate(list)
list = [1,1,1,3,3,4,3,2,4,2]
sol.containsDuplicate(list)        