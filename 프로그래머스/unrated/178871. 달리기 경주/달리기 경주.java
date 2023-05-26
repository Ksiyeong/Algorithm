import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }

        for (String calling : callings) {
            int nowIndex = playersMap.get(calling);

            String temp = players[nowIndex - 1];
            players[nowIndex - 1] = calling;
            players[nowIndex] = temp;

            playersMap.put(calling, nowIndex - 1);
            playersMap.put(temp, nowIndex);
        }

        return players;
    }
}