class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer x = new StringBuffer(my_string);
        answer = x.reverse().toString();
        return answer;
    }
}