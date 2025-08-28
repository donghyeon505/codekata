import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        DayOfWeek dayOfWeek = LocalDate.of(2016, a, b).getDayOfWeek();
        answer = dayOfWeek.toString().substring(0, 3);
        
        return answer;
    }
}