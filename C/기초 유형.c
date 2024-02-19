#include <stdio.h>
//#include <limits.h>
#define SECONDE_PER_MINUTE 60
int main(void)
{
    // Hello World!!
    /*printf("Hello Wordl!! ₩n");
    return 0;*/
//data type 에는 
//primitive( char , int , float , double , void)가 있고
//derivied(array , pointer , function)
//user defined(enum , structure , union)
    //int자료형
    /*int age = 12;
    printf("%d₩n" , age);
    return 0;*/

    // float 와 double 자료형
    /*float frame = 45.5;
    printf("%f₩n" , frame);
    double grade = 23.445;
    printf("%lf" , grade);
    return 0;*/

    //printf 사용
    //연산
    /*int add = 3 + 7 ;
    printf("3 + 7 = %d₩n" , add);
    return 0;*/

    /*int add = 3 + 7;
    printf("%d + %d = %d₩n" , 3 , 7 , add);
    return 0;*/

    /*double f = 22.228;
    printf("%.2f₩n" , f);
    return 0;*/

    //증감 연산자
    /*int x;
    printf("값을 입력하세요 : ");
    scanf("%d" , &x);
    printf("현재 값은 %d 입니다\n" , x);
    printf("현재 값은 %d 입니다\n" , x++);  //x + 1 값을 다음 줄 넘어갈 때 계산
    printf("현재 값은 %d 입니다\n" , ++x);  //x + 1 값을 다음 줄 넘어가기 전 계산
    printf("현재 값은 %d 입니다\n" , x--);  //x + 1 값을 다음 줄 넘어갈 때 계산
    printf("현재 값은 %d 입니다\n" , --x);*/  //x + 1 값을 다음 줄 넘어가기 전 계산

    //복합 대입 연산자
    /*int x;
    scanf("%d" , x);
    //x += 5    x = x + 5
    //x -= 5    x = x - 5
    //x *= 5    x = x * 5
    //x /= 5    x = x / 5
    //x %= 5    x = x % 5
    printf("%d" , x);*/

    //예제 1
    /*int x = 1000;
    int minute = x/SECONDE_PER_MINUTE;
    int second = x%SECONDE_PER_MINUTE;
    printf("%d초는 %d분 %d초 입니다" , x , minute , second);*/

    //입력값 받기 scanf
    /*int input;
    printf("값을 입력하세요: ");
    scanf("%d" , &input);
    printf("입력값 : %d₩n" , input);
    return 0;*/

    //여러 입력값 받기
    /*int a , b , c;
    printf("값을 입력하세요 : ");
    scanf("%d %d %d" , &a , &b , &c);
    printf("입력값 : %d₩n , %d₩n , %d₩n" , a , b , c);*/

    //문자열 받기
    /*char str[256];
    scanf("%s" , str , sizeof(str));
    printf("%s₩n" , str);
    return 0;*/

    //오버플로우(최댓값과 최솟값 구하기
    /*int x = INT_MAX;
    printf("%d" , x);
    printf("%d" , x + 1);
    return 0;*/

    //변수 2개
    /*int x = 10;
    int y = 20;
    printf("%d\n" , x);
    printf("%d\n" , y);
    printf("%d\n" , x + y);
    printf("%d\n" , x * y);
    printf("%d\n" , x / y);*/

    //8진수 & 16진수로 변환하기
    /*int x;
    printf("입력하세요: ");
    scanf("%d" , &x);
    printf("%o" , x);   //8진수는 %o를 사용
    printf("%x" , x)*/    //16진수는 %x를 사용

    //반복문
    
}
