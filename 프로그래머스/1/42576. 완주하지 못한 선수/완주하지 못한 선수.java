import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length ; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
            // answer = participant[participant.length - 1];
        }
        
        // 끝까지 비교했는데 다른 요소가 없다면 participant 배열의 마지막 요소가 완주하지 못한 선수가 된다.
        if ("".equals(answer))
        answer = participant[participant.length - 1];
   
        return answer;
    }
}