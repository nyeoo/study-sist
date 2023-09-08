/*=====================================
 ■■■ 클래스와 인스턴스 ■■■
 - 생성자(Constructor)
======================================*/


public class Test076
{

	int x;

	// ※ 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며
	//	  필요한 경우 인수를 받아들이는 것도 가능하다.
	//	  같은 이름의 메소드를 정의하는 중복정의(오버로딩)이 가능하지만
	//	  리턴값(반환값)은 가질 수 없다.
	// ※ 생성자는 다른 일반 메소드처럼 호출될 수 없고,
	//	  new 연산자를 이용하여 객체를 생성하기 위해 호출되며,
	//	  생성된 객체의 멤버를 초기화 시키는 작업을 수행하게 된다.




	// (사용자정의)생성자
	Test076()
	{

		// ※ 메소드 안에서 또 다른 메소드 생성이 가능하듯이,
		//	  생성자 내부에서 다른 생성자를 호출하는 것은 가능하다.
		//	  하지만, 또 다른 생성자를 호출 하면 이미 있던 생성자가 한 세팅들은 헛수고가 되므로,
		//	  생성자 내부에서 또 다른 생성자를 호출한다면 가장 먼저 실행되어야 한다. (중간에 끼워놓고 쓰거나 뒤에 쓰는 것은 안된다) check~!!!
		//Test(200); --X
		this(200);

		x = 10;	//this.x = 10; 으로 쓰는 것도 가능하다
		System.out.println("인자 없는 생성자");
		System.out.println("Test076이 갖고 있는 x : " + x);
		//System.out.println("Test076이 갖고 있는 x : " + this.x); 도 가능하다.
	}

	// (사용자정의)생성자
	//Test076(int num)
	Test076(int x)
	{
		//x = num;
		//x = x;				//-- 문법적으로 에러가 발생하지는 않지만, 같은 값을 덮어쓰기 하는 것밖에 안된다.(둘 다 지역변수 x이므로)

		//Test076.x = x;
		
		// 『this』 키워드~!!!
		this.x = x;													//-- 이 구문이 없다면 결과는 : Test076이 갖고 있는 x : 0
		//-- 논리적인 해석 -> this를 발견하면 그 this를 품고 있는 클래스를 찾기. 그 클래스가 소유하는 x라고 생각할 것
		
		System.out.println("인자가 하나인 생성자");
		//System.out.println("Test076이 갖고 있는 x : " + x);		//-- Test076이 갖고 있는 x : 100
		System.out.println("Test076이 갖고 있는 x : " + this.x);	//-- Test076이 갖고 있는 x : 100
																	//	 실행 했을 때 둘 다 같은 결과가 나오지만, 다른 과정으로 출력 되었다.
																	//   첫 번째 구문은 Test076(int x)이 받은 100값을 그 안에서 다시 x에 담아서 출력한 것이고,
																	//	 두 번째 구문은 Test076 클래스영역에서 선언된 int x의 값을 초기화, 출력한 것이다.
	}



	public static void main(String[] args)
	{

		// Test076 클래스 기반 인스턴스 생성
		Test076 ob1 = new Test076();
		Test076 ob2 = new Test076(100);
		//--==>> 인자 없는 생성자
		//		 Test076이 갖고 있는 x : 10
		//		 인자가 하나인 생성자
		//		 Test076이 갖고 있는 x : 100

		System.out.println();
		System.out.println("main 에서 ob1.x : " + ob1.x);
		System.out.println("main 에서 ob2.x : " + ob2.x);
		

	}
}

// 실행 결과

/*

인자가 하나인 생성자
Test076이 갖고 있는 x : 200
인자 없는 생성자
Test076이 갖고 있는 x : 10
인자가 하나인 생성자
Test076이 갖고 있는 x : 100

main 에서 ob1.x : 10
main 에서 ob2.x : 100
계속하려면 아무 키나 누르십시오 . . .


*/