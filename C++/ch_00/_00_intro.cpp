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
 * C++ vs C
*/
#include <iostream>
int main()
{
    int fav_number;
    std::cout << "Put your number what you like between 1 to 100: ";
    //printf("Put your number what you like between 1 to 100: ");
    std::cin >> fav_number;
    //scanf("%d" , &fav_number);
    std::cout << "So , you like this number?" << std::endl;
    //printf("So , you like this number?");

    return 0; //optional code
}
/**
 * 컴파일 하는 방법(exe기준)
 * vs 기준 ctr + F7
 * [파일이름] 이 [해당 경로]에 저장되었습니다.
 * exe 파일로 저장되어 pmt로 실행됨
 * 컴퓨터가 읽기 쉬운 형태의 파일(.obj)이 컴파일 시 생성됨
 * 즉시 실행시키기 위해서 F5만 누르면 실행됨
 * 디버깅을 위해선 ctr + F5 누르면 가능
*/