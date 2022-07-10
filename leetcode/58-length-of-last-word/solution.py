class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        wordStart = False
        count = 0
        i = len(s) - 1
        while i >= 0:
            if s[i] == ' ':
                if wordStart:
                    break
                i -= 1
                continue
            count += 1
            wordStart = True
            i -= 1
        return count
        
