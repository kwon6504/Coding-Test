class Solution {
    public int[] solution(int[] numbers, String direction) {
	    int[] answer = new int[numbers.length];

	    switch (direction) {
	        case "left":
	            // 왼쪽으로 한 칸 회전
	            for (int i = 0; i < numbers.length - 1; i++) {
	                answer[i] = numbers[i + 1];
	            }
	            answer[numbers.length - 1] = numbers[0];
	            break;

	        case "right":
	            // 오른쪽으로 한 칸 회전
	            for (int i = 1; i < numbers.length; i++) {
	                answer[i] = numbers[i - 1];
	            }
	            answer[0] = numbers[numbers.length - 1];
	            break;
	    }

	    return answer;
	}
}