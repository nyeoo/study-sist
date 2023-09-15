/*=============================================
 ■■■ 자바의 주요(중요) 클래스 ■■■
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Object 클래스
 ============================================*/

class Test
{
	private int a = 10;
	
	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class Test128
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10 == 9 : " + (10 == 9));
		//--==>> 10 == 9 : false

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a == b));
		//--==>> a == b : true

		// ※ 『==』 비교 연산자는 피연산자의 크기를 비교함을 확인(관찰)

		System.out.println("ob1 == ob2 : " + (ob1 == ob2));
		//--==>> ob1 == ob2 : false


		// ※ 객체(Object)들을 비교하는 과정에서 사용하는 『==』 연산자는
		//    크기를 비교하는 것이 아니라 대상 객체의 주소를 비교
		//

		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.println();

		System.out.println("ob1 : " + ob1);
		//==>> ob1 : Test@15db9742

		System.out.println("ob1.toStirng() : " + ob1.toString());
		//--==>> ob1.toStirng() : Test@15db9742

		System.out.println("ob2 : " + ob2);
		//==>> ob2 : Test@6d06d69c

		System.out.println("ob2.toStirng() : " + ob2.toString());
		//--==>> ob2.toStirng() : Test@6d06d69c

		// 클래스명@해시코드
		
		// ※ 해시코드(hashcode)
		//    : 자바 내부적으로 객체를 구분하기 위해 사용하는 것
		//      메모리의 주소값으로 생각하면 절대 안된다.
		//      해시코드가 다르면 다른 객체라는 것이 의미하지만, 해시코드가 같다고 해서 같은 객체라는 말은 틀린 말이다.


		
	}
}