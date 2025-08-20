import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int i = c;
            
            if (c == ' ') {
                sb.append(c);
            } else if (Character.isUpperCase(c)) {
                i = ((i - 'A' + n) % 26) + 'A';
                sb.append((char)i);
            } else if (Character.isLowerCase(c)) {
                i = ((i - 'a' + n) % 26) + 'a';
                sb.append((char)i);
            } else {
                sb.append(c);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}