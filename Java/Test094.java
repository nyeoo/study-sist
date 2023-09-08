/*========================
 ■■■ 배열 ■■■
 - 배열의 배열
==========================*/

// ○ 과제
//	  배열의 배열(다차원 배열)을 활용하여
//	  다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//	  그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O

계속하려면 아무 키나 누르세요...
 */

// 위에서부터 0층, 1층, 2층, 3층, 4층으로 간주

public class Test094
{
	public static void main(String[] args)
	{

		// 주요 변수 선언 및 배열의 배열 선언 + 메모리 할당
		char arr[][] = new char[5][5];
		int n=65;												// 65 == A


		// 배열 구성
		for (int i=0; i<arr.length; i++)						//-- 0부터 arr배열의 길이까지 반복한다.
		{
			for (int j=0; i>=j; j++)							//-- 0부터 j가 i보다 크기 전까지 반복한다.
			{	
				// 배열의 배열 arr에 A ~ Z까지 담는다.
				if (i%2==1)										//-- 만약 i가 홀수라면(1층, 3층)
				{
					arr[i][i-j]=(char)n;						//-- 11 01 / 33 32 31 30 역순으로 담는다.
				}
				else if (i%2==0)								//-- 만약 i가 짝수라면(0층, 2층, 4층)
				{
					arr[i][j] = (char)n;						//-- 00 / 20 21 22 / 40 41 42 43 44 순서대로 담는다.
				}		
				n++;											//-- n을 1씩 증가시킨다.
			}
		}

		// 배열 전체 요소 출력
		for (int i=0; i<arr.length; i++)						//-- 0부터 arr배열의 길이까지 반복한다.
		{
			for (int j=0; j<arr[i].length; j++)					//-- 0부터 arr[i]배열의 길이까지 반복한다.
			{
				System.out.printf("%3c", arr[i][j]);			//-- 배열을 출력한다.
			}
			System.out.println();								//-- 개행
		}		
	}
}

// 실행 결과

/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/