/*================================
 ���� �÷���(Collection) ����
 ================================*/

// Map -> Hashtable, HashMap

/*
�� java.util.Map �������̽�
   Ű(key)�� ��(valu)�� ����(mapping)�ϸ�
   ������ Ű�� ����� �� ����, �����ؾ� �ϸ�,
   �� Ű�� �� ���� ������ �����ؾ� �Ѵ�.
   ��, �ϳ��� Ű�� �����ϴ� �ϳ��� ���� ���� �����̴�.

*/

/*
�� Hashtable<K, V> Ŭ����
   - �ؽ����̺� ������ ��ü �𵨸�ȭ �� Ŭ������
     �˻��� �����ϱ� ������ ��� �󵵰� ���� ���� ���Ѵ�.
   - �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������(value)��
     ���е� �����ͱ����̴�.
   - �����͸� �����ϰ� �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ�
     �� ���������� Ű���� �ο��ϸ� �ش� �����Ͱ� ��ȯ�ȴ�.
   - ����, Hashtable Ŭ������ key �Ǵ� value�� ������ null �� ������� �ʴ´�.
*/

import java.util.Hashtable;

public class Test170
{
	private static final String[] names = {"������","������","�����","��ٽ�","�赿��","�����"};

	private static final String[] tels
		= {"010-6380-7047","010-6678-9867","010-1234-5678","010-5316-7234","010-1461-5173","010-2136-7324"};

	public static void main(String[] args)
	{
		// Hashtable �ڷᱸ�� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// ht ��� Hashtable �ڷᱸ����
		// �迭(names, tels)�� ����ִ� �����͸� ��ҷ� ��Ƴ���
		// -> put(k, v); �޼ҵ� ���

		for (int i=0; i<names.length; i++)
		{
			//ht.put("������", "010-6380-7047");
			ht.put(names[i], tels[i]);
		}



		// ht ��� Hashtable �ڷᱸ������
		// key �� �̿��Ͽ� ������ �˻�
		// -> get(k); �޼ҵ� ���
		String findName1 = "�赿��";
		String str = ht.get(findName1);
		if (str !=null)
		{
			System.out.println(findName1 + " ��ȭ��ȣ : " + str);
		}
		//else
		//{
		//	System.out.println("�׽�Ʈ");
		//}
		System.out.println();
		//--==>> �赿�� ��ȭ��ȣ : 010-1461-5173
		


		// ht ��� Hashtable �ڷᱸ����
		// key �� �����ϴ����� ���� Ȯ��
		// -> containsKey() �޼ҵ� ��� -> true, false ��ȯ
		String findName2 = "������";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + " �����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println(findName2 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>> ������ �����Ͱ� �������� �ʽ��ϴ�.


		String findName3 = "�����";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " �����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println(findName3 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>> ����� �����Ͱ� �����մϴ�.



		// ht ��� Hashtable �ڷᱸ����
		// value �� �����ϴ����� ���� Ȯ��
		// -> contains() �޼ҵ� ���
		String findTel1 = "010-1234-5678";		// ���� ��ȭ��ȣ
		if (ht.contains(findTel1))
		{
			System.out.println(findTel1 + " �����Ͱ� �����մϴ�.");
		}
		else
		{
			System.out.println(findTel1 + " �����Ͱ� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		//--==>> 010-1234-5678 �����Ͱ� �����մϴ�.

		// ht ��� Hashtable ��������
		// ���������� ������ ����
		// -> remove() �޼ҵ� ���

		ht.remove("������");

		// �� remove() �޼ҵ�� ���ڰ����� key�� �Ѱܹ�����
		//	  �� ��, key�� �����Ǵ� ���� �ƴϴ�.
		//	  �ش� key�� ����Ǿ�(���εǾ�) �ִ� value �� �Բ� �����Ѵ�.

		// ����(remove()) ���� ht ��� Hashtable �ڷᱸ����
		// �ش� key �� �����ϴ��� Ȯ��

		if (ht.containsKey("������"))
			System.out.println("�����̰� �����մϴ�.");
		else
			System.out.println("������ ��𰬾�?????");
		System.out.println();
		//--==>> ������ ��𰬾�?????


		// ����(remove()) ���� ht ��� Hashtable �ڷᱸ����
		// �ش� value �� �����ϴ��� Ȯ��


		if (ht.containsKey("010-6678-9867"))
			System.out.println("������ ��ȭ��ȣ�� �����մϴ�.");
		else
			System.out.println("������ ��ȭ��ȣ�� �������� �ʽ��ϴ�.");
		System.out.println();
		//--==>> ������ ��ȭ��ȣ�� �������� �ʽ��ϴ�.


		// �� null ���� ó��
			
		//ht.put(null, null);				//-- key �� value ��� null �� ����
		//--==>> ���� �߻�(��Ÿ�� ����) java.lang.NullPointerException
		// Hashtable�� null�� ������� ����

		
		//ht.put("���ȯ",null);			//-- value �� null �� ����
		//--==>> ���� �߻�(��Ÿ�� ����) java.lang.NullPointerException

		//ht.put(null, "010-2376-8232");	//-- key �� null �� ����
		//--==>> ���� �߻�(��Ÿ�� ����) java.lang.NullPointerException


		// �ߺ��� key �Է�
		ht.put("������", "010-1111-1111");
		System.out.println(ht.get("������"));
		System.out.println();
		//--==>> 010-1111-1111
		//-- �ߺ��� key�� Ȱ���Ͽ� �����͸� �Է��� ���
		//   ������ �Է��� ��ȭ��ȣ���� ���ο� ��ȭ��ȣ�� ����Ǿ����� Ȯ��
		//   (����� ����)

		// �ߺ��� value �Է�
		ht.put("������","010-1234-5678");

		System.out.println(ht.get("�����"));
		System.out.println(ht.get("������"));
		//--==>> 010-1234-5678
		//		 010-1234-5678
		//-- value �� �ߺ��� ���� �ԷµǴ���
		//   ���� �����Ϳ� �ƹ��� ������ ��ġ�� ����







	}
}