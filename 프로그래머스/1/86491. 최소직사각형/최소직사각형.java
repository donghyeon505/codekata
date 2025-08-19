class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int w = 0;
        int l = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int a = Math.min(sizes[i][0], sizes[i][1]);
            int b = Math.max(sizes[i][0], sizes[i][1]);
            
            if (a > w) {
                w = a;
            }
            
            if (b > l) {
                l = b;
            }
        }
        
        answer = w * l;
        
        return answer;
    }
}