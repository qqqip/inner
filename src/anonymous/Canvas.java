package anonymous;

public class Canvas {	// 각 색마다 클래스를 만들 필요가 없다. 
	public static void main(String[] args) {
		
		 Pen yellow = new Pen() {

			@Override
			public void draw() {
				System.out.println("노랑 노랑 노랑");
				
			}
		};
			
		Pen green = new Pen() {

			@Override
			public void draw() {
				System.out.println("초록 초록 초록");
				
			}
		};
		yellow.draw();
		green.draw();
		
	}
}
