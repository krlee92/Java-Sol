//���� variable
//���α׷� �����ϴ� ����� �����͸� �ӽ� �����ؾ� �� ��
//������ ��� �׸�.
// �ڹ��� ������ ����� �� �ȳ����� �ȵ�
//1+1=2 ����ϰ� �� =�ӽ�����

//CPU : ������ġ-�ӵ�
//RAM : ������ġ : ������, ���α׷� ���ų� ������ϸ� ����\
//		?
//		stack : �� ������ Ȱ���ϴ� ���α׷��� ����Ǹ� �ڵ� ����
//		heap  : �ڵ� ������ �ȵ� > �����ڰ� �������� ����
//			Garbage Collection(heap �ڵ�����)
//HDD : ������ġ : ��������, ��������
//�׷���ī��(�׷��� ó���� CPU+RAM+HDD)

//���� - 
//���
//		��� ���� byte

//		���ͳ� ���θ� ���� int

//		���� ���� �ܰ� long 

//�ڷ���(data type) : �׸� ����
//		�⺻�� : ���ڻ� �ٲ�� �ҹ��ڷν���, �����͸� stack��
//		 ���� :int(21��), long(??) int �ƴϸ� long �����ϳ�����.
//		 �Ǽ� : double(10~)������
//		�ѱ��� :char
//		���� :boolean(ox)
//		���� : void

//		������(reference type) -�� �ȹٲ�� ù���� �빮��, �����͸� heap��, �����Ͱ� �ִ� �������� stack��
//		���ڿ�(�ѱ��ڵ� ����) : String : heap ����. ���ڿ� ������
//		��Ÿ

//		�⺻�ڷ��� : �ƹ� ó���� ���ϰ� �����͸� ������ �� ���� �ν�?
//			100 : int
//			1.25: double[�ڹٸ�,��κ� �ٸ� ���� float]

//������ : �׸� �̸� :����
//�ڹ� ���� x , Ư������ x _�������, ���ڷ� ����   x >>Ʋ���� ���� 

//���� ���ϰ� �۸�, �ҹ��ڷ� ����, �ѱ�x, ����  x, =>����� ���ϸ� �ø���
//ex) ������� int humanage ������� int yesterday_Weather_Temperature

// �ڷ��� ������;

public class VMain {
	public static void main(String[] args) {

		int a = 10; // 10�̶�� �����͸� a��� ������ �ӽ�����(4byte)
		String b = "ASD";
		System.out.println(a); // a�� ����Ȱ� ���
//���� �����(����) = RAM�� ����Ȯ�� 
//������ �� �ֱ�
//		������ = ��; >> = �����ϴ� �ƴϴ�
//		=(���Կ�����) : ���׿� �ִ°� ���׿� �־��

		// ����ũ ������ 2000��
		int mask_Price2;// >>�������� �����Ҷ� �ѹ��� ���� �׵ڷδ� ctrl sp
		mask_Price2 = 2000;
		mask_Price2 = 3000;
		System.out.println(mask_Price2);
		System.out.printf("����: %d��\n", mask_Price2);
//		*�߿�* Ŭ������, ������ �ٲܶ� ���� �������-��Ŭ��-Refactor-Rename=���� ����,Ŭ���� ���δٹٲ�

		// ����ũ ���԰� 100.123g
		float maskWeight2;
//		maskWeight2 = (float) 100.123; float��� ǥ��
//		maskWeight2 = 100.123f; double > float ����ȯ
		double mask_Weight; // double mask_Weight = 100.123; ���ٷε� ����
		mask_Weight = 100.123;
		System.out.printf("����:%fg\n", mask_Weight);

		// ����ũ �����簡 ��ŵ��
		// " " : ���ڿ� ������ ǥ��
		String mask_Maker;
		mask_Maker = "��ŵ��";  // String mask_Maker = "��ŵ��"; ���ٷε� ����.
		
		// ����ũ ���� ���
		// ' ' : �� ���� ������ ǥ��
		char mask_Color = '��'; // ���� char �߾Ⱦ�
		String mask_Color2 = "��";
		
		// ����ũ ���� �������� �Ȳ�������
		String mask_LineOK2 = "����";
		boolean mask_LineOK = true; //false
		
		System.out.println(mask_LineOK);
		
		//������ �̸�
		//������ ��
		//���־���
		//�����ҷ�
		
		String food = "������";
		int money = 8000;
		boolean satisfy = true;
		boolean being_King_Of_The_Class = false;
		System.out.println("��������:" + food);
		System.out.printf("����:%dwon\n" , money);
		System.out.println(satisfy);
		System.out.println(being_King_Of_The_Class);

	}

}
