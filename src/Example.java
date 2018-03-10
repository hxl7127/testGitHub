
class ExSuper{
	String name;
	String nick_name;
	
	public ExSuper(String s,String t){
		name = s;
		nick_name = t;
	}

	public String toString() {
		return name;
	}
	
	
}

public class Example extends ExSuper{

	public Example(String s, String t) {
		super(s, t);
	}
	
	public String toString() {
		return name+"a.k.a"+nick_name;
	} 
 
}
