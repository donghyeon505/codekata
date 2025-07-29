class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        while (true) {
            if (n == 1) {
                break;
            } else if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;
            
            if (answer > 500 ) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}