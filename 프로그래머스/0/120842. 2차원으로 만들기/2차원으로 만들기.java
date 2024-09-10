class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int rows = num_list.length/n;
        answer = new int[rows][n];
        for(int i = 0; i < num_list.length; i++){
            answer[i/n][i%n] = num_list[i];
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<n; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
        return answer;
    }
}