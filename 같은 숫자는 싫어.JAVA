import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(a.get(a.size() - 1) != arr[i])
                a.add(arr[i]);
        }
        int[] answer = new int[a.size()];
        for(int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}
