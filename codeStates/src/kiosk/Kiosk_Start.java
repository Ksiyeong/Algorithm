package kiosk;

import static kiosk.Kiosk_Program.*;
import java.util.Scanner;


public class Kiosk_Start {
    public static void main(String[] args) {
        //TODO:
        Scanner sc = new Scanner(System.in);
        input_print();
        int number = count(sc);
        int result = cost(number);
        output_print(result);
    }
}
