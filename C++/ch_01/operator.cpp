/**
 * cast 형 변환
 * 보통 자동 형 변환에 의해 크기가 큰 자료형 쪽으로 통일되어 표현됨
 * 하지만 cast 형 변환을 이용하여 원하는 자료형으로 강제 변환이 가능하다
 * ex) (int) 'A' = 숫자 65(ASCII)
 *     (char) 65 = 'A'
 *     (double) 3 = 3.0
*/

/**
 * sizeof 연산자
 * 해당 변수나 자료형 , 배열 등이 차지하는 메모리 크기를 표현하는 연산자
 * sizeof num       ->      변수는 괄호 없이 사용 가능
 * sizeof(int)      ->      자료형의 크기
 * sizeof("name")   ->      문자열의 크기를 나타냄
 * !!한글은 한 글자가 2바이트를 차지함
 * 배열은 자료형의 크기 * 방의 크기 로 나옴
*/

/**
 * 삼항 조건 연산자
 * 삼항 조건 연산자는 if else 문을 간단하게 표현할 수 있다.
 * ex)
 * (i > j)? i : j;          ->          i > j라면 i , 아니면 j
 * max = (i > j) ? i : j    ->          i > j라면 max = i , 아니면 max = j
*/

/**
 * 논리 연산자와 연산 생략 기능
 * 연산 결과가 false면 0 , true면 1 출력
 * 간단한 논리 연산은 생략이 가능하다
 * ex)
 * int a = 5 , b = 0;
 * printf("%d" , (7 > 1) && (1 == 2));      -> 1 and 0 => 0
 * printf("%d" , (7 > 1) || (1 == 2));      -> 1 or 0 => 1
 * printf("%d" , (a && b))      -> 5 ans 0 => 0
*/

/**
 * c언어에서의 논리 연산
 * ex) 
 * if (90 <= ans < 95) {}   ->      (x)
 * if (ans >= 90 && ans < 95) {}    ->      (o)
*/