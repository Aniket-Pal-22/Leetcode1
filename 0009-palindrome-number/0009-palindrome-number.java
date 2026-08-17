class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y = x;
        int res = 0;
        while(y!=0){
            int a = y%10;
            res = res*10 + a; 
              y= y/10;
        }
        if(x==res){
            return true;
        }
        else{
        return false;
        }
    }
}