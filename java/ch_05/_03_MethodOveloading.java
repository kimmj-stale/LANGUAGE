package ch_05;

public class _03_MethodOveloading {
    //메서드 오버로딩
    //이름이 같은 두 메서드를 중복해서 사용할 수 있도록 해주는 기능
    public static int multiply(int n) {
        int num = n;
        return num * num;
    }
    public static int multiply(String strn) {
        int strnum = Integer.parseInt(strn);
        return strnum * strnum;
    }

    public static void main(String[] args) {
        System.out.println(multiply(4));              //int로 받아서 1번째 multiply로 적용됨
        System.out.println(multiply("4"));          //str로 받아서 2번째 multiply로 적용됨
    }
}
