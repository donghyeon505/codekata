import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i);
        }
        
        answer = Integer.parseInt(sb.toString(), 3);
        
        return answer;
    }
}