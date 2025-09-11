import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int matchNum = 0;
        int zeroNum = 0;
        
        Set<Integer> win = new HashSet<>();
        for (int n : win_nums) {
            win.add(n);
        }
        
        for (int n : lottos) {
            if (n == 0) {
                zeroNum++;
            }
            
            if (win.contains(n)) {
                matchNum++;
            }
        }
        
        int[] rank = {6, 6, 5, 4, 3, 2 ,1};
        
        int maxRank = zeroNum + matchNum;
        int minRank = matchNum;
        
        int[] answer = {rank[maxRank], rank[minRank]};
        
        return answer;
    }
}