class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        n = len(digits)
        carry = 1

        for i in range(n - 1, -1, -1):
            digits[i] += carry
            carry = digits[i] // 10
            digits[i] %= 10

        if carry > 0:
            return [carry] + digits
        else:
            return digits
