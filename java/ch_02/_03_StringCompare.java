package ch_02;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Python";
        String s2 = "PYthon";
        System.out.println(s1.equals("Python"));        //문자열 비교를 통해 같다면 true 반환
        System.out.println(s2.equalsIgnoreCase("python"));        //대/소문자 구별 없이 내용만 같다면 true 반환

        //문자열 비교 심화
        String i = "1234";
        String k = "1234";
        System.out.println(i.equals(k));        //i와 k가 같다면 true 반환, 아니면 false 반환
        System.out.println(i == k);     //같은 방식

        i = new String("1234");
        k = new String("1234");
        System.out.println(i.equals(k));    //true (값이 똑같기 땨문에 true 반환)
        System.out.println(i == k);     //false (값이 같지만 같은 것을 지정하는 것이 아니기 때문에 false -> i != k)
    }
}
