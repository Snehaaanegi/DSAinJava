class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,rem,n=x;
        for(int i=x;i!=0;i=i/10)
        {
             if (x < 0 || (x % 10 == 0 && x != 0)) 
            return false;
            rem=i%10;
            rev=rev*10+rem;
        }
        if(rev==n) return true;
        else return false;
    }
}