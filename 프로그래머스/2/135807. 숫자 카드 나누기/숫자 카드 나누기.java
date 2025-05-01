class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        int a = arrayA[0];
        int b = arrayB[0];
        
        for(int i = 0; i < arrayA.length; i++) {
            // 나누어 떨어지면 공약수 > a값 그대로 유지
            if(arrayA[i] == 0) continue;
            
            int max = Math.max(arrayA[i], a);
            int min = Math.min(arrayA[i], a);
            
            a = gcd(max, min);
            
        }
        
        for(int i = 0; i < arrayB.length; i++) {
            if(arrayB[i] == 0) continue;
            
            int max = Math.max(arrayB[i], b);
            int min = Math.min(arrayB[i], b);
            
            b = gcd(max, min);
            
        }        
        
        for(int i : arrayB) {
            if(i % a == 0){
                a = 0;
                break;
            }
        }
        
        for(int i : arrayA) {
            if(i % b == 0) {
                b = 0;
                break;
            }
        }
        
        answer = Math.max(a, b);
        return answer;
    }
    
    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
