class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int number:numbers) {
            sum = sum + number; 
        }
        answer = (double)sum/numbers.length;
        // -=는 answer%0.5 값을 answer에서 뺀다는 뜻
        answer -= answer%0.5;
        return answer;
    }
}