class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        for (int i = n; n >= a; n = i = i - a + b) {
            answer +=  b;
        }
        
        return answer;
    }
}