class Solution {
    public int solution(int n) {
        int sum;
        if(n%2==1){
            sum=0;
            for(int i=1; i<=n; i+=2)
                sum+=i;
        }
        else{
            sum=0;
            for(int i=2; i<=n; i+=2)
                sum+=i*i;
        }
        
        return sum;
    }
}