/*===================================
 ■■■ 정렬(Sort) 알고리즘 ■■■
===================================*/

// ○ 과제
//	  사용자로부터 여러 학생의 성적 데이터를 입력 받아
//	  점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//	  결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 임하성 90
// 이름 점수 입력(2, 공백 구분) : 정한울 80
// 이름 점수 입력(3, 공백 구분) : 정현욱 85
// 이름 점수 입력(4, 공백 구분) : 채다선 75
// 이름 점수 입력(5, 공백 구분) : 최혜인 95
/*
---------------------
1등 최혜인 95
2등 임하성 90
3등 정현욱 85
4등 정한울 80
5등 채다선 75
---------------------
계속하려면 아무 키나 누르세요...
*/


import java.util.Scanner;
import java.io.IOException;

public class Test110
{
	public static void main(String[] args) throws IOException
	{	
		// Scanner 인스턴스 사용
		Scanner sc = new Scanner(System.in);
		
		// 주요 변수 선언
		String temp;										//-- name 배열 순서를 바꿀 때 임시로 name 배열을 담아둘 변수 선언
		int n;												//-- 인원 수를 담을 변수
		
		System.out.print("인원 수 입력 : ");
		n = sc.nextInt();
		String[] name = new String[n];						//-- 학생들의 이름을 담을 배열
		int[] score = new int[n];							//-- 학생들의 점수를 담을 배열

		for (int i=0; i<n; i++)								//-- 0부터 입력한 인원 수 전까지 반복하여 배열에 데이터 담기
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		

		// 정렬 (선택 정렬 사용)
		for (int i=0; i<score.length-1; i++)				//-- 웅~~~~ -> 비교기준데이터 (0    1   2  3)
		{
			for (int j=i+1; j<score.length; j++)			//-- 쑝쑝쑝 -> 비교대상데이터 (1234 234 34 4)
			{
				if (score[i]<score[j])						//-- 내림차순 정렬(비교해서 오른쪽 점수가 더 크면 자리를 바꾼다)
				{
					// 자리 바꾸기
					score[i]=score[i]^score[j];				
					score[j]=score[j]^score[i];
					score[i]=score[i]^score[j];

					temp = name[i];							//-- 이름과 점수는 한 세트이므로 자리를 바꿀 때 함께 바꾼다.
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}


		// 결과 출력
		System.out.println("---------------------");
		for (int i=0; i<n; i++)
		{
			System.out.printf("%d등 %s %d\n", i+1, name[i], score[i]);	//-- 등수와 이름과 점수를 반복해서 출력한다.
		}
		System.out.println("---------------------");
	}
}

// 실행 결과

/*

인원 수 입력 : 5
이름 점수 입력(1, 공백 구분) : 박나영 50
이름 점수 입력(2, 공백 구분) : 임하성 80
이름 점수 입력(3, 공백 구분) : 정현욱 75
이름 점수 입력(4, 공백 구분) : 정한울 62
이름 점수 입력(5, 공백 구분) : 채다선 90
---------------------
1등 채다선 90
2등 임하성 80
3등 정현욱 75
4등 정한울 62
5등 박나영 50
---------------------
계속하려면 아무 키나 누르십시오 . . .

*/