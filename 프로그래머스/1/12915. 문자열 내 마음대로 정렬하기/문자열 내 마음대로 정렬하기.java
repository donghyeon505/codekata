import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        answer = Arrays.stream(strings)
                     .sorted(Comparator.comparingInt((String s) -> s.charAt(n))
                                       .thenComparing(Comparator.naturalOrder()))
                     .toArray(String[]::new);
        
        return answer;
    }
}