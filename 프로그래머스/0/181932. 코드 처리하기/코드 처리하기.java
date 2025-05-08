class Solution {
    public String solution(String code) {
        String answer = "";
        
        StringBuilder ret = new StringBuilder();
        
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            // 한 글자만 가져옴, 문자열의 i번째 문자 가져옴
            char c = code.charAt(i); 
            
            if( c == '1'){
                mode = 1 - mode; // 0 -> 1, 1 -> 0
                continue; // '1'은 처리하지 않음
            }
            
            if(mode == 0 && i % 2 == 0){ // 짝수 칸 + mode 0
                    ret.append(c);
            }
            
            if(mode == 1 && i % 2 != 0){ // 홀수 칸 +  mode 1
                    ret.append(c);
            }
            
        }
        
        if(ret.toString().equals("")){
            return "EMPTY";
        }
        
        return ret.toString();
    }
}