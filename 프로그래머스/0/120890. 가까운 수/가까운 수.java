class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        for(int i=0; i<array.length; i++) {
        	int abs = Math.abs(n-array[i]);
        	int prevAbs = Math.abs(n-answer);
        	if(abs < prevAbs) {
        		answer = array[i];
        	} else if(abs == prevAbs) {
        		if(answer > array[i]) {
        			answer = array[i];
        		}
        	}
        }
        return answer;
    }
}