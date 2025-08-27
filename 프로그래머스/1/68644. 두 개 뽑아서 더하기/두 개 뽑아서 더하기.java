import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for (int a = 0; a < numbers.length - 1; a++) {
            for (int b = a + 1; b < numbers.length; b++) {
                list.add(numbers[a] + numbers[b]);
            }
        }
        
        int[] answer = list.stream()
                   .distinct()
                   .sorted()
                   .mapToInt(Integer::intValue)
                   .toArray();
        
        return answer;
    }
}