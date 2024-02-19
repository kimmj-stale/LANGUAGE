#include <stdio.h>
int main(void)
{
    //array[] 형태로 저장 
    //(배열 형태) (배열 이름)[(배열 요소 갯수)];
    //배열 받는 법
    /**
     * for (i = 0; i < (배열 길이); i ++) {
             scanf("%d" , &(배열 이름)[(배열 )]);}*/
    int min , max = 0 , i , index = 0;
    int array[5];
    for (i = 0; i < 5; i++){
        scanf("%d" , &array[i]);
        if (max <= array[i]) {
            max = array[i];
            index = i;
        }
    }
    printf("%d , %d" , max , index + 1);
}