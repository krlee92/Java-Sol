
public class RSMain2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + "," + j + "\t");
				
			}
			System.out.println();
		}
		// 	(i,j)
		//  �� (0.0)
		//  ����(1.1)����
		//  ������(2.2)����
		//  ��������(3.3)����
		//  ����������(4.4����)
		System.out.println("----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		//  ����������(4.4) 
		//  ��������(3.3)
		//  ������(2.2)
		//  ����(1.1)
		//  ��(0.0)
		System.out.println("----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
			//  ��(1.1)
			//    ��(2.2)
			//      ��(3.3)
			//        ��(4.4)
			//          ��(5.5)
		System.out.println("----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print("��");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
			//  ��(0.0)
			//	������(1.2)
			//	����������(2.4)
			//	��������������(3.6)
			//	������������������(4.8)
		String c = null; // null : ������������ �ƹ��͵� ����.
		for (int i = 0; i < 5; i++) {
			c = (i % 2 == 0) ? "��" : "��";
			for (int j = 0; j <= i*2; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println("----------");
		

		

	}

}
