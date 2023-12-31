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
//	  사용자로부터 임의의 알파벳 한 문자를 입력받아
//	  이를 판별하여 입력받은 알파벳이 모음일 경우에만
//	  결과를 출력하는 프로그램을 구현한다.
//	  단, 대소문자를 모두 적용할 수 있도록 처리한다.
//	  또한, 알파벳 이외의 문자가 입력되었을 경우
//	  입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 임의의 알파벳 한 문자 입력 : A	← 대문자 모음
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : e	← 소문자 모음
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : B	← 대문자 자음
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : c	← 소문자 자음
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : 1	← 알파벳 아님
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...


import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{



		// 변수 선언 및 초기화
		char ch=0;					//-- 임의의 알파벳 한 문자를 담을 변수
		


		// 연산 및 처리
		System.out.print("임의의 알파벳 한 문자 입력 : ");

		ch = (char)System.in.read();



		if (ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')	//-- 만약 입력한 문자가 알파벳 대문자, 소문자 모음이라면
		{
			System.out.println(">> 모음 OK~!!!");																			//-- 모음 OK~!!! 를 출력한다.
		}

		else if (('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z'))																//-- 그 외에 입력한 문자가 알파벳 대문자, 소문자 라면
		{
			System.out.print("");																							//-- 아무것도 출력하지 않는다.
		}

		else																												//-- 그 외에 입력한 문자가 알파벳 이외의 문자라면
		{
			System.out.println(">> 입력 오류~!!!");																			//-- 입력 오류~!!! 를 출력한다
		}



	}
}


// 실행 결과

/*
임의의 알파벳 한 문자 입력 : A
>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자 입력 : e
>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자 입력 : D
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자 입력 : z
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자 입력 : 7
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/