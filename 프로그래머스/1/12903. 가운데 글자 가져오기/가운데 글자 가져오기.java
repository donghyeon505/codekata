import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
    
        int i = arr.length;
        
        if (i % 2 == 0) {
            answer = arr[i / 2 - 1] + arr[i / 2];
        } else {
            answer = arr[i / 2];
        }
        
        return answer;
    }
}