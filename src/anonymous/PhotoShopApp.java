package anonymous;

public class PhotoShopApp {
	public static void main(String[] args) {

		PhotoShop ps = new PhotoShop();

		Pen yellow = new Pen() {

			@Override
			public void draw() {
				System.out.println("노랑");
			}
		};

		ps.painting(yellow);
		
		/*	익명객체를 전달하는 것.
		 * ps.painting(new Pen());
		 * ps.painting(new Pen() {});
		 * ps.painting(new Pen() {
		 * });
		 * ps.painting(new Pen() {
		 *    public void draw() {
		 *    }
		 *  })
		 */

		ps.painting(new Pen() {

			@Override
			public void draw() {
				System.out.println("빨강");
			}
		});
		
		ps.painting(() -> {System.out.println("파랑 파랑");});	// 람다표현식	// 하나의 인터페이스에 하나의 추상 메소드만 있어야 한다. 
		
	}

}
