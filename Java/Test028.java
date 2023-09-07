/*=============================
���Ῥ����(Operator)����
- ���� ������ == ���� ������
=============================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ� BufferedReader�� Ȱ���ϰ�,
// ���ǿ�����(���׿�����)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -24
// -24 -> ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 2597
// 2597 -> ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 0
// 0 -> ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ��Ʈ : ���ǿ�����(���׿�����)


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		/*
		n �� 0���� ũ��		-> true		-> n �� ���
							-> false	-> n �� 0 ���� �۴� -> true  -> n�� ����
															-> false -> n�� ��
		*/

		// () ? () : ();
		// (n > 0) ? ("���") : (�ٽ� Ȯ��);
		//                      -----------
		//                      (n < 0) ? ("����") : ("��");

		// (n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));

		// n �� 5 �� ���...
		// (5 > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// (true) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// "���"

		// n �� -5 �� ���...
		// (-5 > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// (false) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// ((n < 0) ? ("����") : ("��"));
		// ((-5 < 0) ? ("����") : ("��"));
		// ((true) ? ("����") : ("��"));
		// "����"

		// n �� 0 �� ���...
		// (0 > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// (false) ? ("���") : ((n < 0) ? ("����") : ("��"));
		// ((n < 0) ? ("����") : ("��"));
		// ((0 < 0) ? ("����") : ("��"));
		// ((false) ? ("����") : ("��"));
		// "��"
		
		// strResult = (n > 0) ? ("���") : ((n < 0) ? ("����") : ("��"));
		strResult = (n > 0) ? "���" : (n == 0) ? "��" : "����";
		

		System.out.printf("%d -> %s\n", n, strResult);
	}
}

// ���� ���

/*
������ ���� �Է� : -24
-24 -> ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 2597
2597 -> ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 0
0 -> ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/