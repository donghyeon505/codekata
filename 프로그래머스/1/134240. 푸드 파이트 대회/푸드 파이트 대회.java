class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
            
        for (int a = 1; a < food.length; a++) {
            int count = food[a];
            
            for (int b = count; b > 0; b-=2) {
                    if (b > 1) {
                        sb.append(a);
                    }
            }
        }
        
        return sb.toString() + "0" + sb.reverse();
    }
}