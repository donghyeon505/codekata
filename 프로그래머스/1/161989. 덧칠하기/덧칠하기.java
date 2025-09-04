class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedSection = 0;

        for (int sec : section) {
            if (sec > paintedSection) {
                answer++;
                paintedSection = sec + m - 1;
            }
        }
        
        return answer;
    }
}