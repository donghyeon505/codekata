class Solution {
    public boolean solution(int x) {
        boolean answer;
        
        int a = x;
        int b = 0;

        while (a > 0) {
            b += (a % 10);
            a /= 10;
        }

        answer = (x % b == 0);
        
        return answer;
    }
}