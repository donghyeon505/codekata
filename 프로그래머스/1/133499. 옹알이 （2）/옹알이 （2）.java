class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String b : babbling) {
            int i = 0;
            String prev = "";
            boolean possible = true;

            while (i < b.length()) {
                boolean matched = false;

                for (String w : words) {
                    if (b.startsWith(w, i) && !w.equals(prev)) {
                        i += w.length();
                        prev = w;
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                answer++;
            }
        }
        
        return answer;
    }
}