/*===========================================
���� ���� �帧�� ��Ʈ��(���) ����
- �ݺ���(for��) �ǽ� �� ����
=============================================*/

// �� ���� for��(�ݺ����� ��ø)�� Ȱ���� ����� �ǽ�

// �� ����
//	  ������ ���� ������ ��µ� �� �ֵ���
//	  �ݺ����� ��ø ������ �ۼ��Ͽ� ���α׷��� �����Ѵ�.

// ���� ��)
/*

    *
   ***
  *****
 *******
*********

*/

public class Test061
{
	public static void main(String[] args)
	{

		int i;						//-- ���� �ǹ��ϴ� ������ �����Ѵ�.
		int j;						//-- ���� �߰��� �� ������ �����Ѵ�.
		int k;						//-- ������ �߰��� �� ������ �����Ѵ�.


		for (i=1; i<=5; i++)		//-- 1 ���� 5 ����� �ݺ��Ѵ�.
		{

			//-- ����(" ")�� ù ��° �࿡�� 4��, �� ��° �� 3��, �� ��° �� 2��, �� ��° �� 1��, �ټ� ��° �� 0�� ����ϵ��� �ݺ��Ѵ�.
			for (k=1;k<=5-i; k++)
			{
				System.out.print(" ");
			}
			

			//-- ��(*)�� ù ��° �࿡�� 1��, �� ��° �� 3��, �� ��° �� 5��, �� ��° �� 7��, �ټ� ��° �� 9�� ����ϵ��� �ݺ��Ѵ�.
			for (j=1; j<=(2*i)-1; j++)
			{
				System.out.printf("%s","*");

			}
			System.out.println();	//-- �� �ݺ��� ���� ������ �����Ѵ�.
		}
		
		
	}

}

// ���� ���

/*

    *
   ***
  *****
 *******
*********
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/