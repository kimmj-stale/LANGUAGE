package ch_03;

public class _06_Multiplication {
    public static void main(String[] args) {
        //구구단 만들기
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
