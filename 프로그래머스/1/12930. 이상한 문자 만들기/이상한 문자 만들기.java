import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char a;
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                i = 0;
            } else {
                if (i++ % 2 == 0) {
                    a = Character.toUpperCase(c);
                } else {
                    a = Character.toLowerCase(c);
                }
                sb.append(a);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}