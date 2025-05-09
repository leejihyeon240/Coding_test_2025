class Solution {
    public int[] solution(int[] num_list) {
        // 한 칸 더 큰 배열
        int[] answer = new int[num_list.length + 1];
        
        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        
        int newVal = (last > secondLast) ? (last - secondLast) : (last * 2); 
        
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        answer[num_list.length] = newVal;
        
        return answer;

    }
}