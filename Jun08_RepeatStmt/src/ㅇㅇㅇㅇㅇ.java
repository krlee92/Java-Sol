
public class ���������� {

	public static void main(String[] args) {
//		 (i,j)
				//  �� (0.0)
				//  ����(1.1)����
				//  ������(2.2)����
				//  ��������(3.3)����
				//  ����������(4.4����)
				for (int i = 0; i <= 4; i++) {
					for (int j = 0; j <= i ; j++) {
						System.out.print("��");
					}
					System.out.println();
				}
				System.out.println("-----------");
			
			
			
			
				//  ����������(4.4) 
				//  ��������(3.3)
				//  ������(2.2)
				//  ����(1.1)
				//  ��(0.0)
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5-i; j++) {
						System.out.print("��");
					}
					System.out.println();
				}
			
				System.out.println("----------");
				//  ��(1.1)
				//    ��(2.2)
				//      ��(3.3)
				//        ��(4.4)
				//          ��(5.5)
				String c;
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						c = (i == j) ? "��" : "  ";
						System.out.print(c);
					}
					System.out.println();
					
				}
			
				//  ��(0.0)
				//	������(1.2)
				//	����������(2.4)
				//	��������������(3.6)
				//	������������������(4.8)
				String d;
				for (int i = 1; i < 6; i++) {
					for (int j = 1; j < (i*2); j++) {
						d = (i % 2 == 0) ? "��" : "��";
						System.out.print(d);
					}
					System.out.println();
				}
			

	}

}
