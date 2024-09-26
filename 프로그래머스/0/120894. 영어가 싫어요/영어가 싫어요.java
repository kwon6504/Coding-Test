class Solution {
    public long solution(String numbers) {
        long answer = 0;
        if(numbers.indexOf("one") != -1) {
        	numbers=numbers.replace("one", "1");
        }
        if(numbers.indexOf("two") != -1) {
        	numbers=numbers.replace("two", "2");
        }
        if(numbers.indexOf("three") != -1) {
        	numbers=numbers.replace("three", "3");
        }
        if(numbers.indexOf("four") != -1) {
        	numbers=numbers.replace("four", "4");
        }
        if(numbers.indexOf("five") != -1) {
        	numbers=numbers.replace("five", "5");
        }
        if(numbers.indexOf("six") != -1) {
        	numbers=numbers.replace("six", "6");
        }
        if(numbers.indexOf("seven") != -1) {
        	numbers=numbers.replace("seven", "7");
        }
        if(numbers.indexOf("eight") != -1) {
        	numbers=numbers.replace("eight", "8");
        }
        if(numbers.indexOf("nine") != -1) {
        	numbers=numbers.replace("nine", "9");
        }
        if(numbers.indexOf("zero") != -1) {
        	numbers=numbers.replace("zero", "0");
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}