package 함수;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class S5_4673 {
    public static void main(String[] args) throws IOException {
        // 1부터 10000까지의 리스트 중에서
        // 1부터 생성자들을 계산하여 remove함수를 이용하여 삭제한다
        // remove도중 false가 나오면 다음 수로 넘어가 셀프넘버를 계산하여 올라간다
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> selfNumber = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            selfNumber.add(i + "");
        }

        for (int i = 1; i <= 10000; i++) {
            if (i < 10) {
                selfNumber.remove(i * 2 + "");
            } else if (i < 100) {
                selfNumber.remove(i + i / 10 + i % 10 + "");
            } else if (i < 1000) {
                selfNumber.remove(i + i / 100 + i % 100 / 10 + i % 10 + "");
            } else if (i < 10000) {
                selfNumber.remove(i + i / 1000 + i % 1000 / 100 + i % 100 / 10 + i % 10 + "");
            }
        }
        for (String self : selfNumber) {
            bf.write(self + "\n");
        }
        bf.flush();
    }
}