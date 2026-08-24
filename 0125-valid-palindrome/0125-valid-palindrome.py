class Solution:
    def isPalindrome(self, s: str) -> bool:
        str2 = ''
        i = 0
        while i < len(s):
            if s[i].isalnum() == True:
                str2 += s[i].lower()
            i+=1
        return str2 == str2[::-1]
