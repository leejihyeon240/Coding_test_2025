class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        if(n % 2 != 0) {
            for(int i = 0; i <= n ; i++){
                if(i % 2 != 0) sum+=i;
            }
            return sum;
        }
        
        if(n % 2 == 0) {
        for(int i = 0; i <= n ; i++){
                if(i % 2 == 0) sum+=i*i;
            }
            return sum;
        }
        
        return answer;
    }
}