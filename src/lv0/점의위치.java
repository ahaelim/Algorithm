package lv0;

public class 점의위치 {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int[] dot) {
            int answer = 0;
            if(dot[0]>0 && dot[1]>0){
                answer = 1;
            }else if(dot[0]<0 && dot[1]>0){
                answer = 2;
            }else if(dot[0]<0 && dot[1]<0){
                answer = 3;
            }else {
                answer=4;
            }
            return answer;
        }
    }
}
