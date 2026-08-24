class Solution {
    public boolean isPalindrome(int x) {
        
        int rEm = 0, copy = x;

        while(x > 0)
        {
            int last = x % 10;
            rEm = (rEm * 10) + last;
            x/=10;
        }

        return copy == rEm;
    }

    public static void main(String[] args)
    {
        int n = 121;

        Solution sol = new Solution();

        if(sol.isPalindrome(n))
        {
            System.out.print("Is Palidrome");
        }
        else
        {
            System.out.print("Is not Palidrome");
        }

    }
}