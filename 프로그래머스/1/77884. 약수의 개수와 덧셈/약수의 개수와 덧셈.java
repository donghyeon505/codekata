class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
        
            int cnt = 0;
            
            for (int a = 1; a <= Math.sqrt(i); a++) {
                if (i % a == 0) {
                    if (a * a == i) {
                        cnt++;
                    } else {
                        cnt += 2;
                    }
                }
            }
            
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}