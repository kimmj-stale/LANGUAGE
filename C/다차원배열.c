/**
 * 구구단을 이용하여 다차원 배열 알아보기
*/
#include <stdio.h>
int main(void)
{
    int i , j;
    int nton[10][10];
    for (i = 1; i < 10; i++) {
        printf("%d단 : \n" , i);
        for (j = 1; j < 10; j++) {
            nton[i][j] = i * j;         /** 배열에 i x j값을 넣고 저장, 하지만 굳이 할 필요는 없음*/
            printf("%d X %d = %d\n" , i , j , nton[i][j]);
        }
    }
    return 0;
}