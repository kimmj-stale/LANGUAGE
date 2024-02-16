package ch_03;

public class _03_For {
    public static void main(String[] args) {
        /*for (선언; 조건; 증감) {
            (수행문)           //n 번 수행할 수행문 , if문을 사용해 제한할 수 있다
        }
         */
        /*for (int i = 0; i < 10; i++) {                //fori 만 쳐도 메서드로 for (int i = 0; i < ; i++) 까지 출력해준다
            System.out.println(i + "번째 손님 어서오세요");
        }*/
        /*for (int i = 2; i <= 30; i += 2) {
            System.out.print(i);*/
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
