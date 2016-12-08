package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitApp {
	public static void main(String[] args) {	// 익명객체를 사용해서 정렬 

		ArrayList<Fruit> cart = new ArrayList<>();
		cart.add(new Fruit("사과", "빨강", 1000, 10));
		cart.add(new Fruit("사과", "노랑", 1500, 15));
		cart.add(new Fruit("바나나", "노랑", 2000, 20));
		cart.add(new Fruit("배", "하양", 5000, 30));
		cart.add(new Fruit("토마토", "빨강", 3000, 30));
		cart.add(new Fruit("파인애플", "노랑", 7000, 50));
		/*
		 * Comparator<Fruit> c = new Comparator<Fruit>() {
		 * 
		 * @Override public int compare(Fruit f1, Fruit f2) {
		 * 
		 * return f1.getPrice() - f2.getPrice(); } }; Collections.sort(cart, c);
		 * System.out.println(cart);
		 */
		/*
		 * Collections.sort(cart, new Comparator<Fruit>() { // 작은것부터 출력
		 * 
		 * @Override public int compare(Fruit f1, Fruit f2) { return
		 * o1.getKcal() - o2.getKcal(); }
		 * 
		 * }); System.out.println(cart);
		 */
		/*
		 * Collections.sort(cart, new Comparator<Fruit>() {
		 * 
		 * @Override public int compare(Fruit f1, Fruit f2) { return
		 * o1.getName().compareTo(o2.getName()); }
		 * 
		 * }); System.out.println(cart);
		 * 
		 * 람다표현식의 실행
		 * 1. 람다 표현식 자리의 인터페이스를 추론해낸다.
		 * 2. 추론된 인터페이스에 정의된 메소드의 구조와 람다표현식의 정의가 일치하는지 확인한다. 
		 * 		(매개변수의 타입, 매개변수의 갯수, 반환값의 타입 등을 체크한다.)
		 * 3. 추론된 인터페이스에 정의된 메소드의 구조와 람다표현식의 정의가 일치하면 람다표현식을 익명객체로 변환한다. 
		 * 
		 * 
		 */

		// Collections.sort(cart, (Fruit f1, Fruit f2) -> {return f1.getName().compareTo(f2.getName()); });
		
		// a매개변수의 타입은 생략가능하다.
		Collections.sort(cart, (f1, f2) -> {return f1.getName().compareTo(f2.getName());});
		
		// 실행문이 하나뿐인 경우 {}는 생략가능하다. 
		// return 키워드를 생략하더라도 표현식의 연산결과가 반환값으로 자동으로 반환된다.  
		Collections.sort(cart, (f1,f2) -> f1.getName().compareTo(f2.getName()));	// 이름 정렬순으로 출력됨.

		System.out.println(cart);

	}
}
