/**
 * if / else 문 
 * 기본적인 구조는 java의 조건문 형식과 매우 유사하다.
 *  if (조건) {
 *      (수행문1);
 *      (수행문2);
 *      .
 *      .
 *      .
 *  }
 *  else {
 *      (수행문1)
 *      .
 *      .
 *      .
 *  }
 * 
 * 혹은
 * if (조건문) (수행문)
 * ㄴ> 위 형식은 단일 수행문일 경우만 사용 , 두 개 이상 사용할 경우 가독성 떨어짐
*/

/*
#include <iostream>
using namespace std;
int main() {
    int score;
    cin >> score;
    if (score > 60) {
        cout << "congratulation! You've got pass score!" << '\n';
     }
     else {
        cout << "You failed"
     }
}
*/

/**
 * 부등호 표현
 * if문 안에 두개의 부등호로 싸인 수식이 존재할 경우
 * if (10 < a < 20) (X)
 * if (10 < a && a < 20) (O)
 * &&를 쓸 수 있으므로 동시에 ||도 사용 가능
*/