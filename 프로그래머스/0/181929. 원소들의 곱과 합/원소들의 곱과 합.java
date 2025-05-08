class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int puls = 1;
        
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
        }
        
        for(int i = 0; i < num_list.length; i++){
            puls *= num_list[i];
        }
        
        if(sum*sum > puls){
            return 1;
        }else {
            return 0;
        }
        
        // return answer;
    }
}