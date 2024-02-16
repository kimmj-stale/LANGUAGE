package ch_04;

public class _02_InhencedFor {
    public static void main(String[] args) {
        //Inhenced For문 (For - Each 문)
        String[] coffees = {"아메리카노", "청포도 에이드", "블루베리 스무디"};
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나 주세요");
        }
    }
}