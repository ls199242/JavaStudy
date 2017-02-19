import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(3,2);
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(v.capacity());
		v.add(4);
		System.out.println(v.capacity());
		v.addElement(5);
		v.addElement(6);
		System.out.println(v.capacity());
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+" ");
		}
	}

}
