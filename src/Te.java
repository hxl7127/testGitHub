import javax.accessibility.AccessibleStreamable;

public class Te { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		char ch = 'y';
		test.test(ch);
	}

}

class Test{
	void test(int i){
		System.out.println("I am an int");
	}
	void test(String s){
		System.out.println("I am an string");
	}
	
}

