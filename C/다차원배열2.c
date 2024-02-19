#include <stdio.h>
int main(void)
{
    int test_score[5][2];
    int total[2] = { 0 , };         /** 배열 안의 모든 공간에 0을 집어넣는 방법 */
    int i , math_sum = 0 , engl_sum = 0;

    for (i = 0; i < 5; i++) {
        printf("%d번째 학생의 점수를 각각 입력해 주세요 : " , i + 1);
        scanf("%d %d" , &test_score[i][0] , &test_score[i][1]);
    }
    for (i = 0; i < 5; i++) {
        math_sum += test_score[i][0];

        engl_sum += test_score[i][1];
    }
    printf("%d %d" , math_sum , engl_sum);
}