package ch_03;

public class _07_Break {
    public static void main(String[] args) {
        //break
        for (int i = 1; i <= 50; i++) {
            if (i == 5) {
                System.out.println("금일 판매 제한을 넘었습니다.");
                break;                                          //조건을 걸어 원하는 부분에서 반복문 탈출
            }
            System.out.println("판매했습니다.");
        }
        //continue문
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;           //i = 5 일 때 해당 인덱스는 통과됨
            }
            System.out.println(i + "번 통과");
        }
    }

}
