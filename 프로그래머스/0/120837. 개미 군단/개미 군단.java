class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = hp/5;
        int soldier = 0;
        if(hp%5 != 0 && (hp%5)/3 != 0){
            soldier = (hp%5)/3;
        }
        int worker = (hp%5)%3;
        answer = general + soldier + worker;
        return answer;
    }
}