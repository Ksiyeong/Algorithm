import java.util.ArrayList;
import java.util.Arrays;

public class 중복순열 {
    public static void main(String[] args) {
        ArrayList<String[]> output = rockPaperScissors(10);
//        ArrayList<String[]> output = rockPaperScissors2(10);

        for (String[] str : output) {
            System.out.println(Arrays.toString(str));
        }
    }

    public static ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        ArrayList<String[]> resultArr = new ArrayList<>();

        // 총 라운드 수는 3의 rounds제곱 -> 3^rounds
        int count = (int) Math.pow(3, rounds);

        for (int i = 0; i < count; i++) {
            resultArr.add(new String[rounds]);
        }

        String[] RPS = {"rock", "paper", "scissors"};

        // 라운드가 증가함에 따라 3의 배수만큼 더 늦게 돈다 ?
        for (int i = 0; i < rounds; i++) {
            for (int k = 0; k < count; k++) {
                // 전체 라운드만큼 반복문 돈다

                int rps = (int) (k / Math.pow(3, rounds - i - 1));
                while (rps >= 3) {
                    rps -= 3;
                }
                resultArr.get(k)[i] = RPS[rps];
            }
        }

        return resultArr;
    }

    public static ArrayList<String[]> rockPaperScissors2(int rounds) {
        //결과를 담을 ArrayList를 선언합니다.
        ArrayList<String[]> outcomes = new ArrayList<>();
        // 함수를 실행하여 반환된 결과를 다시 반환합니다.
        return permutation(rounds, new String[]{}, outcomes);
    }

    // 재귀를 사용할 함수 선언
    // rounds를 넣을 변수 roundsToGo, 일회용 배열인 playedSoFar 변수를 선언합니다.

    // 재귀를 사용하는 이유는, 배열의 모든 요소의 경우의 수를 훑기 위한 적절한 방법이기 때문입니다.
    // 간단히 말하자면, 이 함수는 rounds 숫자를 기준으로, 일회용 배열에 rps 요소를 rounds 숫자만큼 넣게 됩니다.
    // 이 로직을 잘 이해할 수 있을 때까지 하단의 함수 로직을 연구해야 합니다.
    public static ArrayList<String[]> permutation(int roundsToGo, String[] playedSoFar, ArrayList<String[]> outcomes) {
        // rounds가 0일 경우 outcones 배열에 삽입하고, 재귀에서 빠져나옵니다.
        if(roundsToGo == 0) {
            outcomes.add(playedSoFar);
            return outcomes;
        }

        String[] rps = new String[]{"rock", "paper", "scissors"};

        // rps 배열을 한 번씩 순회합니다.
        for(int i = 0; i < rps.length; i++) {
            // rps의 i번째 요소를 변수에 담아서
            String currentPlay = rps[i];

            // permutate(본인)에 기존 rounds에서 하나 뺀 숫자와, 일회용 배열 playedSoFar에 currentPlay를 삽입하여 재귀를 실행합니다.
            // rounds에서 하나를 빼는 이유는, 일회용 배열의 크기를 rounds만큼 맞춰주기 위함입니다. [rock, rock, rock]
            String[] concatArray = Arrays.copyOf(playedSoFar, playedSoFar.length + 1);  //배열의 크기를 하나 늘리고, currentPlay를 요소로 넣어줍니다.
            concatArray[concatArray.length - 1] = currentPlay;

            outcomes = permutation(roundsToGo - 1, concatArray, outcomes);
        }

        // outcomes를 반환합니다.
        return outcomes;
    }
}