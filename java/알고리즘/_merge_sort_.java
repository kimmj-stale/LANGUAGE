package baekjoon_prob;

/**
 * merge sort(병합 정렬)
 * 두개의 partition으로 나누어 값을 비교하는 알고리즘이다.
 * merge sort는 배열을 게속 쪼개면서 길이가 1인 배열이 나올 때 까지 반복한다.
 * 길이가 1인 배열을 비교 후 합치고 합친 배열끼리 다시 비교하는 방법이다. quick sort와 마찬가지로 재귀 함수의 성질을 띈다
 *
 * 시간 복잡도는 O(nlogn)이다.
 * 문제의 상황에 따라 다른 quick sort와 달리 merge sort는 항상 O(nlogn)의 시간 복잡도를 가진다.
 */

public class _merge_sort_ {
    //정렬된 data들을 예비로 저장하기 위해 array를 만든다
    public static int[] sorted;
    //실행함수
    public static void merge_sort(int[] arr) {
        sorted = new int[arr.length];
        merge_sort(arr , 0 , arr.length - 1);
        sorted = null;
    }
    //bottom up 방식을 사용하기 위한 재귀함수
    private static void merge_sort(int[] arr , int left , int right) {
        for (int size = 1; size <= right; size += size) {
            for (int l = 0; l <= right - size; l += (2 * size)) {
                int low = l;
                int middle = l + size - 1;
                int high = Math.min(l + (2 * size) - 1 , right);
                merge(arr , low , middle , high);
            }
        }
    }
    //병합 정렬 작동 함수
    private static void merge(int[] arr , int left , int mid , int right) {
        //두개로 나눈 상황에서 왼쪽 array의 시작을 l부터, 오른쪽 array의 시작을 r부터
        int l = left;
        int r = mid + 1;
        //임시 저장을 위한 sorted의 index
        int idx = left;
        //비교를 위해 시작
        while (l <= mid && r <= right) {
            //왼쪽 값이 작다면 sorted값에 저장 , 오른쪽 값이 작다면 sorted값에 저장, 다음 index로 넘어감
            if (arr[l] <= arr[r]) {
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
            else {
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }
        //둘 중 하나의 array가 모두 끝났다면 아직 안끝난 array를 마저 정렬
        if (l > mid) {
            while (r <= right) {
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }
        else {
            while (l <= mid) {
                sorted[idx] = arr[l];
                idx++;
                l++;
            }
        }
        //sorted에 저장된 옳게 정렬된 값을 다시 원래 배열에 저장
        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }
    }
}
