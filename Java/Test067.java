/*=================================
���� �޼ҵ��� ��� ȣ�� ����
====================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
		
	}

	// showHi() �޼ҵ��� �ڵ� ������ �� ���� ��ġ �ٲٱ�

	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		
		if (cnt==1)
		{
			return;
		}
		showHi(--cnt);

	}

}

// ���� ���

/*
Hi~
Hi~
Hi~
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/