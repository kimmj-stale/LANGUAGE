package ch_01;

public class _07_Operator {
    public static void main(String[] args) {
        //증감 연산자
        int a = 12;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);      //C언어 증감 연산자와 같은 논리 , --도 같다

        //대입 연산자
        int b = 13;
        //b += 1;       //14
        //b -= 1;       //12
        //b /= 2;       //6
        //b %= 2;       //1
        System.out.println(b);

        //비교 연산자
        System.out.println(5 > 3);      //True
        System.out.println((4 < 1));    //False
        //< , > , <= , >= , == , != 사용

        //논리 연산자
        boolean append = false;
        boolean dispance = false;
        boolean collapse = true;
        System.out.println(append || dispance || collapse);     // || = or 과 같은 개념 , 셋 중 하나라도 true라면 값이 true로 출력
        System.out.println(append && dispance && collapse);     // && = and 와 같은 개념 , 셋 중 하나라도 false라면 값이 false로 출력

        //논리 부정 연산자
        System.out.println(!false);
        System.out.println(5 == 5);
        System.out.println(!(5 == 5));      //원래 값의 반대 결과로 출력된다
        //삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 14;
        int max = (x > y) ? x : y;      //true의 경우 x를  , false 의 경우 y를 출력한다
        System.out.println(max);

        boolean same = (x == y) ? true : false;
        System.out.println(same);
    }
}
