import java.util.BitSet;

public class BitSetDemo {

	private static BitSet b1 = new BitSet();
	private static BitSet b2 = new BitSet();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<15;i++){
			if(i%2==0){
				b1.set(i);
			}
			if(i%5!=0){
				b2.set(i);
			}
		}
		p();
		
		b2.and(b1);//���֮��b2�ͱ��ı��ˣ�����˽���
		p();
		
		b2.or(b1);//�øı���b2�ٻ�b1��
		p();
		
		b2.xor(b1);
		p();
	}

	private static void p(){
		System.out.println("b1: " + b1.toString());
		System.out.println("b2: " + b2.toString());
		System.out.println();
	}
}
