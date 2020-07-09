
public class ¿¬½À {
	public static void main(String[] args) {
	a:	for (int i = 0; i < 10; i++) {
		b:	for (int j = 0; j < 10; j++) {
			c:	for (int j2 = 0; j2 < 10; j2++) {
					if (j2 % 2== 1) {
						break c;
						
					}
					System.out.println(i + "," + j + "," + j2);
				}
				
			}
			
		}
	}

}
