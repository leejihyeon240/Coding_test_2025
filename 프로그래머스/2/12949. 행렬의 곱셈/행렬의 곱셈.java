class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;        // arr1 행 개수
        int m = arr2[0].length;     // arr2 열 개수
        int k = arr1[0].length;     // arr1 열 개수
        
        int[][] answer = new int[n][m];
        
        for (int i = 0; i < n; i++) {   
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < k; l++) {
                    answer[i][j] += arr1[i][l] * arr2[l][j];
                }
            }
        }
        
        return answer;
    }
}
