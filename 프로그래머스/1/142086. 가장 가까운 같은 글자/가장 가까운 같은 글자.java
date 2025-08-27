class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for (int a = 0; a < s.length(); a++) {
            
            char parts = s.charAt(a);
            answer[a] = -1;
            
            for (int b = 0; b < a; b++) {
                if (parts == s.charAt(b)) {
                    answer[a] = a - b;
                }
            }
        }
        
        return answer;
    }
}