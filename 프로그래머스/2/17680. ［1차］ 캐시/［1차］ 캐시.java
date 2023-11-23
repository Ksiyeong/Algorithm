import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> cache = new LinkedList<>();
        for (String city : cities) {
            city = city.toLowerCase(); // 대소문자 구분 X

            // cache hit
            if (cache.remove(city)) {
                cache.add(city);
                answer += 1;

            } else { // cache miss
                answer += 5;
                cache.add(city);

                // 캐시 용량이 초과될 경우 LRU에 의해 첫번째 요소 제거
                if (cache.size() > cacheSize) {
                    cache.remove(0);
                }
            }
        }

        return answer;
    }
}