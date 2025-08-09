import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (String n : str) {
            sb.append(n);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}