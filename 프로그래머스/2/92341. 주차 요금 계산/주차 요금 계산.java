import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    private class ParkingRecord {
        private LocalTime inTime;
        private long stayedTime = 0;

        public void calculateStayedTime(LocalTime outTime) {
            this.stayedTime += ChronoUnit.MINUTES.between(this.inTime, outTime);
            this.inTime = null;
        }

        public ParkingRecord(LocalTime inTime) {
            this.inTime = inTime;
        }
    }

    public int[] solution(int[] fees, String[] records) {
        Map<Integer, ParkingRecord> map = new TreeMap<>();

        // 체류 시간 계산
        for (String record : records) {
            String[] split = record.split(" ");
            LocalTime time = LocalTime.parse(split[0]);
            int number = Integer.parseInt(split[1]);
            boolean inOut = split[2].equals("IN"); // IN = true, OUT = false

            if (map.containsKey(number)) {
                ParkingRecord parkingRecord = map.get(number);
                if (inOut) {
                    parkingRecord.inTime = time;
                } else {
                    parkingRecord.calculateStayedTime(time);
                }
            } else {
                map.put(number, new ParkingRecord(time));
            }
        }

        // 정답 계산
        int[] answer = new int[map.size()];

        int i = 0;
        for (ParkingRecord parkingRecord : map.values()) {
            // 잔류 차량 출차 처리
            if (parkingRecord.inTime != null) {
                parkingRecord.calculateStayedTime(LocalTime.of(23, 59));
            }

            // 요금 계산
            answer[i] = fees[1];
            int temp = (int) parkingRecord.stayedTime - fees[0];
            if (temp > 0) {
                answer[i] += (temp / fees[2] * fees[3]) + (temp % fees[2] == 0 ? 0 : fees[3]);
            }
            i++;
        }
        return answer;
    }
}