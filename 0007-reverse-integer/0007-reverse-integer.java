class Solution {
    public int reverse(int x) {
        
        int rev =0;
                
        while(x!=0)
        {
            int last =  x % 10;
            if (rev > Integer.MAX_VALUE / 10 ||  rev < Integer.MIN_VALUE / 10) 
            {
                 return 0;
            }
            rev =  rev * 10 + last;
            x = x / 10; 
        }
        return rev;
    }

    public static void main(String[] args)
    {
        int n = 1534236469;

        Solution sol = new Solution();

        int ans = sol.reverse(n);
        System.out.print("Output: " + ans);
    }
}