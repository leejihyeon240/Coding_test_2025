class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] map = new char[m][n];
        
        // toCharArray()로 쪼개서 한 줄 한 줄 문자 배열로 변환
        for(int i = 0; i < m ; i++) {
            map[i] = board[i].toCharArray();
        }
        
        // 1) 4개의 블록 체크
        // 2) 체크된 블록 삭제
        // 3) 블록을 아래로 떨어뜨림
        // 4) 더 이상 없을 때 까지 반복
        
        // 지워지는 블록은 총 몇 개인지
        
        while(true) {
            int cnt = checkBlock(m, n, map);
            if (cnt == 0) break;
            answer += cnt;
            
            dropBlock(m, n, map);
        }
        
        return answer;
        
    }
    
    // 1) 4개의 블록 체크
    private void checkFour(char[][] map, boolean[][] isChecked, int i, int j) {
        char block = map[i][j];
        
        for(int r = i; r < i+2; r++){
            for(int c = j; c < j+2; c++){
                // 실패
                if (map[r][c] != block) return;
            }
        }
        
        for(int r = i; r < i+2; r++){
            for(int c = j; c < j+2; c++){
                // 맞음 > true
                isChecked[r][c] = true;
            }
        }
    }
    
    // 2) 체크된 블록 삭제
    private int checkBlock(int m, int n, char[][] map) {
        int cnt = 0;
        boolean[][] isChecked = new boolean[m][n];
        
        for (int i = 0; i < m-1; i++){
            for (int j = 0; j < n-1; j++){
                // 빈칸이면 스킵
                if(map[i][j] == '.') continue;
                checkFour(map, isChecked, i, j);
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // isChecked가 true이면
                if(isChecked[i][j]){
                    cnt++;
                    map[i][j] = '.';
                }
            }
        }
        
        return cnt;
    }

    // 3) **블록을 아래로 떨어뜨림
    private void dropBlock(int m, int n, char[][] map) {
        for(int j = 0; j < n; j++) {
            for(int i = m-1; i >= 0; i--){
                if(map[i][j] == '.') {
                    for(int k = i-1; k >= 0; k--) {
                        if (map[k][j] != '.') {
                            map[i][j] = map[k][j];
                            map[k][j] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }

}