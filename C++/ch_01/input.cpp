/**
 * iostream은 파일을 열면 자동으로 생성되는 자동 stream 객체
 * cout은 화면으로 출력하는 객체(printf) , endl은 standard의 내장 함수라 생각하면 됨
 * cin은 키보드로 부터 데이터를 입력받는 객체(scanf)
*/
//예제
/*
#include <iostream>
int main() {
    using namespace std;
    int a;
    cin >> a;   //int로 지정된 a 값을 받는 자리
    cout << a;  //받은 a 값을 다시 출력하는 자리
}
*/

//여러 값 출력
/*
#include <iostream>
using namespace std;
int main() {
    int a , b , c;
    a = 10;
    b = 20;
    c = a + b;
    cout << a << " , " << b << " , " << c;
}
*/
