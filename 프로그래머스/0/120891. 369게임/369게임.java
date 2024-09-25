class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] s = String.valueOf(order).toCharArray();
        for(int i=0; i<s.length; i++) {
        	if(s[i] == '3'||s[i] == '6'||s[i] == '9') {
        		answer++;
        	}
        }
        return answer;
    }
}