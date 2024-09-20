class Solution {
    public int solution(String my_string) {
        String numbersOnly = my_string.replaceAll("[^0-9]", "");
        int answer = 0;
        int[] arr = new int[numbersOnly.length()];
        for(int i = 0; i < numbersOnly.length(); i++){
            arr[i] = Character.getNumericValue(numbersOnly.charAt(i));
            answer = answer + arr[i];
        }
        return answer;
    }
}