//Euclidean Algortiham used for optimal solution of GCD.
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int  odd = 0;
        int even = 0;

        even = n * (n + 1);
        odd = n * n;

        while(even > 0 && odd > 0)
        {
            if(even > odd)
            {
                even%=odd;
            }
            else{
                odd%=even;
            }
        }
        if(even == 0)
        {
            return odd;
        }
        else{
            return even;
        }

    }

    public static void main(String[] args)
    {
        int num = 5;

        Solution sol = new Solution();
        System.out.print(sol.gcdOfOddEvenSums(num));

    }
}
