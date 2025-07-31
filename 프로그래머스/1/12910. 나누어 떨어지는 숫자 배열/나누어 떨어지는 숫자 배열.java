import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        
        for (int l : arr) {
            if (l % divisor == 0) {
                result.add(l);
            }
        }
        
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        
        return answer;
    }
}