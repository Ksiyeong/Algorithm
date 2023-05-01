import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // terms 를 사용하기 편리하게 Map 에 저장
        Map<String, Integer> termsMap = Arrays.stream(terms)
                .map(term -> term.split(" "))
                .collect(Collectors.toMap(term -> term[0], term -> Integer.parseInt(term[1])));

        // 오늘 날짜를 LocalDate 로 변환
        LocalDate todayDate = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        return IntStream.range(1, privacies.length + 1)
                .filter(i -> {
                    String[] privacy = privacies[i - 1].split(" ");

                    LocalDate collectionDate = LocalDate.parse(privacy[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
                    int expirationPeriod = termsMap.get(privacy[1]);

                    // 수집일자 + 약관
                    LocalDate expirationDate = collectionDate.plusMonths(expirationPeriod);

                    // 오늘날짜가 유효기간만료일을 넘겼을 경우 true를 리턴
                    return !todayDate.isBefore(expirationDate);
                })
                .toArray();
    }
}