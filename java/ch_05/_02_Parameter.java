package ch_05;

public class _02_Parameter {
    //매개 변수 사용
    public static void power(int number, int exponent) {               //지정 메서드 옆에 매개 변수를 사용하면서 함수 지정 가능
        int result = number * number * exponent;
        System.out.println(result);
    }

    /*public static void main(String[] args) {
        power(4 , 6);
    //아니면
    }*/

    //거듭제곱
    public static void powerEXP(int num, int exp) {
        int first = 1;
        for (int i = 0; i < exp; i++) {
            first *= num;
            ;
        }
        System.out.println(first);
    }
    /*public static void main(String[] args) {
        powerEXP(4 , 3);
    }*/

    //return 사용
    public static String phonenumber() {
        String number = "010 - 1234 - 5678";
        return number;
    }

    public static void main(String[] args) {
        System.out.println(phonenumber());              //return 사용해서 변수 뽑아낼 수 있음
    }
}
