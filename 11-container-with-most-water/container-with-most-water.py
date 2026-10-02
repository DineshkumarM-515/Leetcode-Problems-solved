class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height)-1
        water = 0

        while left < right:
            curr_area = (right - left)
            curr_height = min(height[left], height[right])

            curr_water = curr_area * curr_height

            water = max(water, curr_water)

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return water
        