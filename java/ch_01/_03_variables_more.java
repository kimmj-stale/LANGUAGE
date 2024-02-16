package ch_01;

public class _03_variables_more {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(a);
        System.out.println((float) a);      //int 자료형 변수를 float 자료형 변수로 변환, 같은 방식으로 double도 가능함

        float b = 93.3F;
        double c = 98.8D;
        //int
        System.out.println((int) b);    //93.0
        System.out.println((int) c);    //98.0
        //정수 + 실수 연산 과정
        //score = 30 + 55.5;    int 와 float 자료형 연산 불가능
        double score = (double) 30 + 55.5;
        System.out.println(score);
        //형 변환
        int aa = 12;
        double aa_converted =  aa;      //aa를 double 자료형으로 전환
        //  자료형의 크기는 int -> long -> float -> double
        double bb = 13.3;
        int bb_converted = (int) bb;     //수동으로 자료형을 전환해야 한다.
        System.out.println(aa_converted);       //12
        System.out.println(bb_converted);       //13
    }
}
