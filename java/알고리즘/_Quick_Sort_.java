package baekjoon_prob;

/**
 * 퀵 소트(Quick Sort)
 * 퀵 소트는 pivot을 중심으로 하여 좌 , 우의 값들을 크기순서대로 정렬하는 방식
 * 왼쪽에서 크기가 다른 두 값을 정하고 크기를 비교하여 작은 값이 왼쪽으로 오도록 위치를 바꾼다.
 * pivot의 위치를 바꿔 중심을 교체한 후 값을 다시 정렬한다.

 * 시간 복잡도O(n*log2*n)이다.
 * 퀵 소트는 문제의 형식에 따라 최악의 경우 O(n^2)의 시간 복잡도를 가질 수 있다. 최고의 상황에선 merge sort 보다 빠르다.
 * 특정 조건 내에서 매우 속도가 느리다.(내림차순 정렬되어 있는 경우)
 * 재귀 함수를 사용하는 알고리즘인데 재귀함수를 사용하지 못하는 경우 성능이 매우 떨어진다.
 */
public class _Quick_Sort_ {
    //Override
    public void sort(int[] arr) {
        //quick sort를 사용할 arr의 범위 설정
        //low와 high를 설정하고 두 값을 비교
        quickSort(arr, 0, arr.length - 1);
    }
    private void quickSort(int[] arr, int low, int high) {
        if (low >= high) { //종료조건
            return;
        }
        int pivot = low + (high - low) / 2; //pivot 설정,
        int pivotValue = arr[pivot];

        //pivot기준, 비교할 두 값을 설정
        int left = low;
        int right = high;
        while (left <= right) {
            //pivot value보다 left value가 작다면 맞게 배열되어있는 것이므로 다음 left값으로 넘어감
            while (arr[left] < pivotValue) {
                left++;
            }
            //pivot value가 rigth value보다 작다면 맞게 배열되어 있는 것이므로 다음 right값으로 넘어감
            while (arr[right] > pivotValue) {
                right--;
            }
            //low 기준, pivot value보다 값이 커 pivot의 우측에 존재하애 한다.
            //high의 경우 pivot value보다 값이 작아 pivot의 좌측에 존재항 한다.
            //이는 pivot을 기준으로 하여 low의 value와 right의 value를 바꿔야 한다.
            if (left <= right) {
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
                left++;
                right--;    //  두 값을 바꾼 후 다음 값으로 넘어간다.
            }
        }
        //해당 pivot을 기준으로 값을 정렬한 후 pivot을 기준으로 구역이 나뉘었다
        //low = 0부터 pivot의 왼쪽으로 온 right값까지 다시 정렬한다.
        quickSort(arr, low, right);
        //pivot의 오른쪽으로 온 left값 부터 high = arr.length - 1까지 다시 정렬한다.
        quickSort(arr, left, high);
    }
}

