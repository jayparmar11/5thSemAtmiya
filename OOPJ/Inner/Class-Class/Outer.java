class Outer {
	class Inner {
		String name;

		void print(String s) {
			System.out.println(s);
		}
	}

	static Outer.Inner createClass() {
		return (new Outer()).new Inner();
	}

	public static void main(String args[]) {
		// Outer.Inner x = (new Outer()).new Inner();
		Outer.Inner x = createClass();
		x.print("Hello");
	}
}