package ch_03;

public class _01_if {
    public static void main(String[] args) {
        //if 조건문
        //if (조건문)
           // (수행문)
        int a = 12;
        if (a == 12)
            System.out.println(true);
        //수행문 2개 이상
        if (a == 12){
            System.out.println(true);
            System.out.println("correct");
        }
        //이중 조건문
        int hour = 11;
        boolean morning = false;
        if (hour < 14 && morning == false)
            System.out.println("ㅇㅇ");

        //else
        int h = 18;
        if (h > 19)
            System.out.println("decaffeine recommanded");
        else
            System.out.println("caffeine available");        //if문의 조건문에 해당되지 않는다면 else의 수행문 수행

        //elif
        int time = 11;
            if (time >= 15)
                System.out.println("caffeine is not available");
            else if (time == 11)
                System.out.println("smoothi is recommended");
            else
                System.out.println("caffeine available");




    }
}
