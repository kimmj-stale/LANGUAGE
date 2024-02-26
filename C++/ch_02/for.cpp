/**
 * for문
 * 일정 횟수만큼 반복하고 싶은 경우 사용한다.
 * for (조건문) {
 *      (수행문)
 * }
 * ex)
 * 조건이 숫자인 경우
 * for (int i = 0; i < n; i++) {
 *      cout << "Hello" << '\n';
 * }
 * 조건이 행렬이나 문자인 경우      
 * for (char a : word) {        // 문자나 행렬 내의 요소를 앞에서 부터 표현
 *      cout << a << '\n';
 * }
*/

/*예제 (수 a 이하의 5의 배수만 출력하는 경우)
#include "iostream"
using namespace std;
int main() {
    int a;
    cin >> a;
    for (int i = 1; i <= a; i++) {
        int k = 5 * i;
        if (k > a) {
            break;
        }
        cout << k << '\n';
    }
}
*/

/*예제2 (아스키 코드 표 찍기)
#include "iostream"
using namespace std;
int main() {
    for (int i = 0; i < 128; i++) {
        cout << i << " = " << (char) i << '\n';
    }
}
*/
