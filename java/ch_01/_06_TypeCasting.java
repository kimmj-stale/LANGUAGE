package ch_01;

public class _06_TypeCasting {
    public static void main(String[] args) {
        //숫자를 문자열로 변환
        String sentence = String.valueOf(93);       //String을 사용하여 숫자 93을 문자열로 전환
        sentence = Integer.toString(93);        //Integer을 사용하여 숫자 93을 문자열로 전환, Double 이나 Float도 사용 가능
        //문자열을 숫자열로 변환
        int i = Integer.parseInt("93");
        double d = Double.parseDouble("93.3");
        float f = Float.parseFloat("93.3");     //전부 문자열로 취급되어 출력됨

    }
}
