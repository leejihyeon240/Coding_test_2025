import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 시험 본 과목의 수
        int n = Integer.parseInt(br.readLine());
        
        String[] score = br.readLine().split(" ");
        
        double sum = 0;
        int max = 0;
        
        for (int i = 0 ; i < n ; i++) {
            if(max < Integer.parseInt(score[i])){
                max = Integer.parseInt(score[i]);
            }else{
                max = max;
            }
        }
        
        for (int k = 0 ; k < n ; k++) {
            sum += (double)Integer.parseInt(score[k])/max*100;
        }
        
        System.out.println(sum / n);            
    }
}