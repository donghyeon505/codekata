import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int length = score.length;
        
        for (int i = length; i >= m; i -= m) {
            int minScore = score[i - m];
            answer += minScore * m;
        }
        
        return answer;
    }
}