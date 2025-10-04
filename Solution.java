class Solution {
    public int pascalTriangleI(int r, int c) {
        if(c< 0 || c > r) return 0;
        
       int sum =1;
       for(int i=0;i<c-1;i++){
        sum *= (r-i-1);
        sum /= (i+1);
       }
       return sum;
        

    }
}
