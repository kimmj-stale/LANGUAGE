/**
 * switch / case 문 사용
 * 각각의 경우마다 해당하는 수행문을 다르게 사용하고 싶을 때 사용
 * switch (입력값) {
 * case 1:
 *      (수행문)
 * case 2:
 *      (수행문)
 *      .
 *      .
 *      .
 * case (입력값):
 *      (수행문)
 * default:
 *      (해당 경우가 아닌 경우 수행문)
 * }
*/

/*예제
#include <iostream>
using namespace std;
int main() {
    int num1 , num2;
    char cont;
    cout << "계산하려는 수식을 입력하세요";
    cin >> num1 >> cont >> num2;
    switch (cont) {
    case '+':
        cout << num1 + num2 << '\n';
        break;
    case '-':
        cout << num1 - num2 << '\n';
        break;
    default:
        cout << "잘못 입력하셨습니다.";
        break;
    }
}
*/