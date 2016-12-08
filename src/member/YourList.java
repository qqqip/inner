package member;

import java.util.Iterator;

public class YourList {
	private String[] names = { "박재범", "권건", "윤상현", "니니" };
	
	public Iterator<String> iterator() {
		
		// 메소드 내부에 정의된 클래스
		class YourListIterator implements Iterator<String> {
			private int index = 0;

			@Override
			public boolean hasNext() {
				if (index < names.length) {
					return true;
				}
				return false;
			}

			@Override
			public String next() {
				String name = names[index];
				index++;
				return name;
			}
			
		}
		return new YourListIterator();
	}
	
}
