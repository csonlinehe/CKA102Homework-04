package HWPen;

public class PenMain {

	void main() {
		
		
			
			
			Pen x[] = new Pen[2];
			x[0] = new Pencil("鉛筆", 25);
			x[1] = new InkBrush("墨水筆", 50);
			
			for(int i = 0; i < x.length; i++) {
				IO.println("此物品售價為： " + x[i].getPrice() + "元");
				x[i].write();
				IO.println();
			}

			
//			Pen pencil = new Pencil();
//			Pen inkbrush = new InkBrush();
//			pencil.write();
//			pencil.setPrice(25);
//			System.out.println("建議售價為：" + pencil.getPrice() + "元");
//			IO.println();
//			inkbrush.write();
//			inkbrush.setPrice(50);
//			System.out.println("建議售價為：" + inkbrush.getPrice() + "元");
			
	}
}

//沒自己動手寫過真的不會懂瘋狂除錯的挫折...........................

