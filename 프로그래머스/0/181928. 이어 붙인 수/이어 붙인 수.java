class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        // StringBuilder = 자바에서 문자열을 효율적으로 붙일 수 있는 도구
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                sum1.append(num_list[i]);
            }
            if(num_list[i] % 2 != 0){
                sum2.append(num_list[i]);
            }
        }
        
        return Integer.parseInt(sum1.toString()) + Integer.parseInt(sum2.toString());
    }
}