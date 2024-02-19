#include <stdio.h>
//새로운 함수 정의
/*int path(int x)
{
    int answer = x * x;
    return answer;          //함수를 call 하먄 return 값으로 answer 호출
}
int main(void)
{
    printf("%d" , path(5));
    return 0;
}*/
//전역변수 정의
int last_hour;
int hour;
int minute;
int input;          //함수 지정 이전에 모든 함수에 들어갈 전역 변수 선정 가능
void min_test()
{
    hour = input / 60;
    last_hour = input % 60;
    minute = last_hour;
}
int main(void)
{
    scanf("%d" , &input);
    min_test();
    printf("%d 시 %d 분" , hour , minute);
    return 0;
}