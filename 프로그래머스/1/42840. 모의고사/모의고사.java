import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] score = new int[3];
        int max = 0;
        
        
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i%(num1.length)]) score[0]++;
            if (answers[i] == num2[i%(num2.length)]) score[1]++;
            if (answers[i] == num3[i%(num3.length)]) score[2]++;
        }
    
        max = Math.max(Math.max(score[0], score[1]), score[2]);
        
        System.out.println(max);
        
        List<Integer> answer_list = new ArrayList<Integer>();
        
        for(int i = 0; i < score.length; i++) {
            if(max == score[i]) {
                answer_list.add(i+1);
            }
        }
        
        int[] answer = new int[answer_list.size()];
        for(int i = 0; i < answer_list.size(); i++) {
            answer[i] = answer_list.get(i);
        }
        
        
        return answer;
    }
}