import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        // 1. 배열 정렬
        Arrays.sort(array);
        max = array[array.length-1]; // 가장 큰 값을 찾음
        
        // 2. max + 1 크기의 count 배열 생성
        int count[] = new int[max+1];
        for(int i = 0; i<array.length; i++) {
            count[array[i]]++; // 각 숫자의 등장 횟수를 count 배열에 저장
        }
        
        // 3. 가장 많이 등장한 숫자 찾기
        int top = count[0]; // 초기 최댓값을 0으로 설정
        for(int i = 1; i<count.length; i++) {
            if(top < count[i]) { // 더 많이 등장한 숫자가 있으면 갱신
                top = count[i];
                answer = i;
            } else if(top == count[i]) { // 여러 숫자가 동일한 최대 등장 횟수를 가질 경우
                answer = -1; // 중복 발생 시 -1로 설정
            }
        }
        return answer; // 가장 많이 등장한 숫자 또는 중복이 있을 경우 -1 반환
    }
}