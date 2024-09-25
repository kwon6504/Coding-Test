class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int num = cipher.length()/code;
        for(int i=1; i<=num;i++) {
        	char s = cipher.charAt(code*i-1);
        	answer = answer + s;
        }
        return answer;
    }
}