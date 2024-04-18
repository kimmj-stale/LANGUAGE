/**
 * Binary Search (이분 탐색)
 * 특정 배열이 오름차순으로 정렬 되어 있을 때 , 특정 값을 찾는 데 특화된 탐색 방식이다.
 * 반복문을 이용한 구현과 재귀를 이용한 구현 두가지가 있다.
 * 특정 배열을 이분 탐색 할 때 , 배열에서 탐색할 범위를 반으로 줄여가면서 탐색
 */

/*
// 반복문을 사용
    public static boolean binary_search(int[] arr , int search_data) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] < search_data) {
                low = mid + 1;
            }
            else if (arr[mid] > search_data){
                high = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
 */
/*
// 재귀 함수를 사용
public static Boolean binary_search(int[] arr , int search_data , int low , int high) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        if (arr[mid] < search_data) {
            return binary_search(arr , search_data , mid + 1 , high);
        }
        else if (arr[mid] > search_data) {
            return binary_search(arr , search_data , low , mid - 1);
        }
        else return true;
    }
 */
