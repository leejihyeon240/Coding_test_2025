class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int plus = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        
        int pplus = 2 * a * b;
        
        if(plus > pplus || plus == pplus){
            return answer = plus;
        }
        
        return answer = pplus;
        
    }
}