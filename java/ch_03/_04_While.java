package ch_03;

public class _04_While {
    public static void main(String[] args) {
        //While문
        /*while (조건문) {
            (수행문)
        }
         */
       /* int i = 0;
        int end = 30;
        while (i < 30) {
            i += 5;
            System.out.println("done");
        }*/
        //Do while 문
        /*do { (수행문);
               (수행문);
               .
               .
        } while (조건문);
         */
        double distance = 25D;
        double height = 1.8D;
        double start = 0D;
        do {start += 0.8;
            System.out.println(start + "m 움직였습니다.");
        } while (start + height < distance);
    }
}
