package member;

import java.util.Iterator;

public class MyList {
	private String[] names = { "박재범", "권건", "윤상현", "니니" };

	public Iterator<String> iterator() {
		return new MyListIterator();
	}

	// 멤버 내부 클래스 // 멤버 내부클래스는 프라이빗도 접근할 수 있다.
	private class MyListIterator implements Iterator<String> {

		private int index = 0;

		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		public String next() {
			String name = names[index];
			index++;
			return name;
		}

	}
}
