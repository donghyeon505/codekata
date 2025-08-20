import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int i = c;
            
            if (c == ' ') {
                sb.append(c);
                
            } else if (i >= 65 && i <= 90) {
                i = ((i - 65 + n)) % 26 + 65;
                
                sb.append((char)i);
            } else if (i >= 97 && i <= 122) {
                i = ((i - 97 + n)) % 26 + 97;
                
                sb.append((char)i);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}