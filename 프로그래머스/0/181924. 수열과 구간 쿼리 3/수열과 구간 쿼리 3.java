class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0]; // {} 안의 첫번째 숫자
            int end = queries[i][1]; // {} 안의 두번째 숫자
                        
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
        }
        
        return arr;
    }
}