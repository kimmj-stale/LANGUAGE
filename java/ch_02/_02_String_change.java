package ch_02;

public class _02_String_change {
    public static void main(String[] args) {
        //문자열 변환/대체
        String s = "I want a buy a new Iphone and Apple watch.";
        System.out.println(s.replace("and" , "&"));     //특정 문자열을 다른 문자열로 대체 가능
        System.out.println(s.substring(9));    //특정 순서부터 문자열을 출력 가능하도록 변경
        int a = s.indexOf("buy");
        System.out.println(s.substring(a));     //같은 내용
        System.out.println(s.replace("." , ""));        //특정 단어를 삭제시키는 방법

        //공백 제거
        String k = "            I like Java.         ";
        System.out.println(k.trim());       //문자열에 있는 공백 제거 (띄어 쓰기는 삭제 안됨)

        //문자열 결합
        String alpha = "abcdefg";
        String alphabet = "hijklmnop";
        System.out.println(alpha.concat(",").concat(alphabet));     //concat을 이용해 계속 문자열을 붙일 수 있음
        System.out.println(alpha + "," + alphabet);     //같은 방법
    }
}
