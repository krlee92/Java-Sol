

public class OMain2 {
	public static void main(String[] args) {
		// 五敢誤戚 薦整査製, 亜維戚 8000据 昔 五敢
		// 窒径
		//////////////////////////////
		//縦雁A
		Menu m = new Menu();		
		m.name = "薦整査製";
		m.price = 8000;
		m.printMenuInfo();
		System.out.println("---------------");
		//縦雁 B拭亀 薦整査製 8000据促軒
		Menu m2 = m; // A縦雁 薦整査製聖 m2虞澗 痕呪稽亀 羨悦 亜管馬惟.
		m2.printMenuInfo();
		m2.price = 10000; //薦整査製葵 幻据生稽 昔雌
		m2.printMenuInfo();
		m.printMenuInfo(); // m,m2澗 heap税 旭精爽社拭 煽舌鞠赤製
//								魚虞辞 m2葵聖 郊菓依 = m葵聖 郊菓依
		System.out.println("---------------");
		Menu m3 = new Menu();
		m3.name = "薦整査製";
		m3.price = 5000;
		m3.printMenuInfo();
		m3.price = 90000;
		m.printMenuInfo();
		System.out.println(m);
		System.out.println(m3);
		System.out.println("---------------");
		m2 = null; // 凧繕莫 痕呪亜 焼巷 腰走(爽社)亀 亜軒徹走 省惟. 爽社研 走酔澗惟 焼還
		m = null; // garbage collection 降疑 : heap拭 希戚雌 羨悦 公馬惟 喫生稽 heap 切疑舛軒
		m3 = null; // garbage collection 降疑 獣繊聖 走榎生稽.
//						走榎 照馬檎 覗稽益轡 魁劾凶猿走 m3 害焼赤製.
		System.out.println("せせせせせ");
		System.out.println("せせせせせ");
		System.out.println("せせせせせ");
		
	}

}
// ?
// stack : 覗稽益轡 曽戟鞠檎 切疑舛軒
// heap : 切疑 舛軒 照喫
//			garbage collection : heap慎常 切疑舛軒
//				益 腰走拭 希戚雌 羨悦拝 号狛戚 蒸惟 鞠檎 降疑