class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisors = new int[number + 1];
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisors[j]++;
            }
        }

        for (int a = 1; a <= number; a++) {
            if (divisors[a] <= limit) {
                answer += divisors[a];
            } else {
                answer += power;
            }
        }
        
        return answer;
    }
}