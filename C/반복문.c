//조건문 & 반복문 정리
#include <stdio.h> 
int main(void)
{
    //조건문
    /*int x = 100;
    if (x > 50) {
        x -= 50;
    }
    printf("%d" , x);*/

    //반복문(for)
    /*int y;
    for (int y; y <= 20; y++) {
        printf("%d 번째 손님입니다.\n" , y);
    }*/
    //예제 풀이
    /*int y;
    scanf("%d" , &y);
    if ((y % 4 == 0 && y % 100 == 0) || y % 400 == 0) {
        printf("%d 년은 윤년입니다." , y);
    }
    else
    {
        printf("%d 년은 윤년이 아닙니다." , y);
    }*/

    //while문
    /*int i = 1 , sum = 0;
    while (i <= 100)
    {
        sum += i;
        i++;
    }
    printf("%d" , sum);
    return 0;*/
}