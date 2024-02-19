#include <stdio.h>
int main(void)
{
    //5x5 상자 만들기
    /*int i , j , k;
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5; j++){
            printf("*");
        }
        printf("\n");
    }*/

    //5줄 피라미드 만들기
    /*int i , j;
    for (int i = 1; i <= 5; i ++)
    {
        for (int k = 1; k <= (5 - i); k++)
        {
            printf(" ");
        }
        for (int j = 1; j <= (2 * i - 1); j ++)
        {
            printf("*");
        }
        printf("\n");
    }*/

    //마름모 만들기
    int i , j , k;
    for (int i = 1; i <= 5; i ++)
    {
        for (int k = 1; k <= (5 - i); k++)
        {
            printf(" ");
        }
        for (int j = 1; j <= (2 * i - 1); j ++)
        {
            printf("*");
        }
        printf("\n");
    }
    for (int i = 1; i <= 4; i++)
    {
        for (int k = 1; k <= i; k++)
        {
            printf(" ");
        }
        
        for (int j = 1; j <= 9 - (2 * i); j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}