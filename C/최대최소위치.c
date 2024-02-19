/**
 * 예제풀이 - 짝수 중 가장 큰 수 / 홀수 중 가장 큰 수 / 그 숫자의 각각의 위치
*/
#include <stdio.h>
#define NUMBER 5

int main(void)
{
    int array[NUMBER];
    int i , oddMAX = 0 , evenMAX = 0 ;
    int index_odd = 0 , index_even = 0;

    for (i = 0; i < NUMBER; i++){
        scanf("%d" , &array[i]);
        if (array[i] % 2 == 0)
        {
            if (evenMAX <= array[i]) 
            {
                evenMAX = array[i];
                index_even = i;
            }
        }
        if (array[i] % 2 != 0) {
            if (oddMAX <= array[i]) {
                oddMAX = array[i];
                index_odd = i;
            }
        }
    }
    printf("%d , %d\n" , oddMAX , evenMAX);
    printf("%d , %d" , index_odd + 1 , index_even + 1);
    return 0;
}