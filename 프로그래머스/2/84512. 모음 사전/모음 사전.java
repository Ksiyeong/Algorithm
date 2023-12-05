class Solution {
    public int solution(String word) {
        int answer = 0;
        char[] AEIOU = new char[]{' ', 'A', 'E', 'I', 'O', 'U'};

        for (char c1 : AEIOU) {
            if (c1 == ' ') {
                continue;
            }
            answer++;
            String str1 = "" + c1;
            if (str1.equals(word)) {
                return answer;
            }

            for (char c2 : AEIOU) {
                if (c2 == ' ') {
                    continue;
                }
                answer++;
                String str2 = str1 + c2;
                if (str2.equals(word)) {
                    return answer;
                }

                for (char c3 : AEIOU) {
                    if (c3 == ' ') {
                        continue;
                    }
                    answer++;
                    String str3 = str2 + c3;
                    if (str3.equals(word)) {
                        return answer;
                    }

                    for (char c4 : AEIOU) {
                        if (c4 == ' ') {
                            continue;
                        }
                        answer++;
                        String str4 = str3 + c4;
                        if (str4.equals(word)) {
                            return answer;
                        }

                        for (char c5 : AEIOU) {
                            if (c5 == ' ') {
                                continue;
                            }
                            answer++;
                            String str5 = str4 + c5;
                            if (str5.equals(word)) {
                                return answer;
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }
}