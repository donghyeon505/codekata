import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        answer = IntStream.rangeClosed(0, 9)
            .filter (n -> Arrays.stream(numbers).noneMatch(x -> x == n))
            .sum();
        
        return answer;
    }
}