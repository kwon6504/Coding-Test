class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        for(int i = 1; i <= n; i++){
            count = count*i;
            if(count == n){
                answer = i;
                break;
            }
            if(count > n){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}