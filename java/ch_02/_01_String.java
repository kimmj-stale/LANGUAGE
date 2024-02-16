package ch_02;

public class _01_String {
    public static void main(String[] args) {
        //문자열의 길이
        String s = "I like Kenzo and Palace";
        System.out.println(s.length());     //문자열의 길이만큼 출력 , 23

        //대/소문자 변경
        System.out.println(s.toUpperCase());    //대문자로
        System.out.println(s.toLowerCase());    //소문자로

        //포함 관계
        System.out.println(s.contains("Kenzo"));    //true
        System.out.println(s.contains("kenzo"));    //false
        System.out.println(s.indexOf("Kenzo"));     //특정 단의의 위치 파악 가능
        System.out.println(s.indexOf("kenzo"));     //포함되어 있지 않은 단어의 위치는 -1 로 나옴
        System.out.println(s.lastIndexOf("Kenzo"));     //특정 단어가 여러개라면 마지막 단어의 위치를 나타냄
        System.out.println(s.startsWith("I"));      //특정 단어로 시작하는 문장/단어라면 true를  반환
        System.out.println(s.endsWith("Palace"));   //특정 단어로 끝나는 문장/단어라면 true를 반환

    }
}
