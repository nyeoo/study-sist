/*======================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
======================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//    분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합 if문(if 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참(true)일 경우
//    특정 문장을 수행하고자 할 때 사용되는 구문이다.

// ○ 과제
//	  사용자로부터 임의의 문자를 하나 입력받아
//	  알파벳 대문자이면 소문자로, 소문자이면 대문자로
//	  알파벳이 아닌 기타 문자면 입력 오류 처리하는
//	  프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// >> A → a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : b
// >> b → B
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : 3
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...



import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{


		// 임의의 한 문자를 담을 변수 선언 및 초기화
		char ch;
		


		// 연산 및 처리
		System.out.print("한 문자 입력 : ");
		
		ch = (char)System.in.read();


		// 아스키코드
		// 대문자 -> 소문자				// +32
		// 'A(65)' -> 'a(97)'
		// 'B(66)' -> 'b(98)'
		// 'C(67)' -> 'c(99)'
		//  :
		// 'Z(90)' -> 'z(122)'

		// 소문자 -> 대문자				// -32
		// 'a(97)' -> 'A(65)' 
		// 'b(98)' -> 'B(66)' 
		// 'c(99)' -> 'C(67)' 
		//  :
		// 'z(122)' -> 'Z(90)'	


		if (ch>='A' && ch<='Z')									//-- 만약 입력한 임의의 한 문자가 알파벳 대문자라면
		{
			System.out.printf(">> %c → %c\n", ch, ch+32);		//-- 아스키코드를 활용하여 알파벳 대문자를 소문자로 바꾸어 출력한다.(예시 : A → a)
		}
		else if (ch>='a' &&ch<='z')								//-- 그 외에 입력한 임의의 한 문자가 알파벳 소문자라면
		{
			System.out.printf(">> %c → %c\n", ch, ch-32);		//-- 아스키코드를 활용하여 알파벳 소문자를 대문자로 바꾸어 출력한다.(예시 : a → A)
		}
		else													//-- 그 외에 입력한 임의의 한 문자가 기타 문자라면
		{
			System.out.println(">> 입력 오류~!!!");				//-- 입력 오류~!!! 를 출력한다.
		}

	}
}

// 실행 결과

/*
한 문자 입력 : A
>> A → a
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : f
>> f → F
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : 5
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : @
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/