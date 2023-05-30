class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[]{wallpaper.length, wallpaper[0].length(), 0, 0};

        for (int i = 0; i < wallpaper.length; i++) {
            int firstX = wallpaper[i].indexOf('#');
            int lastX = wallpaper[i].lastIndexOf('#');

            if (firstX > -1) {
                if (answer[0] > i) {
                    answer[0] = i;
                }
                if (answer[1] > firstX) {
                    answer[1] = firstX;
                }
                if (answer[2] < i + 1) {
                    answer[2] = i + 1;
                }
                if (answer[3] < lastX + 1) {
                    answer[3] = lastX + 1;
                }
            }
        }
        
        return answer;
    }
}