class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int i = dot[0];
        int j = dot[1];
        
        if(i>0 && j>0){
            answer = 1;
        } 
        if(i<0 && j>0) {
            answer = 2;
        }
        if(i<0 && j<0) {
            answer = 3;
        }
        if(i>0 && j<0) {
            answer = 4;
        }
        return answer;
    }
}