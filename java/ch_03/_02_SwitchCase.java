package ch_03;

public class _02_SwitchCase {
    public static void main(String[] args) {
        //Switch Case
        /*switch (변수) {         //switch case 구문의 경우 명확한 케이스가 없다면 사용하기 어려움
            case (조건문) :
                (수행문)
                break;
            case (조건문) :
                (수행문)
                break;
            .
            .
            default;
                (수행문)
                break;
        }*/
        int ppl = 4;
        switch (ppl) {
            case 4 :
                System.out.println("중간 광고 " + (ppl + 1)  + "개가 있습니다.");
                break;
            case 2:
                System.out.println("중간 광고 " + ppl  + "개가 있습니다.");
                break;
            default:
                break;          //위의 케이스가 모두 해당되지 않을 때
        }
    }
}
