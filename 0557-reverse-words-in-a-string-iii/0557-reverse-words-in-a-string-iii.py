class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.split(" ")
        l = []
        for i in s:
            l.append(i[::-1])
        return " ".join(l)