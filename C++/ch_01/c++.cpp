/*
#include <iostream>
int main(){
    std::cout<<"소프트웨어"<<std::endl;
    //표준 객체의 namespace = std
    //범위 지정 연산자 = ::
    //C에서 printf 와 비슷한 역할을 수행
    return 0;
}
*/

/**
 * 보통 객체로 std를 많이 사용하며 생략하는 경우도 존재(자주 하진 않음)
*/

/*
#include <iostream>
using namespace std;        //namespace를 std로 사용하겠다 선언
int main(){
    cout<<"ABCD"<<endl;
}
*/
/*
#include <iostream>
int main() {
    using std::cout;
    using std::endl;    //cout의 범위를 std::cout부터 std::endl 까지 참조하겠다 선언

    cout<<"소프트웨어"<<endl;
}
*/
/**
 * iostream은 파일을 열면 자동으로 생성되는 자동 stream 객체
 * cout은 화면으로 출력하는 객체(printf) , endl은 standard의 내장 함수라 생각하면 됨
*/
