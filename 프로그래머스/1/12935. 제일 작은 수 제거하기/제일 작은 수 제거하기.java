import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer;
        
        int i = Arrays.stream(arr).min().getAsInt();
        
        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            answer = Arrays.stream(arr)
                                 .filter(n -> n != i)
                                 .toArray();
        }
        
        return answer;
    }
}