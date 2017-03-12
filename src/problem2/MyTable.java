package problem2;

public class MyTable {

	private Entry[] entries = new Entry[26];
	char[] arr1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			'u', 'v', 'w', 'x', 'y', 'z' };

	public String get(char c) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == c)
				return entries[i].s;
		}
		return null;
	}

	public void add(char c, String s) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == c)
				entries[i] = new Entry(c, s);
		}
	}

	public String toString() {
		StringBuilder toStr = new StringBuilder();
		for (Entry en : entries) {
			if (en != null){
				toStr.append(en.toString());
				toStr.append("\n");
			}
		}
		return toStr.toString();

	}

	class Entry {
		char c;
		String s;

		Entry(char c, String s) {
			this.c = c;
			this.s = s;
		}

		public String toString() {
			return this.c + "->" + this.s;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Alice");
		t.add('b', "Billy");
		t.add('c', "Calorine");
		System.out.println(t);

	}

}
