package ch_04;

public class _01_array {
    public static void main(String[] args) {
        //array
        //같은 자료형의 문자열을 저장하는 배열
        //배열 만들기
        //(배열 자료형)[] (배열 이름) = new (배열 자료형)[배열의 요소 갯수];

        //다른 방법
        //(배열 자료형) (배열 이름)[] = new (배열 자료형)[배열 요소들의 갯수]
        //이하 동일

        //다른 방법 2
        //(배열 자료형) (배열 이름)[] = new (배열 자료형)[배열 요소들의 갯수 - 필수 아님] {(요소들)}

        int[] phone = new int[] {1 , 2 , 3 , 4 , 5};
        System.out.println(phone[2]);           //3 출력

        //다른 방법 3
        //(배열 자료형)[] (배열 이름) = {(요소들)}

        //ArrayLoop(배열 순회)
        String[] coffee = {"아메리카노" , "카푸치노" , "청포도 에이드" , "에스프레소"};
        for (int i = 0; i < 4; i++) {
            System.out.println(coffee[i] + " 나왔습니다.");
            //int 자료형이나 boolean , double , float도 array 형성 가능
        }
        //배열 길이를 이용
        for (int i = 0; i < coffee.length; i++) {
            System.out.println(coffee[i] + " 나왔습니다.");          //위와 결과가 같음을 알 수 있음
        }
    }
}
