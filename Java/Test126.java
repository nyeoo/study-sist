/*=============================================
 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 ============================================*/

/*
�� ����

	�Ϲ������� Ŭ������ �ϳ��� �����ϴ� ���� �ƴ϶� ���� ������ Ŭ������ ���� �� ��� ����ϰ� �Ǵµ�
	�̷��� Ŭ������ �������̽��� ������ ��Ű��(package)��� �Ѵ�.
	Sun(Oarcle)�翡���� �ڹ� ���α׷��� ȿ�������� �ۼ��� �� �ֵ��� �ڹ� ǥ�� ��Ű���� �����ϸ�,
	�ڹ� ǥ�� ��Ű������ �׷���, ��Ʈ��ũ, �����ͺ��̽� ���� �پ��ϰ� ������ Ŭ�������� ���ԵǾ� �ִ�.

�� import ����

	�ڹ� ǥ�� ��Ű���� ����ڿ� ���� �ܺο��� ������� ��Ű���� ����ϱ� ���ؼ��� �������� �����ϱ⿡ �ռ�
	���α׷��� ���Խ�Ű�� ������ �ʿ��ѵ�, �� �� import ���� �̿��Ͽ� ��Ű�� �Ǵ� Ŭ������
	���α׷��� ���Խ�Ű�� �ȴ�.
	������, ��java.lang.*�� ��Ű���� �ڹ� ���α׷��� �⺻������ import �Ǿ� �ֱ� ������ �� ��Ű���� Ŭ��������
	import ���� �ʰ� �ٷ� ����ϴ� ���� �����ϴ�.
	
	import ���� �ݵ�� Ŭ���� ���� ���� ���� ����Ǿ� �־�� �ϸ� ������ ������ ���� �� ������ �ִ�.

	import [static] ��Ű��.Ŭ����;
	import [static] ��Ű��.*;

	�� JDK 1.5 ���ʹ� import ������ static Ű���带 ����� �� �ְ� �Ͽ��� �������� ��Ű���� import �� �� �ִ�
	����� �����ϰ� �Ǿ���.
	���� ��Ű���� �������� import �� ����� ��� ���� ������ �޼ҵ�� ��� �������� ���λ�(ex-> ob, br, sc ó��)�� ������ �ʰ�
	����ϴ� ���� �����ϴ�.

�� Object Ŭ����

	java.lang.Object Ŭ������ �ڹ� Ŭ������ �ֻ��� Ŭ������ �ڹ� ǥ�� ��Ű���� Ŭ������ ����ڿ� ����
	�ۼ��� ���!!! Ŭ������ �⺻������ �� Ŭ�����κ��� ��ӹ޴´�.
	����, �ڹ��� ��� Ŭ������ java.lang.Object Ŭ������ �޼ҵ鸦 ������ ������, �ٷ� ����ϴ� ���� �����ϴ�.
*/

//import java.lang.*;

public class Test126 //extends Object
{

	/*
	Object Ŭ������ ���� ��� ���� �����
	...
	...

	... toString()
	{
		...;
	}
	*/

	public static void main(String[] args)
	{
		Test126 ob = new Test126();

		// ��ü.xxx();
		// �ش� ��ü�� ������Ű�µ� ���� Ŭ������ �޼ҵ� xxx() ȣ��

		// Circle ob = new Circle();
		// ob.input();
		//-- ob ��ü�� ������Ű�µ� ���� Ŭ���� -> Circle
		//   Circle Ŭ������ ���ǵǾ� �ִ� input() �޼ҵ� ȣ��

		// ��ü.yyy();
		//-- �ش� ��ü�� ������Ű�µ� ���� ��� Ŭ������
		//   yyy() �޼ҵ尡 �������� ���� ��...
		//--==>> ���� �߻�(������ ����)

		//System.out.println(ob.action());
		//--==>> ���� �߻�(������ ����)
		//		 cannot find symbol
		//-- ob ��ü�� ������Ű�µ� ���� Test126 Ŭ������ action �޼ҵ尡 �������� �ʱ� ������ ���� �߻�

		System.out.println(ob.toString());								//-- String�� ��ȯ�Ѵ�.
		//--==>> Test126@15db9742
		//-- �޸� �ּҰ� �ƴ϶� �ڹٰ� ��ü�� �����ϱ� ���� ���Ƿ� �ο��ϴ� �ĺ���ȣ
		//-- Test126 Ŭ������ toString() �޼ҵ尡 �������� �������� �ұ��ϰ�
		//   ������ �߻����� �ʴ� ��Ȳ
		//   -> Object �κ��� ��ӹ���~!!!

		System.out.println(ob);											//-- ��ü�� ��ȯ�Ѵ�.										
		//--==>> Test126@15db9742
		


		
	}
}