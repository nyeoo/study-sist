/*===================================================================
 ���� Ŭ������ �ν��Ͻ� ����
 - �޼ҵ� �ߺ�����(Method Overloading)�� ������ ���¿� �Ұ����� ����
====================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');
		print(20);

		print(3.14);

		//double result = print(3.14);
		
	}

	public static void print() {}
	//public static void print() {}							//--(X)
	public static void print(int i) {}
	//public static void print(int j) {}					//--(X) �Ű������̸��� �ٸ� ���� �������
	public static void print(char c) {}						//-- �ڵ� �� ��ȯ ��Ģ check~!!!
	public static void print(int i, int j) {}
	public static void print(double d) {}					//-- �ڵ� �� ��ȯ ��Ģ check~!!!
	//public static void print(double e) {return 10.0}		//-- ���� �Ұ�
	//public static double print(double e) {return 10.0;}	//-- ��ȯ�ڷ����� �ٸ� ���� �޼ҵ带 ȣ���� ���� ���̹Ƿ� ���� �������.



}