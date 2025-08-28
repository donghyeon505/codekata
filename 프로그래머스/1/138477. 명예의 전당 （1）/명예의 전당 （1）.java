import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
             
        List<Integer> scoreList = new ArrayList<>();
        
        for (int a = 0; a < score.length; a++) {
             
            scoreList.add(score[a]);
             
            scoreList.sort(Collections.reverseOrder());
             
            if (scoreList.size() < k) {
                 answer[a] = scoreList.get(scoreList.size() - 1);
            } else {
                 answer[a] = scoreList.get(k - 1);
            }
        }
        
        return answer;
    }
}