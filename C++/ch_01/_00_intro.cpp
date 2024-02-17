/**
 * C++
 * 오브젝트 코드 - 컴퓨터가 읽을 수 있는 machine - readable code
 * 컴파일러 - 소스코드를 오브젝트 코드로 변환하는 도구
 * 링커 - 오브젝트 코드를 실행파일(exe , dmg)로 변환하는 도구
 * 테스트 & 디버깅: 프로그램에 존재하는 오루를 찾고 수정하는 과정
 * 
 * IDE(Integrated Development Environment)
 * - 통합 개발 환경 (텍스트 에디터 + 컴파일러 + 링커 + 디버거)
*/
/**
 * 입출력 
*/
#include <iostream>
int main()
{
    int fav_number;
    std::cout << "Put your number what you like between 1 to 100: ";
    std::cin >> fav_number;
    std::cout << "So , you like this number?" << std::endl;

    return 0; //optional code
}