/*======================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문 실습 및 관찰
======================================*/

// 1부터 100까지 정수의 합을 구하되...
// 10의 배수가 될 때 마다...
// 그 시점까지의 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 1 ~ 10 까지의 합 : xx
// 1 ~ 20 까지의 합 : xxx
// 1 ~ 30 까지의 합 : xxx
//   :
// 1 ~ 100 까지의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

// 힌트 : 출력구문도 반복된다(?)

public class Test047
{
	public static void main(String[] args)
	{

		int n=1;				//-- 1 부터 1씩 증가할 변수
		int sum=0;				//-- 누적합을 담아낼 변수

		while (n <= 100)		//-- 100번 반복
		{
			sum += n;			//-- sum을 n만큼 증가
			if (n % 10 == 0)	//-- n이 10의 배수라면...
			{
				System.out.printf("1 ~ %d 까지의 합 : %d\n", n , sum);
			}
			else if (n % 10 != 0)
			{
			}
			n++;


		}


	}
}

// 실행 결과

/*
1 ~ 10 까지의 합 : 55
1 ~ 20 까지의 합 : 210
1 ~ 30 까지의 합 : 465
1 ~ 40 까지의 합 : 820
1 ~ 50 까지의 합 : 1275
1 ~ 60 까지의 합 : 1830
1 ~ 70 까지의 합 : 2485
1 ~ 80 까지의 합 : 3240
1 ~ 90 까지의 합 : 4095
1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .

*/