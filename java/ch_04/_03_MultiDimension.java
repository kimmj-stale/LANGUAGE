package ch_04;

public class _03_MultiDimension {
    public static void main(String[] args) {
        //다차원 배열 (2차원 배열)
        //2개 이상의 배열을 나열 할 경우
        String[][] teammate = {
                {"Faker" , "Zeus" , "Keria"},
                {"hena" , "Karis" , "Morgan"},
                {"Cuzz" , "Andil" , "Dudu"}
        };
        //호출 방법
        System.out.println(teammate[2][0]);         //Cuzz 출력

        //MultiDimension Loop
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(teammate[i][j]);         //for문을 이용해 선수 전원 출력
            }
        }
        //영화관 좌석 만들기
        String[][] seatnumber = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seatnumber.length; i++) {           // 1 ~ 10
            for (int j = 0; j < seatnumber[i].length; j++) {        // 1 ~ 15
                seatnumber[i][j] = String.valueOf(ch) + (j + 1);        //valueOf = 원하는 열 형태로 만들어 줌
            }
            ch++;                                               //A B C D E .....
        }
        for (int i = 0; i < seatnumber.length; i++) {
            for (int j = 0; j < seatnumber[i].length; j++) {
                System.out.print(seatnumber[i][j] + " ");         //A1 A2 ......
            }
            System.out.println();
        }

    }
}
