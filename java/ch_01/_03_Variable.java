package ch_01;

public class _03_Variable {
    public static void main(String[] args) {
        String name , phone;
        name = "Apple";
        phone = "Iphone";
        int bill;
        bill = 15000;
        double per;     //float 자료형도 상관없음. float는 정교한 자료형 저장이 불가능함. float f = 3.l4f 로 표현 가능
        per = 85.5;
        char grade;     //한 단어 표현은 보통 char로 나타낸다. String 도 상관없음.
        grade = 'A';
        boolean team = true;    //나중에 더배움
        System.out.println(name + "은 최고의 IT 회사이다. 매출이 무려 " + bill + "$ 이기 때문이다.");
        System.out.println(name + "의 점유율은 무려" + per + "% 나 된다.");
        System.out.println("내 기준 " + phone + "은 " + grade + "급 이다.");
        //float vs double
        double d = 3.141592653589793238462643383279;
        float f = 3.141592653589793238462643383279F;
        System.out.println(d);
        System.out.println(f);  //수를 완전히 표현하지 못함
        //int i = 1000000000000;  //너무 큰 수는 표현 불가능
        long l = 1000000000000000L;    //long 으로 표현 가능
        l = 1_000_000_000_000_000L;     //이런 식으로 표현해도 상관없음
    }
}
