class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,a=x;
        while(a>0){
            rev=rev*10+(a%10);
            a=a/10;   
        }
        if(rev==x)return true;
        else return false;
    }
}