/*1 String Compare
public class _Compare_ {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String a = "aaaaaaa";
        String b = "bbbbbbb";
        String c = "aaaaaaa";
        String d = "aaaaaa";

        sb.append(a.compareTo(b)).append(" ").append(a.compareTo(c)).append(" ").append(a.compareTo(d));
        System.out.println(sb);
    }
}
// -1 0 1 출력
//문자열이 동일한 경우 길이의 차이만큼 출력
//문자열이 다른 경우 -1을 출력, 동일한 경우 0
 */

/*
public class _Compare_ {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String o1 = "abcdef";
        String o2 = "abcd";
        String o3 = "abcdefgh";
        String o4 = "iyocxzv";

        sb.append(o1.compareTo(o2)).append(" ").append(o1.compareTo(o3)).append(" ").append(o1.compareTo(o4));
        System.out.println(sb);
    }
}
//동일한 문자열의 경우 길이 차이 출력
//abcdef(6) - abcd(4) = 2
//abcdef(6) - abcdefgh(8) = -2

//동일한 문자열이 아니라면 길이 차이가 아닌 맨 앒글자의 아스키 코드 값의 차를 출력한다
//a(97)bcdef - i(105)yockzv = -8
 */

/*
public class _Compare_ {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n1 = 9;
        int n2 = 5;
        int n3 = 99;
        int n4 = 21633572;
        int n5 = 9;

        sb.append(Integer.compare(n1 , n2)).append(" ").append(Integer.compare(n1 , n3)).append(" ").append(Integer.compare(n1 , n4)).append(" ").append(Integer.compare(n1 , n5));
        System.out.println(sb);
    }
}
//1 -1 -1 0 출력
//숫자를 비교해서 자기보다 크면 1 , 같으면 0, 작으면 -1을 출력한다.
 */