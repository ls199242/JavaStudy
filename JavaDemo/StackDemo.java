import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		System.out.println(s.empty());
		
		s.push(1);
		s.push(2);
		System.out.println(s.toString());
		
		s.peek();
		System.out.println(s.toString());
		
		System.out.println(s.search(2));
		
		System.out.println(s.indexOf(1));
		
		s.pop();
		System.out.println(s.toString());
	}

}
