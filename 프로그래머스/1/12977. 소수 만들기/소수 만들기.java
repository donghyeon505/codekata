class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int length = nums.length;

        for (int a = 0; a < length; a++) {
            for (int b = a + 1; b < length; b++) {
                for (int c = b + 1; c < length; c++) {
                    
                    int sum = nums[a] + nums[b] + nums[c];
                    boolean prime = true;
                    
                    for (int i = 2; i*i <= sum; i++) {
                        if (sum % i == 0) {
                            prime = false;
                            break;
                        }
                        prime = true;
                    }
                    
                    if (prime) {
                        answer++;
                    }
                    
                }
            }
        }

        return answer;
    }
}